package net.euler;

import java.util.ArrayList;

/**
 * Lattice Paths
 *
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
 * there are exactly 6 routes to the bottom right corner. How many such routes are there through a 20×20 grid?

 * User: Alexandros Bantis
 * Date: 3/9/13
 * Time: 5:24 AM
 */
public class Problem015 {


  private long[] pascalsTriangle(long row) {
    long[] thisRow = {1, 1};
    long[] lastRow;
    if (row == 1)
      return thisRow;
    for (int i = 2; i < row+1; i++) {
      lastRow = thisRow;
      thisRow = new long[i+1];
      thisRow[0] = 1;
      thisRow[i] = 1;
      for (int j = 1; j < thisRow.length-1; j++) {
        thisRow[j] = lastRow[j-1] + lastRow[j];
      }
    }
    return thisRow;
  }

  public long latticePaths(long size) {
    long[] row = pascalsTriangle(size);
    long sum = 0;
    for (long val : row) {
      sum += val * val;
    }
    return sum;
  }


}
