package hw_0618;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>19) System.out.println("adult");
        else System.out.printf("%d years later",20-age);
    }
}
