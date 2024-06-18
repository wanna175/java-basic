package hw_0618;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        String isLeap = "commom year";

        if(year%400==0) isLeap = "leap year";
        if(year%4==0&&year%100!=0) isLeap = "leap year";

        System.out.println(isLeap);
    }
}
