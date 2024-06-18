package hw_0618_2;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int num = sc.nextInt();
            int div = num/3;
            if(num==-1) break;

            if(num%3 ==0) System.out.println(div);
        }
    }
}
