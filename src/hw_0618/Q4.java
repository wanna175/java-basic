package hw_0618;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();

        if(weight<=50.8) System.out.println("Flyweight");
        else if(weight<=61.23) System.out.println("Lightweight");
        else if(weight<=72.57) System.out.println("Middleweight");
        else if(weight<=88.45) System.out.println("Cruiserweight");
        else System.out.println("Heavyweight");
    }
}
