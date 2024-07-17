package day18.objectEx;

public class MyObject implements Cloneable {

  private String name;
  private int age;

  @Override
  public MyObject clone() {
    try {
      return (MyObject) super.clone();
    } catch (CloneNotSupportedException e) {
      return null;
    }
  }
}
