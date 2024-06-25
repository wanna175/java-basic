package hw_0625;

import java.util.Random;

public class Prob2 {

  public static void main(String[] args) {
    int[] arr = new int[5];
    Random random = new Random();

    for (int i = 0; i < 5; ++i) {
      arr[i] = random.nextInt(100) + 1;
    }

    for (int v : arr) {
      System.out.printf("%d ", v);
    }
  }

}
