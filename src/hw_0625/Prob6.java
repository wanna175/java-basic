package hw_0625;

import java.util.Random;

public class Prob6 {

  public static void main(String[] args) {
    int[] arr;
    int maxValue;

    System.out.println("<< 생성된 난수 >>");
    arr = generatedRandom();
    for (int i : arr) {
      System.out.printf("%d, ", i);
    }
    System.out.println("\n===============================");

    maxValue = getMaxNum(arr);
    System.out.println("배열에서 가장 큰 숫자 : " + maxValue);

  }

  public static int[] generatedRandom() {
    int[] arr = new int[10];
    Random random = new Random();

    for (int i = 0; i < 10; ++i) {
      arr[i] = random.nextInt(30) + 1;
    }

    return arr;
  }

  public static int getMaxNum(int[] arr) {
    int maxValue = 0;
    for (int i : arr) {
      if (i > maxValue) {
        maxValue = i;
      }
    }

    return maxValue;
  }
}
