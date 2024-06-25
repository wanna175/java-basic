package hw_0625;

public class Prob1 {

  public static void main(String[] args) {

    int[] ia = new int[]{3, 7, 1, 8, 10, 2, 15, 2, 10};
    int[] ib = new int[]{1, 2, 3, 4, 5};

    System.out.println("( 배열 ia )");
    Solution(ia);
    System.out.println("( 배열 ib )");
    Solution(ib);
  }

  public static void Solution(int[] arr) {
    int odd = 0, even = 0;
    for (int v : arr) {
			if (v % 2 == 0) {
				even += v;
			} else {
				odd += v;
			}
    }
    System.out.println("홀수의 합 : " + odd);
    System.out.println("짝수의 합 : " + even);
  }

}
