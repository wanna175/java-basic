package day17.database.dbEX;

import day17.database.dbEX.dbconf.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateUserInfo {

  static Connection connection = null;

  public static void main(String[] args) {
    connection = ConnectionFactory.getInstance().open();
    String query = new StringBuilder()
        .append("UPDATE users SET ")
        .append("userAge = ?, ")
        .append("userEmail = ? ")
        .append("WHERE userId = ?").toString();

    try {
      PreparedStatement pstmt = connection.prepareStatement(query);
      pstmt.setInt(1, 20);
      pstmt.setString(2, "winter0715@gmail.com");
      pstmt.setString(3, "0002");

      int rows = pstmt.executeUpdate();
      System.out.println("수정된 행의 수 : " + rows);
      pstmt.close();
    } catch (SQLException e) {
      System.out.println("에러 : " + e.getMessage());
    } finally {
      ConnectionFactory.getInstance().close();
    }
  }

}
