import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        try {
            java.util.Optional<java.lang.String> strOptional2 = strman.Strman.first("hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.String str1 = strman.Strman.htmlEncode("");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.String str1 = strman.Strman.formatNumber((long) 'a');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "97" + "'", str1.equals("97"));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        try {
            java.lang.String str3 = strman.Strman.decode("97", (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -1 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.String str1 = strman.Strman.hexEncode("");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        boolean boolean3 = strman.Strman.endsWith("", "97", true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        boolean boolean2 = strman.Strman.contains("", "97");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.lang.String str1 = strman.Strman.toCamelCase("");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.String str3 = strman.Strman.surround("hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!hi!" + "'", str3.equals("hi!hi!"));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        int int2 = strman.Strman.lastIndexOf("", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.String str1 = strman.Strman.dasherize("hi!hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hi!" + "'", str1.equals("hi!hi!"));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.String str1 = strman.Strman.collapseWhitespace("");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        boolean boolean4 = strman.Strman.endsWith("hi!hi!", "97", (int) (byte) 0, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        boolean boolean3 = strman.Strman.isEnclosedBetween("hi!", "hi!hi!", "hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.String str1 = strman.Strman.toSnakeCase("97");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "97" + "'", str1.equals("97"));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.String str3 = strman.Strman.ensureRight("", "", true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.String str1 = strman.Strman.leftTrim("");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        try {
            java.lang.String str3 = strman.Strman.decode("97", (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.util.regex.PatternSyntaxException; message: Illegal repetition near index 6\r\n(?<=\\G.{-1})\r\n      ^");
        } catch (java.util.regex.PatternSyntaxException e) {
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        try {
            long long4 = strman.Strman.countSubstr("", "", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        boolean boolean2 = strman.Strman.inequal("hi!hi!", "97");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.lang.String str1 = strman.Strman.htmlDecode("hi!hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.util.Optional<java.lang.String> strOptional1 = strman.Strman.trimEnd("97");
        org.junit.Assert.assertNotNull(strOptional1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        boolean boolean3 = strman.Strman.endsWith("hi!hi!", "null", true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.lang.String str1 = strman.Strman.lowerFirst("97");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "97" + "'", str1.equals("97"));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        boolean boolean3 = strman.Strman.contains("97", "hi!hi!", true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.String str3 = strman.Strman.removeLeft("hi!hi!", "", true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!hi!" + "'", str3.equals("hi!hi!"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.String str2 = strman.Strman.removeLeft("null", "hi!hi!");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null" + "'", str2.equals("null"));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.lang.String str3 = strman.Strman.surround("null", "", "97");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null97" + "'", str3.equals("null97"));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        int int2 = strman.Strman.lastIndexOf("null", "null");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.String str2 = strman.Strman.ensureLeft("hi!hi!", "");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!hi!" + "'", str2.equals("hi!hi!"));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.util.Map<java.lang.Character, java.lang.Long> charMap1 = strman.Strman.charsCount("null");
        org.junit.Assert.assertNotNull(charMap1);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.String str1 = strman.Strman.slugify("");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        boolean boolean2 = strman.Strman.inequal("null97", "null97");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        boolean boolean2 = strman.Strman.unequal("null", "hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        boolean boolean2 = strman.Strman.unequal("null", "97");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        boolean boolean2 = strman.Strman.isEnclosedBetween("null", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.lang.String str1 = strman.Strman.hexEncode("97");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00390037" + "'", str1.equals("00390037"));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        boolean boolean3 = strman.Strman.endsWith("hi!", "hi!hi!", true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        boolean boolean1 = strman.Strman.isString((java.lang.Object) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.String str1 = strman.Strman.removeNonWords("hi!hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hihi" + "'", str1.equals("hihi"));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        long long2 = strman.Strman.countSubstr("hihi", "null");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.lang.String str3 = strman.Strman.truncate("97", (int) (short) 0, "hi!hi!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.lang.String str1 = strman.Strman.htmlDecode("null");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.lang.String str3 = strman.Strman.removeLeft("hi!hi!", "null97", false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!hi!" + "'", str3.equals("hi!hi!"));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.util.Optional<java.lang.String> strOptional2 = strman.Strman.first("hi!", (int) (byte) 0);
        org.junit.Assert.assertNotNull(strOptional2);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.util.Optional<java.lang.String> strOptional1 = strman.Strman.trimEnd("hihi");
        org.junit.Assert.assertNotNull(strOptional1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        boolean boolean1 = strman.Strman.isLowerCase("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        boolean boolean2 = strman.Strman.contains("97", "hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.lang.String str1 = strman.Strman.removeSpaces("null");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.lang.String str4 = strman.Strman.replace("null", "null97", "null97", false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null" + "'", str4.equals("null"));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        boolean boolean3 = strman.Strman.isEnclosedBetween("null", "00390037", "null97");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        try {
            java.lang.String str3 = strman.Strman.slice("", (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.util.Optional<java.lang.String> strOptional1 = strman.Strman.trimEnd("");
        org.junit.Assert.assertNotNull(strOptional1);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.lang.String str1 = strman.Strman.startCase("hihi");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hihi" + "'", str1.equals("Hihi"));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.util.Map<java.lang.Character, java.lang.Long> charMap1 = strman.Strman.charsCount("00390037");
        org.junit.Assert.assertNotNull(charMap1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.lang.String str1 = strman.Strman.swapCase("null97");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "NULL97" + "'", str1.equals("NULL97"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        boolean boolean1 = strman.Strman.isUpperCase("hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        int int1 = strman.Strman.length("hihi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        long long4 = strman.Strman.countSubstr("hi!hi!", "hi!hi!", true, true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.lang.String str4 = strman.Strman.replace("NULL97", "", "null97", false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null97Nnull97Unull97Lnull97Lnull979null977null97" + "'", str4.equals("null97Nnull97Unull97Lnull97Lnull979null977null97"));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.lang.String str1 = strman.Strman.htmlDecode("NULL97");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.String str1 = strman.Strman.lowerFirst("hi!hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hi!" + "'", str1.equals("hi!hi!"));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.lang.String str1 = strman.Strman.collapseWhitespace("Hihi");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hihi" + "'", str1.equals("Hihi"));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.util.Optional<java.lang.String> strOptional1 = strman.Strman.head("");
        org.junit.Assert.assertNotNull(strOptional1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.util.Optional<java.lang.String> strOptional1 = strman.Strman.trimStart("");
        org.junit.Assert.assertNotNull(strOptional1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.lang.String str1 = strman.Strman.toStudlyCase("hihi");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hihi" + "'", str1.equals("Hihi"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.lang.String str1 = strman.Strman.transliterate("null");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        boolean boolean2 = strman.Strman.contains("Hihi", "Hihi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.lang.String str1 = strman.Strman.formatNumber(10L);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10" + "'", str1.equals("10"));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.lang.String str3 = strman.Strman.ensureLeft("", "NULL97", true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "NULL97" + "'", str3.equals("NULL97"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.lang.String str3 = strman.Strman.truncate("null97Nnull97Unull97Lnull97Lnull979null977null97", (int) (byte) 10, "");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null97Nnul" + "'", str3.equals("null97Nnul"));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        boolean boolean2 = strman.Strman.isEnclosedBetween("97", "null97");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.lang.String[] strArray3 = strman.Strman.chars("null");
        boolean boolean4 = strman.Strman.containsAny("null97Nnull97Unull97Lnull97Lnull979null977null97", strArray3);
        try {
            java.util.Optional<java.lang.String> strOptional5 = strman.Strman.trimEnd("null97", strArray3);
            org.junit.Assert.fail("Expected exception of type java.util.regex.PatternSyntaxException; message: Illegal Unicode escape sequence near index 4\r\n[n\\u\\l\\l]+$\r\n    ^");
        } catch (java.util.regex.PatternSyntaxException e) {
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        int int2 = strman.Strman.lastIndexOf("00390037", "null97");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        boolean boolean1 = strman.Strman.isBlank("00390037");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.String str1 = strman.Strman.lowerFirst("null97");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null97" + "'", str1.equals("null97"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.util.Optional<java.lang.String> strOptional1 = strman.Strman.trimEnd("hi!");
        org.junit.Assert.assertNotNull(strOptional1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.lang.String str3 = strman.Strman.safeTruncate("null97Nnull97Unull97Lnull97Lnull979null977null97", 10, "hi!hi!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!hi!" + "'", str3.equals("hi!hi!"));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        int int3 = strman.Strman.lastIndexOf("Hihi", "null97Nnul", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        long long4 = strman.Strman.countSubstr("97", "null97Nnull97Unull97Lnull97Lnull979null977null97", false, true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.String str2 = strman.Strman.removeLeft("", "97");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        boolean boolean2 = strman.Strman.unequal("10", "97");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.lang.String str1 = strman.Strman.humanize("hi!hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hi!hi!" + "'", str1.equals("Hi!hi!"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.lang.String str1 = strman.Strman.htmlDecode("null97Nnul");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.util.Optional<java.lang.String> strOptional1 = strman.Strman.tail("null");
        org.junit.Assert.assertNotNull(strOptional1);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.lang.String str1 = strman.Strman.escapeRegExp("");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.String str2 = strman.Strman.repeat("hi!", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str2.equals("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!"));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.lang.String[] strArray3 = strman.Strman.words("", "null");
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        try {
            java.util.Optional<java.lang.String> strOptional5 = strman.Strman.trimStart("NULL97", strArray3);
            org.junit.Assert.fail("Expected exception of type java.util.regex.PatternSyntaxException; message: Unclosed character class near index 3\r\n^[]+\r\n   ^");
        } catch (java.util.regex.PatternSyntaxException e) {
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.lang.String str1 = strman.Strman.toCamelCase("00390037");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00390037" + "'", str1.equals("00390037"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.util.Optional<java.lang.String> strOptional1 = strman.Strman.tail("97");
        org.junit.Assert.assertNotNull(strOptional1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        int int4 = strman.Strman.indexOf("NULL97", "97", (int) ' ', true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        long long2 = strman.Strman.countSubstr("null97Nnul", "hi!hi!");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.lang.String str3 = strman.Strman.surround("null97", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!" + "'", str3.equals("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!"));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.lang.String str3 = strman.Strman.ensureRight("hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3.equals("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!"));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.lang.String str1 = strman.Strman.slugify("null97Nnul");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null97nnul" + "'", str1.equals("null97nnul"));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        boolean boolean1 = strman.Strman.isUpperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.String str3 = strman.Strman.removeRight("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "null97Nnull97Unull97Lnull97Lnull979null977null97", false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3.equals("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!"));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.lang.String str1 = strman.Strman.startCase("");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.util.List<java.lang.String> strList4 = strman.Strman.zip(strArray3);
        boolean boolean6 = strman.Strman.containsAny("", strArray3, true);
        boolean boolean7 = strman.Strman.containsAll("00390037", strArray3);
        try {
            java.util.Optional<java.lang.String> strOptional8 = strman.Strman.trimStart("hi!hi!", strArray3);
            org.junit.Assert.fail("Expected exception of type java.util.regex.PatternSyntaxException; message: Unclosed character class near index 3\r\n^[]+\r\n   ^");
        } catch (java.util.regex.PatternSyntaxException e) {
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.lang.String str2 = strman.Strman.toDecamelize("Hihi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hihi" + "'", str2.equals("hihi"));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        long long2 = strman.Strman.countSubstr("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        boolean boolean1 = strman.Strman.isLowerCase("Hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        int int2 = strman.Strman.lastIndexOf("97", "null97Nnul");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        int int3 = strman.Strman.lastIndexOf("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 294 + "'", int3 == 294);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.lang.String[] strArray7 = new java.lang.String[] { "hihi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!", "null97Nnull97Unull97Lnull97Lnull979null977null97", "NULL97", "hihi", "null97nnul" };
        try {
            java.util.Optional<java.lang.String> strOptional8 = strman.Strman.trimEnd("Hi!hi!", strArray7);
            org.junit.Assert.fail("Expected exception of type java.util.regex.PatternSyntaxException; message: Illegal/unsupported escape sequence near index 365\r\n[hihi\\hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!\\null97Nnull97Unull97Lnull97Lnull979null977null97\\NULL97\\hihi\\null97nnul]+$\r\n                                                                                                                                                                                                                                                                                                                                                                             ^");
        } catch (java.util.regex.PatternSyntaxException e) {
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.lang.String str1 = strman.Strman.rightTrim("Hi!hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hi!hi!" + "'", str1.equals("Hi!hi!"));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.lang.String str1 = strman.Strman.swapCase("null97Nnull97Unull97Lnull97Lnull979null977null97");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "NULL97nNULL97uNULL97lNULL97lNULL979NULL977NULL97" + "'", str1.equals("NULL97nNULL97uNULL97lNULL97lNULL979NULL977NULL97"));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.lang.String str3 = strman.Strman.ensureLeft("", "Hihi", true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Hihi" + "'", str3.equals("Hihi"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.util.Optional<java.lang.String> strOptional1 = strman.Strman.head("null97");
        java.lang.Class<?> wildcardClass2 = strOptional1.getClass();
        org.junit.Assert.assertNotNull(strOptional1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        long long4 = strman.Strman.countSubstr("", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!", true, true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.lang.String[] strArray3 = strman.Strman.split("97", "");
        try {
            java.util.Optional<java.lang.String> strOptional4 = strman.Strman.trimEnd("10", strArray3);
            org.junit.Assert.fail("Expected exception of type java.util.regex.PatternSyntaxException; message: Illegal/unsupported escape sequence near index 3\r\n[9\\7]+$\r\n   ^");
        } catch (java.util.regex.PatternSyntaxException e) {
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.lang.String[] strArray4 = strman.Strman.words("", "hi!");
        java.lang.String str5 = strman.Strman.format("null", strArray4);
        try {
            java.util.Optional<java.lang.String> strOptional6 = strman.Strman.trimStart("null97nnul", strArray4);
            org.junit.Assert.fail("Expected exception of type java.util.regex.PatternSyntaxException; message: Unclosed character class near index 3\r\n^[]+\r\n   ^");
        } catch (java.util.regex.PatternSyntaxException e) {
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null" + "'", str5.equals("null"));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        boolean boolean2 = strman.Strman.endsWith("", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.lang.String str1 = strman.Strman.slugify("Hi!hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi-hi" + "'", str1.equals("hi-hi"));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.lang.String str1 = strman.Strman.startCase("null97Nnul");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Null97nnul" + "'", str1.equals("Null97nnul"));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.util.List<java.lang.String> strList5 = strman.Strman.zip(strArray4);
        boolean boolean7 = strman.Strman.containsAny("", strArray4, true);
        boolean boolean9 = strman.Strman.containsAny("hi!hi!", strArray4, true);
        java.lang.String str10 = strman.Strman.prepend("NULL97", strArray4);
        try {
            java.util.Optional<java.lang.String> strOptional11 = strman.Strman.trimEnd("NULL97nNULL97uNULL97lNULL97lNULL979NULL977NULL97", strArray4);
            org.junit.Assert.fail("Expected exception of type java.util.regex.PatternSyntaxException; message: Unclosed character class near index 3\r\n[]+$\r\n   ^");
        } catch (java.util.regex.PatternSyntaxException e) {
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "NULL97" + "'", str10.equals("NULL97"));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        boolean boolean4 = strman.Strman.endsWith("null97Nnull97Unull97Lnull97Lnull979null977null97", "hi-hi", (int) '#', false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        boolean boolean2 = strman.Strman.unequal("null97nnul", "Null97nnul");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        boolean boolean2 = strman.Strman.isEnclosedBetween("null97Nnul", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.lang.String str3 = strman.Strman.removeLeft("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi-hi", true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3.equals("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!"));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        boolean boolean2 = strman.Strman.endsWith("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hihi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.lang.String str3 = strman.Strman.ensureLeft("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!", "Hihi", false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Hihihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!" + "'", str3.equals("Hihihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!"));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.lang.String str1 = strman.Strman.upperFirst("null97Nnull97Unull97Lnull97Lnull979null977null97");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Null97Nnull97Unull97Lnull97Lnull979null977null97" + "'", str1.equals("Null97Nnull97Unull97Lnull97Lnull979null977null97"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        boolean boolean3 = strman.Strman.contains("97", "Hi!hi!", false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.lang.String str1 = strman.Strman.humanize("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!" + "'", str1.equals("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!"));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.lang.String str3 = strman.Strman.removeLeft("hi!hi!", "Hihihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!", true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!hi!" + "'", str3.equals("hi!hi!"));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        boolean boolean4 = strman.Strman.endsWith("null97Nnull97Unull97Lnull97Lnull979null977null97", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!", (int) (short) 0, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.lang.String str1 = strman.Strman.htmlEncode("null97Nnull97Unull97Lnull97Lnull979null977null97");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull" + "'", str1.equals("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull"));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.util.Optional<java.lang.String> strOptional2 = strman.Strman.at("NULL97nNULL97uNULL97lNULL97lNULL979NULL977NULL97", (int) ' ');
        org.junit.Assert.assertNotNull(strOptional2);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.lang.String str3 = strman.Strman.removeRight("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull", "hi-hi", true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull" + "'", str3.equals("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull"));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.lang.String str1 = strman.Strman.humanize("Hihi");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hihi" + "'", str1.equals("Hihi"));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.lang.String str2 = strman.Strman.ensureLeft("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str2.equals("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!"));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        boolean boolean4 = strman.Strman.endsWith("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull", "Null97nnul", (int) (byte) -1, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.lang.String str1 = strman.Strman.collapseWhitespace("hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.util.List<java.lang.String> strList6 = strman.Strman.zip(strArray5);
        boolean boolean8 = strman.Strman.containsAny("", strArray5, true);
        boolean boolean10 = strman.Strman.containsAny("hi!hi!", strArray5, true);
        boolean boolean12 = strman.Strman.containsAll("10", strArray5, false);
        boolean boolean13 = strman.Strman.containsAll("Null97Nnull97Unull97Lnull97Lnull979null977null97", strArray5);
        try {
            java.util.Optional<java.lang.String> strOptional14 = strman.Strman.trimEnd("Hi!hi!", strArray5);
            org.junit.Assert.fail("Expected exception of type java.util.regex.PatternSyntaxException; message: Unclosed character class near index 3\r\n[]+$\r\n   ^");
        } catch (java.util.regex.PatternSyntaxException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        try {
            java.lang.String str2 = strman.Strman.last("hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.lang.String[] strArray3 = strman.Strman.chop("", (int) '4');
        try {
            java.util.Optional<java.lang.String> strOptional4 = strman.Strman.trimStart("Hihi", strArray3);
            org.junit.Assert.fail("Expected exception of type java.util.regex.PatternSyntaxException; message: Unclosed character class near index 3\r\n^[]+\r\n   ^");
        } catch (java.util.regex.PatternSyntaxException e) {
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.lang.String str1 = strman.Strman.toStudlyCase("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull" + "'", str1.equals("Nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull"));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        int int4 = strman.Strman.indexOf("Null97Nnull97Unull97Lnull97Lnull979null977null97", "Hihi", 100, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.lang.String str2 = strman.Strman.ensureRight("null97", "null97Nnull97Unull97Lnull97Lnull979null977null97");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "null97null97Nnull97Unull97Lnull97Lnull979null977null97" + "'", str2.equals("null97null97Nnull97Unull97Lnull97Lnull979null977null97"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.lang.String str1 = strman.Strman.decEncode("Hi!hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "000720010500033001040010500033" + "'", str1.equals("000720010500033001040010500033"));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.lang.String[] strArray4 = strman.Strman.split("97", "");
        boolean boolean5 = strman.Strman.containsAll("Hihi", strArray4);
        try {
            java.util.Optional<java.lang.String> strOptional6 = strman.Strman.trimStart("97", strArray4);
            org.junit.Assert.fail("Expected exception of type java.util.regex.PatternSyntaxException; message: Illegal/unsupported escape sequence near index 4\r\n^[9\\7]+\r\n    ^");
        } catch (java.util.regex.PatternSyntaxException e) {
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.lang.String str1 = strman.Strman.hexEncode("null97Nnull97Unull97Lnull97Lnull979null977null97");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "006e0075006c006c00390037004e006e0075006c006c003900370055006e0075006c006c00390037004c006e0075006c006c00390037004c006e0075006c006c003900370039006e0075006c006c003900370037006e0075006c006c00390037" + "'", str1.equals("006e0075006c006c00390037004e006e0075006c006c003900370055006e0075006c006c00390037004c006e0075006c006c00390037004c006e0075006c006c003900370039006e0075006c006c003900370037006e0075006c006c00390037"));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.util.Optional<java.lang.String> strOptional1 = strman.Strman.trimEnd("null97Nnull97Unull97Lnull97Lnull979null977null97");
        org.junit.Assert.assertNotNull(strOptional1);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.lang.String str1 = strman.Strman.toStudlyCase("Hihihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hihihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!" + "'", str1.equals("Hihihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!"));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        int int4 = strman.Strman.indexOf("null97Nnull97Unull97Lnull97Lnull979null977null97", "NULL97nNULL97uNULL97lNULL97lNULL979NULL977NULL97", (int) ' ', true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.lang.String str1 = strman.Strman.reverse("null97Nnull97Unull97Lnull97Lnull979null977null97");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "79llun779llun979llunL79llunL79llunU79llunN79llun" + "'", str1.equals("79llun779llun979llunL79llunL79llunU79llunN79llun"));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        try {
            java.lang.String str2 = strman.Strman.repeat("10", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.lang.String str1 = strman.Strman.toCamelCase("000720010500033001040010500033");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "000720010500033001040010500033" + "'", str1.equals("000720010500033001040010500033"));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.util.List<java.lang.String> strList4 = strman.Strman.zip(strArray3);
        boolean boolean6 = strman.Strman.containsAny("", strArray3, true);
        boolean boolean8 = strman.Strman.containsAny("hi!hi!", strArray3, true);
        boolean boolean10 = strman.Strman.containsAll("10", strArray3, false);
        java.util.List<java.lang.String> strList11 = strman.Strman.zip(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.util.Optional<java.lang.String> strOptional1 = strman.Strman.trimStart("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97");
        org.junit.Assert.assertNotNull(strOptional1);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.util.Optional<java.lang.String> strOptional1 = strman.Strman.tail("");
        org.junit.Assert.assertNotNull(strOptional1);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.lang.String str3 = strman.Strman.leftPad("null97Nnul", "NULL97nNULL97uNULL97lNULL97lNULL979NULL977NULL97", 4);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null97Nnul" + "'", str3.equals("null97Nnul"));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.lang.String str1 = strman.Strman.escapeRegExp("000720010500033001040010500033");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "000720010500033001040010500033" + "'", str1.equals("000720010500033001040010500033"));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.lang.String str1 = strman.Strman.collapseWhitespace("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull" + "'", str1.equals("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull"));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.lang.String str1 = strman.Strman.base64Encode("");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.lang.String str1 = strman.Strman.formatNumber(1L);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.lang.String str3 = strman.Strman.leftPad("Null97Nnull97Unull97Lnull97Lnull979null977null97", "hi!hi!", 10);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Null97Nnull97Unull97Lnull97Lnull979null977null97" + "'", str3.equals("Null97Nnull97Unull97Lnull97Lnull979null977null97"));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        int int3 = strman.Strman.lastIndexOf("Null97Nnull97Unull97Lnull97Lnull979null977null97", "1", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.lang.String str1 = strman.Strman.escapeRegExp("null97Nnul");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null97Nnul" + "'", str1.equals("null97Nnul"));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        try {
            java.lang.String str2 = strman.Strman.repeat("1", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        boolean boolean2 = strman.Strman.inequal("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.lang.String str1 = strman.Strman.toCamelCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str1.equals("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!"));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.lang.String str1 = strman.Strman.underscored("Null97nnul");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null97nnul" + "'", str1.equals("null97nnul"));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.util.Optional<java.lang.String> strOptional2 = strman.Strman.at("hihi", 4);
        org.junit.Assert.assertNotNull(strOptional2);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.lang.String str1 = strman.Strman.swapCase("null97nnul");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "NULL97NNUL" + "'", str1.equals("NULL97NNUL"));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.lang.String str3 = strman.Strman.ensureLeft("10", "97", true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "9710" + "'", str3.equals("9710"));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        try {
            java.lang.String str3 = strman.Strman.decode("1", (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.util.regex.PatternSyntaxException; message: Illegal repetition near index 6\r\n(?<=\\G.{-1})\r\n      ^");
        } catch (java.util.regex.PatternSyntaxException e) {
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.lang.String str1 = strman.Strman.underscored("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97" + "'", str1.equals("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97"));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.lang.String str1 = strman.Strman.leftTrim("hi-hi");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi-hi" + "'", str1.equals("hi-hi"));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.lang.String str1 = strman.Strman.underscored("Hihi");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hihi" + "'", str1.equals("hihi"));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.lang.String str1 = strman.Strman.reverse("Hihi");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ihiH" + "'", str1.equals("ihiH"));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.lang.String str3 = strman.Strman.ensureLeft("97", "10", true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1097" + "'", str3.equals("1097"));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.lang.String str1 = strman.Strman.toStudlyCase("79llun779llun979llunL79llunL79llunU79llunN79llun");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "79llun779llun979llunL79llunL79llunU79llunN79llun" + "'", str1.equals("79llun779llun979llunL79llunL79llunU79llunN79llun"));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.lang.String str2 = strman.Strman.toDecamelize("Hi!hi!", "Null97nnul");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!hi!" + "'", str2.equals("hi!hi!"));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.util.Optional<java.lang.String> strOptional2 = strman.Strman.at("000720010500033001040010500033", (int) '4');
        org.junit.Assert.assertNotNull(strOptional2);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        int int3 = strman.Strman.lastIndexOf("", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.lang.String str1 = strman.Strman.toKebabCase("10");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10" + "'", str1.equals("10"));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.lang.String str2 = strman.Strman.toDecamelize("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull", "Null97Nnull97Unull97Lnull97Lnull979null977null97");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull" + "'", str2.equals("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull"));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.lang.String str1 = strman.Strman.collapseWhitespace("null97null97Nnull97Unull97Lnull97Lnull979null977null97");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null97null97Nnull97Unull97Lnull97Lnull979null977null97" + "'", str1.equals("null97null97Nnull97Unull97Lnull97Lnull979null977null97"));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.lang.String str1 = strman.Strman.escapeRegExp("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull" + "'", str1.equals("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull"));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        int int4 = strman.Strman.lastIndexOf("NULL97", "Hihihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!", (int) '4', true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.lang.String str1 = strman.Strman.transliterate("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str1.equals("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!"));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.lang.String str1 = strman.Strman.reverse("hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "!ih" + "'", str1.equals("!ih"));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.lang.String str1 = strman.Strman.toSnakeCase("hi!hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hi!" + "'", str1.equals("hi!hi!"));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        boolean boolean1 = strman.Strman.isBlank("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.util.Map<java.lang.Character, java.lang.Long> charMap1 = strman.Strman.charsCount("006e0075006c006c00390037004e006e0075006c006c003900370055006e0075006c006c00390037004c006e0075006c006c00390037004c006e0075006c006c003900370039006e0075006c006c003900370037006e0075006c006c00390037");
        org.junit.Assert.assertNotNull(charMap1);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        int int3 = strman.Strman.lastIndexOf("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!", "1097", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        long long4 = strman.Strman.countSubstr("null", "ihiH", true, false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.lang.String str1 = strman.Strman.startCase("hi!hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hi!hi!" + "'", str1.equals("Hi!hi!"));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.util.Map<java.lang.Character, java.lang.Long> charMap1 = strman.Strman.charsCount("10");
        org.junit.Assert.assertNotNull(charMap1);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.lang.String str1 = strman.Strman.toKebabCase("NULL97NNUL");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "n-u-l-l97-n-n-u-l" + "'", str1.equals("n-u-l-l97-n-n-u-l"));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.util.Optional<java.lang.String> strOptional1 = strman.Strman.trimEnd("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!");
        java.lang.Class<?> wildcardClass2 = strOptional1.getClass();
        org.junit.Assert.assertNotNull(strOptional1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.lang.String str3 = strman.Strman.ensureRight("null", "null97nnul", false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "nullnull97nnul" + "'", str3.equals("nullnull97nnul"));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        long long4 = strman.Strman.countSubstr("hi-hi", "null", true, false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.lang.String str3 = strman.Strman.rightPad("9710", "97", (-1));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "9710" + "'", str3.equals("9710"));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.lang.String str1 = strman.Strman.hexEncode("null97");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "006e0075006c006c00390037" + "'", str1.equals("006e0075006c006c00390037"));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        boolean boolean2 = strman.Strman.endsWith("nullnull97nnul", "006e0075006c006c00390037004e006e0075006c006c003900370055006e0075006c006c00390037004c006e0075006c006c00390037004c006e0075006c006c003900370039006e0075006c006c003900370037006e0075006c006c00390037");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        boolean boolean2 = strman.Strman.endsWith("006e0075006c006c00390037004e006e0075006c006c003900370055006e0075006c006c00390037004c006e0075006c006c00390037004c006e0075006c006c003900370039006e0075006c006c003900370037006e0075006c006c00390037", "Hihihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.lang.String[] strArray1 = strman.Strman.lines("006e0075006c006c00390037004e006e0075006c006c003900370055006e0075006c006c00390037004c006e0075006c006c00390037004c006e0075006c006c003900370039006e0075006c006c003900370037006e0075006c006c00390037");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.lang.String str1 = strman.Strman.removeNonWords("hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi" + "'", str1.equals("hi"));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.lang.String str3 = strman.Strman.safeTruncate("NULL97NNUL", (int) (byte) -1, "Hihihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Hihihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!" + "'", str3.equals("Hihihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!"));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.lang.String[] strArray1 = null;
        java.lang.String str2 = strman.Strman.prependArray("Null97Nnull97Unull97Lnull97Lnull979null977null97", strArray1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Null97Nnull97Unull97Lnull97Lnull979null977null97" + "'", str2.equals("Null97Nnull97Unull97Lnull97Lnull979null977null97"));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.lang.String str1 = strman.Strman.htmlDecode("Nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.lang.String str1 = strman.Strman.capitalize("hi");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hi" + "'", str1.equals("Hi"));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.lang.String str1 = strman.Strman.hexEncode("79llun779llun979llunL79llunL79llunU79llunN79llun");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00370039006c006c0075006e003700370039006c006c0075006e003900370039006c006c0075006e004c00370039006c006c0075006e004c00370039006c006c0075006e005500370039006c006c0075006e004e00370039006c006c0075006e" + "'", str1.equals("00370039006c006c0075006e003700370039006c006c0075006e003900370039006c006c0075006e004c00370039006c006c0075006e004c00370039006c006c0075006e005500370039006c006c0075006e004e00370039006c006c0075006e"));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        try {
            java.util.Optional<java.lang.String> strOptional2 = strman.Strman.first("97", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.lang.String str3 = strman.Strman.ensureLeft("null97nnul", "hi-hi", true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi-hinull97nnul" + "'", str3.equals("hi-hinull97nnul"));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        boolean boolean1 = strman.Strman.isLowerCase("79llun779llun979llunL79llunL79llunU79llunN79llun");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.util.List<java.lang.String> strList4 = strman.Strman.zip(strArray3);
        boolean boolean6 = strman.Strman.containsAny("", strArray3, true);
        boolean boolean7 = strman.Strman.containsAll("00390037", strArray3);
        try {
            java.util.Optional<java.lang.String> strOptional8 = strman.Strman.trimEnd("hihi", strArray3);
            org.junit.Assert.fail("Expected exception of type java.util.regex.PatternSyntaxException; message: Unclosed character class near index 3\r\n[]+$\r\n   ^");
        } catch (java.util.regex.PatternSyntaxException e) {
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.util.Optional<java.lang.String> strOptional2 = strman.Strman.first("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!", (int) (short) 10);
        org.junit.Assert.assertNotNull(strOptional2);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.lang.String str1 = strman.Strman.capitalize("Hi");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hi" + "'", str1.equals("Hi"));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.lang.String str1 = strman.Strman.toCamelCase("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!" + "'", str1.equals("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!"));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.util.Optional<java.lang.String> strOptional2 = strman.Strman.at("null97nnul", 1);
        org.junit.Assert.assertNotNull(strOptional2);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.lang.String str2 = strman.Strman.removeRight("!ih", "null97Nnul");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "!ih" + "'", str2.equals("!ih"));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.lang.String str2 = strman.Strman.removeLeft("97", "null97");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "97" + "'", str2.equals("97"));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        boolean boolean3 = strman.Strman.endsWith("", "hi!", true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        long long2 = strman.Strman.countSubstr("hi!", "hi!hi!");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.lang.String str3 = strman.Strman.encode("00370039006c006c0075006e003700370039006c006c0075006e003900370039006c006c0075006e004c00370039006c006c0075006e004c00370039006c006c0075006e005500370039006c006c0075006e004e00370039006c006c0075006e", 0, 10);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "48485155484851574848549948485499484855534848541014848515548485155484851574848549948485499484855534848541014848515748485155484851574848549948485499484855534848541014848529948485155484851574848549948485499484855534848541014848529948485155484851574848549948485499484855534848541014848535348485155484851574848549948485499484855534848541014848521014848515548485157484854994848549948485553484854101" + "'", str3.equals("48485155484851574848549948485499484855534848541014848515548485155484851574848549948485499484855534848541014848515748485155484851574848549948485499484855534848541014848529948485155484851574848549948485499484855534848541014848529948485155484851574848549948485499484855534848541014848535348485155484851574848549948485499484855534848541014848521014848515548485157484854994848549948485553484854101"));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        boolean boolean3 = strman.Strman.endsWith("Hihi", "79llun779llun979llunL79llunL79llunU79llunN79llun", false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.lang.String str3 = strman.Strman.removeLeft("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!", "79llun779llun979llunL79llunL79llunU79llunN79llun", false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!" + "'", str3.equals("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!"));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        boolean boolean3 = strman.Strman.endsWith("00370039006c006c0075006e003700370039006c006c0075006e003900370039006c006c0075006e004c00370039006c006c0075006e004c00370039006c006c0075006e005500370039006c006c0075006e004e00370039006c006c0075006e", "n-u-l-l97-n-n-u-l", false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.lang.String str1 = strman.Strman.toCamelCase("null97Nnull97Unull97Lnull97Lnull979null977null97");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null97Nnull97Unull97Lnull97Lnull979null977null97" + "'", str1.equals("null97Nnull97Unull97Lnull97Lnull979null977null97"));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.lang.String str3 = strman.Strman.ensureLeft("9710", "NULL97nNULL97uNULL97lNULL97lNULL979NULL977NULL97", true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "NULL97nNULL97uNULL97lNULL97lNULL979NULL977NULL979710" + "'", str3.equals("NULL97nNULL97uNULL97lNULL97lNULL979NULL977NULL979710"));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.lang.String str1 = strman.Strman.binEncode("hi-hinull97nnul");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "000000000110100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100" + "'", str1.equals("000000000110100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100"));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.lang.String str2 = strman.Strman.removeRight("9710", "NULL97NNUL");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "9710" + "'", str2.equals("9710"));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.lang.String str1 = strman.Strman.capitalize("hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hi!" + "'", str1.equals("Hi!"));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.util.Optional<java.lang.String> strOptional1 = strman.Strman.tail("NULL97");
        org.junit.Assert.assertNotNull(strOptional1);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.lang.String str1 = strman.Strman.capitalize("1097");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1097" + "'", str1.equals("1097"));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        try {
            java.lang.String str2 = strman.Strman.repeat("ihiH", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        boolean boolean2 = strman.Strman.endsWith("hi-hi", "null97nnul");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.lang.String[] strArray2 = strman.Strman.words("000000000110100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100", "Null97nnul");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.lang.String str2 = strman.Strman.repeat("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (int) '#');
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.lang.String str2 = strman.Strman.toDecamelize("9710", "null97Nnull97Unull97Lnull97Lnull979null977null97");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "9710" + "'", str2.equals("9710"));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        int int4 = strman.Strman.lastIndexOf("NULL97", "1097", (int) (short) 100, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.util.List<java.lang.String> strList4 = strman.Strman.zip(strArray3);
        boolean boolean6 = strman.Strman.containsAny("", strArray3, true);
        boolean boolean8 = strman.Strman.containsAny("hi!hi!", strArray3, true);
        java.lang.String str9 = strman.Strman.appendArray("10", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10" + "'", str9.equals("10"));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.lang.String str1 = strman.Strman.binEncode("Nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "000000000100111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100" + "'", str1.equals("000000000100111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100"));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.lang.String str1 = strman.Strman.capitalize("hi!hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hi!hi!" + "'", str1.equals("Hi!hi!"));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.util.Map<java.lang.Character, java.lang.Long> charMap1 = strman.Strman.charsCount("97");
        org.junit.Assert.assertNotNull(charMap1);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        boolean boolean1 = strman.Strman.isLowerCase("null");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.lang.String str2 = strman.Strman.removeLeft("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull", "Null97Nnull97Unull97Lnull97Lnull979null977null97");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull" + "'", str2.equals("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull"));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        java.lang.String str1 = strman.Strman.swapCase("79llun779llun979llunL79llunL79llunU79llunN79llun");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "79LLUN779LLUN979LLUNl79LLUNl79LLUNu79LLUNn79LLUN" + "'", str1.equals("79LLUN779LLUN979LLUNl79LLUNl79LLUNu79LLUNn79LLUN"));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.lang.String str3 = strman.Strman.removeLeft("NULL97NNUL", "hi-hinull97nnul", true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "NULL97NNUL" + "'", str3.equals("NULL97NNUL"));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        boolean boolean3 = strman.Strman.endsWith("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!", false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        java.lang.String str1 = strman.Strman.formatNumber((long) (short) 10);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "10" + "'", str1.equals("10"));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        int int1 = strman.Strman.length("hi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        int int4 = strman.Strman.lastIndexOf("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!", "", (int) (byte) -1, true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.lang.String str1 = strman.Strman.toCamelCase("48485155484851574848549948485499484855534848541014848515548485155484851574848549948485499484855534848541014848515748485155484851574848549948485499484855534848541014848529948485155484851574848549948485499484855534848541014848529948485155484851574848549948485499484855534848541014848535348485155484851574848549948485499484855534848541014848521014848515548485157484854994848549948485553484854101");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "48485155484851574848549948485499484855534848541014848515548485155484851574848549948485499484855534848541014848515748485155484851574848549948485499484855534848541014848529948485155484851574848549948485499484855534848541014848529948485155484851574848549948485499484855534848541014848535348485155484851574848549948485499484855534848541014848521014848515548485157484854994848549948485553484854101" + "'", str1.equals("48485155484851574848549948485499484855534848541014848515548485155484851574848549948485499484855534848541014848515748485155484851574848549948485499484855534848541014848529948485155484851574848549948485499484855534848541014848529948485155484851574848549948485499484855534848541014848535348485155484851574848549948485499484855534848541014848521014848515548485157484854994848549948485553484854101"));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        java.lang.String str3 = strman.Strman.ensureLeft("000000000100111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!", true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!000000000100111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100" + "'", str3.equals("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!000000000100111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100"));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        java.lang.String str1 = strman.Strman.decEncode("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001100011700108001080005700055" + "'", str1.equals("001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001100011700108001080005700055"));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        boolean boolean2 = strman.Strman.contains("null97", "9710");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        java.lang.String str3 = strman.Strman.ensureLeft("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "006e0075006c006c00390037", false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "006e0075006c006c00390037hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3.equals("006e0075006c006c00390037hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!"));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        boolean boolean1 = strman.Strman.isUpperCase("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        int int1 = strman.Strman.length("hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        java.lang.String str1 = strman.Strman.toSnakeCase("");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        java.util.Optional<java.lang.String> strOptional1 = strman.Strman.tail("006e0075006c006c00390037hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strOptional1);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.lang.String str3 = strman.Strman.rightPad("1", "006e0075006c006c00390037hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (int) ' ');
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        boolean boolean4 = strman.Strman.endsWith("Null97Nnull97Unull97Lnull97Lnull979null977null97", "", 1, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        int int4 = strman.Strman.indexOf("hi!hi!", "Hi!", (int) (short) 10, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.lang.String str3 = strman.Strman.insert("000000000110100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100", "79LLUN779LLUN979LLUNl79LLUNl79LLUNu79LLUNn79LLUN", 10);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "000000000179LLUN779LLUN979LLUNl79LLUNl79LLUNu79LLUNn79LLUN10100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100" + "'", str3.equals("000000000179LLUN779LLUN979LLUNl79LLUNl79LLUNu79LLUNn79LLUN10100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100"));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        try {
            java.lang.String str3 = strman.Strman.truncate("nullnull97nnul", 10, "nullnull97nnul");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -4");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.lang.String str1 = strman.Strman.startCase("48485155484851574848549948485499484855534848541014848515548485155484851574848549948485499484855534848541014848515748485155484851574848549948485499484855534848541014848529948485155484851574848549948485499484855534848541014848529948485155484851574848549948485499484855534848541014848535348485155484851574848549948485499484855534848541014848521014848515548485157484854994848549948485553484854101");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "48485155484851574848549948485499484855534848541014848515548485155484851574848549948485499484855534848541014848515748485155484851574848549948485499484855534848541014848529948485155484851574848549948485499484855534848541014848529948485155484851574848549948485499484855534848541014848535348485155484851574848549948485499484855534848541014848521014848515548485157484854994848549948485553484854101" + "'", str1.equals("48485155484851574848549948485499484855534848541014848515548485155484851574848549948485499484855534848541014848515748485155484851574848549948485499484855534848541014848529948485155484851574848549948485499484855534848541014848529948485155484851574848549948485499484855534848541014848535348485155484851574848549948485499484855534848541014848521014848515548485157484854994848549948485553484854101"));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        java.lang.String str1 = strman.Strman.reverse("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!000000000100111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111001000000000!ih79llun!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih" + "'", str1.equals("001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111001000000000!ih79llun!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih"));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        java.lang.String str1 = strman.Strman.toSnakeCase("006e0075006c006c00390037");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "006e0075006c006c00390037" + "'", str1.equals("006e0075006c006c00390037"));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        java.lang.String str1 = strman.Strman.lowerFirst("Hihihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hihihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!" + "'", str1.equals("hihihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!"));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        java.util.Optional<java.lang.String> strOptional1 = strman.Strman.head("001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001100011700108001080005700055");
        org.junit.Assert.assertNotNull(strOptional1);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        boolean boolean1 = strman.Strman.isBlank("ihiH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        java.lang.String str2 = strman.Strman.ensureLeft("00370039006c006c0075006e003700370039006c006c0075006e003900370039006c006c0075006e004c00370039006c006c0075006e004c00370039006c006c0075006e005500370039006c006c0075006e004e00370039006c006c0075006e", "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!00370039006c006c0075006e003700370039006c006c0075006e003900370039006c006c0075006e004c00370039006c006c0075006e004c00370039006c006c0075006e005500370039006c006c0075006e004e00370039006c006c0075006e" + "'", str2.equals("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!00370039006c006c0075006e003700370039006c006c0075006e003900370039006c006c0075006e004c00370039006c006c0075006e004c00370039006c006c0075006e005500370039006c006c0075006e004e00370039006c006c0075006e"));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        java.lang.String str1 = strman.Strman.escapeRegExp("9710");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "9710" + "'", str1.equals("9710"));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        java.lang.String str1 = strman.Strman.formatNumber((long) '#');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "35" + "'", str1.equals("35"));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        java.lang.String str1 = strman.Strman.transliterate("006e0075006c006c00390037004e006e0075006c006c003900370055006e0075006c006c00390037004c006e0075006c006c00390037004c006e0075006c006c003900370039006e0075006c006c003900370037006e0075006c006c00390037");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "006e0075006c006c00390037004e006e0075006c006c003900370055006e0075006c006c00390037004c006e0075006c006c00390037004c006e0075006c006c003900370039006e0075006c006c003900370037006e0075006c006c00390037" + "'", str1.equals("006e0075006c006c00390037004e006e0075006c006c003900370055006e0075006c006c00390037004c006e0075006c006c00390037004c006e0075006c006c003900370039006e0075006c006c003900370037006e0075006c006c00390037"));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        int int4 = strman.Strman.lastIndexOf("79LLUN779LLUN979LLUNl79LLUNl79LLUNu79LLUNn79LLUN", "nullnull97nnul", 0, true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        java.lang.String str3 = strman.Strman.rightPad("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!000000000110100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100", "006e0075006c006c00390037hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (int) '#');
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!000000000110100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100" + "'", str3.equals("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!000000000110100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100"));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        java.lang.String str1 = strman.Strman.swapCase("NULL97nNULL97uNULL97lNULL97lNULL979NULL977NULL97");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null97Nnull97Unull97Lnull97Lnull979null977null97" + "'", str1.equals("null97Nnull97Unull97Lnull97Lnull979null977null97"));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        java.lang.String str1 = strman.Strman.binEncode("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "000000000100100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110111000000000011101010000000001101100000000000110110000000000001110010000000000110111000000000110100000000000011010010000000000100001" + "'", str1.equals("000000000100100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110111000000000011101010000000001101100000000000110110000000000001110010000000000110111000000000110100000000000011010010000000000100001"));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        boolean boolean2 = strman.Strman.isEnclosedBetween("!ih", "000720010500033001040010500033");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        java.lang.String str1 = strman.Strman.decEncode("Null97nnul");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00078001170010800108000570005500110001100011700108" + "'", str1.equals("00078001170010800108000570005500110001100011700108"));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        java.lang.String[] strArray3 = strman.Strman.split("hi!hi!", "hi!");
        java.lang.String str5 = strman.Strman.join(strArray3, "hihi");
        java.lang.String[] strArray6 = strman.Strman.removeEmptyStrings(strArray3);
        java.util.Optional<java.lang.String> strOptional7 = strman.Strman.trimStart("", strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strOptional7);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        java.lang.String str1 = strman.Strman.collapseWhitespace("hi-hi");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi-hi" + "'", str1.equals("hi-hi"));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.lang.String str1 = strman.Strman.startCase("ihiH");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Ihi H" + "'", str1.equals("Ihi H"));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        java.lang.String str1 = strman.Strman.humanize("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!00370039006c006c0075006e003700370039006c006c0075006e003900370039006c006c0075006e004c00370039006c006c0075006e004c00370039006c006c0075006e005500370039006c006c0075006e004e00370039006c006c0075006e");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!00370039006c006c0075006e003700370039006c006c0075006e003900370039006c006c0075006e004c00370039006c006c0075006e004c00370039006c006c0075006e005500370039006c006c0075006e004e00370039006c006c0075006e" + "'", str1.equals("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!00370039006c006c0075006e003700370039006c006c0075006e003900370039006c006c0075006e004c00370039006c006c0075006e004c00370039006c006c0075006e005500370039006c006c0075006e004e00370039006c006c0075006e"));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        boolean boolean1 = strman.Strman.isLowerCase("48485155484851574848549948485499484855534848541014848515548485155484851574848549948485499484855534848541014848515748485155484851574848549948485499484855534848541014848529948485155484851574848549948485499484855534848541014848529948485155484851574848549948485499484855534848541014848535348485155484851574848549948485499484855534848541014848521014848515548485157484854994848549948485553484854101");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        java.util.Optional<java.lang.String> strOptional1 = strman.Strman.tail("79llun779llun979llunL79llunL79llunU79llunN79llun");
        org.junit.Assert.assertNotNull(strOptional1);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.lang.String str3 = strman.Strman.insert("n-u-l-l97-n-n-u-l", "001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111001000000000!ih79llun!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", (int) '4');
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "n-u-l-l97-n-n-u-l" + "'", str3.equals("n-u-l-l97-n-n-u-l"));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        java.util.Map<java.lang.Character, java.lang.Long> charMap1 = strman.Strman.charsCount("79llun779llun979llunL79llunL79llunU79llunN79llun");
        org.junit.Assert.assertNotNull(charMap1);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        java.lang.String str1 = strman.Strman.escapeRegExp("null");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        java.lang.String str1 = strman.Strman.base64Encode("006e0075006c006c00390037");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "MDA2ZTAwNzUwMDZjMDA2YzAwMzkwMDM3" + "'", str1.equals("MDA2ZTAwNzUwMDZjMDA2YzAwMzkwMDM3"));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        int int1 = strman.Strman.length("006e0075006c006c00390037hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 330 + "'", int1 == 330);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.lang.String str3 = strman.Strman.ensureLeft("null97null97Nnull97Unull97Lnull97Lnull979null977null97", "000000000110100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100", false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "000000000110100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100null97null97Nnull97Unull97Lnull97Lnull979null977null97" + "'", str3.equals("000000000110100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100null97null97Nnull97Unull97Lnull97Lnull979null977null97"));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        java.lang.String str1 = strman.Strman.hexEncode("001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001100011700108001080005700055");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003100300030003000310031003700300030003100300038003000300031003000380030003000300035003700300030003000350035" + "'", str1.equals("003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003100300030003000310031003700300030003100300038003000300031003000380030003000300035003700300030003000350035"));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        java.util.Optional<java.lang.String> strOptional1 = strman.Strman.trimEnd("Hi");
        org.junit.Assert.assertNotNull(strOptional1);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        int int4 = strman.Strman.indexOf("003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003100300030003000310031003700300030003100300038003000300031003000380030003000300035003700300030003000350035", "null97nnul", 0, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        boolean boolean1 = strman.Strman.isUpperCase("000000000179LLUN779LLUN979LLUNl79LLUNl79LLUNu79LLUNn79LLUN10100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        java.lang.String str2 = strman.Strman.repeat("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str2.equals("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!"));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        java.lang.String str3 = strman.Strman.surround("null97Nnull97Unull97Lnull97Lnull979null977null97", "Nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull97Nnull97Unull97Lnull97Lnull979null977null97hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97" + "'", str3.equals("Nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull97Nnull97Unull97Lnull97Lnull979null977null97hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97"));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "null" };
        java.util.Optional<java.lang.String> strOptional6 = strman.Strman.trimEnd("null", strArray5);
        boolean boolean7 = strman.Strman.containsAny("35", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strOptional6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        java.lang.String str1 = strman.Strman.slugify("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!00370039006c006c0075006e003700370039006c006c0075006e003900370039006c006c0075006e004c00370039006c006c0075006e004c00370039006c006c0075006e005500370039006c006c0075006e004e00370039006c006c0075006e");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-null97hi-00370039006c006c0075006e003700370039006c006c0075006e003900370039006c006c0075006e004c00370039006c006c0075006e004c00370039006c006c0075006e005500370039006c006c0075006e004e00370039006c006c0075006e" + "'", str1.equals("hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-null97hi-00370039006c006c0075006e003700370039006c006c0075006e003900370039006c006c0075006e004c00370039006c006c0075006e004c00370039006c006c0075006e005500370039006c006c0075006e004e00370039006c006c0075006e"));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        java.util.Optional<java.lang.String> strOptional1 = strman.Strman.head("001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111001000000000!ih79llun!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertNotNull(strOptional1);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        java.lang.String str3 = strman.Strman.safeTruncate("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!", (int) (short) -1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!" + "'", str3.equals("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!"));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        boolean boolean2 = strman.Strman.isEnclosedBetween("NULL97nNULL97uNULL97lNULL97lNULL979NULL977NULL97", "!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        boolean boolean3 = strman.Strman.isEnclosedBetween("00390037", "000000000179LLUN779LLUN979LLUNl79LLUNl79LLUNu79LLUNn79LLUN10100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100", "Null97Nnull97Unull97Lnull97Lnull979null977null97");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        boolean boolean2 = strman.Strman.contains("Hi!", "hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-hi-null97hi-00370039006c006c0075006e003700370039006c006c0075006e003900370039006c006c0075006e004c00370039006c006c0075006e004c00370039006c006c0075006e005500370039006c006c0075006e004e00370039006c006c0075006e");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        java.lang.String str3 = strman.Strman.encode("79LLUN779LLUN979LLUNl79LLUNl79LLUNu79LLUNn79LLUN", 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "000000005500000000570000000076000000007600000000850000000078000000005500000000550000000057000000007600000000760000000085000000007800000000570000000055000000005700000000760000000076000000008500000000780000000108000000005500000000570000000076000000007600000000850000000078000000010800000000550000000057000000007600000000760000000085000000007800000001170000000055000000005700000000760000000076000000008500000000780000000110000000005500000000570000000076000000007600000000850000000078" + "'", str3.equals("000000005500000000570000000076000000007600000000850000000078000000005500000000550000000057000000007600000000760000000085000000007800000000570000000055000000005700000000760000000076000000008500000000780000000108000000005500000000570000000076000000007600000000850000000078000000010800000000550000000057000000007600000000760000000085000000007800000001170000000055000000005700000000760000000076000000008500000000780000000110000000005500000000570000000076000000007600000000850000000078"));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        java.util.Optional<java.lang.String> strOptional1 = strman.Strman.tail("Hi!");
        org.junit.Assert.assertNotNull(strOptional1);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        java.lang.String str3 = strman.Strman.ensureRight("001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111001000000000!ih79llun!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "000000000100100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110111000000000011101010000000001101100000000000110110000000000001110010000000000110111000000000110100000000000011010010000000000100001", true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111001000000000!ih79llun!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih000000000100100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110111000000000011101010000000001101100000000000110110000000000001110010000000000110111000000000110100000000000011010010000000000100001" + "'", str3.equals("001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111001000000000!ih79llun!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih000000000100100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110111000000000011101010000000001101100000000000110110000000000001110010000000000110111000000000110100000000000011010010000000000100001"));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        java.lang.String str2 = strman.Strman.ensureLeft("48485155484851574848549948485499484855534848541014848515548485155484851574848549948485499484855534848541014848515748485155484851574848549948485499484855534848541014848529948485155484851574848549948485499484855534848541014848529948485155484851574848549948485499484855534848541014848535348485155484851574848549948485499484855534848541014848521014848515548485157484854994848549948485553484854101", "hi-hi");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi-hi48485155484851574848549948485499484855534848541014848515548485155484851574848549948485499484855534848541014848515748485155484851574848549948485499484855534848541014848529948485155484851574848549948485499484855534848541014848529948485155484851574848549948485499484855534848541014848535348485155484851574848549948485499484855534848541014848521014848515548485157484854994848549948485553484854101" + "'", str2.equals("hi-hi48485155484851574848549948485499484855534848541014848515548485155484851574848549948485499484855534848541014848515748485155484851574848549948485499484855534848541014848529948485155484851574848549948485499484855534848541014848529948485155484851574848549948485499484855534848541014848535348485155484851574848549948485499484855534848541014848521014848515548485157484854994848549948485553484854101"));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        java.lang.String str1 = strman.Strman.rightTrim("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull" + "'", str1.equals("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull"));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        java.lang.String str1 = strman.Strman.leftTrim("000000005500000000570000000076000000007600000000850000000078000000005500000000550000000057000000007600000000760000000085000000007800000000570000000055000000005700000000760000000076000000008500000000780000000108000000005500000000570000000076000000007600000000850000000078000000010800000000550000000057000000007600000000760000000085000000007800000001170000000055000000005700000000760000000076000000008500000000780000000110000000005500000000570000000076000000007600000000850000000078");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "000000005500000000570000000076000000007600000000850000000078000000005500000000550000000057000000007600000000760000000085000000007800000000570000000055000000005700000000760000000076000000008500000000780000000108000000005500000000570000000076000000007600000000850000000078000000010800000000550000000057000000007600000000760000000085000000007800000001170000000055000000005700000000760000000076000000008500000000780000000110000000005500000000570000000076000000007600000000850000000078" + "'", str1.equals("000000005500000000570000000076000000007600000000850000000078000000005500000000550000000057000000007600000000760000000085000000007800000000570000000055000000005700000000760000000076000000008500000000780000000108000000005500000000570000000076000000007600000000850000000078000000010800000000550000000057000000007600000000760000000085000000007800000001170000000055000000005700000000760000000076000000008500000000780000000110000000005500000000570000000076000000007600000000850000000078"));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        java.util.Optional<java.lang.String> strOptional2 = strman.Strman.first("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!00370039006c006c0075006e003700370039006c006c0075006e003900370039006c006c0075006e004c00370039006c006c0075006e004c00370039006c006c0075006e005500370039006c006c0075006e004e00370039006c006c0075006e", 294);
        org.junit.Assert.assertNotNull(strOptional2);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        long long2 = strman.Strman.countSubstr("00078001170010800108000570005500110001100011700108", "9710");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        java.lang.String str3 = strman.Strman.ensureLeft("00390037", "006e0075006c006c00390037", false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "006e0075006c006c0039003700390037" + "'", str3.equals("006e0075006c006c0039003700390037"));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        java.lang.String str1 = strman.Strman.reverse("null97nnul");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "lunn79llun" + "'", str1.equals("lunn79llun"));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        boolean boolean1 = strman.Strman.isUpperCase("00390037");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        java.lang.String str3 = strman.Strman.encode("Hi!", (-1), 100);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "7210533" + "'", str3.equals("7210533"));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        java.lang.String str1 = strman.Strman.decEncode("hi");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0010400105" + "'", str1.equals("0010400105"));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        java.lang.String[] strArray3 = strman.Strman.words("", "null");
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        try {
            java.util.Optional<java.lang.String> strOptional5 = strman.Strman.trimStart("Hi", strArray3);
            org.junit.Assert.fail("Expected exception of type java.util.regex.PatternSyntaxException; message: Unclosed character class near index 3\r\n^[]+\r\n   ^");
        } catch (java.util.regex.PatternSyntaxException e) {
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        java.lang.String str1 = strman.Strman.swapCase("Nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL" + "'", str1.equals("nULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL"));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        java.lang.String str3 = strman.Strman.surround("nullnull97nnul", "1097", "hi");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1097nullnull97nnulhi" + "'", str3.equals("1097nullnull97nnulhi"));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        java.lang.String str1 = strman.Strman.humanize("hi");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hi" + "'", str1.equals("Hi"));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        int int2 = strman.Strman.lastIndexOf("null97Nnul", "000000000100100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110111000000000011101010000000001101100000000000110110000000000001110010000000000110111000000000110100000000000011010010000000000100001");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        java.lang.String str1 = strman.Strman.htmlEncode("000000000100100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110111000000000011101010000000001101100000000000110110000000000001110010000000000110111000000000110100000000000011010010000000000100001");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        boolean boolean3 = strman.Strman.endsWith("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!", "MDA2ZTAwNzUwMDZjMDA2YzAwMzkwMDM3", false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        java.lang.String str1 = strman.Strman.collapseWhitespace("NULL97NNUL");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "NULL97NNUL" + "'", str1.equals("NULL97NNUL"));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        java.lang.String str1 = strman.Strman.underscored("hi");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi" + "'", str1.equals("hi"));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        java.lang.String str3 = strman.Strman.removeRight("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!00370039006c006c0075006e003700370039006c006c0075006e003900370039006c006c0075006e004c00370039006c006c0075006e004c00370039006c006c0075006e005500370039006c006c0075006e004e00370039006c006c0075006e", "null97", false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!00370039006c006c0075006e003700370039006c006c0075006e003900370039006c006c0075006e004c00370039006c006c0075006e004c00370039006c006c0075006e005500370039006c006c0075006e004e00370039006c006c0075006e" + "'", str3.equals("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!00370039006c006c0075006e003700370039006c006c0075006e003900370039006c006c0075006e004c00370039006c006c0075006e004c00370039006c006c0075006e005500370039006c006c0075006e004e00370039006c006c0075006e"));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        java.lang.String str2 = strman.Strman.removeRight("Hi!hi!", "null97Nnull97Unull97Lnull97Lnull979null977null97");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hi!hi!" + "'", str2.equals("Hi!hi!"));
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        java.lang.String str1 = strman.Strman.htmlEncode("null97nnul");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nullnullnullnullnullnullnullnullnullnull" + "'", str1.equals("nullnullnullnullnullnullnullnullnullnull"));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        boolean boolean2 = strman.Strman.endsWith("10", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!000000000100111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        java.lang.String str1 = strman.Strman.escapeRegExp("35");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "35" + "'", str1.equals("35"));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        java.lang.String str1 = strman.Strman.htmlDecode("001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001100011700108001080005700055");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        java.lang.String str1 = strman.Strman.humanize("001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001100011700108001080005700055");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001100011700108001080005700055" + "'", str1.equals("001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001100011700108001080005700055"));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        try {
            java.lang.String str3 = strman.Strman.decode("null97nnul", 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 0 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        java.lang.String str1 = strman.Strman.toStudlyCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!000000000110100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!000000000110100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100" + "'", str1.equals("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!000000000110100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100"));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        java.lang.String str1 = strman.Strman.toCamelCase("Ihi H");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ihiH" + "'", str1.equals("ihiH"));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        java.lang.String[] strArray4 = strman.Strman.between("", "00078001170010800108000570005500110001100011700108", "10");
        java.lang.String str5 = strman.Strman.append("nULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "nULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL" + "'", str5.equals("nULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL"));
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        java.lang.String str3 = strman.Strman.removeRight("hi-hi", "NULL97nNULL97uNULL97lNULL97lNULL979NULL977NULL979710", false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi-hi" + "'", str3.equals("hi-hi"));
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        boolean boolean2 = strman.Strman.endsWith("00370039006c006c0075006e003700370039006c006c0075006e003900370039006c006c0075006e004c00370039006c006c0075006e004c00370039006c006c0075006e005500370039006c006c0075006e004e00370039006c006c0075006e", "003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003100300030003000310031003700300030003100300038003000300031003000380030003000300035003700300030003000350035");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        boolean boolean4 = strman.Strman.endsWith("000000000100100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110111000000000011101010000000001101100000000000110110000000000001110010000000000110111000000000110100000000000011010010000000000100001", "hi-hinull97nnul", 330, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        boolean boolean1 = strman.Strman.isString((java.lang.Object) "null97null97Nnull97Unull97Lnull97Lnull979null977null97");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        java.lang.String str1 = strman.Strman.base64Encode("NULL97");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "TlVMTDk3" + "'", str1.equals("TlVMTDk3"));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        boolean boolean2 = strman.Strman.inequal("null97", "0010400105");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        java.lang.String str2 = strman.Strman.ensureRight("!ih", "null");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "!ihnull" + "'", str2.equals("!ihnull"));
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        boolean boolean4 = strman.Strman.endsWith("", "nullnull97nnul", 100, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        java.lang.String str3 = strman.Strman.rightPad("lunn79llun", "00390037", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "lunn79llun" + "'", str3.equals("lunn79llun"));
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        boolean boolean3 = strman.Strman.endsWith("000720010500033001040010500033", "", true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        java.lang.String str1 = strman.Strman.toKebabCase("nullnull97nnul");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nullnull97nnul" + "'", str1.equals("nullnull97nnul"));
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        long long4 = strman.Strman.countSubstr("", "NULL97", true, true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        java.lang.String str3 = strman.Strman.encode("null97", 2, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1101171081085755" + "'", str3.equals("1101171081085755"));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        int int2 = strman.Strman.lastIndexOf("null", "Nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull97Nnull97Unull97Lnull97Lnull979null977null97hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        java.lang.String str3 = strman.Strman.removeRight("35", "Hi!", false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "35" + "'", str3.equals("35"));
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        java.lang.String str2 = strman.Strman.last("000720010500033001040010500033", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "3" + "'", str2.equals("3"));
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        int int3 = strman.Strman.lastIndexOf("!ih", "Hihi", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        int int1 = strman.Strman.length("000720010500033001040010500033");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 30 + "'", int1 == 30);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        java.lang.String str1 = strman.Strman.htmlEncode("1101171081085755");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull" + "'", str1.equals("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull"));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        java.lang.String[] strArray1 = null;
        try {
            boolean boolean2 = strman.Strman.containsAll("null97", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        java.lang.String str1 = strman.Strman.htmlDecode("1null97null97Nnull97Unull97Lnull97Lnull979null977null97");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        java.lang.String[] strArray1 = null;
        try {
            java.util.Optional<java.lang.String> strOptional2 = strman.Strman.trimEnd("Hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Input array 'strings' can't be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        boolean boolean1 = strman.Strman.isString((java.lang.Object) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!000000000100111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        java.lang.String str3 = strman.Strman.surround("hi!hi!", "Hi!hi!", "NULL97nNULL97uNULL97lNULL97lNULL979NULL977NULL979710");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Hi!hi!hi!hi!NULL97nNULL97uNULL97lNULL97lNULL979NULL977NULL979710" + "'", str3.equals("Hi!hi!hi!hi!NULL97nNULL97uNULL97lNULL97lNULL979NULL977NULL979710"));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        java.lang.String[] strArray2 = strman.Strman.words("null97Nnul");
        java.lang.String str3 = strman.Strman.format("000000000110100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100null97null97Nnull97Unull97Lnull97Lnull979null977null97Hihihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "000000000110100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100null97null97Nnull97Unull97Lnull97Lnull979null977null97Hihihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!" + "'", str3.equals("000000000110100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100null97null97Nnull97Unull97Lnull97Lnull979null977null97Hihihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!"));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        boolean boolean1 = strman.Strman.isLowerCase("null97Nnul");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        boolean boolean1 = strman.Strman.isBlank("79llun779llun979llunL79llunL79llunU79llunN79llun");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        java.lang.String str1 = strman.Strman.startCase("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull" + "'", str1.equals("Nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull"));
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        java.util.Optional<java.lang.String> strOptional2 = strman.Strman.at("hihihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!", 1);
        org.junit.Assert.assertNotNull(strOptional2);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        java.lang.String str1 = strman.Strman.toKebabCase("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull" + "'", str1.equals("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull"));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        java.lang.String[] strArray4 = strman.Strman.chars("null");
        boolean boolean5 = strman.Strman.containsAny("null97Nnull97Unull97Lnull97Lnull979null977null97", strArray4);
        java.lang.String str6 = strman.Strman.format("null97null97Nnull97Unull97Lnull97Lnull979null977null97", strArray4);
        boolean boolean7 = strman.Strman.containsAny("1101171081085755", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null97null97Nnull97Unull97Lnull97Lnull979null977null97" + "'", str6.equals("null97null97Nnull97Unull97Lnull97Lnull979null977null97"));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        java.lang.String str1 = strman.Strman.rightTrim("Hi!hi!hi!hi!NULL97nNULL97uNULL97lNULL97lNULL979NULL977NULL979710");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hi!hi!hi!hi!NULL97nNULL97uNULL97lNULL97lNULL979NULL977NULL979710" + "'", str1.equals("Hi!hi!hi!hi!NULL97nNULL97uNULL97lNULL97lNULL979NULL977NULL979710"));
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        java.lang.String str3 = strman.Strman.ensureLeft("lunn79llun", "1", true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1lunn79llun" + "'", str3.equals("1lunn79llun"));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        java.lang.String str4 = strman.Strman.replace("79LLUN779LLUN979LLUNl79LLUNl79LLUNu79LLUNn79LLUN", "79llun779llun979llunL79llunL79llunU79llunN79llun", "", false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        try {
            java.lang.String str3 = strman.Strman.slice("006e0075006c006c00390037", (int) (short) -1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        java.lang.String str3 = strman.Strman.removeLeft("1097", "hi-hi", false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1097" + "'", str3.equals("1097"));
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        java.lang.String str1 = strman.Strman.slugify("001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001100011700108001080005700055");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001100011700108001080005700055" + "'", str1.equals("001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001100011700108001080005700055"));
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        java.lang.String str1 = strman.Strman.transliterate("1lunn79llun");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1lunn79llun" + "'", str1.equals("1lunn79llun"));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "null" };
        java.util.Optional<java.lang.String> strOptional6 = strman.Strman.trimEnd("null", strArray5);
        java.util.Optional<java.lang.String> strOptional7 = strman.Strman.trimStart("", strArray5);
        boolean boolean8 = strman.Strman.isString((java.lang.Object) strOptional7);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strOptional6);
        org.junit.Assert.assertNotNull(strOptional7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        java.lang.String str1 = strman.Strman.decEncode("null97Nnul");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00110001170010800108000570005500078001100011700108" + "'", str1.equals("00110001170010800108000570005500078001100011700108"));
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        java.lang.String str1 = strman.Strman.htmlEncode("NULL97nNULL97uNULL97lNULL97lNULL979NULL977NULL979710");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull" + "'", str1.equals("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull"));
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        java.lang.String str3 = strman.Strman.removeRight("Ihi H", "001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001100011700108001080005700055", true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Ihi H" + "'", str3.equals("Ihi H"));
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        java.lang.String str1 = strman.Strman.toCamelCase("!ihnull");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "!ihnull" + "'", str1.equals("!ihnull"));
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        boolean boolean1 = strman.Strman.isString((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        java.lang.String str2 = strman.Strman.repeat("", 10);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        java.lang.String str1 = strman.Strman.underscored("9710");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "9710" + "'", str1.equals("9710"));
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        int int4 = strman.Strman.lastIndexOf("nullnullnullnullnullnullnullnullnullnull", "000000000100111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100", (int) '#', true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        java.lang.String str3 = strman.Strman.removeLeft("n-u-l-l97-n-n-u-l", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "n-u-l-l97-n-n-u-l" + "'", str3.equals("n-u-l-l97-n-n-u-l"));
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        try {
            java.lang.String str3 = strman.Strman.slice("1", (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        java.lang.String[] strArray2 = strman.Strman.split("35", "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        java.lang.String str1 = strman.Strman.slugify("hi");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi" + "'", str1.equals("hi"));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        java.lang.String str2 = strman.Strman.repeat("006e0075006c006c00390037", 10);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037" + "'", str2.equals("006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037"));
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        java.lang.String str1 = strman.Strman.toCamelCase("00110001170010800108000570005500078001100011700108");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00110001170010800108000570005500078001100011700108" + "'", str1.equals("00110001170010800108000570005500078001100011700108"));
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        java.lang.String str1 = strman.Strman.rightTrim("hihiNULL97nNULL97uNULL97lNULL97lNULL979NULL977NULL979710");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hihiNULL97nNULL97uNULL97lNULL97lNULL979NULL977NULL979710" + "'", str1.equals("hihiNULL97nNULL97uNULL97lNULL97lNULL979NULL977NULL979710"));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        java.lang.String str1 = strman.Strman.hexEncode("00110001170010800108000570005500078001100011700108");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00300030003100310030003000300031003100370030003000310030003800300030003100300038003000300030003500370030003000300035003500300030003000370038003000300031003100300030003000310031003700300030003100300038" + "'", str1.equals("00300030003100310030003000300031003100370030003000310030003800300030003100300038003000300030003500370030003000300035003500300030003000370038003000300031003100300030003000310031003700300030003100300038"));
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        java.lang.String str1 = strman.Strman.dasherize("Ihi H");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ihi-h" + "'", str1.equals("ihi-h"));
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        boolean boolean2 = strman.Strman.isEnclosedBetween("Hihi", "3");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        try {
            java.lang.String str3 = strman.Strman.truncate("null97", (int) (byte) 1, "Hi!hi!hi!hi!NULL97nNULL97uNULL97lNULL97lNULL979NULL977NULL979710");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -63");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        boolean boolean1 = strman.Strman.isString((java.lang.Object) 2);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        java.lang.String[] strArray3 = strman.Strman.words("", "hi!");
        java.lang.String str4 = strman.Strman.format("NULL97NNUL", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "NULL97NNUL" + "'", str4.equals("NULL97NNUL"));
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        java.lang.String str1 = strman.Strman.toCamelCase("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!00370039006c006c0075006e003700370039006c006c0075006e003900370039006c006c0075006e004c00370039006c006c0075006e004c00370039006c006c0075006e005500370039006c006c0075006e004e00370039006c006c0075006e");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!00370039006c006c0075006e003700370039006c006c0075006e003900370039006c006c0075006e004c00370039006c006c0075006e004c00370039006c006c0075006e005500370039006c006c0075006e004e00370039006c006c0075006e" + "'", str1.equals("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!00370039006c006c0075006e003700370039006c006c0075006e003900370039006c006c0075006e004c00370039006c006c0075006e004c00370039006c006c0075006e005500370039006c006c0075006e004e00370039006c006c0075006e"));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        java.lang.String str1 = strman.Strman.underscored("1null97null97Nnull97Unull97Lnull97Lnull979null977null97");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1null97null97_nnull97_unull97_lnull97_lnull979null977null97" + "'", str1.equals("1null97null97_nnull97_unull97_lnull97_lnull979null977null97"));
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        java.lang.String str1 = strman.Strman.rightTrim("hihi");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hihi" + "'", str1.equals("hihi"));
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        java.lang.String[] strArray4 = strman.Strman.between("", "00078001170010800108000570005500110001100011700108", "10");
        java.lang.String str5 = strman.Strman.prepend("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!000000000110100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!000000000110100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100" + "'", str5.equals("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!000000000110100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100"));
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        java.lang.String[] strArray3 = new java.lang.String[] { "!ihnull", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!000000000110100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100" };
        boolean boolean4 = strman.Strman.containsAll("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!00370039006c006c0075006e003700370039006c006c0075006e003900370039006c006c0075006e004c00370039006c006c0075006e004c00370039006c006c0075006e005500370039006c006c0075006e004e00370039006c006c0075006e", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        java.lang.String str1 = strman.Strman.leftTrim("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str1.equals("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!"));
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        java.lang.String str2 = strman.Strman.removeRight("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!00370039006c006c0075006e003700370039006c006c0075006e003900370039006c006c0075006e004c00370039006c006c0075006e004c00370039006c006c0075006e005500370039006c006c0075006e004e00370039006c006c0075006e", "006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!00370039006c006c0075006e003700370039006c006c0075006e003900370039006c006c0075006e004c00370039006c006c0075006e004c00370039006c006c0075006e005500370039006c006c0075006e004e00370039006c006c0075006e" + "'", str2.equals("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!00370039006c006c0075006e003700370039006c006c0075006e003900370039006c006c0075006e004c00370039006c006c0075006e004c00370039006c006c0075006e005500370039006c006c0075006e004e00370039006c006c0075006e"));
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        boolean boolean2 = strman.Strman.endsWith("hihiNULL97nNULL97uNULL97lNULL97lNULL979NULL977NULL979710", "1lunn79llun");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        long long4 = strman.Strman.countSubstr("null97Nnull97Unull97Lnull97Lnull979null977null97", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull", false, false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        boolean boolean1 = strman.Strman.isUpperCase("null97Nnull97Unull97Lnull97Lnull979null977null97");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        java.lang.String str1 = strman.Strman.leftTrim("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97" + "'", str1.equals("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97"));
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        java.lang.String str1 = strman.Strman.swapCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str1.equals("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!"));
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        java.lang.String str1 = strman.Strman.base64Encode("3");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Mw==" + "'", str1.equals("Mw=="));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        java.lang.String str3 = strman.Strman.safeTruncate("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!000000000110100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100", 330, "NULL97");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "NULL97" + "'", str3.equals("NULL97"));
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        boolean boolean2 = strman.Strman.inequal("ihi-h", "006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        java.lang.String str1 = strman.Strman.toKebabCase("000000000100111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "000000000100111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100" + "'", str1.equals("000000000100111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100"));
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        java.lang.String str1 = strman.Strman.capitalize("1null97null97_nnull97_unull97_lnull97_lnull979null977null97");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1null97null97_nnull97_unull97_lnull97_lnull979null977null97" + "'", str1.equals("1null97null97_nnull97_unull97_lnull97_lnull979null977null97"));
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        java.lang.String[] strArray4 = strman.Strman.chop("NULL97nNULL97uNULL97lNULL97lNULL979NULL977NULL979710", (int) (short) 0);
        java.lang.String str5 = strman.Strman.format("hi-hinull97nnul", strArray4);
        java.lang.String str6 = strman.Strman.format("003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003100300030003000310031003700300030003100300038003000300031003000380030003000300035003700300030003000350035", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi-hinull97nnul" + "'", str5.equals("hi-hinull97nnul"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003100300030003000310031003700300030003100300038003000300031003000380030003000300035003700300030003000350035" + "'", str6.equals("003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003100300030003000310031003700300030003100300038003000300031003000380030003000300035003700300030003000350035"));
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        long long2 = strman.Strman.countSubstr("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!", "null97null97Nnull97Unull97Lnull97Lnull979null977null97");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        try {
            java.util.Optional<java.lang.String> strOptional2 = strman.Strman.first("35", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        java.lang.String str1 = strman.Strman.decEncode("00110001170010800108000570005500078001100011700108");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0004800048000490004900048000480004800049000490005500048000480004900048000560004800048000490004800056000480004800048000530005500048000480004800053000530004800048000480005500056000480004800049000490004800048000480004900049000550004800048000490004800056" + "'", str1.equals("0004800048000490004900048000480004800049000490005500048000480004900048000560004800048000490004800056000480004800048000530005500048000480004800053000530004800048000480005500056000480004800049000490004800048000480004900049000550004800048000490004800056"));
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        boolean boolean2 = strman.Strman.unequal("Nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull", "Nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        boolean boolean2 = strman.Strman.contains("1lunn79llun", "hihi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        java.util.Optional<java.lang.String> strOptional1 = strman.Strman.tail("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!000000000100111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100");
        org.junit.Assert.assertNotNull(strOptional1);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        java.lang.String str1 = strman.Strman.reverse("null97Nnul");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "lunN79llun" + "'", str1.equals("lunN79llun"));
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        java.lang.String str1 = strman.Strman.toKebabCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97" + "'", str1.equals("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97"));
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        java.util.Optional<java.lang.String> strOptional2 = strman.Strman.at("Ihi H", (int) (byte) 100);
        org.junit.Assert.assertNotNull(strOptional2);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        java.lang.String str1 = strman.Strman.capitalize("hihihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hihihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!" + "'", str1.equals("Hihihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!"));
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        java.lang.String str3 = strman.Strman.insert("1null97null97Nnull97Unull97Lnull97Lnull979null977null97", "NULL97", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "NULL971null97null97Nnull97Unull97Lnull97Lnull979null977null97" + "'", str3.equals("NULL971null97null97Nnull97Unull97Lnull97Lnull979null977null97"));
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        java.lang.String str1 = strman.Strman.swapCase("Null97nnul");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nULL97NNUL" + "'", str1.equals("nULL97NNUL"));
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        java.lang.String str3 = strman.Strman.ensureLeft("hihi", "", true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hihi" + "'", str3.equals("hihi"));
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        boolean boolean2 = strman.Strman.endsWith("!ih", "3");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        java.lang.String str1 = strman.Strman.toSnakeCase("000000000110100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100null97null97Nnull97Unull97Lnull97Lnull979null977null97Hihihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "000000000110100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100null97null97_nnull97_unull97_lnull97_lnull979null977null97_hihihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!" + "'", str1.equals("000000000110100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100null97null97_nnull97_unull97_lnull97_lnull979null977null97_hihihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!"));
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        boolean boolean4 = strman.Strman.endsWith("ihi-h", "Nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull", (int) (short) 1, false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        java.lang.String str1 = strman.Strman.underscored("ihi-h");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ihi_h" + "'", str1.equals("ihi_h"));
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        boolean boolean3 = strman.Strman.endsWith("null97Nnul", "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!000000000110100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100", false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        java.lang.String str1 = strman.Strman.binEncode("Hi");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000010010000000000001101001" + "'", str1.equals("00000000010010000000000001101001"));
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        java.lang.String str2 = strman.Strman.ensureRight("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!", "null97Nnul");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!null97Nnul" + "'", str2.equals("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!null97Nnul"));
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        java.lang.String str1 = strman.Strman.toSnakeCase("000000000100100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110111000000000011101010000000001101100000000000110110000000000001110010000000000110111000000000110100000000000011010010000000000100001");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "000000000100100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110111000000000011101010000000001101100000000000110110000000000001110010000000000110111000000000110100000000000011010010000000000100001" + "'", str1.equals("000000000100100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110111000000000011101010000000001101100000000000110110000000000001110010000000000110111000000000110100000000000011010010000000000100001"));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        java.lang.String str3 = strman.Strman.ensureLeft("Nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull", "000000000110100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100null97null97Nnull97Unull97Lnull97Lnull979null977null97Hihihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!", false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "000000000110100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100null97null97Nnull97Unull97Lnull97Lnull979null977null97Hihihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!Nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull" + "'", str3.equals("000000000110100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100null97null97Nnull97Unull97Lnull97Lnull979null977null97Hihihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!Nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull"));
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        java.lang.String str2 = strman.Strman.toDecamelize("0004800048000490004900048000480004800049000490005500048000480004900048000560004800048000490004800056000480004800048000530005500048000480004800053000530004800048000480005500056000480004800049000490004800048000480004900049000550004800048000490004800056", "7210533");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0004800048000490004900048000480004800049000490005500048000480004900048000560004800048000490004800056000480004800048000530005500048000480004800053000530004800048000480005500056000480004800049000490004800048000480004900049000550004800048000490004800056" + "'", str2.equals("0004800048000490004900048000480004800049000490005500048000480004900048000560004800048000490004800056000480004800048000530005500048000480004800053000530004800048000480005500056000480004800049000490004800048000480004900049000550004800048000490004800056"));
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        boolean boolean3 = strman.Strman.contains("00390037", "1", true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        java.lang.String str3 = strman.Strman.removeLeft("0010400105", "hihiNULL97nNULL97uNULL97lNULL97lNULL979NULL977NULL979710", true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0010400105" + "'", str3.equals("0010400105"));
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        java.lang.String str1 = strman.Strman.lowerFirst("001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111001000000000!ih79llun!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111001000000000!ih79llun!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih" + "'", str1.equals("001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111001000000000!ih79llun!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih"));
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        boolean boolean1 = strman.Strman.isString((java.lang.Object) "null97Nnul");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        try {
            java.lang.String str3 = strman.Strman.decode("000000000100100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110100000000000011010010000000000100001000000000110111000000000011101010000000001101100000000000110110000000000001110010000000000110111000000000110100000000000011010010000000000100001", 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0010000000\"");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        java.lang.String str3 = strman.Strman.ensureLeft("00110001170010800108000570005500078001100011700108", "0010400105", false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "001040010500110001170010800108000570005500078001100011700108" + "'", str3.equals("001040010500110001170010800108000570005500078001100011700108"));
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        java.lang.String str1 = strman.Strman.binEncode("ihiH");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0000000001101001000000000110100000000000011010010000000001001000" + "'", str1.equals("0000000001101001000000000110100000000000011010010000000001001000"));
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        java.lang.String str1 = strman.Strman.htmlEncode("NULL97nNULL97uNULL97lNULL97lNULL979NULL977NULL97");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull" + "'", str1.equals("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull"));
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        java.lang.String str3 = strman.Strman.insert("000000000179LLUN779LLUN979LLUNl79LLUNl79LLUNu79LLUNn79LLUN10100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100", "1101171081085755", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1101171081085755000000000179LLUN779LLUN979LLUNl79LLUNl79LLUNu79LLUNn79LLUN10100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100" + "'", str3.equals("1101171081085755000000000179LLUN779LLUN979LLUNl79LLUNl79LLUNu79LLUNn79LLUN10100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100"));
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        java.lang.String str1 = strman.Strman.removeNonWords("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!000000000110100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi000000000110100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100" + "'", str1.equals("Hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi000000000110100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100"));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        java.util.Map<java.lang.Character, java.lang.Long> charMap1 = strman.Strman.charsCount("Null97Nnull97Unull97Lnull97Lnull979null977null97");
        org.junit.Assert.assertNotNull(charMap1);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        java.lang.String str2 = strman.Strman.removeLeft("Hihi", "1null97null97_nnull97_unull97_lnull97_lnull979null977null97");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Hihi" + "'", str2.equals("Hihi"));
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        java.util.Optional<java.lang.String> strOptional2 = strman.Strman.at("97", (int) (byte) 100);
        org.junit.Assert.assertNotNull(strOptional2);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        java.lang.String[] strArray3 = strman.Strman.between("Hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi000000000110100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100", "!ih", "NULL971null97null97Nnull97Unull97Lnull97Lnull979null977null97");
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        int int1 = strman.Strman.length("null97");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        int int4 = strman.Strman.lastIndexOf("Ihi H", "00110001170010800108000570005500078001100011700108", 6, true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        boolean boolean1 = strman.Strman.isUpperCase("nULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        java.lang.String str2 = strman.Strman.last("NULL971null97null97Nnull97Unull97Lnull97Lnull979null977null97", 4);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ll97" + "'", str2.equals("ll97"));
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        java.lang.String str1 = strman.Strman.formatNumber((long) ' ');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32" + "'", str1.equals("32"));
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        java.lang.String str1 = strman.Strman.htmlDecode("!ihnull");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null" + "'", str1.equals("null"));
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        java.lang.String str2 = strman.Strman.removeLeft("006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037", "NULL97nNULL97uNULL97lNULL97lNULL979NULL977NULL979710");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037" + "'", str2.equals("006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037"));
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        boolean boolean3 = strman.Strman.contains("000000000100111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100000000000110111000000000011101010000000001101100000000000110110000000000011011100000000001110101000000000110110000000000011011000000000001101110000000000111010100000000011011000000000001101100", "hi-hinull97nnul", false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        java.util.Map<java.lang.Character, java.lang.Long> charMap1 = strman.Strman.charsCount("Hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi000000000110100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100");
        org.junit.Assert.assertNotNull(charMap1);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        java.lang.String[] strArray1 = strman.Strman.lines("NULL971null97null97Nnull97Unull97Lnull97Lnull979null977null97");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        java.lang.String str1 = strman.Strman.binEncode("35");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000001100110000000000110101" + "'", str1.equals("00000000001100110000000000110101"));
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        java.lang.String str1 = strman.Strman.lowerFirst("00300030003100310030003000300031003100370030003000310030003800300030003100300038003000300030003500370030003000300035003500300030003000370038003000300031003100300030003000310031003700300030003100300038");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00300030003100310030003000300031003100370030003000310030003800300030003100300038003000300030003500370030003000300035003500300030003000370038003000300031003100300030003000310031003700300030003100300038" + "'", str1.equals("00300030003100310030003000300031003100370030003000310030003800300030003100300038003000300030003500370030003000300035003500300030003000370038003000300031003100300030003000310031003700300030003100300038"));
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        boolean boolean1 = strman.Strman.isLowerCase("001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001040010500033001100011700108001080005700055");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        java.lang.String str1 = strman.Strman.lowerFirst("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull" + "'", str1.equals("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull"));
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        java.lang.String str3 = strman.Strman.surround("006e0075006c006c0039003700390037", "nullnullnullnullnullnullnullnullnullnull", "Hihi");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "nullnullnullnullnullnullnullnullnullnull006e0075006c006c0039003700390037Hihi" + "'", str3.equals("nullnullnullnullnullnullnullnullnullnull006e0075006c006c0039003700390037Hihi"));
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        long long4 = strman.Strman.countSubstr("NULL97", "003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003000340030003000310030003500300030003000330033003000300031003100300030003000310031003700300030003100300038003000300031003000380030003000300035003700300030003000350035", true, false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        java.lang.String str1 = strman.Strman.hexEncode("3");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0033" + "'", str1.equals("0033"));
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        java.lang.String str1 = strman.Strman.base64Encode("nULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "blVMTE5VTExOVUxMTlVMTE5VTExOVUxMTlVMTE5VTExOVUxMTlVMTE5VTExOVUxMTlVMTE5VTExOVUxMTlVMTE5VTExOVUxMTlVMTE5VTExOVUxMTlVMTE5VTExOVUxMTlVMTE5VTExOVUxMTlVMTE5VTExOVUxMTlVMTE5VTExOVUxMTlVMTE5VTExOVUxMTlVMTE5VTExOVUxMTlVMTE5VTExOVUxMTlVMTE5VTExOVUxMTlVMTE5VTExOVUxM" + "'", str1.equals("blVMTE5VTExOVUxMTlVMTE5VTExOVUxMTlVMTE5VTExOVUxMTlVMTE5VTExOVUxMTlVMTE5VTExOVUxMTlVMTE5VTExOVUxMTlVMTE5VTExOVUxMTlVMTE5VTExOVUxMTlVMTE5VTExOVUxMTlVMTE5VTExOVUxMTlVMTE5VTExOVUxMTlVMTE5VTExOVUxMTlVMTE5VTExOVUxMTlVMTE5VTExOVUxMTlVMTE5VTExOVUxMTlVMTE5VTExOVUxM"));
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        java.lang.String str1 = strman.Strman.lowerFirst("ll97");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ll97" + "'", str1.equals("ll97"));
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        java.lang.String str1 = strman.Strman.toSnakeCase("Hihi");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hihi" + "'", str1.equals("hihi"));
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        java.lang.String str2 = strman.Strman.removeRight("00000000001100110000000000110101", "hi-hi");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "00000000001100110000000000110101" + "'", str2.equals("00000000001100110000000000110101"));
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        java.lang.String str3 = strman.Strman.truncate("97", 294, "hihihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "97" + "'", str3.equals("97"));
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        java.lang.String str1 = strman.Strman.toStudlyCase("null");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Null" + "'", str1.equals("Null"));
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        boolean boolean2 = strman.Strman.endsWith("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull", "Hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        java.lang.String[] strArray6 = new java.lang.String[] { "006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037006e0075006c006c00390037", "0010400105", "hihihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!", "0000000001101001000000000110100000000000011010010000000001001000", "hihiNULL97nNULL97uNULL97lNULL97lNULL979NULL977NULL979710" };
        java.lang.String str7 = strman.Strman.format("Null97nnul", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Null97nnul" + "'", str7.equals("Null97nnul"));
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        boolean boolean3 = strman.Strman.endsWith("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!", "79llun779llun979llunL79llunL79llunU79llunN79llun", true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        int int4 = strman.Strman.lastIndexOf("Hi", "000720010500033001040010500033", (int) (short) -1, false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        java.lang.String str1 = strman.Strman.hexEncode("1lunn79llun");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0031006c0075006e006e00370039006c006c0075006e" + "'", str1.equals("0031006c0075006e006e00370039006c006c0075006e"));
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        int int3 = strman.Strman.lastIndexOf("nullnullnullnullnullnullnullnullnullnull", "MDA2ZTAwNzUwMDZjMDA2YzAwMzkwMDM3", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        java.util.Map<java.lang.Character, java.lang.Long> charMap1 = strman.Strman.charsCount("000720010500033001040010500033");
        org.junit.Assert.assertNotNull(charMap1);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        boolean boolean1 = strman.Strman.isLowerCase("TlVMTDk3");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        java.lang.String[] strArray2 = strman.Strman.chop("", (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        java.lang.String str1 = strman.Strman.toKebabCase("7210533");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "7210533" + "'", str1.equals("7210533"));
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        boolean boolean3 = strman.Strman.contains("", "hi", true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        java.lang.String str1 = strman.Strman.binEncode("hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "000000000110100000000000011010010000000000100001" + "'", str1.equals("000000000110100000000000011010010000000000100001"));
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        java.util.Optional<java.lang.String> strOptional1 = strman.Strman.trimStart("0004800048000490004900048000480004800049000490005500048000480004900048000560004800048000490004800056000480004800048000530005500048000480004800053000530004800048000480005500056000480004800049000490004800048000480004900049000550004800048000490004800056");
        org.junit.Assert.assertNotNull(strOptional1);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        java.lang.String str3 = strman.Strman.insert("ihi_h", "TlVMTDk3", (int) ' ');
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "ihi_h" + "'", str3.equals("ihi_h"));
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        boolean boolean2 = strman.Strman.unequal("0010400105", "001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111011000000000001101100000000000110110000000001010111000000000011101100000000000110110000000000011011000000000101011100000000001110110000000000011011000000000001101100000000010101110000000000111001000000000!ih79llun!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        java.lang.String str2 = strman.Strman.toDecamelize("hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!hi!" + "'", str2.equals("hi!hi!"));
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        java.lang.String str3 = strman.Strman.leftPad("00000000001100110000000000110101", "Nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull97Nnull97Unull97Lnull97Lnull979null977null97hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97", 294);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        try {
            java.lang.String str3 = strman.Strman.decode("NULL97", 6, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"NULL97\"");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        boolean boolean3 = strman.Strman.isEnclosedBetween("ll97", "null97null97Nnull97Unull97Lnull97Lnull979null977null97", "000000000110100000000000011010010000000000101101000000000110100000000000011010010000000001101110000000000111010100000000011011000000000001101100000000000011100100000000001101110000000001101110000000000110111000000000011101010000000001101100null97null97Nnull97Unull97Lnull97Lnull979null977null97Hihihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!null97hi!Nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        java.lang.String str2 = strman.Strman.toDecamelize("hi!", "hihiNULL97nNULL97uNULL97lNULL97lNULL979NULL977NULL979710");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        java.lang.String str3 = strman.Strman.ensureRight("lunN79llun", "null97null97Nnull97Unull97Lnull97Lnull979null977null97", false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "lunN79llunnull97null97Nnull97Unull97Lnull97Lnull979null977null97" + "'", str3.equals("lunN79llunnull97null97Nnull97Unull97Lnull97Lnull979null977null97"));
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        boolean boolean1 = strman.Strman.isUpperCase("0033");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        java.lang.String str1 = strman.Strman.removeNonWords("Hi!hi!hi!hi!NULL97nNULL97uNULL97lNULL97lNULL979NULL977NULL979710");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "HihihihiNULL97nNULL97uNULL97lNULL97lNULL979NULL977NULL979710" + "'", str1.equals("HihihihiNULL97nNULL97uNULL97lNULL97lNULL979NULL977NULL979710"));
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        java.lang.String str1 = strman.Strman.startCase("nULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "N Ullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull" + "'", str1.equals("N Ullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull"));
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        java.lang.String str2 = strman.Strman.removeRight("ihiH", "001040010500110001170010800108000570005500078001100011700108");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ihiH" + "'", str2.equals("ihiH"));
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        boolean boolean2 = strman.Strman.endsWith("HihihihiNULL97nNULL97uNULL97lNULL97lNULL979NULL977NULL979710", "NULL971null97null97Nnull97Unull97Lnull97Lnull979null977null97");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        java.lang.String str4 = strman.Strman.replace("0033", "null97nnul", "006e0075006c006c00390037004e006e0075006c006c003900370055006e0075006c006c00390037004c006e0075006c006c00390037004c006e0075006c006c003900370039006e0075006c006c003900370037006e0075006c006c00390037", false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0033" + "'", str4.equals("0033"));
    }
}

