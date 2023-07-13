
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test001"); }


    java.lang.String str2 = StringParser.escapeString("aa4aaaa4a a4aa", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#aa4aaaa4a a4aa#"+ "'", str2.equals("#aa4aaaa4a a4aa#"));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test002"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#  4   4hi!4   4  #", (int)(short)1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test003"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aa aa a#a", (int)(byte)-1, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test004"); }


    java.lang.String str2 = StringParser.escapeString(" # #a # ", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  # #a #  "+ "'", str2.equals("  # #a #  "));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test005"); }


    java.lang.String str2 = StringParser.escapeString("4aa#4", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 4aa#4 "+ "'", str2.equals(" 4aa#4 "));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test006"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#a4 a #4 a 4a#", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a4 a #4 a 4a#"+ "'", str2.equals("#a4 a #4 a 4a#"));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test007"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4 #4", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " #"+ "'", str2.equals(" #"));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test008"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a a####4####4####a a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a a####4####4####a a"+ "'", str2.equals("a a####4####4####a a"));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test009"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a44a  aaa44  44aaa  a44a", 0, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test010"); }


    java.lang.String str2 = StringParser.escapeString("4 a #4 a 4", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44 a #4 a 44"+ "'", str2.equals("44 a #4 a 44"));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test011"); }


    java.lang.String str2 = StringParser.escapeString("###  4a  ####  a4  ###", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "####  4a  ####  a4  ####"+ "'", str2.equals("####  4a  ####  a4  ####"));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test012"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a aaa4#aa44aa#4aaa a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a aaa4#aa44aa#4aaa a"+ "'", str2.equals("a aaa4#aa44aa#4aaa a"));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test013"); }


    java.lang.String str2 = StringParser.escapeString("a#a44####44a#a", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a#a44####44a#a4"+ "'", str2.equals("4a#a44####44a#a4"));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test014"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a#a4a", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a"+ "'", str2.equals("#a"));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test015"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4 44a44  44a44 4", (int)(byte)0, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test016"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a# aa a#aa44aa#a aa #a", 10, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test017"); }


    java.lang.String str2 = StringParser.escapeString("a4aaa# a#aa44aa#a #aaa4a", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a4aaa# a#aa44aa#a #aaa4a4"+ "'", str2.equals("4a4aaa# a#aa44aa#a #aaa4a4"));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test018"); }


    java.lang.String str2 = StringParser.escapeString("##444a  44#44#44  a444##", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4##444a  44#44#44  a444##4"+ "'", str2.equals("4##444a  44#44#44  a444##4"));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test019"); }


    java.lang.String str2 = StringParser.escapeString("#a# 4hi!4 #a#", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "##a# 4hi!4 #a##"+ "'", str2.equals("##a# 4hi!4 #a##"));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test020"); }


    java.lang.String str2 = StringParser.escapeString("#  a   #", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "##  a   ##"+ "'", str2.equals("##  a   ##"));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test021"); }


    java.lang.String str2 = StringParser.escapeString("# 44a44  44a44 #", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " # 44a44  44a44 # "+ "'", str2.equals(" # 44a44  44a44 # "));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test022"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a##4a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a##4a"+ "'", str2.equals("a##4a"));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test023"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"44##4 4# #### #4 4##44", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44##4 4# #### #4 4##44"+ "'", str2.equals("44##4 4# #### #4 4##44"));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test024"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"aa 444  444 aa", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa 444  444 aa"+ "'", str2.equals("aa 444  444 aa"));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test025"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#4  a #  ####  # a  4#", 32, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test026"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4aa ###4a### aa4", 0, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test027"); }


    java.lang.String str2 = StringParser.escapeString("a4a4    4a4a", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa4a4    4a4aa"+ "'", str2.equals("aa4a4    4a4aa"));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test028"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4 #4", 10, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test029"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#  aaa4", (int)' ', '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test030"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" #4#4a#4a4#4# ", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#4#4a#4a4#4#"+ "'", str2.equals("#4#4a#4a4#4#"));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test031"); }


    java.lang.String str2 = StringParser.escapeString("#4aa44aa4a #44# a4aa44aa4#", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " #4aa44aa4a #44# a4aa44aa4# "+ "'", str2.equals(" #4aa44aa4a #44# a4aa44aa4# "));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test032"); }


    java.lang.String str2 = StringParser.escapeString(" a#aaiaa#a ", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a a#aaiaa#a a"+ "'", str2.equals("a a#aaiaa#a a"));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test033"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4#  aaa44  44aaa  #4", 32, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test034"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aaaa4a #44# a4aaaa", (int)(byte)-1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test035"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#a ###4a### a#", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a #"+ "'", str2.equals("a #"));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test036"); }


    java.lang.String str2 = StringParser.escapeString("a444 #### 444a", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a444 #### 444a "+ "'", str2.equals(" a444 #### 444a "));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test037"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a 44  #44#  44 a", (int)(short)0, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test038"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"44  a a a44a a a  44", 0, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test039"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a##aaa44  44aaa##a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a##aaa44  44aaa##a"+ "'", str2.equals("a##aaa44  44aaa##a"));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test040"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#a  a4a #44# a4a  a#", (int)(short)1, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test041"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"444a####a444", (int)(short)0, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test042"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 4 aia 4 ", (int)(byte)-1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test043"); }


    java.lang.String str2 = StringParser.escapeString("  #a4 ", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "   #a4  "+ "'", str2.equals("   #a4  "));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test044"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a a  a a", (int)(byte)100, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test045"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"aa 44#  #44 aa", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a"+ "'", str2.equals("a"));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test046"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a4  #44#  4a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4  #44#  4a"+ "'", str2.equals("a4  #44#  4a"));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test047"); }


    java.lang.String str2 = StringParser.escapeString(" 4 #44# 4 ", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  4 #44# 4  "+ "'", str2.equals("  4 #44# 4  "));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test048"); }


    java.lang.String str2 = StringParser.escapeString("aa #4 4# #### #4 4# aa", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaa #4 4# #### #4 4# aaa"+ "'", str2.equals("aaa #4 4# #### #4 4# aaa"));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test049"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#a##a44a##a#", 0, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test050"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"aa4aa44  44aa4aa", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a"+ "'", str2.equals("a"));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test051"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a4a444#a", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a"+ "'", str2.equals("4a"));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test052"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 4a #### a4 ", (int)(byte)0, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test053"); }


    java.lang.String str2 = StringParser.escapeString(" #4#a aaa4a #44# a4aaa a#4# ", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a #4#a aaa4a #44# a4aaa a#4# a"+ "'", str2.equals("a #4#a aaa4a #44# a4aaa a#4# a"));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test054"); }


    java.lang.String str2 = StringParser.escapeString("## #aa4# ##", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "### #aa4# ###"+ "'", str2.equals("### #aa4# ###"));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test055"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"444 ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "444 "+ "'", str2.equals("444 "));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test056"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a4 a  4a", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 a"+ "'", str2.equals("4 a"));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test057"); }


    java.lang.String str2 = StringParser.escapeString("4aaa4aaaaa44aaaaa4aaa4", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4aaa4aaaaa44aaaaa4aaa4a"+ "'", str2.equals("a4aaa4aaaaa44aaaaa4aaa4a"));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test058"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" 444a#aa a#aa44aa#a aa#a444 ", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "444a#aa "+ "'", str2.equals("444a#aa "));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test059"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aa", (int)(short)1, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test060"); }


    java.lang.String str2 = StringParser.escapeString("4##  ##4", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#4##  ##4#"+ "'", str2.equals("#4##  ##4#"));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test061"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4  4#i#4  4", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4  4#i#4  4"+ "'", str2.equals("4  4#i#4  4"));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test062"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" aa 4 a a a a a44a a a a a 4 aa ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " aa 4 a a a a a44a a a a a 4 aa "+ "'", str2.equals(" aa 4 a a a a a44a a a a a 4 aa "));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test063"); }


    java.lang.String str2 = StringParser.escapeString("44a a a a44a a a a44", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 44a a a a44a a a a44 "+ "'", str2.equals(" 44a a a a44a a a a44 "));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test064"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"   a a a a44a a a a   ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "   a a a a44a a a a   "+ "'", str2.equals("   a a a a44a a a a   "));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test065"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a aa 4 aa44aa 4 aa a", 10, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test066"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4a#4 aa#4aaa44aaa4#aa 4#a4", 0, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test067"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#44a", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44"+ "'", str2.equals("44"));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test068"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4#44#4a", 52, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test069"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"##4 aa#4aaa44aaa4#aa 4##", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "##4 aa#4aaa44aaa4#aa 4##"+ "'", str2.equals("##4 aa#4aaa44aaa4#aa 4##"));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test070"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a aaiaa a", 35, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test071"); }


    java.lang.String str2 = StringParser.escapeString("####", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "######"+ "'", str2.equals("######"));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test072"); }


    java.lang.String str2 = StringParser.escapeString("4#4#i#4#4", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 4#4#i#4#4 "+ "'", str2.equals(" 4#4#i#4#4 "));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test073"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4#4#4a#4a4#4#4a", 32, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test074"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"aa 4 a a a a a44a a a a a 4 aa", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a"+ "'", str2.equals("a"));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test075"); }


    java.lang.String str2 = StringParser.escapeString(" #a4", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a #a4a"+ "'", str2.equals("a #a4a"));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test076"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"# 4a a a a44a a a a4 #", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 4a a a a44a a a a4 "+ "'", str2.equals(" 4a a a a44a a a a4 "));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test077"); }


    java.lang.String str2 = StringParser.escapeString("#a aa a##", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#a aa a##a"+ "'", str2.equals("a#a aa a##a"));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test078"); }


    java.lang.String str2 = StringParser.escapeString("a 44#44#44 a", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a 44#44#44 a#"+ "'", str2.equals("#a 44#44#44 a#"));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test079"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" a# 4   4hi!4   4 #a ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a# 4   4hi!4   4 #a "+ "'", str2.equals(" a# 4   4hi!4   4 #a "));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test080"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4aa  aaa44  44aaa  aa4", 52, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test081"); }


    java.lang.String str2 = StringParser.escapeString(" #4a44  ", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  #4a44   "+ "'", str2.equals("  #4a44   "));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test082"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"   a a a a44a a a a   ", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " "+ "'", str2.equals(" "));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test083"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4#4a#4a4#4", (int)(byte)10, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test084"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"44a a a a44a a a a44", 32, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test085"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#4#a aaa4a #44# a4aaa a#4#", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4#"+ "'", str2.equals("4#"));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test086"); }


    java.lang.String str2 = StringParser.escapeString("a# aaa# a#aa44aa#a #aaa #a", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a# aaa# a#aa44aa#a #aaa #a#"+ "'", str2.equals("#a# aaa# a#aa44aa#a #aaa #a#"));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test087"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"   4 #### 4   ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "   4 #### 4   "+ "'", str2.equals("   4 #### 4   "));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test088"); }


    java.lang.String str2 = StringParser.escapeString("  #aa4#  ", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4  #aa4#  4"+ "'", str2.equals("4  #aa4#  4"));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test089"); }


    java.lang.String str2 = StringParser.escapeString("a  #a4a   a", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a  #a4a   a4"+ "'", str2.equals("4a  #a4a   a4"));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test090"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" 4   4hi!4   4 ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 4   4hi!4   4 "+ "'", str2.equals(" 4   4hi!4   4 "));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test091"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4aaa4#aa44aa#4aaa4a", (int)'#', '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test092"); }


    java.lang.String str2 = StringParser.escapeString("  a4aa44   ", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "   a4aa44    "+ "'", str2.equals("   a4aa44    "));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test093"); }


    java.lang.String str2 = StringParser.escapeString("#aa 444####444 aa#", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#aa 444####444 aa#a"+ "'", str2.equals("a#aa 444####444 aa#a"));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test094"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"##a a##aa444##444aa##a a##", (int)'a', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test095"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" a# 4   4hi!4   4 #a ", 10, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test096"); }


    java.lang.String str2 = StringParser.escapeString(" 4##44##4 ", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  4##44##4  "+ "'", str2.equals("  4##44##4  "));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test097"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"aa4a#4aaiaa4#a4aa", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa4a#4aaiaa4#a4aa"+ "'", str2.equals("aa4a#4aaiaa4#a4aa"));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test098"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 4 #44# 4 ", (int)(short)10, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test099"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4##4a 44#44#44 a4##4", 97, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test100"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a###  #a", 35, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test101"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#a aaa4#aa44aa#4aaa a#", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a aaa4#"+ "'", str2.equals("a aaa4#"));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test102"); }


    java.lang.String str2 = StringParser.escapeString(" a#", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  a# "+ "'", str2.equals("  a# "));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test103"); }


    java.lang.String str2 = StringParser.escapeString("aa4##  aaa44  44aaa  ##4aa", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " aa4##  aaa44  44aaa  ##4aa "+ "'", str2.equals(" aa4##  aaa44  44aaa  ##4aa "));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test104"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"## a", 32, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test105"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#aa4a #44# a4aa#", 10, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test106"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4# 4 a a a a a44a a a a a 4 #4", (int)(short)10, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test107"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aa44  a a a a44a a a a  44aa", 97, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test108"); }


    java.lang.String str2 = StringParser.escapeString("a##  aaa44  44aaa  ##a", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a##  aaa44  44aaa  ##a#"+ "'", str2.equals("#a##  aaa44  44aaa  ##a#"));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test109"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4 4#a 4", (int)(byte)10, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test110"); }


    java.lang.String str2 = StringParser.escapeString("a#a#a44a#a#a", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a#a#a44a#a#a#"+ "'", str2.equals("#a#a#a44a#a#a#"));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test111"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a 4#aa44 a", (int)(byte)100, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test112"); }


    java.lang.String str2 = StringParser.escapeString("#4#a#", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "##4#a##"+ "'", str2.equals("##4#a##"));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test113"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#  #a4 #### 4a#  #", 0, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test114"); }


    java.lang.String str2 = StringParser.escapeString(" 4a#4aaaaa44aaaaa4#a4 ", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  4a#4aaaaa44aaaaa4#a4  "+ "'", str2.equals("  4a#4aaaaa44aaaaa4#a4  "));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test115"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a #a  a# a", 97, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test116"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4a# 4   4hi!4   4 #a4", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a# 4   4hi!4   4 #a4"+ "'", str2.equals("4a# 4   4hi!4   4 #a4"));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test117"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" #  ####  # ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " #  ####  # "+ "'", str2.equals(" #  ####  # "));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test118"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a#4a #44# a4#a", 32, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test119"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"44#4aa444##444aa4#44", (int)(byte)100, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test120"); }


    java.lang.String str2 = StringParser.escapeString("#aa  44#44#44  aa#", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4#aa  44#44#44  aa#4"+ "'", str2.equals("4#aa  44#44#44  aa#4"));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test121"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4  #aa4#  4", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  #aa4"+ "'", str2.equals("  #aa4"));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test122"); }


    java.lang.String str2 = StringParser.escapeString(" 4 #a a4a# 4 ", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a 4 #a a4a# 4 a"+ "'", str2.equals("a 4 #a a4a# 4 a"));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test123"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a# aa4 #a", (int)'a', '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test124"); }


    java.lang.String str2 = StringParser.escapeString("#4 a##aa444##444aa##a 4#", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#4 a##aa444##444aa##a 4#a"+ "'", str2.equals("a#4 a##aa444##444aa##a 4#a"));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test125"); }


    java.lang.String str2 = StringParser.escapeString("4a #4a# a4", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4a #4a# a4a"+ "'", str2.equals("a4a #4a# a4a"));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test126"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#a# 4hi!4 #a#", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#"+ "'", str2.equals("a#"));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test127"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a#44aaaaa44aaaaa44#a", 35, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test128"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"  a4aa44  44aa4a  ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  a4aa44  44aa4a  "+ "'", str2.equals("  a4aa44  44aa4a  "));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test129"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a a # a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a a # a"+ "'", str2.equals("a a # a"));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test130"); }


    java.lang.String str2 = StringParser.escapeString("a##4 a4aa44  4##a", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a##4 a4aa44  4##a#"+ "'", str2.equals("#a##4 a4aa44  4##a#"));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test131"); }


    java.lang.String str2 = StringParser.escapeString("a#44#4aa444##444aa4#44#a", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa#44#4aa444##444aa4#44#aa"+ "'", str2.equals("aa#44#4aa444##444aa4#44#aa"));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test132"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a#4 a#aa4a 4#a", 100, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test133"); }


    java.lang.String str2 = StringParser.escapeString("a##aa4", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a##aa4#"+ "'", str2.equals("#a##aa4#"));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test134"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4444a4    4a4444a", (int)(byte)-1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test135"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#a#a44a#a#", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#"+ "'", str2.equals("a#"));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test136"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" #aaiaa# ", 0, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test137"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#a#aaaa44aaaa#a#", 52, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test138"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a#a444####444a#a", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a"+ "'", str2.equals("#a"));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test139"); }


    java.lang.String str2 = StringParser.escapeString("4#a aa a#aa44aa#a aa a#4", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4#a aa a#aa44aa#a aa a#4a"+ "'", str2.equals("a4#a aa a#aa44aa#a aa a#4a"));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test140"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aa4 4a4aa", (int)(byte)0, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test141"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"aa 4 aa44aa 4 aa", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a"+ "'", str2.equals("a"));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test142"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#44a", (int)(byte)1, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test143"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aa #a4aaa44aaa4a# aa", 35, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test144"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"aa4 4a4aa", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa4 4a4aa"+ "'", str2.equals("aa4 4a4aa"));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test145"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"##aa aaa4#aa44aa#4aaa aa##", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "##aa aaa4#aa44aa#4aaa aa##"+ "'", str2.equals("##aa aaa4#aa44aa#4aaa aa##"));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test146"); }


    java.lang.String str2 = StringParser.escapeString("44 a #4 a 44", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 44 a #4 a 44 "+ "'", str2.equals(" 44 a #4 a 44 "));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test147"); }


    java.lang.String str2 = StringParser.escapeString("# 4#44 #", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " # 4#44 # "+ "'", str2.equals(" # 4#44 # "));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test148"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a#4a4##4a4#a", (int)(short)1, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test149"); }


    java.lang.String str2 = StringParser.escapeString("4a4 a#aa a#aa44aa#a aa#a 4a4", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4a4 a#aa a#aa44aa#a aa#a 4a4a"+ "'", str2.equals("a4a4 a#aa a#aa44aa#a aa#a 4a4a"));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test150"); }


    java.lang.String str2 = StringParser.escapeString("4 ##aa4## 4", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44 ##aa4## 44"+ "'", str2.equals("44 ##aa4## 44"));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test151"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4#4#4a#4a4#4#4a", 0, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test152"); }


    java.lang.String str2 = StringParser.escapeString("4#4#4a4    4a4#4#4", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#4#4#4a4    4a4#4#4#"+ "'", str2.equals("#4#4#4a4    4a4#4#4#"));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test153"); }


    java.lang.String str2 = StringParser.escapeString("44 aa#4", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a44 aa#4a"+ "'", str2.equals("a44 aa#4a"));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test154"); }


    java.lang.String str2 = StringParser.escapeString("#444 #", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " #444 # "+ "'", str2.equals(" #444 # "));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test155"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#a aa a##", (int)' ', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test156"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4a4##a## #4##4a4", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4"+ "'", str2.equals("a4"));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test157"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4# a a44a a #4", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4# a a44a a #4"+ "'", str2.equals("4# a a44a a #4"));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test158"); }


    java.lang.String str2 = StringParser.escapeString("a   #4aaaaa44aaaaa4#   a", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a   #4aaaaa44aaaaa4#   a#"+ "'", str2.equals("#a   #4aaaaa44aaaaa4#   a#"));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test159"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" a4##44##4a ", (int)(byte)10, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test160"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a4aa4 #4a", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a"+ "'", str2.equals("4a"));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test161"); }


    java.lang.String str2 = StringParser.escapeString("4 aa444##444aa 4", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44 aa444##444aa 44"+ "'", str2.equals("44 aa444##444aa 44"));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test162"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aa4 # 44#44#44 # 4aa", (int)'#', ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test163"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"## 4#i#4 ##", (int)'4', ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test164"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"44##44", (int)(byte)100, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test165"); }


    java.lang.String str2 = StringParser.escapeString("4##a a a a44a a a a##4", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44##a a a a44a a a a##44"+ "'", str2.equals("44##a a a a44a a a a##44"));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test166"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#4  #a4a   4#", (int)(short)-1, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test167"); }


    java.lang.String str2 = StringParser.escapeString("a4a#a a#a#a4a", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa4a#a a#a#a4aa"+ "'", str2.equals("aa4a#a a#a#a4aa"));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test168"); }


    java.lang.String str2 = StringParser.escapeString("4  4a4a4a 4a4  4", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 4  4a4a4a 4a4  4 "+ "'", str2.equals(" 4  4a4a4a 4a4  4 "));

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test169"); }


    java.lang.String str2 = StringParser.escapeString("#  4   #", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#  4   #a"+ "'", str2.equals("a#  4   #a"));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test170"); }


    java.lang.String str2 = StringParser.escapeString("a4a44aaaaa44aaaaa44a4a", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a4a44aaaaa44aaaaa44a4a#"+ "'", str2.equals("#a4a44aaaaa44aaaaa44a4a#"));

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test171"); }


    java.lang.String str2 = StringParser.escapeString(" 4#aa44aa#4 ", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 4#aa44aa#4 4"+ "'", str2.equals("4 4#aa44aa#4 4"));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test172"); }


    java.lang.String str2 = StringParser.escapeString("#aaa444##444aaa#", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " #aaa444##444aaa# "+ "'", str2.equals(" #aaa444##444aaa# "));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test173"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aaa4a #44# a4aaa", 1, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test174"); }


    java.lang.String str2 = StringParser.escapeString("##aa ", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4##aa 4"+ "'", str2.equals("4##aa 4"));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test175"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4## a4####4a ##4", (int)' ', ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test176"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a#4####4#a", (int)'4', '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test177"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4 a 444##444 a 4", (int)'#', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test178"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4a aaaaaa44aaaaaa a4", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a aaaaaa44aaaaaa a4"+ "'", str2.equals("4a aaaaaa44aaaaaa a4"));

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test179"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 4# a a44a a #4 ", 52, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test180"); }


    java.lang.String str2 = StringParser.escapeString("###aa44aa###", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "####aa44aa####"+ "'", str2.equals("####aa44aa####"));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test181"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" #  4  4  # ", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "# "+ "'", str2.equals("# "));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test182"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4 a  4hi!4  a 4", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a  4"+ "'", str2.equals(" a  4"));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test183"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a#a4aaiaa4a#a", 100, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test184"); }


    java.lang.String str2 = StringParser.escapeString("a a  a a", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a a  a a "+ "'", str2.equals(" a a  a a "));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test185"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4#a a4a#4a", (int)(short)10, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test186"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#a4 #", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4 "+ "'", str2.equals("a4 "));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test187"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4aaaaa44", 10, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test188"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4a  #a4a   a4", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a  #a4"+ "'", str2.equals("a  #a4"));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test189"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"##4 aa#4aaa44aaa4#aa 4##", (int)(byte)-1, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test190"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"aa4a  44#44#44  a4aa", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a"+ "'", str2.equals("a"));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test191"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#a  4a4aa44  44aa4a4  a#", (int)'#', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test192"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"# a#aa4", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a#"+ "'", str2.equals(" a#"));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test193"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"aa4aa44  44aa4aa", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa4aa44  44aa4aa"+ "'", str2.equals("aa4aa44  44aa4aa"));

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test194"); }


    java.lang.String str2 = StringParser.escapeString("aa#a#a44a#a#aa", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4aa#a#a44a#a#aa4"+ "'", str2.equals("4aa#a#a44a#a#aa4"));

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test195"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"  #aa4", 52, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test196"); }


    java.lang.String str2 = StringParser.escapeString("4a444#4", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 4a444#4 "+ "'", str2.equals(" 4a444#4 "));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test197"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#aaaa#aaaaa4aaa#", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#aaaa#aaaaa4aaa#"+ "'", str2.equals("#aaaa#aaaaa4aaa#"));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test198"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"   #4#44#4#   ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "   #4#44#4#   "+ "'", str2.equals("   #4#44#4#   "));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test199"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#a #4#", (int)'a', '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test200"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a#4# #### #4#a", (int)' ', '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test201"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" #aa 444####444 aa# ", (int)'a', '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test202"); }


    java.lang.String str2 = StringParser.escapeString("4# ##i## #4", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44# ##i## #44"+ "'", str2.equals("44# ##i## #44"));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test203"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#a  a4a #44# a4a  a#", 10, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test204"); }


    java.lang.String str2 = StringParser.escapeString("4a aaaaaa44aaaaaa a4", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 4a aaaaaa44aaaaaa a4 "+ "'", str2.equals(" 4a aaaaaa44aaaaaa a4 "));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test205"); }


    java.lang.String str2 = StringParser.escapeString(" #a#4a4aa44  44aa4a4#a# ", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  #a#4a4aa44  44aa4a4#a#  "+ "'", str2.equals("  #a#4a4aa44  44aa4a4#a#  "));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test206"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4aa #a  a# aa4", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4aa #a  a# aa4"+ "'", str2.equals("4aa #a  a# aa4"));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test207"); }


    java.lang.String str2 = StringParser.escapeString("a#aa #a#a", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a#aa #a#a#"+ "'", str2.equals("#a#aa #a#a#"));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test208"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4aa #### aa4", (int)(byte)1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test209"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"   #4aaaaa44aaaaa4#   ", 10, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test210"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" a4a #44# a4a ", (int)(short)100, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test211"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a#44aa", (int)(short)-1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test212"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a##   ####   ##a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a##   ####   ##a"+ "'", str2.equals("a##   ####   ##a"));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test213"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"# a#", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a"+ "'", str2.equals(" a"));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test214"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a#4#   ####   #4#a", 1, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test215"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"   44a444   ", 32, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test216"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#4a4aa44 #", 32, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test217"); }


    java.lang.String str2 = StringParser.escapeString(" 4aa44  44aa4 ", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  4aa44  44aa4  "+ "'", str2.equals("  4aa44  44aa4  "));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test218"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#4## #44#444# ##4#", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#4## #44#444# ##4#"+ "'", str2.equals("#4## #44#444# ##4#"));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test219"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4aaa4a 4", (int)(byte)1, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test220"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a# aa4 #a", 1, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test221"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a#a4    4a#a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#a4    4a#a"+ "'", str2.equals("a#a4    4a#a"));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test222"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"  4#aa4#4  ", 100, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test223"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4444#44444", (int)(byte)-1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test224"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4a### ", (int)(short)100, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test225"); }


    java.lang.String str2 = StringParser.escapeString("4aa44##44aa4", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4aa44##44aa4a"+ "'", str2.equals("a4aa44##44aa4a"));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test226"); }


    java.lang.String str2 = StringParser.escapeString("#  a #4", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "##  a #4#"+ "'", str2.equals("##  a #4#"));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test227"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a4 #", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 "+ "'", str2.equals("4 "));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test228"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" # 4a4 hi! 4a4 # ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " # 4a4 hi! 4a4 # "+ "'", str2.equals(" # 4a4 hi! 4a4 # "));

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test229"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4a##4 4# #### #4 4##a4", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a##4"+ "'", str2.equals("a##4"));

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test230"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"   4#a#i#a#4   ", (int)'a', ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test231"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a ##4a# a", (int)(byte)10, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test232"); }


    java.lang.String str2 = StringParser.escapeString("  aa 4 a a a a a44a a a a a 4 aa  ", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a  aa 4 a a a a a44a a a a a 4 aa  a"+ "'", str2.equals("a  aa 4 a a a a a44a a a a a 4 aa  a"));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test233"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aa ###4a### aa", (int)(short)1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test234"); }


    java.lang.String str2 = StringParser.escapeString("a4 44a", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a4 44a "+ "'", str2.equals(" a4 44a "));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test235"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4aa4aaaa4a a4aa4", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa4"+ "'", str2.equals("aa4"));

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test236"); }


    java.lang.String str2 = StringParser.escapeString("4 a###4####4###a 4", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4 a###4####4###a 4a"+ "'", str2.equals("a4 a###4####4###a 4a"));

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test237"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a4   #4aaaaa44aaaaa4#   4a", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4   #4a"+ "'", str2.equals("4   #4a"));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test238"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4a4a 4", 0, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test239"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4a4 a  4a4", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a4 a  4a4"+ "'", str2.equals("4a4 a  4a4"));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test240"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a 4#i#4 a", 0, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test241"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a  #4aaaaa44aaaaa4#  a", 100, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test242"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"##4##4##", 0, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test243"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" aa ", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa"+ "'", str2.equals("aa"));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test244"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a      a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a      a"+ "'", str2.equals("a      a"));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test245"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#aa  aaa44  44aaa  aa#", (int)(short)1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test246"); }


    java.lang.String str2 = StringParser.escapeString("# aa4 #", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " # aa4 # "+ "'", str2.equals(" # aa4 # "));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test247"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aa#4a ", 35, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test248"); }


    java.lang.String str2 = StringParser.escapeString("4#4##44##4#4", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4#4##44##4#4a"+ "'", str2.equals("a4#4##44##4#4a"));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test249"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"  4##4a44  44a4##4  ", 0, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test250"); }


    java.lang.String str2 = StringParser.escapeString("a 4   4hi!4   4 a", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a 4   4hi!4   4 a "+ "'", str2.equals(" a 4   4hi!4   4 a "));

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test251"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"44a444", 100, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test252"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4##a  a##4", 0, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test253"); }


    java.lang.String str2 = StringParser.escapeString("4a##a# aa44aa #a##a4", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4a##a# aa44aa #a##a4a"+ "'", str2.equals("a4a##a# aa44aa #a##a4a"));

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test254"); }


    java.lang.String str2 = StringParser.escapeString("4# ###4a### #4", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 4# ###4a### #4 "+ "'", str2.equals(" 4# ###4a### #4 "));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test255"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" 4a##4a#a4 ", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a##4a#a4"+ "'", str2.equals("4a##4a#a4"));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test256"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"  4a", (int)(short)10, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test257"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a# ##4a# #a", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "# ##4a"+ "'", str2.equals("# ##4a"));

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test258"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"44aaaaa44aaaaa44", (int)'#', '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test259"); }


    java.lang.String str2 = StringParser.escapeString("4aa4a ", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4aa4a a"+ "'", str2.equals("a4aa4a a"));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test260"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4 ##aa4## 4", (int)(byte)-1, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test261"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4 a# 4hi!4 #a 4", 1, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test262"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a#a  a#a", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a"+ "'", str2.equals("#a"));

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test263"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#aaa444##444aaa#", (int)'#', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test264"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#a4a  44#44#44  a4a#", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a4a  44#44#44  a4a#"+ "'", str2.equals("#a4a  44#44#44  a4a#"));

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test265"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4a #a4 #### 4a# a4", 35, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test266"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4#aaa a#aa4#4", 35, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test267"); }


    java.lang.String str2 = StringParser.escapeString("a4a## #44# ##a4a", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a4a## #44# ##a4a#"+ "'", str2.equals("#a4a## #44# ##a4a#"));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test268"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" #a4", (int)(short)0, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test269"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"  4a4a4a 4a4  ", 100, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test270"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a44aaaa44aaaa44a", (int)(byte)0, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test271"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#a#aaaa44aaaa#a#", (int)(byte)1, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test272"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#4#  #4#", (int)' ', '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test273"); }


    java.lang.String str2 = StringParser.escapeString("4# #a a#a# #4", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4# #a a#a# #4a"+ "'", str2.equals("a4# #a a#a# #4a"));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test274"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#4#44a44  44a44#4#", 97, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test275"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4aaaaaa4", (int)(short)-1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test276"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a# 4##4a44  44a4##4 #a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a# 4##4a44  44a4##4 #a"+ "'", str2.equals("a# 4##4a44  44a4##4 #a"));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test277"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4# 4 a a a a a44a a a a a 4 #4", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "# 4"+ "'", str2.equals("# 4"));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test278"); }


    java.lang.String str2 = StringParser.escapeString("444##4a44  44a4##444", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 444##4a44  44a4##444 "+ "'", str2.equals(" 444##4a44  44a4##444 "));

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test279"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#4 aa#4aaa44aaa4#aa 4#", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#4 aa#4aaa44aaa4#aa 4#"+ "'", str2.equals("#4 aa#4aaa44aaa4#aa 4#"));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test280"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"## a4##aa44aa##4a ##", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "## a4##aa44aa##4a ##"+ "'", str2.equals("## a4##aa44aa##4a ##"));

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test281"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#a  ####  a#", 32, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test282"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 4aaa a#aa44aa#a aaa4 ", 0, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test283"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aa 44#44#44 aa", (int)(short)100, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test284"); }


    java.lang.String str2 = StringParser.escapeString("4aa #### aa4", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 4aa #### aa4 "+ "'", str2.equals(" 4aa #### aa4 "));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test285"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a# a#aa44aa#a #a", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "# a"+ "'", str2.equals("# a"));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test286"); }


    java.lang.String str2 = StringParser.escapeString("##4 hi! 4##", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "###4 hi! 4###"+ "'", str2.equals("###4 hi! 4###"));

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test287"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 4  a a a a44a a a a  4 ", (int)(short)1, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test288"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"444a44", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4"+ "'", str2.equals("4"));

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test289"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4#aa4aa4aaaaa44aaaaa4aa4aa#4", 32, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test290"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#4#aaaaa44aaaaa#4#", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4#"+ "'", str2.equals("4#"));

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test291"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a 4 a a a a a44a a a a a 4 a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a 4 a a a a a44a a a a a 4 a"+ "'", str2.equals("a 4 a a a a a44a a a a a 4 a"));

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test292"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a44a4    4a44a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a44a4    4a44a"+ "'", str2.equals("a44a4    4a44a"));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test293"); }


    java.lang.String str2 = StringParser.escapeString(" #aa #4a# ", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 #aa #4a# 4"+ "'", str2.equals("4 #aa #4a# 4"));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test294"); }


    java.lang.String str2 = StringParser.escapeString("4##aaa44  44aaa##4", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#4##aaa44  44aaa##4#"+ "'", str2.equals("#4##aaa44  44aaa##4#"));

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test295"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a44a aaa4a #44# a4aaa a44a", (int)' ', '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test296"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4##4a44  44a4##4", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "##4"+ "'", str2.equals("##4"));

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test297"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"## 4a#", (int)(byte)-1, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test298"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" a##4 hi! 4##a ", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a##4 "+ "'", str2.equals("a##4 "));

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test299"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4a# ##4a# #a4", (int)'a', '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test300"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a4 4a4a", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 4a"+ "'", str2.equals("4 4a"));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test301"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" #4#44#4# ", (int)(short)10, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test302"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4 a  4hi!4  a 4", (int)(short)-1, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test303"); }


    java.lang.String str2 = StringParser.escapeString("   4 #### 4   ", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "    4 #### 4    "+ "'", str2.equals("    4 #### 4    "));

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test304"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aa#i#aa", (int)(short)-1, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test305"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" aaa #4aa ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " aaa #4aa "+ "'", str2.equals(" aaa #4aa "));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test306"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"44 aa444##444aa 44", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4"+ "'", str2.equals("4"));

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test307"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a##44##a", (int)'4', '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test308"); }


    java.lang.String str2 = StringParser.escapeString("#4a444#4#", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "##4a444#4##"+ "'", str2.equals("##4a444#4##"));

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test309"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"  #aa4  ", 10, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test310"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" aaaa44  44aaaa ", (int)(short)-1, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test311"); }


    java.lang.String str2 = StringParser.escapeString("4 #i# 4", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#4 #i# 4#"+ "'", str2.equals("#4 #i# 4#"));

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test312"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4 a", 35, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test313"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" # aa a#aa4", 52, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test314"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4#a #44# a#4", (int)' ', ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test315"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#444# 4#", (int)' ', ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test316"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4a4 a4", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a4 a4"+ "'", str2.equals("4a4 a4"));

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test317"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" #a4 #### 4a# ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " #a4 #### 4a# "+ "'", str2.equals(" #a4 #### 4a# "));

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test318"); }


    java.lang.String str2 = StringParser.escapeString("##a##4a##a##", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " ##a##4a##a## "+ "'", str2.equals(" ##a##4a##a## "));

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test319"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4# #a a#a# #4", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "# #a a#a# #"+ "'", str2.equals("# #a a#a# #"));

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test320"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" # #44  44# # ", (int)' ', '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test321"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4a#  4#i#4  #a4", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#  4"+ "'", str2.equals("a#  4"));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test322"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4# ", (int)(short)100, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test323"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"##4#44#4##", 100, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test324"); }


    java.lang.String str2 = StringParser.escapeString("4a#", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 4a# "+ "'", str2.equals(" 4a# "));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test325"); }


    java.lang.String str2 = StringParser.escapeString("4#a#aaiaa#a#4", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4#a#aaiaa#a#4a"+ "'", str2.equals("a4#a#aaiaa#a#4a"));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test326"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4 4#a#i#a#4 4a", 35, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test327"); }


    java.lang.String str2 = StringParser.escapeString("#4  #44#  4#", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#4  #44#  4#a"+ "'", str2.equals("a#4  #44#  4#a"));

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test328"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4#a44", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a4"+ "'", str2.equals("#a4"));

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test329"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a#a# aa44aa #a#a", (-1), '#');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test330"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"  4#  a #44# a  #4  ", (int)(short)100, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test331"); }


    java.lang.String str2 = StringParser.escapeString("# 44aaaa44 #", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a# 44aaaa44 #a"+ "'", str2.equals("a# 44aaaa44 #a"));

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test332"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"444 aia 444", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4"+ "'", str2.equals("4"));

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test333"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4# #4aaaaa44aaaaa4# #4a", 32, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test334"); }


    java.lang.String str2 = StringParser.escapeString("#a444a44  44a444a#", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "##a444a44  44a444a##"+ "'", str2.equals("##a444a44  44a444a##"));

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test335"); }


    java.lang.String str2 = StringParser.escapeString("4#a4a 4", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#4#a4a 4#"+ "'", str2.equals("#4#a4a 4#"));

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test336"); }


    java.lang.String str2 = StringParser.escapeString("a aa44aa a", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a aa44aa a "+ "'", str2.equals(" a aa44aa a "));

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test337"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4a444#", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4"+ "'", str2.equals("a4"));

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test338"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"  4 aia 4  ", (int)(short)10, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test339"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4a  ####  a4a", (int)' ', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test340"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"# a #### a #", (int)(byte)10, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test341"); }


    java.lang.String str2 = StringParser.escapeString("a4### 4a", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa4### 4aa"+ "'", str2.equals("aa4### 4aa"));

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test342"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" #4a 44#44#44 a4# ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " #4a 44#44#44 a4# "+ "'", str2.equals(" #4a 44#44#44 a4# "));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test343"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a aa hi! aa a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a aa hi! aa a"+ "'", str2.equals("a aa hi! aa a"));

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test344"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a#a#a4aaaaa44aaaaa4a#a#a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#a#a4aaaaa44aaaaa4a#a#a"+ "'", str2.equals("a#a#a4aaaaa44aaaaa4a#a#a"));

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test345"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"  a #  ####  # a  ", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " "+ "'", str2.equals(" "));

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test346"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"## ", (-1), '#');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test347"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a  #a  a#  a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a  #a  a#  a"+ "'", str2.equals("a  #a  a#  a"));

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test348"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"44# ", (int)(short)10, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test349"); }


    java.lang.String str2 = StringParser.escapeString("a ## 4aa44  44aa4 ## a", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a ## 4aa44  44aa4 ## a4"+ "'", str2.equals("4a ## 4aa44  44aa4 ## a4"));

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test350"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" a###4####4###a ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a###4####4###a "+ "'", str2.equals(" a###4####4###a "));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test351"); }


    java.lang.String str2 = StringParser.escapeString(" ##aa4", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  ##aa4 "+ "'", str2.equals("  ##aa4 "));

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test352"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4aa4 #4", 52, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test353"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4aaa4a #44# a4aaa4", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4aaa4a #44# a4aaa4"+ "'", str2.equals("4aaa4a #44# a4aaa4"));

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test354"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 44##a44a##44 ", (int)(short)100, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test355"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4  # aa a#aa44aa#a aa #  4", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4  # aa a#aa44aa#a aa #  4"+ "'", str2.equals("4  # aa a#aa44aa#a aa #  4"));

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test356"); }


    java.lang.String str2 = StringParser.escapeString("aa44 #44# 44aa", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " aa44 #44# 44aa "+ "'", str2.equals(" aa44 #44# 44aa "));

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test357"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4  #4a#4a4#  4", 32, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test358"); }


    java.lang.String str2 = StringParser.escapeString("aa####4a", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#aa####4a#"+ "'", str2.equals("#aa####4a#"));

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test359"); }


    java.lang.String str2 = StringParser.escapeString("  aaaa4  ", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "   aaaa4   "+ "'", str2.equals("   aaaa4   "));

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test360"); }


    java.lang.String str2 = StringParser.escapeString("# 44a44a44 #", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a# 44a44a44 #a"+ "'", str2.equals("a# 44a44a44 #a"));

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test361"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"  4 aia 4  ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  4 aia 4  "+ "'", str2.equals("  4 aia 4  "));

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test362"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#a##aa4#", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a##aa4#"+ "'", str2.equals("#a##aa4#"));

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test363"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"44# 4a44", (int)'4', '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test364"); }


    java.lang.String str2 = StringParser.escapeString("4##4a44####44a4##4", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44##4a44####44a4##44"+ "'", str2.equals("44##4a44####44a4##44"));

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test365"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"##4a #### a4##", 1, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test366"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"    4 #### 4    ", 52, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test367"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"aaa4", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a"+ "'", str2.equals("a"));

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test368"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a  aa  aa  a", (int)'#', '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test369"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"44aa a444", 1, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test370"); }


    java.lang.String str2 = StringParser.escapeString("#  a4####4a  #", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "##  a4####4a  ##"+ "'", str2.equals("##  a4####4a  ##"));

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test371"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"44a  44#44#44  a44", (int)(short)0, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test372"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#   ####   #", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#   ####   #"+ "'", str2.equals("#   ####   #"));

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test373"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" #a#4aaaa44aaaa4#a# ", (int)(byte)0, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test374"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"44a4aa44 44", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44a4aa44 44"+ "'", str2.equals("44a4aa44 44"));

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test375"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aaa#", 0, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test376"); }


    java.lang.String str2 = StringParser.escapeString("##4#  #4##", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " ##4#  #4## "+ "'", str2.equals(" ##4#  #4## "));

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test377"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a 4  4 a", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " 4  4 "+ "'", str2.equals(" 4  4 "));

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test378"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"44# ##i## #44", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44# ##i## #44"+ "'", str2.equals("44# ##i## #44"));

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test379"); }


    java.lang.String str2 = StringParser.escapeString("# ##4", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a# ##4a"+ "'", str2.equals("a# ##4a"));

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test380"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"# a #a  a# a #", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "# a #a  a# a #"+ "'", str2.equals("# a #a  a# a #"));

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test381"); }


    java.lang.String str2 = StringParser.escapeString("4#4aaiaa4#4", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4#4aaiaa4#4a"+ "'", str2.equals("a4#4aaiaa4#4a"));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test382"); }


    java.lang.String str2 = StringParser.escapeString(" 4a4 hi! 4a4 ", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 4a4 hi! 4a4 4"+ "'", str2.equals("4 4a4 hi! 4a4 4"));

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test383"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#4  #a4a   4#", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#4  #a4a   4#"+ "'", str2.equals("#4  #a4a   4#"));

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test384"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"44a#   4hi!4   #a44", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4"+ "'", str2.equals("4"));

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test385"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a #44# a", 0, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test386"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"# 4  aaiaa  4 #", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "# 4  aaiaa  4 #"+ "'", str2.equals("# 4  aaiaa  4 #"));

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test387"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4aa44", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4aa44"+ "'", str2.equals("4aa44"));

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test388"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#4a 44#44#44 a4#", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a 44#"+ "'", str2.equals("4a 44#"));

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test389"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"44aa  aaa44  44aaa  aa44", 52, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test390"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4 44", (-1), '4');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test391"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a444#", 0, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test392"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"aaaa4a a", (int)(short)1, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test393"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4 a4a  44#44#44  a4a 4", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a4"+ "'", str2.equals(" a4"));

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test394"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4#a  a#4", (int)(short)100, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test395"); }


    java.lang.String str2 = StringParser.escapeString("4aaa ", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4aaa a"+ "'", str2.equals("a4aaa a"));

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test396"); }


    java.lang.String str2 = StringParser.escapeString("4#   #4aaaaa44aaaaa4#   #4", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#4#   #4aaaaa44aaaaa4#   #4#"+ "'", str2.equals("#4#   #4aaaaa44aaaaa4#   #4#"));

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test397"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"aaa#", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a"+ "'", str2.equals("a"));

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test398"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" aa#4aaa44aaa4#aa ", 100, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test399"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4aa44  44aa4a", (int)(byte)1, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test400"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" a 444  444 a ", (-1), '4');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test401"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#a#44a#4a44#a#", (int)'a', ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test402"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" # aa4 ", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "# "+ "'", str2.equals("# "));

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test403"); }


    java.lang.String str2 = StringParser.escapeString("a4 44a44  44a44 4a", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a4 44a44  44a44 4a#"+ "'", str2.equals("#a4 44a44  44a44 4a#"));

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test404"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"444##4 4# #### #4 4##444", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "444##4 4# #### #4 4##444"+ "'", str2.equals("444##4 4# #### #4 4##444"));

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test405"); }


    java.lang.String str2 = StringParser.escapeString(" a4 #a4a #44# a4a# 4a ", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a a4 #a4a #44# a4a# 4a a"+ "'", str2.equals("a a4 #a4a #44# a4a# 4a a"));

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test406"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4hi!4", (int)(short)10, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test407"); }


    java.lang.String str2 = StringParser.escapeString("4# a", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44# a4"+ "'", str2.equals("44# a4"));

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test408"); }


    java.lang.String str2 = StringParser.escapeString("a ##aa444##444aa## a", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a ##aa444##444aa## a "+ "'", str2.equals(" a ##aa444##444aa## a "));

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test409"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a 4# a#aa44aa#a #4 a", (int)(byte)-1, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test410"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a#4# #### #4#a", (int)' ', '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test411"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" #  aaa44  44aaa  # ", (int)(byte)100, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test412"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#### #44# ####", 97, '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test413"); }


    java.lang.String str2 = StringParser.escapeString("4###aa44aa###4", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4###aa44aa###4a"+ "'", str2.equals("a4###aa44aa###4a"));

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test414"); }


    java.lang.String str2 = StringParser.escapeString("#4 4   4hi!4   4 4#", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#4 4   4hi!4   4 4#a"+ "'", str2.equals("a#4 4   4hi!4   4 4#a"));

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test415"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a44# a44  44a #44a", (int)'a', '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test416"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#a#a#a44a#a#a#", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a#a#a44a#a#a#"+ "'", str2.equals("#a#a#a44a#a#a#"));

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test417"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"# aa44aa #", (int)(short)1, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test418"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"##4aaa44aaa4##", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#"+ "'", str2.equals("#"));

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test419"); }


    java.lang.String str2 = StringParser.escapeString("###aaa44  44aaa###", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "####aaa44  44aaa####"+ "'", str2.equals("####aaa44  44aaa####"));

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test420"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"aa44  a a a a44a a a a  44aa", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a"+ "'", str2.equals("a"));

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test421"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4#aaaaa44aaaaa#4", 0, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test422"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#aaaaa4#", 0, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test423"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#44##44#", (int)'#', ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test424"); }


    java.lang.String str2 = StringParser.escapeString("a4#   a  #4a", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a4#   a  #4a#"+ "'", str2.equals("#a4#   a  #4a#"));

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test425"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" aa  aa ", (int)(byte)10, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test426"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4 a a a a a44a a a a a 4a", (int)'4', 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test427"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4a#a aaa4a #44# a4aaa a#a4", 0, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test428"); }


    java.lang.String str2 = StringParser.escapeString("## # 4#i#4 # ##", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "### # 4#i#4 # ###"+ "'", str2.equals("### # 4#i#4 # ###"));

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test429"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" a 4a ##4a# a4 a ", (int)(byte)1, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test430"); }


    java.lang.String str2 = StringParser.escapeString("aa4##a44a##4aa", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#aa4##a44a##4aa#"+ "'", str2.equals("#aa4##a44a##4aa#"));

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test431"); }


    java.lang.String str2 = StringParser.escapeString("a a#a444##a a", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4a a#a444##a a4"+ "'", str2.equals("4a a#a444##a a4"));

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test432"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"444#a4a #44# a4a#444", 0, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test433"); }


    java.lang.String str2 = StringParser.escapeString("# ##", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "## ###"+ "'", str2.equals("## ###"));

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test434"); }


    java.lang.String str2 = StringParser.escapeString("#a aa a#aa44aa#a aa a#", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " #a aa a#aa44aa#a aa a# "+ "'", str2.equals(" #a aa a#aa44aa#a aa a# "));

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test435"); }


    java.lang.String str2 = StringParser.escapeString("4#4aaaa44aaaa4#4", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#4#4aaaa44aaaa4#4#"+ "'", str2.equals("#4#4aaaa44aaaa4#4#"));

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test436"); }


    java.lang.String str2 = StringParser.escapeString("4aaa #4aa4", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4aaa #4aa4a"+ "'", str2.equals("a4aaa #4aa4a"));

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test437"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a#a4    4a#a", (int)(short)1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test438"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"# #44a444# #", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " #"+ "'", str2.equals(" #"));

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test439"); }


    java.lang.String str2 = StringParser.escapeString("## 4#i#4 ##", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "### 4#i#4 ###"+ "'", str2.equals("### 4#i#4 ###"));

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test440"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"  #a  a#  ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  #a  a#  "+ "'", str2.equals("  #a  a#  "));

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test441"); }


    java.lang.String str2 = StringParser.escapeString("4#4 aaa4####4aaa 4#4", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44#4 aaa4####4aaa 4#44"+ "'", str2.equals("44#4 aaa4####4aaa 4#44"));

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test442"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a aa  aa a", (int)(short)-1, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test443"); }


    java.lang.String str2 = StringParser.escapeString(" a #", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 a #4"+ "'", str2.equals("4 a #4"));

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test444"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a  #a4a   a", (int)'a', '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test445"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"a4 aa4a", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4 aa4a"+ "'", str2.equals("a4 aa4a"));

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test446"); }


    java.lang.String str2 = StringParser.escapeString("## 4 a a a a a44a a a a a 4 ##", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "### 4 a a a a a44a a a a a 4 ###"+ "'", str2.equals("### 4 a a a a a44a a a a a 4 ###"));

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test447"); }


    java.lang.String str2 = StringParser.escapeString("4# 4  #4", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "44# 4  #44"+ "'", str2.equals("44# 4  #44"));

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test448"); }


    java.lang.String str2 = StringParser.escapeString(" a  #a4a   a ", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 a  #a4a   a 4"+ "'", str2.equals("4 a  #a4a   a 4"));

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test449"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4#aa444##444aa#4", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4#aa444##444aa#4"+ "'", str2.equals("4#aa444##444aa#4"));

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test450"); }


    java.lang.String str2 = StringParser.escapeString("#a 4a####a4 a#", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "##a 4a####a4 a##"+ "'", str2.equals("##a 4a####a4 a##"));

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test451"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 4#4#4a#4a4#4#4 ", (int)(short)100, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test452"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4444a4", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4"+ "'", str2.equals("4"));

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test453"); }


    java.lang.String str2 = StringParser.escapeString("aa #a  a# aa", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#aa #a  a# aa#"+ "'", str2.equals("#aa #a  a# aa#"));

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test454"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#4##a  a##4#", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#4##a  a##4#"+ "'", str2.equals("#4##a  a##4#"));

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test455"); }


    java.lang.String str2 = StringParser.escapeString(" #a aaa4a #44# a4aaa a# ", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  #a aaa4a #44# a4aaa a#  "+ "'", str2.equals("  #a aaa4a #44# a4aaa a#  "));

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test456"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"aa#4", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa#4"+ "'", str2.equals("aa#4"));

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test457"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#a4 #", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#a4 #"+ "'", str2.equals("#a4 #"));

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test458"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a4a4aa#a444##444a#aa4a4a", 0, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test459"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"   4hi!4   ", 35, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 35);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test460"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4#    #4", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#    #"+ "'", str2.equals("#    #"));

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test461"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a#a a#a#a", 10, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test462"); }


    java.lang.StringBuilder stringBuilder0 = null;
    java.lang.CharSequence charSequence1 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, charSequence1, (int)(short)10, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test463"); }


    java.lang.String str2 = StringParser.escapeString("4## aa#a44a#aa ##4", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a4## aa#a44a#aa ##4a"+ "'", str2.equals("a4## aa#a44a#aa ##4a"));

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test464"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4a#44a44  44a44#a4", (int)(byte)1, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test465"); }


    java.lang.String str2 = StringParser.escapeString(" ##4 4# #### #4 4## ", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "# ##4 4# #### #4 4## #"+ "'", str2.equals("# ##4 4# #### #4 4## #"));

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test466"); }


    java.lang.String str2 = StringParser.escapeString("a#a4a", ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a#a4a "+ "'", str2.equals(" a#a4a "));

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test467"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a####a", (int)(byte)-1, ' ');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test468"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#aa a#aa44aa#a aa#", 1, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test469"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"4  #  4", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "  #  "+ "'", str2.equals("  #  "));

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test470"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"# a####4####4####a #", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " a#"+ "'", str2.equals(" a#"));

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test471"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" 4   4hi!4   4 ", 97, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test472"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#aa #4 4# #### #4 4# aa#", (int)(short)-1, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.StringIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test473"); }


    java.lang.String str2 = StringParser.escapeString("4 a #4 a 4", '#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#4 a #4 a 4#"+ "'", str2.equals("#4 a #4 a 4#"));

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test474"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"aa aa a#a", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a"+ "'", str2.equals("a"));

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test475"); }


    java.lang.String str2 = StringParser.escapeString("#a  #aa4#  a#", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4#a  #aa4#  a#4"+ "'", str2.equals("4#a  #aa4#  a#4"));

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test476"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#4#44a44  44a44#4#", (int)(byte)1, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test477"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" #4#4a44  44a4#4# ", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " #4#4a44  44a4#4# "+ "'", str2.equals(" #4#4a44  44a4#4# "));

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test478"); }


    java.lang.String str2 = StringParser.escapeString("##a a#a##", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a##a a#a##a"+ "'", str2.equals("a##a a#a##a"));

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test479"); }


    java.lang.String str2 = StringParser.escapeString("#aa# 444####444 #aa#", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4#aa# 444####444 #aa#4"+ "'", str2.equals("4#aa# 444####444 #aa#4"));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test480"); }


    java.lang.String str2 = StringParser.escapeString("#  #", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#  #a"+ "'", str2.equals("a#  #a"));

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test481"); }


    java.lang.String str2 = StringParser.escapeString("# a#aa4", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4# a#aa44"+ "'", str2.equals("4# a#aa44"));

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test482"); }


    java.lang.String str2 = StringParser.escapeString(" 444##4a44  44a4##444 ", '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "4 444##4a44  44a4##444 4"+ "'", str2.equals("4 444##4a44  44a4##444 4"));

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test483"); }


    java.lang.String str2 = StringParser.escapeString("#a## a#aa44aa#a ##a#", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a#a## a#aa44aa#a ##a#a"+ "'", str2.equals("a#a## a#aa44aa#a ##a#a"));

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test484"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"## a4", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "## a4"+ "'", str2.equals("## a4"));

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test485"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"#4 4 #### 4 4#", (int)(short)1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test486"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4 a4#44  44#4a 4", (int)(short)0, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test487"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4  aaiaa  4", 97, '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test488"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a#4# #### #4#a", (int)(byte)10, '#');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test489"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"### 4#i#4 ###", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "### 4#i#4 ###"+ "'", str2.equals("### 4#i#4 ###"));

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test490"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)"#44a444#", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "#44a444#"+ "'", str2.equals("#44a444#"));

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test491"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" #44aa#i#aa44# ", 0, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test492"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4 4aa4a #44# a4aa4 4", 0, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test493"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" aaa4#", false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + " aaa4#"+ "'", str2.equals(" aaa4#"));

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test494"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" aaaaaa ", (int)(short)1, 'a');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test495"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4##a  a##4", 32, 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test496"); }


    java.lang.String str2 = StringParser.escapeString(" a#a444##444a#a ", 'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a a#a444##444a#a a"+ "'", str2.equals("a a#a444##444a#a a"));

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test497"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"4a### ", (int)'4', '4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test498"); }


    java.lang.StringBuilder stringBuilder0 = null;
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)"a#a## a#aa44aa#a ##a#a", 32, ' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 32);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test499"); }


    java.lang.String str2 = StringParser.buildString((java.lang.CharSequence)" aa44a#aa a#aa44aa#a aa#a44aa ", true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa44a#aa "+ "'", str2.equals("aa44a#aa "));

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test500"); }


    java.lang.StringBuilder stringBuilder0 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i4 = StringParser.readString(stringBuilder0, (java.lang.CharSequence)" aa a#aa44aa#a aa ", 0, '4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

}
