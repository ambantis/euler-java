package net.euler;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

/**
 * Number letter counts
 *
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five,
 * then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total. If all the
 * numbers from 1 to 1000 (one thousand) inclusive were written out in words,
 * how many letters would be used?
 *
 * User: Alexandros Bantis
 * Date: 3/10/13
 * Time: 2:32 PM
 */
public class Problem017 {

  private HashMap<Integer, Integer> lengths;

  public Problem017() {
    initLengths();
  }

  public int numberLetterCountsTo(int n) {
    int count = 0;
    for (int i = 0; i < n+1; i++) {
      count += spelledOutLength(i);
    }
    return count;
  }

  public int spelledOutLength(int n) {
    int count = (hasAnd(n)) ? 3 : 0;
    int part;
    int power;
    while (true) {
      if (lengths.containsKey(n)) {
        count += lengths.get(n);
        break;
      } else {
        power = getPower(n);
        part = (n / power) * power;
        if (!lengths.containsKey(part)) {
          System.err.println("n = " + n);
          System.err.println("part = " + part);
          throw new IllegalArgumentException("Lookup table cannot parse " + n);
        }
        count += lengths.get(part);
        n -= part;
      }
    }
    return count;
  }

  private int getPower(Integer n) {
    return expBase10(n.toString().length() - 1);
  }

  public boolean hasAnd(Integer n) {
    return n > 100 && n % 100 > 0;
  }

  private int expBase10(int exp) {
    int val = 1;
    for (int i = 0; i < exp; i++)
      val *= 10;
    return val;
  }

  private void initLengths() {
    String line;
    String[] parsedLine;
    lengths = new HashMap<Integer, Integer>();
    try {
      URL url = this.getClass().getResource("/problem017.txt");
      Charset charset = Charset.forName("UTF-8");
      BufferedReader reader = Files.newBufferedReader(Paths.get(url.toURI()), charset);
      lengths.put(0,0);
      while ((line = reader.readLine()) != null) {
        parsedLine = line.split(",");
        lengths.put(Integer.parseInt(parsedLine[0]), parsedLine[1].length());
      }
    } catch (URISyntaxException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
