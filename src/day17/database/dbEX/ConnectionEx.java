package day17.database.dbEX;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionEx {

  private static Connection connection = null;
  private static String url = "jdbc:mysql://127.0.0.1:3306/employees?serverTimezone=UTC";
  private static String id = "root";
  private static String pw = "mysql1234";

  public static void main(String[] args) {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      //Driver class파일을 동적로딩하는 것이다. 약간 동적 라이브러리랑 비슷하네

      connection = DriverManager.getConnection(url, id, pw);
      System.out.println("connection 객체값 : " + connection);
    } catch (ClassNotFoundException | SQLException e) {
      System.err.println("에러 : " + e.getMessage());
    } finally {
      if (connection != null) {
        try {
          connection.close();
          System.out.println("서버와 연결이 끊겼습니다.");
        } catch (SQLException e) {
          System.err.println(e.getMessage());
        }
      }
    }
  }
}
