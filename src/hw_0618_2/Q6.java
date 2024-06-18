package hw_0618_2;

import java.util.Scanner;

public class Q6 {
    final static String[] capital = new String[]{"","Seoul","Washington","Tokyo","Beijing"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("1. Korea");
            System.out.println("2. USA");
            System.out.println("3. Japan");
            System.out.println("4. China\n");

            System.out.printf("number? ");
            int num = sc.nextInt();

            if(num<1||num>4){
                System.out.println("\nnone\n");
                break;
            }

            System.out.println("\n"+capital[num]+"\n");
        }
    }
}
