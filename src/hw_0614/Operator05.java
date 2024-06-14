package hw_0614;

import java.util.Scanner;

public class Operator05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person minSoo = new Person(sc.nextInt(), sc.nextInt());
        Person kiYeong = new Person(sc.nextInt(), sc.nextInt());

        System.out.println(Compare(minSoo,kiYeong));
    }
    public static boolean Compare(Person p1,Person p2){
        return p1.getHeight()>p2.getWeight()&&p1.getWeight()> p2.getWeight();
    }
}
