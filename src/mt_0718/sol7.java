package mt_0718;

import java.util.Arrays;
import java.util.List;

public class sol7 {

  public static void main(String[] args) {

  }

  public static void sumEven() {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    int sum = numbers.stream().filter(i -> i % 2 == 0).mapToInt(Integer::intValue).sum();
    System.out.println(sum);
  }

}
