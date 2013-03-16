package net.euler;

/**
 * Special Pythagorean triplet
 *
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which a^2 + b^2 = c^2.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find the product abc.
 *
 * User: Alexandros Bantis
 * Date: 2/28/13
 * Time: 8:57 PM
 */
public class Problem009 {

  public Problem009() {}

  public int tripletProduct(int ceiling) {
    for (int c = 1; c < ceiling - 2; c++)
      for (int b = 1; b < ceiling - c; b++) {
        int a = ceiling - b - c;
          if (a*a + b*b == c*c)
            return a * b * c;
      }
    return 0;
  }
}
