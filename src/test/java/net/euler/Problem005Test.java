package net.euler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;
import static net.euler.Problem005.findSmallestMultipleBruteForce;

/**
 * User: Alexandros Bantis
 * Date: 1/29/13
 * Time: 7:41 PM
 */
@RunWith(JUnit4.class)
public class Problem005Test {
  @Test
  public void testFindSmallestMultiple() {
    int expectedResult = 2520;
    int actualResult = findSmallestMultipleBruteForce(10);
    assertEquals("failure - should equal 2520", expectedResult, actualResult);
  }
}
