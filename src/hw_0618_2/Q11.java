package hw_0618_2;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.printf("Base = ");
            int base = sc.nextInt();
            System.out.printf("Height = ");
            int height = sc.nextInt();
            System.out.printf("Triangle width = %.1f\n",base*height/2.0);
            System.out.printf("Continue? ");
            char con = sc.next().charAt(0);
            if(con!='y' && con!='Y') break;
        }
    }
}
