package hw_0613;

import java.util.Scanner;

public class Operator07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        boolean b_num1 = (num1!=0);
        int num2 = scanner.nextInt();
        boolean b_num2 = (num2!=0);

        System.out.printf("%d %d\n\n",b_num1&&b_num2?1:0,b_num1||b_num2?1:0);
        System.out.println("[JAVA]");
        System.out.printf("%b %b",b_num1&&b_num2,b_num1||b_num2);
    }
}
