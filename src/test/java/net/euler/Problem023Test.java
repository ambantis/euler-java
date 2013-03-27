package net.euler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * User: Alexandros Bantis
 * Date: 3/25/13
 * Time: 9:21 PM
 */
@RunWith(JUnit4.class)
public class Problem023Test {

  @Test
  public void testTwentyEightIsAbundant() {
    int number = 28;
    Problem023 problem023 = new Problem023();
    assertFalse("failure - 28 is a perfect number", problem023.abundant(number));
  }

  @Test
  public void testTwelveIsAbundant() {
    int number = 12;
    Problem023 problem023 = new Problem023();
    assertTrue("failure - 12 is abundant", problem023.abundant(number));
  }

  /**
   * TestAbundantSet
   *
   * "There are 2487 abundant numbers below 10,000 http://www.tanyakhovanova.com/Numbers/numbers.html#abundant
   * This tests whether this is the case.
   */
  @Test
  public void testAbundantSetTo10000() {
    int ceiling = 10000;
    int expected = 2487;
    Problem023 problem023 = new Problem023();
    int actual = problem023.countAbundantNumbersTo(ceiling);
    assertEquals("failure - should be 2,487 abundant numbers under 10,000", expected, actual);
  }

}
