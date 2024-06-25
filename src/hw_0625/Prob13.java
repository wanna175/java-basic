package hw_0625;

import java.util.ArrayList;
import java.util.List;

public class Prob13 {

  public static void main(String[] args) {
    Prob13 p = new Prob13();
    int[] inputNumbers = {7, 5, 2, 6266, 19, 34, 51, 32, 11, 67, 21, 1, 1, 1};

    int[] result = p.ascending(inputNumbers);

    for (int i : result) {
      System.out.printf("%d ", i);
    }
  }

  public int[] ascending(int[] inputNumbers) {
    quickSort(0, inputNumbers.length - 1, inputNumbers);
    return inputNumbers;
  }

  public void quickSort(int start_idx, int end_idx, int[] inputNumbers) {
    if (end_idx - start_idx <= 0) {
      return;
    }
    int low = start_idx, high = end_idx;
    int pivot = inputNumbers[start_idx];

    while (low < high) {
      while (low < high && pivot < inputNumbers[high]) {
        high--;
      }
      while (low < high && pivot >= inputNumbers[low]) {
        low++;
      }
      if (low > high) {
        break;
      }
      swap(low, high, inputNumbers);
    }
    swap(high, start_idx, inputNumbers);

    quickSort(start_idx, high - 1, inputNumbers);
    quickSort(high + 1, end_idx, inputNumbers);
  }

  public void swap(int a, int b, int[] arr) {
    int tmp = arr[a];
    arr[a] = arr[b];
    arr[b] = tmp;
  }
}
