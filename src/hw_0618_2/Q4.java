package hw_0618_2;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0,count=0;

        while(true){
            int num = sc.nextInt();
            sum+=num;
            ++count;

            if(num>99) break;
        }
        System.out.println(sum);
        System.out.printf("%.1f",sum/(float)count);
    }
}
