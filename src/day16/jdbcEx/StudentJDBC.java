package day16.jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentJDBC {

  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/employees?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    String userName = "root";
    String password = "mysql1234";
    String query = "SELECT * FROM STUDENT";
    try {
      Connection con = DriverManager.getConnection(url, userName, password);
      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery(query);
      while (rs.next()) {
        int sno = rs.getInt("sno");
        String name = rs.getString("name");
        int korean = rs.getInt("korean");
        int math = rs.getInt("math");
        int english = rs.getInt("english");
        int science = rs.getInt("science");
        int total = rs.getInt("total");

        System.out.println(
            sno + " " + name + " " + korean + " " + math + " " + english + " " + science + " "
                + total);
      }
      rs.close();
      stmt.close();
      con.close();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

}
