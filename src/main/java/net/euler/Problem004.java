package net.euler;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Largest Palindrome product
 *
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers
 * is 9009 = 91 x 99. Find the largest palindrome made from the product of two 3-digit numbers.
 * User: Alexandros Bantis
 * Date: 1/23/13
 * Time: 8:15 PM
 */
public class Problem004 {

  private static boolean isPalindrome(Integer number) {
    String value = number.toString();
    String reverse = new StringBuffer(value).reverse().toString();
    return value.equals(reverse);
  }

  public static int largestPalindromeProduct(Integer ceiling) {
    LinkedList<Integer> palindromes = new LinkedList<Integer>();
    for (int i = 0; i < ceiling; i++)
      for (int j = 0; j < ceiling; j++)
        if (isPalindrome(i * j))
          palindromes.add(i * j);
    return Collections.max(palindromes);
  }

}
