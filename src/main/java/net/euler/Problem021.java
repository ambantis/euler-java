package net.euler;

/**
 * Amicable numbers
 *
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n
 * which divide evenly into n). If d(a) = b and d(b) = a, where a != b,
 * then a and b are an amicable pair and each of a and b are called amicable
 * numbers.
 *
 * e.g., the proper divisors of 220 = {1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110}
 * proper divisors of 284 = {1, 2, 4, 71, 142}; so d(284) = 220
 *
 * Evaluate the sum of all the amicable numbers under 10,000
 *
 * User: Alexandros Bantis
 * Date: 3/18/13
 * Time: 9:07 PM
 */
public class Problem021 {

  public int d(int n) {
    int sum = 0;
    double ceiling = Math.sqrt(n);
    for (int i = 2; i < ceiling; i++) {
      if (n % i == 0)
        sum += i + n / i;
    }
    return sum + 1;
  }

  public int amicablePairsTo(int n) {
    int sum = 0;
    int b;
    for (int a = 2; a < n; a++) {
      b = d(a);
      if (a < b && d(b) == a)
        sum += a + b;
    }
    return sum;
  }
}
