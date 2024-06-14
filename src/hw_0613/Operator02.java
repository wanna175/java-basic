package hw_0613;

import java.util.Scanner;

public class Operator02 {
    public static void main(String[] args) {
        int num1, num2;

        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num1+=100;
        num2%=10;
        System.out.printf("%d %d",num1,num2);
    }
}
