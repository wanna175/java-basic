package hw_0618_2;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans=0;
        while(true){
            int num = sc.nextInt();
            if(num==0) break;
            if(num%3==0||num%5==0) continue;
            ++ans;
        }
        System.out.println(ans);
    }
}
