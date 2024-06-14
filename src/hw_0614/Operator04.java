package hw_0614;

import java.util.Scanner;

public class Operator04 {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.printf("%d %d",++num1,num2--);
        System.out.printf("%d %d",num1,num2);
    }
}
