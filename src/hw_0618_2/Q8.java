package hw_0618_2;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int odd = 0,even = 0;
        while(true){
            int num = sc.nextInt();

            if(num==0) break;
            if(num%2==0) even++;
            else odd++;
        }
        System.out.println("odd : "+odd);
        System.out.println("even : "+even);
    }
}
