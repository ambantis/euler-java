package net.euler;

import static net.euler.Problem001.sumMultiplesOf3And5;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * User: Alexandros Bantis
 * Date: 1/23/13
 * Time: 4:34 PM
 */
@RunWith(JUnit4.class)
public class Problem001Test {
  @Test
  public void testSumMultiplesOf3And5ForTen() {
    int ceiling = 10;
    int expectedResult = 23;
    int actualResult = sumMultiplesOf3And5(ceiling);
    assertEquals("failure - should equal 23", expectedResult, actualResult);
  }
}
