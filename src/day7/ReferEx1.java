package day7;

public class ReferEx1 extends Object {

  public static void main(String[] args) {
    ReferEx1 refex1 = new ReferEx1();
    ReferEx1 refex2 = new ReferEx1();
    System.out.println(refex1.toString() + " " + refex2.toString());
    System.out.println(refex1.hashCode() + " " + refex2.hashCode());

    if (refex1 == refex2) {
      System.out.println("주소값이 같으므로 같은 객체");
    } else {
      System.out.println("주소값이 다르므로 다른 객체");
    }

    String str1 = new String("Happy birth day");
    String str2 = new String("Happy birth day");
    if (str1 == str2) {
      System.out.println("주소값이 같으므로 같은 객체");
    } else {
      System.out.println("주소값이 다르므로 다른 객체");
    }
    String str3 = "Hi wake up! ";
    String str4 = "Hi wake up!";

    if (str3 == str4) {
      System.out.println("주소값이 같으므로 같은 객체");
    } else {
      System.out.println("주소값이 다르므로 다른 객체");
    }
  }

  public static void method1() {
    System.out.println("method1");
  }

  public static void method2() {
    System.out.println("method2");
  }
}
