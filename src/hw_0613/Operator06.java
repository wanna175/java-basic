package hw_0613;

import java.util.Scanner;

public class Operator06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.printf("%d > %d --- %d\n",num1,num2,(num1 > num2)?1:0);
        System.out.printf("%d < %d --- %d\n",num1,num2,(num1 < num2)?1:0);
        System.out.printf("%d >= %d --- %d\n",num1,num2,(num1 >= num2)?1:0);
        System.out.printf("%d <= %d --- %d\n",num1,num2,(num1 <= num2)?1:0);
    }
}
