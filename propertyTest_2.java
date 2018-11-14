import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeThat;


@RunWith(JUnitQuickcheck.class)
public class propertyTest_2 {
    // #1: This test was passed
    @Property
    public void betweenNotEmptyShouldContainStartAndEnd(final String value, final String start, final String end) {
        if (Strman.between(value, start, end).length > 0) {
            assertTrue(Strman.contains(value, start));
            assertTrue(Strman.contains(value, end));
        }
    }

    // #2: This test was passed
    @Property
    public void charsLengthReturnsOneOnEmptyString(final String value) {
        if(value.isEmpty())
            assertTrue(1 == Strman.chars(value).length);
    }

    // #3: This test was passed
    @Property
    public void charsLengthEqualsNonEmptyString(final String value) {
        if(!value.isEmpty())
            assertTrue(value.length() == Strman.chars(value).length);
    }

    // #4: This test was passed
    @Property
    public void collapseWhiteSpaceHasLessOrEqualLength(final String value) {
        assertTrue(Strman.collapseWhitespace(value).length() <= value.length());
    }

    // #5: This test was passed
    @Property
    public void containsAllReturnNonEmptyBetween(final String value, final String[] needles) {
        String[] test = {""};
        if (Strman.containsAll(value,needles,true))
            for (int i = 0; i < needles.length - 1; i++)
                for (int j = i + 1 ; j < needles.length - 1; j++)
                    assertTrue(Strman.between(value,needles[i],needles[j]) != test);
    }

    // #6: This test was passed
    @Property
    public void ensureLeftContainsBoth(final String value, final String prefix) {
        assertTrue(Strman.contains(Strman.ensureLeft(value, prefix), prefix));
        assertTrue(Strman.contains(Strman.ensureLeft(value, prefix), value));
    }

    // #7: This test was passed
    @Property
    public void ensureRightContainsBoth(final String value, final String suffix) {
        assertTrue(Strman.contains(Strman.ensureLeft(value, suffix), suffix));
        assertTrue(Strman.contains(Strman.ensureLeft(value, suffix), value));
    }

    // #8: This test was passed
    @Property
    public void unEqualReturnFalse(final String value) {
        assertFalse(Strman.unequal(value, value));
    }

    // #9: This test was passed
    @Property
    public void insertRemainTotalLength(final String value, final String substr, final int index) {
        if (index > value.length())
            assertEquals(value, Strman.insert(value,substr,index));
        else {
            if (index >= 0)
            assertEquals(value.length() + substr.length(),
                    Strman.insert(value, substr, index).length());
        }

    }

    // #10: This test was failed
    @Property
    public void countSubstrReturnNonZeroIfContain(final String value, final String subStr) {
        assumeThat (value, containsString(subStr));
        assertTrue(Strman.countSubstr(value, subStr) > 0L);
    }
}
