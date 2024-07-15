package day17.database.dbEX.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {

  private String userId;
  private String userName;
  private int userAge;
  private String userEmail;

  @Override
  public String toString() {
    return "User{" +
        "userId=" + userId +
        ", userName=" + userName +
        ", userAge=" + userAge +
        ", userEmail=" + userEmail + "}";
  }
}
