package day4;

import java.util.Scanner;

public class LogicalOperEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("숫자1 : ");
        int num1 = sc.nextInt();
        System.out.printf("숫자2 : ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("합계 : "+ sum);
        System.out.printf("평균 : %.1f",sum/2.0);
    }
}
