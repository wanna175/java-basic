package hw_0625;

public class Prob8 {

  public static int getValue(int[] values, boolean isMax) {
    int ans = (isMax) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
    for (int i : values) {
      ans = (isMax) ? Math.max(ans, i) : Math.min(ans, i);
    }
    return ans;
  }

  public static void main(String[] args) {
    int[] values = {57, 3, 43, 5, 39, 23, 55, 2};

    int maxValue = getValue(values, true);
    int minValue = getValue(values, false);

    System.out.println("최댓값 = " + maxValue);
    System.out.println("최솟값 = " + minValue);

  }
}
