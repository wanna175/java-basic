package day9;

public class IndexOfContainsExample {

  public static void main(String[] args) {
    String subject = "자바 객체 프로그래밍 과목입니다.";
    String[] subjectArr = subject.split(" ");

    //1
    System.out.print(subjectArr[1] + " " + subjectArr[2]);
    //2
    System.out.print(subjectArr[2] + " " + subjectArr[3]);
    //3

  }
}
