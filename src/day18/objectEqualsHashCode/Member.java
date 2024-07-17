package day18.objectEqualsHashCode;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Member {

  private int memberCode;
  private String name;

  @Override
  public boolean equals(Object o) {
    if (o instanceof Member m) {
      return this.memberCode == m.getMemberCode() && this.name.equals(m.getName());
    }
    return false;
  }
}
