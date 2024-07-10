package day17.database.dbEX;

import day17.database.dbEX.dbconf.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteUserInfo {

  static Connection connection = null;

  public static void main(String[] args) {
    connection = ConnectionFactory.getInstance().open();
    String query = new StringBuilder()
        .append("DELETE FROM ")
        .append("student WHERE name = ?")
        .toString();

    try {
      PreparedStatement pstmt = connection.prepareStatement(query);
      pstmt.setString(1, "고재현");
      int rows = pstmt.executeUpdate();
      System.out.println("삭제된 행의 수 : " + rows);
      pstmt.close();

    } catch (SQLException e) {
      System.err.println("error : " + e.getMessage());
    } finally {
      ConnectionFactory.getInstance().close();
    }
  }

}
