package propertytest.com.strman;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
// import com.strman.Strman;
import org.junit.runner.RunWith;

//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeThat;
import static org.hamcrest.Matchers.containsString;

//import org.junit.Test;

//import static org.hamcrest.CoreMatchers.*;

//import static org.junit.Assert.*;
import static com.strman.Strman.*;

@RunWith(JUnitQuickcheck.class)
public class propertyTest {
    @Property
    public void containsReturnTrue(final String value, final String needle) {
        assumeThat(value, containsString(needle));
        assertTrue(contains(value, needle));
    }
}
