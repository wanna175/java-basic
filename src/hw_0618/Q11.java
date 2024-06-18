package hw_0618;

import java.util.Scanner;

public class Q11 {
    final static int[] common_year = new int[]{0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        if(month>12||month<1) return;
        System.out.println(common_year[month]);
    }
}
