package net.euler;

/**
 * Reciprocal cycles
 *
 * A unit fraction contains 1 in the numerator. The decimal representation of
 * the unit fractions with denominators 2 to 10 are given:
 *
 *   1/2	= 	0.5
 *   1/3	= 	0.(3)
 *   1/4	= 	0.25
 *   1/5	= 	0.2
 *   1/6	= 	0.1(6)
 *   1/7	= 	0.(142857)
 *   1/8	= 	0.125
 *   1/9	= 	0.(1)
 *   1/10	= 	0.1
 *
 *  Where 0.1(6) means 0.166666..., and has a 1-digit recurring cycle.
 *  It can be seen that 1/7 has a 6-digit recurring cycle.
 *
 *  Find the value of d < 1000 for which 1/d contains the longest recurring
 *  cycle in its decimal fraction part.
 *
 * User: Alexandros Bantis
 * Date: 4/6/13
 * Time: 7:58 PM
 */
public class Problem026 {

  public int calcMaxCycle() {
    int maxUnit = 0;
    int maxLen = 0;
    int currLen = 0;
    for (int i = 2; i < 1000; i++) {
      currLen = getCycleLength(i);
      System.out.println("i=" + i + "; len=" + currLen);
      if (currLen > maxLen) {
        maxUnit = i;
        maxLen = currLen;
      }
    }
    return maxUnit;
  }

  public int getCycleLength(int denominator) {
    int digits = 1;
    int numerator = 1;
    int modulo;
    while (true) {
      numerator *= 10;
      modulo = numerator % denominator;
      if (modulo == 0 || modulo == 1)
        break;
      numerator = modulo;
      digits++;
    }
    return digits;
  }
}
