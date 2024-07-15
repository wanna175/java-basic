package day17.exception;

public class MyResource implements AutoCloseable {

  private String name;

  public MyResource(String name) {
    this.name = name;
    System.out.println("MyResource( " + this.name + ") 열기");
  }

  public String readOne() {
    System.out.println("MyResource( " + this.name + " ) 읽기");
    return "100";
  }

  public String readTwo() {
    System.out.println("MyResource( " + this.name + " ) 읽기");
    return "readTwo";
  }

  @Override
  public void close() throws Exception {
    System.out.println("MyResource( " + this.name + " ) 닫기");
  }
}
