package day19.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BookComparatorEx {

  public static void main(String[] args) {
    ArrayList<Book2> booklist = new ArrayList<>();
    booklist.add(new Book2("세이노의 가르침", "세이토", "화이트혁명", 2001));
    booklist.add(new Book2("호모데우스", "유발 하라리", "민음사", 2004));
    booklist.add(new Book2("호모데우스", "유발 하라리", "민음사", 2004));
    booklist.add(new Book2("불안", "알랭 드 보통", "은행나무", 1999));
    booklist.add(new Book2("코스모스", "칼세이건", "사이언스북", 2007));
    booklist.add(new Book2("코스모스", "칼세이건", "사이언스북", 2007));
    booklist.add(new Book2("동물농장", "조지오웰", "민음사", 1989));
    booklist.add(new Book2("정의란 무엇인가", "마이클샌델", "와이즈베리", 2001));
    booklist.add(new Book2("정의란 무엇인가", "마이클샌델", "와이즈베리", 2000));
    booklist.add(new Book2("정의란 무엇인가", "마이클샌델", "와이즈베리", 2008));
    booklist.add(new Book2("사피엔스", "유발 하라리", "김영사", 2010));
    booklist.add(new Book2("역사의 쓸모", "최태성", "다산북스", 2020));
    booklist.add(new Book2("역사의 쓸모", "최태성", "다산북스", 2020));

    //1.제목 내림차순 정렬
    Collections.sort(booklist, new DescSubject());
    for (int i = 0; i < booklist.size(); ++i) {
      System.out.println(booklist.get(i).getYear() + " " + booklist.get(i).getSubject());
    }
    System.out.println();
    System.out.println("======================================================");

    //2.
    Comparator<Book2> mycomparator = new Comparator<Book2>() {
      @Override
      public int compare(Book2 o1, Book2 o2) {
        return (o1.getYear() - o2.getYear()) * (-1);
      }
    };
    Collections.sort(booklist, mycomparator);
    for (int i = 0; i < booklist.size(); i++) {
      System.out.println(booklist.get(i).getYear() + " " + booklist.get(i).getSubject());
    }

    // 3. 기준1 : 출판년도 최신 기준2 : 출판년도가 같다면 제목의 글자수로 내림차순 기준3. 출판년도, 제목의 글자수까지 같다면 , 제목 내림차순
    Collections.sort(booklist, new Comparator<Book2>() {
      @Override
      public int compare(Book2 o1, Book2 o2) {
        int result = (o1.getYear() - o2.getYear()) * (-1);
        if (result == 0) {
          result = (o1.getSubject().length() - o2.getSubject().length()) * (-1);
        }
        if (result == 0) {
          result = (o1.getSubject().compareTo(o2.getSubject())) * (-1);
        }

        return result;
      }
    });
    for (int i = 0; i < booklist.size(); i++) {
      System.out.println(booklist.get(i).getYear() + " " + booklist.get(i).getSubject());
    }

  }

}
