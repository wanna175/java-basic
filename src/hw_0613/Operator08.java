package hw_0613;

import java.util.Scanner;

public class Operator08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        boolean result1 = (num1>num2)&&(num1>num3);
        boolean result2 = (num1==num2)&&(num2==num3);


        System.out.printf("%d %d",result1?1:0,result2?1:0);
    }
}
