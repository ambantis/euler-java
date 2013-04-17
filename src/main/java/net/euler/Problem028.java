package net.euler;

/**
 * Number spiral diagonals
 *
 * Starting with the number 1 and moving to the right in a clockwise
 * direction a 5 by 5 spiral is formed as follows:
 *
 *           21 22 23 24 25
 *           20  7  8  9 10
 *           19  6  1  2 11
 *           18  5  4  3 12
 *           17 16 15 14 13
 *
 * It can be verified that the sum of the numbers on the diagonals is 101.
 * What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral
 * formed in the same way?
 *
 * User: Alexandros Bantis
 * Date: 4/16/13
 * Time: 6:18 PM
 */
public class Problem028 {

  public int calcDiagonals(int limit) {
    int sum = 1;
    int topRight, topLeft, bottomLeft, bottomRight;
    for (int length = 3; length < limit+1; length += 2) {
      topRight = length * length;
      topLeft = topRight - length + 1;
      bottomLeft = topLeft - length + 1;
      bottomRight = bottomLeft - length + 1;
      sum += topRight + topLeft + bottomLeft + bottomRight;
    }
    return sum;
  }
}
