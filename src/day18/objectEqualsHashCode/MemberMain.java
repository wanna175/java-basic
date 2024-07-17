package day18.objectEqualsHashCode;

public class MemberMain {

  public static void main(String[] args) {
    Member m1 = new Member(112, "SSG");
    Member m2 = new Member(112, "SSG");
    System.out.println(m1 == m2);//주소값을 비교한다.
    System.out.println(m1.equals(m2));
    System.out.println(m1.hashCode() + "\t" + m2.hashCode());
  }

}
