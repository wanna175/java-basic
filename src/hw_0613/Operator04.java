package hw_0613;

import java.util.Scanner;

public class Operator04 {
    public static void main(String[] args) {
        int num1,num2,result;
        Scanner scanner = new Scanner(System.in);

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        result = (num1++)*(--num2);

        System.out.printf("%d %d %d",num1,num2,result);
    }
}
