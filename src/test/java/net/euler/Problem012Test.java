package net.euler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

/**
 * User: Alexandros Bantis
 * Date: 3/4/13
 * Time: 5:26 PM
 */
@RunWith(JUnit4.class)
public class Problem012Test {

  @Test
  public void testTriangleNumber() {
    int divisors = 5;
    long expected = 28;
    Problem012 problem012 = new Problem012();
    long actual = problem012.getNaturalNumberWith(divisors);
    assertEquals("failure - should equal 28", expected, actual);
  }

//  @Test
//  public void testTriangleNumber() {
//    int divisors = 5;
//    BigInteger expected = BigInteger.valueOf(28L);
//    Problem012 problem012 = new Problem012();
//    BigInteger actual = problem012.getNaturalNumberWith(divisors);
//    assertEquals("failure - should equal 28", expected, actual);
//  }

}
