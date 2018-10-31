import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.endsWith;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeThat;
import static org.hamcrest.Matchers.containsString;


@RunWith(JUnitQuickcheck.class)
public class propertyTest {
    @Property
    public void containsReturnTrue(final String value, final String needle) {
        assumeThat(value, containsString(needle));
        assertTrue(Strman.contains(value, needle));
    }

    @Property
    public void endsWithReturnTrue(final String value, final String search) {
        assumeThat(value, endsWith(search));
        assertTrue(Strman.endsWith(value, search));
    }
}
