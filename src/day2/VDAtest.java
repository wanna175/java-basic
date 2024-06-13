 package day2;

public class VDAtest {
    public static void main(String[] args) {
        int v;
        v = 20;
        System.out.println("v = "+ v);
        //2
        int a = 10;
        int b = a * 10;
        int c = b * 10;
        //3
        int sum = 0;
        sum += 1;
        sum += 2;
        sum += 3;
        sum += 4;
        sum += 5;
        System.out.println(sum);
        //4
        int x = 10;
        int y = 20;
        int tmp;
        tmp = x;
        x = y;
        y = tmp;
        System.out.println("x = " + x + "\ny = " + y);

        //20을 이진수로 표현
        int o = 0b10100;

        int x5 = 30;
        boolean result;
        result = (x5 == 20);

    }
}
