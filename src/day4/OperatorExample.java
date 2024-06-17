package day4;

public class OperatorExample {
    public static void main(String[] args) {
        //자바는 정수타입을 연산할 때 int로 자동으로 캐스팅된다.
        byte b = 100,result;
        b = (byte)-b;
        result = b;
        System.out.println(result);
        System.out.println(result);

        double z = 1/2;
        if(Double.isFinite(z)||Double.isNaN(z))
            System.out.println("값을 산출할 수 없는 숫자입니다.");
        //객체를 비교할 때는 주소값으로 비교하기 때문에 ==으로 비교할 수 없다.

    }
}
