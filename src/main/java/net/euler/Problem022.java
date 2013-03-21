package net.euler;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * Using names.txt, a 46K text file containing over five-thousand first names,
 * begin by sorting it into alphabetical order. Then working out the alphabetical
 * value for each name, multiply this value by its alphabetical position in
 * the list to obtain a name score.
 *
 * For example, when the list is sorted into alphabetical order, COLIN,
 * which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list.
 * So, COLIN would obtain a score of 938 × 53 = 49714.
 *
 * What is the total of all the name scores in the file?

 * User: Alexandros Bantis
 * Date: 3/19/13
 * Time: 7:33 PM
 */
public class Problem022 {
  BufferedReader reader;
  List<String> words;
  int[] scores;

  // QUICK SORT
  public long runQuickSort(String fileName) {
    long score = 0;
    try {
      initReader(fileName);
      buildWordList();
      quickSort(words, 0, words.size()-1);
      buildScoreList();
      for (int i = 0; i < scores.length; i++) {
        score += scores[i] * (i+1);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } catch (URISyntaxException e) {
      e.printStackTrace();
    }
    return score;
  }

  public void quickSort(List<String> words, int left, int right) {
    if (left < right) {
      int pivotIndex = (left + right) / 2;
      pivotIndex = partition(words, left, right, pivotIndex);
      quickSort(words, left, pivotIndex - 1);
      quickSort(words, pivotIndex+1, right);
    }
  }

  public int partition(List<String> words, int left, int right, int pivot) {
    String pivotValue = words.get(pivot);
    swap(words, pivot, right);
    int storeIndex = left;
    for (int i = left; i < right; i++) {
      if (words.get(i).compareTo(pivotValue) < 0) {
        swap(words, i, storeIndex);
        storeIndex++;
      }
    }
    swap(words, storeIndex, right);
    return storeIndex;
  }

  public void swap(List<String> list, int a, int b) {
    String tmp = list.get(a);
    list.set(a, list.get(b));
    list.set(b, tmp);
  }

  // RECURSIVE MERGE SORT
  public long runRecursiveMergeSort(String fileName) {
    long score = 0;
    try {
      initReader(fileName);
      buildWordList();
      words = new ArrayList<String>(recursiveMergeSort(new ConcurrentLinkedDeque<String>(words)));
      buildScoreList();
      for (int i = 0; i < scores.length; i++)
        score += scores[i] * (i+1);
    } catch (IOException e) {
      e.printStackTrace();
    } catch (URISyntaxException e) {
      e.printStackTrace();
    }
    return score;
  }

  public ConcurrentLinkedDeque<String>
  recursiveMergeSort(ConcurrentLinkedDeque<String> list) {
    if (list.size() <= 1)
      return list;
    int middle = list.size() / 2;

    ConcurrentLinkedDeque<String> left = new ConcurrentLinkedDeque<String>();
    for (int i = 0; i < middle; i++)
      left.add(list.pop());
    ConcurrentLinkedDeque<String> right = list;
    left = recursiveMergeSort(left);
    right = recursiveMergeSort(right);
    return merge(left, right);
  }

  private ConcurrentLinkedDeque<String>
  merge(ConcurrentLinkedDeque<String> left, ConcurrentLinkedDeque<String> right) {
    ConcurrentLinkedDeque<String> result = new ConcurrentLinkedDeque<String>();
    while (left.size() > 0 || right.size() > 0) {
      if (left.size() > 0 && right.size() > 0) {
        if (left.peek().compareTo(right.peek()) <= 0) {
          result.addLast(left.remove());
        } else {
          result.addLast(right.remove());
        }
      } else if (left.size() > 0) {
        result.addLast(left.remove());
      } else if (right.size() > 0) {
        result.addLast(right.remove());
      }
    }
    return result;
  }

  public void initReader(String fileName) throws URISyntaxException, IOException {
    URL url = this.getClass().getResource(fileName);
    Charset charset = Charset.forName("UTF-8");
    reader = Files.newBufferedReader(Paths.get(url.toURI()), charset);
  }

  public void buildWordList() {
    words = new ArrayList<String>();
    String word;
    try {
      while ((word = nextWord()).length() > 0) {
        words.add(word);
        if (reader.read() == -1) // remove commas or break
          break;
      }
    } catch (IOException e) {
      e.printStackTrace();
    } catch (IllegalArgumentException e) {
      e.printStackTrace();
    }
  }

  public String nextWord() throws IOException, IllegalArgumentException {
    ArrayDeque<Character> word = new ArrayDeque<Character>();
    char ch;
    if (reader.read() != '"')
      return word.toString();
    while ((ch = (char)reader.read()) != '"')
      word.addLast(ch);
    StringBuilder stringBuilder = new StringBuilder(word.size());
    for (char letter : word)
      stringBuilder.append(letter);
    return stringBuilder.toString();
  }

  public void buildScoreList() {
    scores = new int[words.size()];
    for (int i = 0; i < words.size(); i++)
      scores[i] = wordScore(words.get(i));
  }

  public int wordScore(String word) {
    int score = 0;
    for (int c : word.toCharArray())
      score += (c - 'A' + 1);
    return score;
  }

}
