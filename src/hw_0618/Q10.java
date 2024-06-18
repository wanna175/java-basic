package hw_0618;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Number? ");
        int num = sc.nextInt();

        if(num==1) System.out.println("dog");
        else if(num==2) System.out.println("cat");
        else if(num==3) System.out.println("chick");
        else System.out.println("I don't know");
    }
}
