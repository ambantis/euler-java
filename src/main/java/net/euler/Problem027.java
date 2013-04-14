package net.euler;

/**
 * Quadratic primes
 *
 * Euler published the remarkable quadratic formula
 *           n**2 + n + 41
 *
 * It turns out that the formula will produce 40 primes for the consecutive
 * values n = 40, 40**2 + 40 + 41 = 40(40 + 1) + 41 is divisible by 41, and
 * certainly when n = 4, 41**2 + 41 + 41 is clearly divisible by 41.
 *
 * Using computers, the incredible formula n**2 - 79n + 1601 was discovered,
 * which produces 80 primes for the consecutive values n = 0 to 79. The
 * product of the coefficients, -79 and 1601, is -126,479.
 *
 * Considering the quadratics of the form:
 *           n**2 + an + b, where |a| < 1000 and |b| < 1000
 *           where |n| is the modulus/absolute value of n
 *           e.g., |11| = 11 and |-4| = 4
 *
 * Find the product of the coefficients, a and b, for the quadratic equation
 * that produces the maximum number of primes for the consecutive values of n,
 *
 * User: Alexandros Bantis
 * Date: 4/13/13
 * Time: 3:13 PM
 */
public class Problem027 {

  private int floor;
  private int ceiling;
  Problem007 problem007;

  public Problem027(int floor, int ceiling) {
    if (floor > ceiling)
      throw new IllegalArgumentException("floor must be less than ceiling");
    else if (floor == ceiling)
      throw new IllegalArgumentException("floor and ceiling are the same number");
    problem007 = new Problem007();
    this.floor = floor;
    this.ceiling = ceiling;
  }

  public int calcMaxCombo() {
    int max = 0;
    int coefficients = 0;
    int count;
    for (int a = floor; a < ceiling; a++) {
      for (int b = floor; b < ceiling; b++) {
        count = calcPrimeCount(a, b);
        if (count > max) {
          coefficients = a * b;
          max = count;
        }
      }
    }
    return coefficients;
  }

  public int quadratic(int a, int b, int n) {
    return (n * n) + (a * n) + b;
  }

  public int calcPrimeCount(int a, int b) {
    int count = 0;
    while (true) {
      int val = quadratic(a, b, count);
      if (!isPrime(val))
        break;
      count++;
    }
    return count;
  }

  public boolean isPrime(int n) {
    return problem007.isPrime(n);
  }
}
