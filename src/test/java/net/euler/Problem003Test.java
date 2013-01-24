package net.euler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;
import static net.euler.Problem003.largestPrimeFactorOf;

/**
 * User: Alexandros Bantis
 * Date: 1/23/13
 * Time: 7:20 PM
 */
@RunWith(JUnit4.class)
public class Problem003Test {
  @Test
  public void testLargestPrimeFactorOf13195() {
    BigInteger number = new BigInteger("13195");
    int expectedResult = 29;
    int actualResult = largestPrimeFactorOf(number);
    assertEquals("failure - should equal 29 but actual result is " + actualResult, expectedResult, actualResult);
  }
}
