package hw_0625_2;

public class Emp {

  private String id;
  private String name;
  private int baseSalary;

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getBaseSalary() {
    return baseSalary;
  }

  public double getSalary(double bonus) {
    return this.baseSalary + baseSalary * bonus;
  }

  public String toString() {
    return this.name + "(" + this.id + ") 사원의 기본급은 " + this.baseSalary + "원 입니다.";
  }
}
