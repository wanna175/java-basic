package day18.objectEx;

public class ObjectEx {

  public static void main(String[] args) throws CloneNotSupportedException {
    MyObject myobj = new MyObject();
    System.out.println(myobj.toString());
    MyObject copyObj = myobj.clone();
    System.out.println(myobj);
    System.out.println(copyObj);
  }
}
