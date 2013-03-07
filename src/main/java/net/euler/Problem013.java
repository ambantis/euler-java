package net.euler;

import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigInteger;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Large sum
 *
 * Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
 * User: Alexandros Bantis
 * Date: 3/6/13
 * Time: 8:56 PM
 */
public class Problem013 {
  private BufferedReader reader;

  public Problem013() {
    try {
      URL url = this.getClass().getResource("/problem013.txt");
      Charset charset = Charset.forName("UTF-8");
      reader = Files.newBufferedReader(Paths.get(url.toURI()), charset );
    } catch (IOException e) {
      e.printStackTrace();
    } catch (URISyntaxException e) {
      e.printStackTrace();
    }
  }

  public BigInteger calcMax() {
    String line;
    BigInteger sum = BigInteger.ZERO;
    try {
      while ((line = reader.readLine()) != null) {
        sum = sum.add(new BigInteger(line));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return sum;
  }

  public String firstTen() {
    return calcMax().toString().substring(0,10);
  }


}
