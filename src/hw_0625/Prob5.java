package hw_0625;

public class Prob5 {

  public static void main(String[] args) {

    int[] ia = new int[]{3, 7, 1, 8, 10, 2, 15, 2, 10};
    int[] ib = new int[]{1, 2, 3, 4, 5};

    Prob5 p = new Prob5();
    System.out.println("( 배열 ia )");
    p.calc(ia);
    System.out.println("( 배열 ib )");
    p.calc(ib);
  }

  public void calc(int[] ix) {
    int odd = 0, even = 0;
    for (int v : ix) {
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
