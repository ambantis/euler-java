package net.euler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static junit.framework.Assert.assertEquals;

/**
 * User: Alexandros Bantis
 * Date: 4/6/13
 * Time: 10:15 PM
 */
@RunWith(JUnit4.class)
public class Problem026Test {

  @Test
  public void testOneThird() {
    int denominator = 3;
    Problem026 problem026 = new Problem026();
    int expected = 1;
    int actual = problem026.getCycleLength(denominator);
    assertEquals("failure - should equal 1", expected, actual);
  }

  @Test
  public void testOneSeventh() {
    int denominator = 7;
    Problem026 problem026 = new Problem026();
    int expected = 6;
    int actual = problem026.getCycleLength(denominator);
    assertEquals("failure - should equal 6", expected, actual);
  }


}
