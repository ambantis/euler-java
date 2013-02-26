package net.euler;

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

  private static int intPow(int base, int exponent) {
    int value = 1;
    for (int i = 0; i < exponent; i++)
      value *= base;
    return value;
  }

  /**
   * primesTo computes all primes numbers up to n using trial by division algorithm
   *
   * @param n designates primes should be in the range 2 ... n
   * @return int[] a sieve of all prime factors (0=CROSSED_OUT, 1=NOT_CROSSED_OUT)
   */
  private static int[] primesTo(int n) {
    int ceiling = (int) Math.sqrt(n * 1.0) + 1;
    int[] sieve = new int[n+1];

    // set default values
    for (int i = 2; i <= n; i++)
      sieve[i] = NOT_CROSSED_OUT;

    // cross out sieve values
    for (int i = 2; i <= ceiling; i++)
      for (int j = 2; i*j <= n; j++)
        sieve[i*j] = CROSSED_OUT;
    return sieve;
  }


  /**
   * getPrimeExp computes a prime factorization of n
   *
   * @param n the number subject to prime factorization
   * @return int[] an array of exponents for prime factors of n
   *               e.g., 8 => (0^0, 1^0, 2^3, 3^0, 4^0, 5^0, 6^0, 7^0, 8^0)
   */
  public static int[] getPrimeExp(int n) {
    int[] factor = primesTo(n);
    int[] primePowAll = new int[n+1];

    // set prime_factor_exponent for all factor/exponent pairs
    for (int i = 2; i <= n; i++) {
      if (factor[i] != CROSSED_OUT) {
        while (true) {
          if (n % i == 0) {
          n /= i;
          primePowAll[i] += 1;
          } else {
            break;
          }
        }
      }
    }

    return primePowAll;
  }

  /**
   * findSmallestMultiple computes the smallest number evenly divisible by all numbers 1 to n
   *
   * @param n the top of the range
   * @return int evenly divisible by all numbers 1 to n
   */
  public static int findSmallestMultiple(int n) {
    int[] gcfAll = new int[n+1];

    // populate greatest common factor arrays
    int[] gcfThis = null;
    for (int i = 2; i <= n; i++) {
      gcfThis = getPrimeExp(i);
      for (int j = 2; j <= i; j++) {
        if (gcfThis[j] > 0 && gcfThis[j] > gcfAll[j]) {
          gcfAll[j] = gcfThis[j];
        }
      }
    }

    // multiply out gcf arrays
    int value = 1;
    for (int i = 2; i <= n; i++) {
      if (gcfAll[i] > 0)
        value *= intPow(i, gcfAll[i]);
    }
    return value;
  }

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




}
