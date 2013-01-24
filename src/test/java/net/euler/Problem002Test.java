package net.euler;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;
import static net.euler.Problem002.sumEvenFiboNumbersTo;


/**
 * User: Alexandros Bantis
 * Date: 1/23/13
 * Time: 5:49 PM
 */
@RunWith(JUnit4.class)
public class Problem002Test {
  @Test
  public void testSumEvenFiboNumbersTo100() {
    int ceiling = 100;
    int expectedResult = 44;
    int actualResult = sumEvenFiboNumbersTo(ceiling);
    assertEquals("failure - should equal 44 but actual result is " + actualResult, expectedResult, actualResult);
  }
}
