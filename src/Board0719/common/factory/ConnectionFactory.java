package Board0719.common.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {

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
