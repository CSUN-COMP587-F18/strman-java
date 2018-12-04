import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;

//import static org.hamcrest.Matchers.endsWith;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
//import static org.junit.Assume.assumeThat;
//import static org.hamcrest.Matchers.containsString;


@RunWith(JUnitQuickcheck.class)
public class propertyTest_1 {
    // #1: This test was passed
    @Property
    public void containsAllShouldcontainsEach(final String value, final String[] needles) {
        if (Strman.containsAll(value, needles)) {
            for (int i = 0; i < needles.length; i++)
                assertTrue(Strman.contains(value,needles[i]));
        }
    }

    // #2: This test was passed
    @Property
    public void notcontainsAnyShouldnotcontainsEach(final String value, final String[] needles) {
        if (!Strman.containsAny(value, needles)) {
            for (int i = 0; i < needles.length; i++)
                assertFalse(Strman.contains(value,needles[i]));
        }
    }

    // #3: This test was passed
    @Property
    public void countSubStringReturnZero(final String value, final String subStr) {
        if (!Strman.contains(value, subStr, true))
            assertTrue(Strman.countSubstr(value,subStr) == 0L);
    }

    // #4: This test was failed
    @Property
    public void countSubStringReturnPositive(final String value, final String subStr) {
        if (Strman.contains(value, subStr, true))
            assertTrue(Strman.countSubstr(value,subStr) >= 1L);
    }

    // #5: This test was passed
    @Property
    public void anyStringContainsNull(final String value, final String needle) {
        if (needle == null)
            assertTrue(Strman.contains(value, needle));
    }

    // #6: This test was passed
    @Property
    public void anyStringContainsEmpty(final String value, final String needle) {
        if (needle == "")
            assertTrue(Strman.contains(value, needle));
    }
}
