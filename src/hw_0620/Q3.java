package hw_0620;

public class Q3 {

  public static void main(String[] args) {
    int sum = 0;
    for (int i = 1; i < 11; ++i) {
      sum += fact(i);
    }
  }

  private static int fact(int n) {
    int sum = 0;
    for (int i = 1; i < n + 1; ++i) {
      sum += i;
    }
    return sum;
  }
}
