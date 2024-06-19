package day5_6;

import java.util.Scanner;

public class ForExam {
    public static void main(String[] args) {
        for(int i=0;i<5;++i) System.out.println(i);
        System.out.println("==========");
        for(int i=0;i<5;i++) System.out.println(i);
        //
        int sum=0;
        for(int i=1;i<101;++i) sum+=i;
        System.out.println(sum);
        //////////////////////////////////////////
        sum=0;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;++i){
            int num = sc.nextInt();
            sum+=num;
        }
        System.out.println(sum);
        //////////////////////////////////////////


    }
}
