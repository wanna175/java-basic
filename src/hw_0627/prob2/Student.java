package hw_0627.prob2;

public class Student {

  private String name;
  private String subject;
  private int fee;
  private double returnFee;

  public Student(String name, String subject, int fee) {
    this.name = name;
    this.subject = subject;
    this.fee = fee;
    this.returnFee = 0.0;
  }

  public void calcReturnFee() {
    if (subject.equals("javaprogram")) {
      returnFee = fee / 100.0 * 25;
      return;
    }
    if (subject.equals("jspprogram")) {
      returnFee = fee / 100.0 * 20;
      return;
    }
    System.out.println("그런 과정명은 없습니다.");
  }

  public void print() {
    System.out.printf("%s 씨의 과정명은 %s이고 교육비는 %d이며 환급금은 %.2f 입니다.", name, subject, fee, returnFee);
  }

  public static void main(String args[]) {
    Student stu = new Student("차은우", "jspprogram",
        500000);
    stu.calcReturnFee();
    stu.print();
  }
}
