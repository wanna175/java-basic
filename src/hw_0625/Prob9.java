package hw_0625;

import java.util.Arrays;

public class Prob9 {

  public static void main(String[] args) {
    Prob9 median = new Prob9();

    int[] values1 = {10, 4, 53, 63, 17, 37, 52, 16, 33, 65};
    System.out.println("input : " + Arrays.toString(values1));
    System.out.println("median : " + median.findMedian(values1));
    System.out.println("=================================================");

    int[] values2 = {32, 53, 52, 76, 15, 98, 76, 65, 36, 10};
    System.out.println("input : " + Arrays.toString(values2));
    System.out.println("median : " + median.findMedian(values2));
  }

  public int findMedian(int[] values) {
    int sum = 0, answer = values[0], diff;
    double avg;
    for (int i : values) {
      sum += i;
    }
    avg = sum / (double) values.length;
    diff = sum;
    for (int i : values) {
      int tmp = (int) Math.abs(avg - i);
      if (diff < tmp) {
        continue;
      }
      if (diff == tmp && answer < i) {
        continue;
      }
      diff = tmp;
      answer = i;
    }
    return answer;
  }
}
