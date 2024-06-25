package hw_0625;

public class Prob14 {

  public static void main(String[] args) {
    char[] s = {'J', 'a', 'v', 'a', 'P', 'r', 'o', 'g', 'r', 'a', 'm'};
    reverseString(s, 0, 4);
    for (char c : s) {
      System.out.printf("%c", c);
    }
  }

  public static char[] reverseString(char[] s, int start, int end) {
    while (start < end) {
      char tmp = s[start];
      s[start] = s[end];
      s[end] = tmp;

      start++;
      end--;
    }
    return s;
  }
}
