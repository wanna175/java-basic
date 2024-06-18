package hw_0618;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char gender = sc.next().charAt(0);
        int age = sc.nextInt();

        if(age>17){
            if(gender=='F') System.out.println("WOMAN");
            else System.out.println("MAN");
        }else{
            if(gender=='F') System.out.println("GIRL");
            else System.out.println("BOY");
        }
    }
}
