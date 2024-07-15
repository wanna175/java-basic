package day17.database.dbEX;

import day17.database.dbEX.dbconf.ConnectionFactory;
import day17.database.dbEX.vo.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectOneUser {

  static Connection connection = null;
  static ResultSet rs = null;

  public static void main(String[] args) {
    String query = "SELECT userId,userName,userAge,userEmail " +
        "FROM users " + "WHERE userId=?";
    connection = ConnectionFactory.getInstance().open();

    try {
      PreparedStatement pstmt = connection.prepareStatement(query);
      pstmt.setString(1, "0001");
      rs = pstmt.executeQuery();

      if (rs.next()) {
        User user = new User();
        user.setUserId(rs.getString("userId"));
        user.setUserName(rs.getString("userName"));
        user.setUserAge(rs.getInt("userAge"));
        user.setUserEmail(rs.getString("userEmail"));
        System.out.println(user.toString());
      } else {
        System.out.println("해당 회원은 존재하지 않습니다.");
      }

      rs.close();
      pstmt.close();
    } catch (SQLException e) {
      System.err.println("에러: " + e.getMessage());
    } finally {
      ConnectionFactory.getInstance().close();
    }
  }

}
