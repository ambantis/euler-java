package net.euler;

import java.math.BigInteger;

/**
 * Power digit sum
 *
 * 2**15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * What is the sum of the digits of the number 2**1000?
 *
 * User: Alexandros Bantis
 * Date: 3/10/13
 * Time: 12:05 AM
 */
public class Problem016 {

  public String bigNumberString(int power) {
    BigInteger two = BigInteger.valueOf(2);
    BigInteger bigNumber = BigInteger.ONE;
    for (int i = 0; i < power; i++) {
      bigNumber = bigNumber.multiply(two);
    }
    return bigNumber.toString();
  }

  public long sumOfDigits(String n) {
    long sumOfDigits = 0;
    for (char c : n.toCharArray()) {
      sumOfDigits += Long.parseLong(Character.toString(c));
    }
    return sumOfDigits;
  }
}
