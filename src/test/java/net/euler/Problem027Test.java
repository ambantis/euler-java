package net.euler;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * User: Alexandros Bantis
 * Date: 4/13/13
 * Time: 3:28 PM
 */
@RunWith(JUnit4.class)
public class Problem027Test {

  @Rule
  public ExpectedException exception = ExpectedException.none();

  @Test()
  public void testInvalidCombos() {
    int floor = 5;
    int ceiling = 0;
    exception.expect(IllegalArgumentException.class);
    new Problem027(floor, ceiling);
  }

  /**
   * testQuadraticOutput
   *
   * the quadratic function should yield a result that is n^2 + an + b
   * thus should yield (5 * 5) + (-79 * 5) + 1601 == 1231, which is prime
   */
  @Test
  public void testQuadraticOutput() {
    int a = -79;
    int b = 1601;
    int n = 5;
    int expected = 1231;
    Problem027 problem027 = new Problem027(0, 10);
    int actual = problem027.quadratic(a, b, n);
    assertEquals("failure - should equal 1231", expected, actual);
  }

  @Test
  public void testPrimeCount() {
    int a = -79;
    int b = 1601;
    int expected = 80;
    Problem027 problem027 = new Problem027(0, 100);
    int actual = problem027.calcPrimeCount(a, b);
    assertEquals("failure - should equal 80", expected, actual);
  }

  @Test
  public void testCombosFromZeroToForty() {
    int a = 1;
    int b = 41;
    int floor = 0;
    int ceiling = 50;
    Problem027 problem027 = new Problem027(floor, ceiling);
    int expected = a * b;
    int actual = problem027.calcMaxCombo();
    assertEquals("failure - should be a=1, b=41", expected, actual);
  }
}
