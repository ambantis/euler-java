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

  public int tripletProduct() {
    for (int i = 1; i < 999; i++)
      for (int j = 1; j < 999; j++)
        for (int k = 1; k < 999; k++)
          if (isSum1000(i,j,k) && isPythagoreanTriplet(i,j,k))
            return i * j * k;
    return 0;
  }

  private boolean isPythagoreanTriplet (int x, int y, int z) {
    int a;
    int b;
    int c = Math.max(Math.max(x, y), y);
    if (c == x) {
      a = y;
      b = z;
    } else if (c == y) {
      a = x;
      b = z;
    } else {
      a = x;
      b = y;
    }
    return a * a + b * b == c * c;
  }

  private boolean isSum1000(int x, int y, int z) {
    return x + y + z == 1000;
  }
}
