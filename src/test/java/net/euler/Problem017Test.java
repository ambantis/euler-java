package net.euler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

/**
 * User: Alexandros Bantis
 * Date: 3/10/13
 * Time: 8:01 PM
 */
@RunWith(Parameterized.class)
public class Problem017Test {

  private int number;
  private int expected;

  @Parameters
  public static Collection<Integer[]> getTestParameters() {
    return Arrays.asList(new Integer[][] {
        {   4,  4},
        {  10,  3},
        {  11,  6},
        {  12,  6},
        {  13,  8},
        {  14,  8},
        {  15,  7},
        {  16,  7},
        {  17,  9},
        {  18,  8},
        {  19,  8},
        {  20,  6},
        {  15,  7},
        {  41,  8},
        { 100, 10},
        { 600, 10},
        { 783, 26},
        {1000, 11}
    });
  }

  public Problem017Test(int number, int expected) {
    this.number = number;
    this.expected = expected;
  }

  @Test
  public void testSpelledOutLengths() {
    Problem017 problem017 = new Problem017();
    int actual = problem017.spelledOutLength(number);
    assertEquals("failure - " + number + " should have length of " + expected, expected, actual);
  }

//  @Test
//  public void testNumberLetterCounts() {
//    int ceiling = 5;
//    int expected = 19;
//    Problem017 problem017 = new Problem017();
//    int actual = problem017.numberLetterCountsTo(ceiling);
//    assertEquals("failure = should equal " + expected, expected, actual);
//  }


}
