package hw_0614;

import java.util.Scanner;

public class Operator03 {
    public static void main(String[] args) {
        int width,length;
        Scanner sc = new Scanner(System.in);

        width = sc.nextInt();
        length = sc.nextInt();

        width+=5;
        length*=2;

        System.out.println("width = "+width);
        System.out.println("length = "+length);
        System.out.println("area = "+width*length);
    }
}
