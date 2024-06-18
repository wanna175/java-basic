package hw_0618_2;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0,count = 0;

        while(true){
            int num = sc.nextInt();

            if(num>99||num<0) break;

            sum+=num;
            ++count;
        }
        System.out.println("sum : "+sum);
        System.out.printf("avg : %.1f",sum/(float)count);

    }
}
