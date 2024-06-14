package hw_0613;

import java.util.Scanner;

public class Operator03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println(num++);
        System.out.println(++num);
    }
}
