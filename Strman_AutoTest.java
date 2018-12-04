/*
 * Auto generated test cases for append()
 */

package autotest.com.strman;

import java.util.Random;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

import static org.junit.Assert.*;
import static com.strman.Strman.*;

public class Strman_AutoTest {

    @Test
    public void append_AutoTest() throws Exception {

        Random rd = new Random();
        int bound = 100;

        int firstLength = rd.nextInt(bound);
        int secondLength = rd.nextInt(bound);

        byte[] first = new byte[firstLength];
        byte[] second = new byte[secondLength];

        rd.nextBytes(first );
        rd.nextBytes(second );

        String firstString = new String(first);
        String secondString = new String(second);

        assertThat(append(firstString, secondString),
                equalTo(firstString + secondString));
    }

    @Test
    public void appendToNull_AutoTest() throws Exception {

        Random rd = new Random();
        int bound = 100;

        //int firstLength = rd.nextInt(bound);
        int firstLength = 0;
        int secondLength = rd.nextInt(bound);

        byte[] first = new byte[firstLength];
        byte[] second = new byte[secondLength];

        rd.nextBytes(first );
        rd.nextBytes(second );

        String firstString = new String(first);
        String secondString = new String(second);

        assertThat(append(firstString, secondString),
                equalTo(firstString + secondString));
    }

    @Test
    public void appendNull_AutoTest() throws Exception {

        Random rd = new Random();
        int bound = 100;

        int firstLength = rd.nextInt(bound);
        //int secondLength = rd.nextInt(bound);
        int secondLength = 0;

        byte[] first = new byte[firstLength];
        byte[] second = new byte[secondLength];

        rd.nextBytes(first );
        rd.nextBytes(second );

        String firstString = new String(first, "US-ASCII");
        String secondString = new String(second, "US-ASCII");

        assertThat(append(firstString, secondString),
                equalTo(firstString + secondString));
    }
}
