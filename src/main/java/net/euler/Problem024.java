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

  List<Character> chars;
  List<List<Character>> permutations;
  StringBuilder sb;
//  int limit;

  public Problem024(String s) {
    initChars(s);
//    limit = nth;
    permutations = new ArrayList<List<Character>>(fact(s.length()));
    sb = new StringBuilder(chars.size());
  }

  public void initChars(String s) {
    chars = new ArrayList<Character>(s.length());
    char[] tmp = s.toCharArray();
    for (char c : tmp)
      chars.add(c);
    Collections.sort(chars);
  }


  public int getKey() {
    int key = chars.size() - 1;
    while (key > 0 && chars.get(key).compareTo(chars.get(key - 1)) <= 0)
      key--;
    return --key;
  }

  public int getNewKey(int key) {
    int newKey = chars.size()-1;
    while (newKey > key && chars.get(newKey).compareTo(chars.get(key)) <= 0)
      newKey--;
    return newKey;
  }

  public void reverseSortTail(int key) {
    List<Character> left = new ArrayList<Character>(chars.subList(0, key + 1));
    List<Character> right = new ArrayList<Character>(chars.subList(key+1,chars.size()));
    Collections.reverse(right);
    Collections.addAll(left, right.toArray(new Character[right.size()]));
    chars = new ArrayList<Character>(left);
  }

  public boolean hasNextPermutation() {
    return getKey() > -1;
  }

  public List<Character> nextPermutation() {
    int key = getKey();
    if (key < 0)
      return null;
    int newKey = getNewKey(key);
    Collections.swap(chars, key, newKey);
    reverseSortTail(key);
    return new ArrayList<Character>(chars);
  }

  public void generatePermutations() {
    permutations.add(new ArrayList<Character>(chars));
    while (hasNextPermutation())
      permutations.add(nextPermutation());
//    for (int i = 1; i < limit && hasNextPermutation(); i++) {
//      nextPermutation();
//      temp = new ArrayList<Character>(chars);
//      permutations.add(temp);
//    }
//    while (hasNextPermutation()) {
//      nextPermutation();
//      temp = new ArrayList<Character>(chars);
//      if (convertPermutation(permutations.get(limit-1)).compareTo(convertPermutation(temp)) > 0)
//        permutations.set(limit-1,(temp));
//    }
  }

  public String getPermutation(int i) {
    return (i < 0 || i > permutations.size()-1) ? "" : convertPermutation(permutations.get(i));
  }

  public int fact(int n) {
    int fact = 1;
    for (int i = 1; i < n+1; i++)
      fact *= i;
    return fact;
  }

  public String convertPermutation(List<Character> cl) {
    sb.delete(0,sb.length());
    for (Character c : cl)
      sb.append(c);
    return sb.toString();
  }


  public int getNumberPermutations() {
    return permutations.size();
  }

  public List<Character> getChars() {
    return chars;
  }

}
