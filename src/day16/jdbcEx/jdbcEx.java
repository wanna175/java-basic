package day16.jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcEx {

  public static void main(String[] args) throws SQLException {
    mysql1();
  }

  public static void mysql2() {
    String url = "jdbc:mysql://localhost:3306/employees?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    String userName = "root";
    String password = "mysql1234";
    String query = "SELECT * FROM member WHERE id = 1";


  }

  public static void mysql1() {
    String url = "jdbc:mysql://localhost:3306/employees?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    String userName = "root";
    String password = "mysql1234";
    String query = "SELECT * FROM member WHERE id = 1";
    try {
      Connection con = DriverManager.getConnection(url, userName, password);
      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery(query);
      while (rs.next()) {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        String job = rs.getString("job");
        System.out.println(id + " " + name + " " + job);
      }
      rs.close();
      stmt.close();
      con.close();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

}
