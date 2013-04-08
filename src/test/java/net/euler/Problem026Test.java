package net.euler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
import static junit.framework.Assert.assertEquals;

/**
 * User: Alexandros Bantis
 * Date: 4/6/13
 * Time: 10:15 PM
 */
@RunWith(Parameterized.class)
public class Problem026Test {

  private int denominator;
  private int expected;

  @Parameters
  public static Collection<Integer[]> getTestParameters() {
    return Arrays.asList(new Integer[][] {
        {  2, 0},
        {  3, 1},
        {  6, 1},
        {  7, 6},
        {101, 4}
    });
  }

  public Problem026Test(int denominator, int expected) {
    this.denominator = denominator;
    this.expected = expected;
  }

  @Test
  public void testCalcPatternLength() {
    Problem026 problem026 = new Problem026();
    int actual = problem026.calcPatternLength(denominator);
    assertEquals("CalcPatternLength failure", expected, actual);
  }

}
