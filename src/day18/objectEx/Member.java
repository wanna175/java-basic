package day18.objectEx;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Member implements Cloneable {

  private String name;
  private int age;
  private Address addr;


  @Override
  public Member clone() {
    try {
      Object cloneAddress = addr.clone();
      Address addr = (Address) cloneAddress;
      Member cloneMember = (Member) super.clone();
      cloneMember.setAddr(addr);
      return cloneMember;
    } catch (CloneNotSupportedException e) {
      return null;
    }
  }

  @Override
  public String toString() {
    return "Member{" +
        "name='" + name + '\'' +
        ", age=" + age + '\'' + this.hashCode() +
        '}';
  }
}
