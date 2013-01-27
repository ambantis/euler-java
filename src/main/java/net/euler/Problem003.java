package net.euler;

import java.util.LinkedList;

/**
 * Largest prime factor
 *
 * The prime factors of 13195 are 5, 7, 13, 29. What is the largest prime factor of the number 600851475143?
 *
 * User: Alexandros Bantis
 * Date: 1/23/13
 * Time: 6:30 PM
 */
public class Problem003 {

  private static LinkedList<Long> factors;

  private static Long roughRoot(Long number) {
    Long i;
    for (i = 1L; i * i < number; i++) {}
    return i;
  }

  private static void initializePrimeFactorList(Long number) {
    Long i = 2L;
    Long ceiling = roughRoot(number);
    Long rem = number;
    factors = new LinkedList<Long>();
    while (i < ceiling) {
      if (rem % i == 0) {
        factors.add(i);
        rem /= i;
      } else {
        i++;
      }
    }
  }

  public static Long largestPrimeFactorOf(Long number) {
    initializePrimeFactorList(number);
    Long result = 0L;
    for (Long factor : factors)
      if (factor > result)
        result = factor;
    return result;
  }

}
