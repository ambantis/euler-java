package net.euler;

import org.javatuples.Pair;
import org.javatuples.Triplet;

import java.util.*;

/**
 * Integer right triangles
 *
 * If p is the perimeter of a right angle triangle with integral length sides, {a,b,c},
 * there are exactly three solutions for p = 120:
 *
 *     {20,48,52}, {24,45,51}, {30,40,50}
 *
 * For which value of p ≤ 1000, is the number of solutions maximised?
 *
 * User: Alexandros Bantis
 * Date: 6/6/13
 * Time: 5:23 PM
 */
public class Problem039 {
  Set<Triplet<Integer, Integer, Integer>> primitiveTriples;
  HashMap<Integer, ArrayList<Triplet<Integer, Integer, Integer>>> solutions;
  int ceiling;

  public Problem039(int ceiling) {
    this.ceiling = ceiling;
  }

  public void populateSolutions() {
    solutions = new HashMap<Integer, ArrayList<Triplet<Integer, Integer, Integer>>>(ceiling);
    ArrayList<Triplet<Integer, Integer, Integer>> group;
    Triplet<Integer, Integer, Integer> triangle;
    int factor;
    int perimeter;
    Iterator it;
    for (int targetPerimeter = 1; targetPerimeter < ceiling; targetPerimeter++) {
      group = new ArrayList<Triplet<Integer, Integer, Integer>>();
      it = primitiveTriples.iterator();
      int a;
      int b;
      int c;
      while (it.hasNext()) {
        triangle = (Triplet<Integer, Integer, Integer>) it.next();
        perimeter = getPerimeter(triangle);
        factor = 1;
        while (true) {
          if (perimeter * factor == targetPerimeter) {
            a = triangle.getValue0() * factor;
            b = triangle.getValue1() * factor;
            c = triangle.getValue2() * factor;
            group.add(new Triplet<Integer, Integer, Integer>(a,b,c));
            break;
          } else if (perimeter * factor > targetPerimeter) {
            break;
          } else {
            factor++;
          }
        }

      }
      solutions.put(targetPerimeter, group);
    }
  }

  public int getMaxSolutions() {
    int maxSolutionPerimeter = 0;
    int maxSolutionCount = 0;
    int solutionCount;
    int solutionPerimeter;
    Iterator it = solutions.entrySet().iterator();
    while (it.hasNext()) {
      Map.Entry pairs = (Map.Entry) it.next();
      solutionPerimeter = (Integer) pairs.getKey();
      solutionCount = ((ArrayList<Triplet<Integer, Integer, Integer>>) pairs.getValue()).size();
      if (solutionCount > maxSolutionCount) {
        maxSolutionPerimeter = solutionPerimeter;
        maxSolutionCount = solutionCount;
      }
    }
    return maxSolutionPerimeter;
  }

  public int getPerimeter(Triplet<Integer, Integer, Integer> triangle) {
    return triangle.getValue0() + triangle.getValue1() + triangle.getValue2();
  }

  public void populatePrimitiveTriples() {
    primitiveTriples = new HashSet<Triplet<Integer, Integer, Integer>>();
    Pair<Integer, Integer> pair;
    Triplet<Integer, Integer, Integer> triple;
    for (int m = 1; m < Math.sqrt(ceiling); m++)
      for (int n = 1; n < Math.sqrt(ceiling); n++) {
        pair = new Pair<Integer, Integer>(m, n);
        if (mGreaterThanN(pair) && isCoprime(pair)) {
          triple = getPythagoreanTriple(pair);
          if (!primitiveTriples.contains(reduce(triple))) {
            primitiveTriples.add(triple);
          }
        }
      }
  }

  public Triplet<Integer, Integer, Integer> getPythagoreanTriple(Pair<Integer, Integer> pair) {
    int m = pair.getValue0();
    int n = pair.getValue1();
    int a = m*m - n*n;
    int b = 2 * m * n;
    int c = m*m + n*n;
    if (a < b)
      return new Triplet<Integer, Integer, Integer>(a, b, c);
    else
      return new Triplet<Integer, Integer, Integer>(b, a, c);
  }

  public boolean mGreaterThanN(Pair<Integer, Integer> pair) {
    return pair.getValue0() > pair.getValue1();
  }


  public boolean isCoprime(Pair<Integer, Integer> pair) {
    if (pair.getValue0() < 1 || pair.getValue1() < 1 || pair.getValue0().equals(pair.getValue1()))
      return false;
    else
      return pair.equals(reduce(pair));
  }

  public Pair<Integer, Integer> reduce(Pair<Integer, Integer> pair) {
    int m = pair.getValue0();
    int n = pair.getValue1();
    int ceiling = (m < n) ? m : n;
    for (int i = 2; i < ceiling; i++) {
      while (m % i == 0 && n % i == 0) {
        m /= i;
        n /= i;
      }
    }
    return new Pair<Integer, Integer>(m, n);
  }

  public Triplet<Integer, Integer, Integer> reduce(Triplet<Integer, Integer, Integer> triangle) {
    int a = triangle.getValue0();
    int b = triangle.getValue1();
    int c = triangle.getValue2();
    int ceiling = (a < b) ? a : b;
    for (int i = 2; i < ceiling; i++)
      while (a % i == 0 && b % i == 0 && c % i == 0) {
        a /= i;
        b /= i;
        c /= i;
      }
    return new Triplet<Integer, Integer, Integer>(a,b,c);
  }
}
