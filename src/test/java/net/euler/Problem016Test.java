package net.euler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;

/**
 * User: Alexandros Bantis
 * Date: 3/10/13
 * Time: 12:14 AM
 */
@RunWith(JUnit4.class)
public class Problem016Test {

  @Test
  public void testPowerDigitExponent() {
    int exp = 15;
    String expected = "32768";
    Problem016 problem016 = new Problem016();
    String actual = problem016.bigNumberString(exp);
    assertEquals("failure = should equal '32768'", expected, actual);
  }

  @Test
  public void testPowerDigitSum() {
    int exp = 15;
    long expected = 26;
    Problem016 problem016 = new Problem016();
    String twoToFifteen = problem016.bigNumberString(exp);
    long actual = problem016.sumOfDigits(twoToFifteen);
    assertEquals("failure - should equal 26", expected, actual);
  }

}
