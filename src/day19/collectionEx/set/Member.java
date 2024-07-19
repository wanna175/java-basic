package day19.collectionEx.set;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Member {

  public String name;
  public int age;

  @Override
  public int hashCode() {
    return name.hashCode() + age;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Member member) {
      return member.name.equals(name) && (member.age == age);
    } else {
      return false;
    }
  }
}
