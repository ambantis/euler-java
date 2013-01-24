package net.euler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertEquals;
import static net.euler.Problem004.largestPalindromeProduct;

/**
 * User: Alexandros Bantis
 * Date: 1/23/13
 * Time: 8:45 PM
 */
@RunWith(JUnit4.class)
public class Problem004Test {
  @Test
  public void testLargestPalindromeProduct() {
    int ceiling = 100;
    int expectedResult = 9009;
    int actualResult = largestPalindromeProduct(ceiling);
    assertEquals("failure - should equal 9009", expectedResult, actualResult);
  }
}
