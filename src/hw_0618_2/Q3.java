package hw_0618_2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.printf("number? ");
            int num = sc.nextInt();

            if(num ==0) break;

            if(num>0) System.out.println("positive integer");
            else System.out.println("negative number");
        }
    }
}
