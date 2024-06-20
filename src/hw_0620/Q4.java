package hw_0620;

public class Q4 {

  public static void main(String[] args) {
    int num = 1;
    int sum = 0;

    while (true) {
      int tmp = num;
      if (tmp % 2 == 0) {
        tmp = -tmp;
      }
      sum += tmp;
      if (sum > 99) {
        System.out.println(tmp);
        break;
      }
      num++;
    }
  }

}
