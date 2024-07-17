package day19.MapEx;

import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {

  public static void main(String[] args) throws IOException {
    Properties properties = new Properties();
    //PropertiesEx 클래스를 기준으로 database.properties 를 읽어온다.(상대경로)
    //Class 객체의 getResourceAsStream 메소드는 주어진 상대 경로의 리소스 파일을 읽어와 InputStream을 리턴해 준다.
    properties.load(PropertiesEx.class.getResourceAsStream("database.properties"));
    String driver = properties.getProperty("driver");
    String url = properties.getProperty("url");

    System.out.println(driver);
    System.out.println(url);
  }

}
