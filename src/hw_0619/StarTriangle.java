package hw_0619;

import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if(n<1||n>100||m<1||m>3){
            System.out.println("INPUT ERROR!");
            return;
        }

        switch (m){
            case 1 : triangle1(n);break;
            case 2 : triangle2(n);break;
            case 3 : triangle3(n);break;
        }

    }
    public static void triangle1(int height){
        for(int i=0;i<height;++i){
            for(int j=0;j<=i;++j){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void triangle2(int height){
        for(int i=0;i<height;++i){
            for(int j=i;j<height;++j){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void triangle3(int height){
        int total = height*2-1;
        for(int i = 0; i < height; ++i){
            for(int j=0;j<total/2-i;++j)
                System.out.print(" ");
            for(int j=0;j<2*i+1;++j)
                System.out.print("*");
            System.out.println();
        }
    }
}
