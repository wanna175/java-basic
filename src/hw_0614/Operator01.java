package hw_0614;

import java.util.Scanner;

public class Operator01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kor = sc.nextInt();
        int eng = sc.nextInt();
        int mat = sc.nextInt();
        int com = sc.nextInt();
        int sum=kor+eng+mat+com,avg = sum/4;

        System.out.println("sum = "+sum);
        System.out.println("avg = "+avg);
    }
}
