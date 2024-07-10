package day17.database.dbEX.dbconf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import lombok.Getter;
import lombok.NoArgsConstructor;


public class ConnectionFactory {
  //ConnectionFactory에 Mysql 서버로부터 Connection을 얻어오는 open()메서드를 작성
  //싱글턴 패턴을 이용하여 만들어 주세요

  private static Connection connection = null;
  private static String url = "jdbc:mysql://127.0.0.1:3306/employees?serverTimezone=UTC";
  private static String id = "root";
  private static String pw = "mysql1234";

  private static final ConnectionFactory instance = new ConnectionFactory();

  private ConnectionFactory() {
  }

  public static ConnectionFactory getInstance() {
    return instance;
  }

  public Connection open() {
    try {
      connection = DriverManager.getConnection(url, id, pw);
    } catch (SQLException e) {
      System.err.println("error : " + e.getMessage());
    }
    return connection;
  }

  public void close() {
    try {
      connection.close();
    } catch (SQLException e) {
      System.err.println("error : " + e.getMessage());
    }
  }

}
