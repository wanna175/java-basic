package day4;

import java.util.Scanner;

public class LogicalOperEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = sc.next().charAt(0);
        System.out.println(result);
        //1
        System.out.println(Character.isLowerCase(result)?"소문자":"대문자");
        //2

    }
}
