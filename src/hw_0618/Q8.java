package hw_0618;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num>0) System.out.println("plus");
        else if(num<0) System.out.println("minus");
        else System.out.println("zero");
    }
}
