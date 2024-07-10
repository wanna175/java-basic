package day7;

public class MethodEx {

  public static void main(String[] args) {
    String str1 = "SSG";
    System.out.println(str1.hashCode());
    //리터럴 : 사용자가 직접 입력한 값 (고정값)-상수 : 한번만 값을 저장한다.

    String str2 = "SSG";
    System.out.println(str2.hashCode());
    //리터럴 값이기 때문에 주소값이 같게 나온다.
    //상수 풀에 저장(constant pool)-> 컴파일 되는 시점

    String str3 = new String("SSG");
    String str4 = new String("SSG");
    System.out.println(str3 == str4);//주소값 비교

    if (str3.equals(str4)) {
      System.out.println("문자열의 값은 같다.");
    }
    System.out.println(str3.charAt(0));

  }

}
