package day17.database.dbEX;

import day17.database.dbEX.dbconf.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertEX {

  static Connection connection = null;
  static String query = "INSERT INTO users(userId,userName,userAge,userEmail) VALUES(?,?,?,?)";

  public static void main(String[] args) {
    connection = ConnectionFactory.getInstance().open();

    try {
      PreparedStatement pstmt = connection.prepareStatement(query);
      pstmt.setString(1, "0006");
      pstmt.setString(2, "이제훈");
      pstmt.setInt(3, 42);
      pstmt.setString(4, "dkek323@gamil.com");

      int rows = pstmt.executeUpdate();
      System.out.println("저장된 행의 수 :" + rows);

      pstmt.close();
    } catch (SQLException e) {
      System.err.println("에러 : " + e.getMessage());
    } finally {
      ConnectionFactory.getInstance().close();
    }
  }
}
