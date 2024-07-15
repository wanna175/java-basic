package day17.exception;

public class ExceptionEx01 {

  public static void main(String[] args) {
    printLengthString("null");
  }

  public static void printLengthString(String data) {
    int result = 0;
    try {
      result = data.length();
      System.out.println("문자 수 = " + result);

      Class.forName("java.lang.String");
      System.out.println("String 클래스가 존재합니다.");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
      System.out.println("널 예외 처리 온료!");
    }
  }
}
