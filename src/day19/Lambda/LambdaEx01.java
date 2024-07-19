package day19.Lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaEx01 {

  // List 컬렉션에 1,2,3,4,5,6,7,8,9,10 10개의 정수를 저장하고
  // 컬렉션의 짝수의 합을 구하세요
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    int sum = numbers.stream().filter(i -> i % 2 == 0).mapToInt(Integer::intValue).sum();

    System.out.println(sum);
  }

}
