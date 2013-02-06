package net.euler;

import org.javatuples.Pair;

/**
 * Smallest Multiple
 *
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 *
 * User: Alexandros Bantis
 * Date: 1/29/13
 * Time: 7:06 PM
 */
public class Problem005 {

  final private static int CROSSED_OUT = 0;
  final private static int NOT_CROSSED_OUT = 1;

  // brute force method
  private static boolean isDivisibleByAll(int n, int ceiling) {
    for (int i = 1; i < ceiling; i++)
      if (n % i != 0)
        return false;
    return true;
  }

  // brute force method
  public static int findSmallestMultipleBruteForce (int ceiling) {
    int number = 1;
    while (!isDivisibleByAll(number, ceiling))
      number++;
    return number;
  }

  private static int intPow(int base, int exponent) {
    int value = 1;
    for (int i = 0; i < exponent; i++)
      value *= base;
    return value;
  }

  public static int[] primesTo(int n) {
    int ceiling = (int) Math.sqrt(n * 1.0) + 1;
    int[] factors = new int[n+1];

    // set default values
    for (int i = 0; i <= n; i++)
      factors[i] = NOT_CROSSED_OUT;

    // cross out sieve values
    factors[0] = CROSSED_OUT;
    factors[1] = CROSSED_OUT;
    for (int i = 2; i < ceiling; i++)
      for (int j = 2; i*j <= n; j++)
        factors[i*j] = CROSSED_OUT;
    return factors;
  }


  // elegant algorithm
  public static int[] getPrimeFactors(int n) {
    int[] factor = primesTo(n);
    int[] power = new int[n+1];

    // set prime_factor_exponent for all factor/exponent pairs
    for (int i = 2; i <= n; i++) {
      if (factor[i] != CROSSED_OUT) {
        while (true) {
          if (n % i == 0) {
          n /= i;
          power[i] += 1;
          } else {
            break;
          }
        }
      }
    }

    return power;
  }

  public static int findSmallestMultipleElegant(int n) {
    int[] power = new int[n+1];

    // populate greatest common factor arrays
    int[] primeFactorExponents = null;
    for (int i = 2; i <= n; i++) {
      primeFactorExponents = getPrimeFactors(i);
      for (int j = 2; j <= i; j++) {
        if (primeFactorExponents[j] > 0 && primeFactorExponents[j] > power[j]) {
          power[j] = primeFactorExponents[j];
        }
      }
    }

    // multiply out gcf arrays
    int value = 1;
    for (int i = 2; i <= n; i++) {
      if (power[i] > 0)
        value *= intPow(i, power[i]);
    }
    return value;
  }

}
