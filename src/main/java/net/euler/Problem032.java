package net.euler;

import java.util.*;

/**
 * Pandigital products
 *
 * We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once;
 * for example, the 5-digit number, 15234, is 1 through 5 pandigital.
 *
 * The product 7254 is unusual, as the identity, 39 × 186 = 7254, containing multiplicand, multiplier,
 * and product is 1 through 9 pandigital.
 *
 * Find the sum of all products whose multiplicand/multiplier/product identity can be written as a
 * 1 through 9 pandigital. HINT: Some products can be obtained in more than one way so be sure to only
 * include it once in your sum.
 *
 * User: Alexandros Bantis
 * Date: 5/8/13
 * Time: 11:34 PM
 */
public class Problem032 {

  LinkedList<Integer> multiplicands;
  LinkedList<Integer> multipliers;
  LinkedHashSet<Integer> products;

  public Problem032() {
    multiplicands = new LinkedList<Integer>();
    multipliers = new LinkedList<Integer>();
    products = new LinkedHashSet<Integer>();
  }

  public int sumOfPandigitals() {
    int result = 0;
    collectMultiplicands(100,2000);
    collectMultipliers(1,100);
    collectPanDigitals();
    for (Integer product : products)
      result += product;
    return result;
  }

  public void collectPanDigitals() {
    int product;
    for (Integer multiplicand : multiplicands)
      for (Integer multiplier : multipliers) {
        product = multiplicand * multiplier;
        if (isPanDigital(arrayListOf(multiplicand, multiplier, product)) && !products.contains(product))
          products.add(product);
      }
  }

  public boolean isPanDigital(ArrayList<Integer> ns) {
    if (ns.size() != 9 || ns.contains(0))
      return false;
    boolean result = true;
    Collections.sort(ns);
    int first = ns.get(0);
    for (int i = 0; i < ns.size(); i++)
      if (ns.get(i) != i+first)
        return false;
    return result;
  }

  public void collectMultiplicands(int from, int until) {
    multiplicands.clear();
    for (int i = from; i < until; i++)
      multiplicands.add(i);
  }

  public void collectMultipliers(int from, int until) {
    multipliers.clear();
    for (int i = from; i < until; i++)
      multipliers.add(i);
  }

  public ArrayList<Integer> arrayListOf(Integer x, Integer y, Integer z) {
    ArrayList<Integer> result = new ArrayList<Integer>();
    for (Character c : (x.toString() + y.toString() + z.toString()).toCharArray())
      result.add(c - '0');
    return result;
  }

}
