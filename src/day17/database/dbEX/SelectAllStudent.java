package day17.database.dbEX;

import day17.database.dbEX.dbconf.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SelectAllStudent {

  static Connection connection = null;
  static ResultSet rs = null;
  static ArrayList<Student> studentList = new ArrayList<>();

  public static void main(String[] args) {
    String query = "SELECT * FROM student";
    connection = ConnectionFactory.getInstance().open();

    try {
      PreparedStatement pstmt = connection.prepareStatement(query);
      rs = pstmt.executeQuery();
      while (rs.next()) {
        Student student = new Student();
        student.setSno(rs.getInt("sno"));
        student.setName(rs.getString("name"));
        student.setKor(rs.getInt("kor"));
        student.setEng(rs.getInt("eng"));
        student.setMath(rs.getInt("math"));
        student.setSci(rs.getInt("sci"));
        student.setGrade(rs.getString("grade").charAt(0));
        studentList.add(student);
      }
      for (Student student : studentList) {
        System.out.println(student.getName() + " " + student.getGrade());
      }
      rs.close();
      pstmt.close();
    } catch (SQLException e) {
      System.err.println("Error : " + e.getMessage());
    } finally {
      ConnectionFactory.getInstance().close();
    }
  }

}
