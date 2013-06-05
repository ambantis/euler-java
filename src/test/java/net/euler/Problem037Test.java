package net.euler;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * User: Alexandros Bantis
 * Date: 6/4/13
 * Time: 7:35 PM
 */
@RunWith(JUnit4.class)
public class Problem037Test {
  Problem037 problem037;
  int maxPrime;

  @Before
  public void setup() {
    problem037 = new Problem037();
    maxPrime = 2000000;
  }

  @After
  public void teardown() {
    problem037 = null;
  }

  @Test
  public void testIntPow() {
    int[] expected = {1,3,9,27,81};

    int[] actual = new int[5];
    for (int i = 0; i < 5; i++)
      actual[i] = problem037.intPow(3,i);
    assertArrayEquals("failure - 3^0 to 3^4 should equal {1,3,9,27,81", expected, actual);
  }

  @Test
  public void testIsOnePrime() {
    assertFalse("failure - 1 is not prime", problem037.isPrime(1));
  }

  @Test
  public void testIsNinetySevenPrime() {
    assertTrue("failure - 97 is prime", problem037.isPrime(97));
  }

  @Test
  public void testLeftTruncate() {
    int initialVal = 3797;
    int expected = 797;
    int actual = problem037.leftTruncate(initialVal);
    assertEquals("failure - left truncating 3797 should equal 797", expected, actual);
  }

  @Test
  public void testRightTruncate() {
    int initialVal = 3797;
    int expected = 379;
    int actual = problem037.rightTruncate(initialVal);
    assertEquals("failure - right truncating 3797 should equal 379", expected, actual);
  }

  @Test
  public void testIsTruncatablePrime() {
    problem037.primesToMax();
    assertTrue("failure - 3797 should be a truncatable prime", problem037.isTruncatablePrime(3797));
  }

  @Test
  public void testGetTruncatablePrimeCount() {
    int expected = 11;
    problem037.primesToMax();
    int actual = problem037.getTruncatablePrimeCount();
    assertEquals("failure - should be 11 truncatable primes", expected, actual);
  }


}
