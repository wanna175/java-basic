package day19.compare;

import java.util.TreeSet;

public class PersonEx {

  public static void main(String[] args) {
    TreeSet<Person> peoples = new TreeSet<>(new PersonComparator());

    peoples.add(new Person("KKK", 19));
    peoples.add(new Person("LLL", 29));
    peoples.add(new Person("GGG", 9));
    peoples.add(new Person("DDD", 39));
    peoples.add(new Person("EEE", 30));
    peoples.add(new Person("BBB", 18));

    for (Person person : peoples) {
      System.out.println(person.getAge() + " " + person.getName());
    }
  }

}
