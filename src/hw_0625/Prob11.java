package hw_0625;

public class Prob11 {

  public static void main(String[] args) {

  }

  public int[][] sub(int[][] a, int[][] b, int[][] c) {
    for (int i = 0; i < c.length; ++i) {
      for (int j = 0; j < c[0].length; ++j) {
        c[i][j] = a[i][j] - b[i][j];
      }
    }
    return c;
  }

  public void prn(int[][] c) {

    for (int i = 0; i < c.length; ++i) {
      for (int j = 0; j < c[0].length; ++j) {
        System.out.printf("%d ", c[i][j]);
      }
      System.out.println();
    }
  }
}
