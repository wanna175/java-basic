package day19.collectionEx.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx01 {

  public static void main(String[] args) {
    Set<String> set = new HashSet<>();

    //객체저장
    set.add("신세계");
    set.add("신세계");
    set.add("신세계1");
    System.out.println(set.size());
    System.out.println("=====================================");
    Set<Member> memberlist = new HashSet<>();

    memberlist.add(new Member("ssg", 20));
    memberlist.add(new Member("ksg", 20));
    memberlist.add(new Member("lsg", 20));
    memberlist.add(new Member("msg", 20));
    System.out.println("=====회원을 반복자 Iterator를 이용해서 가져오기");
    //회원을 반복자 Iterator를 이용하여 가져오기
    Iterator<Member> iterator = memberlist.iterator();
    while (iterator.hasNext()) {
      //회원 한명 가져오기
      Member member = iterator.next();
      System.out.println(member.name + "\t" + member.age);
      //if(member.name.equals("ksg")) iterator.remove();
    }
    Iterator<Member> iterator1 = memberlist.iterator();
    System.out.println();
    System.out.println("member ssg 삭제");
    while (iterator1.hasNext()) {
      //회원 한명 가져오기
      Member member = iterator1.next();
      System.out.println(member.name + "\t" + member.age);
      // if(member.name.equals("ssg")) memberlist.remove(member);   //회원 탈퇴  (컬렉션에서 제거)
      if (member.name.equals("ssg")) {
        iterator1.remove();   //회원 탈퇴  (컬렉션에서 제거)
      }

    }

    System.out.println();
    System.out.println("==========회원을 enhanced for 를 이용해서 가져오기================");

    //회원을 enhanced for 를 이용해서 가져오기
    for (Member member : memberlist) {
      System.out.println(member.name + "\t" + member.age);
      if (member.name.equals("lsg")) {
        memberlist.remove(member);
      }
    }

    System.out.println(memberlist.size());


  }

}
