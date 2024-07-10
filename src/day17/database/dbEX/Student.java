package day17.database.dbEX;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {

  private int sno;
  private String name;
  private int kor;
  private int eng;
  private int math;
  private int sci;
  private char grade;

}
