package day19.compare;

import java.util.Comparator;

public class DescSubject implements Comparator<Book2> {
//제목기준 오름차순 비교기

  @Override
  public int compare(Book2 o1, Book2 o2) {
    return (o1.getSubject().compareTo(o2.getSubject())) * (-1);
  }
}
