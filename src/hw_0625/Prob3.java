package hw_0625;

public class Prob3 {

  public static void main(String[] args) {
    int[] arr = new int[]{10, 30, 20, 80, 50};
    int sum = 0;

    for (int n : arr) {
      sum += n;
    }

    for (int n : arr) {
      double ratio = n / (double) sum * 100;
      for (int i = 0; i < (int) ratio; ++i) {
        System.out.print("*");
      }
      System.out.printf("(%.16f%%)\n", ratio);
    }
  }
}
