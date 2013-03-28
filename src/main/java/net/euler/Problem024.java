package net.euler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Lexicographic permutations
 *
 * A permutation is an ordered arrangement of objects. For example, 3124 is one possible permutation
 * of the digits 1, 2, 3 and 4. If all of the permutations are listed numerically or alphabetically,
 * we call it lexicographic order. The lexicographic permutations of 0, 1 and 2 are:
 *
 *                 012   021   102   120   201   210
 *
 * What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
 * User: Alexandros Bantis
 * Date: 3/27/13
 * Time: 8:13 AM
 */
public class Problem024 {

  List<Character> permutation;
  List<String> permutations;
  StringBuilder sb;

  public Problem024(String s) {
    initChars(s);
    permutations = new ArrayList<String>(fact(s.length()));
    sb = new StringBuilder(permutation.size());
  }

  public void initChars(String s) {
    permutation = new ArrayList<Character>(s.length());
    char[] tmp = s.toCharArray();
    for (char c : tmp)
      permutation.add(c);
    Collections.sort(permutation);
  }

  public void generatePermutations() {
    permutations.add(permutationToString());
    while (hasNextPermutation())
      permutations.add(nextPermutation());
  }

  public String getPermutation(int i) {
    return (i < 0 || i > permutations.size()-1) ? "" : permutations.get(i);
  }

  public int getNumberPermutations() throws IllegalArgumentException {
    if (permutations.isEmpty())
      throw new IllegalArgumentException("Error: No permutations generated yet.");
    return permutations.size();
  }

  private int getKey() {
    int key = permutation.size() - 1;
    while (key > 0 && permutation.get(key).compareTo(permutation.get(key - 1)) <= 0)
      key--;
    return --key;
  }

  private int getNewKey(int key) {
    int newKey = permutation.size()-1;
    while (newKey > key && permutation.get(newKey).compareTo(permutation.get(key)) <= 0)
      newKey--;
    return newKey;
  }

  private void reverseSortTail(int key) {
    List<Character> left = new ArrayList<Character>(permutation.subList(0, key + 1));
    List<Character> right = new ArrayList<Character>(permutation.subList(key+1, permutation.size()));
    Collections.reverse(right);
    Collections.addAll(left, right.toArray(new Character[right.size()]));
    permutation = new ArrayList<Character>(left);
  }

  private boolean hasNextPermutation() {
    return getKey() > -1;
  }

  private String nextPermutation() {
    int key = getKey();
    if (key < 0)
      return null;
    int newKey = getNewKey(key);
    Collections.swap(permutation, key, newKey);
    reverseSortTail(key);
    return permutationToString();
  }

  private int fact(int n) {
    int fact = 1;
    for (int i = 1; i < n+1; i++)
      fact *= i;
    return fact;
  }

  private String permutationToString() {
    sb.delete(0,sb.length());
    for (Character c : permutation)
      sb.append(c);
    return sb.toString();
  }

}
