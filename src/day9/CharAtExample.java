package day9;

public class CharAtExample {

  public static void main(String[] args) {
    String ssn = "0106241230123";
    //1
    StringBuilder answer = new StringBuilder();
    for (int i = 0; i < ssn.length(); ++i) {
      answer.append(ssn.charAt(i));
    }
    System.out.println(answer);
  }
}
