package hw_0613;

import java.util.Scanner;

public class Operator05 {
    public static void main(String[] args) {
        int num1,num2;
        boolean result = false;
        Scanner scanner = new Scanner(System.in);

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        if(num1==num2) result=true;
        System.out.println(result);
        System.out.println(!result);
    }
}
