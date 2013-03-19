package net.euler;

import java.math.BigInteger;

/**
 * Factorial digit sum
 *
 * n! means n × (n − 1) × ... × 3 × 2 × 1
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 *
 * Find the sum of the digits in the number 100!

 * User: Alexandros Bantis
 * Date: 3/15/13
 * Time: 11:41 PM
 */
public class Problem020 {

  private BigInteger fact(int n) {
    BigInteger factorial  = BigInteger.ONE;
    for (int i = 1; i < n+1; i++)
      factorial = factorial.multiply(BigInteger.valueOf(i));
    return factorial;
  }

  public int factorialSumOfDigits(int n) {
    int sumOfDigits = 0;
    String factString = fact(n).toString();
    for (char c : factString.toCharArray()) {
      sumOfDigits += Integer.parseInt(Character.toString(c));
    }
    return sumOfDigits;
  }

}
