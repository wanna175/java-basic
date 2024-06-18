package hw_0618;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();

        if(d1>=4.0 &&d2>=4.0) System.out.println("A");
        else if(d1>=3.0 &&d2>=3.0) System.out.println("B");
        else System.out.println("C");
    }
}
