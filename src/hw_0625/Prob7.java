package hw_0625;

import java.util.HashSet;
import java.util.Set;

public class Prob7 {

  public static void main(String[] args) {
    int[] array = {3, 17, 12, 43, 3, 17, 3, 8, 21, 8};
    System.out.println("<< 중복되지 않은 숫자 >>");
    printUniqueNumber(array);
  }

  private static void printUniqueNumber(int[] array) {
    Set<Integer> set = new HashSet<>();
    for (Integer i : array) {
      set.add(i);
    }
    for (Integer i : set) {
      System.out.printf("%d, ", i);
    }
  }
}
