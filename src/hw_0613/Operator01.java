package hw_0613;

import java.util.Scanner;

public class Operator01 {
    public static void main(String[] args) {
        int num1, num2, num3;
        int sum = 0, avg;
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        sum = num1+num2+num3;
        avg = sum/3;
        System.out.println("sum : "+sum);
        System.out.println("avg : "+avg);
    }
}
