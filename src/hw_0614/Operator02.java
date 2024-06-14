package hw_0614;

import java.util.Scanner;

public class Operator02 {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.printf("%d / %d = %d...%d",num1,num2,num1/num2,num1%num2);
    }
}
