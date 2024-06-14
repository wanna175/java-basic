package day3;

public class StringExam {
    public static void main(String[] args) {
        String name = "java";
        String job = "Programming";

        String str = "나는 \"자바\"를 배웁니다.";
        System.out.println(str);

        //자바는 실행 속도의 향상을 위해 컴파일 단계에서 연산을 수행한다.
        byte result = 10+20;//실행 단계가 아니라 컴파일 단계에서 수행!!
        //정수 리터럴이 아닌 변수가 오퍼랜드로 사용되면 실행 시 연산을 수행한다.
        byte x = 20,y = 10;
        //byte result = x + y;//에러가 발생 byte등 정수타입들이 피연산자이면 자동으로 int로 캐스팅 된다.

        int intval = 10;
        double doubleval = 5.5;
        double result1 = intval + doubleval;
        int result2 = (int)result1;
        System.out.println(result1);
        System.out.println(result2);

        //1/2 = 0.5
        int num1 = 1;
        int num2 = 2;
        System.out.printf("%d/%d = %.1f",num1,num2,(double)num1/num2);

        //String 타입 변환
        int op1 = Integer.parseInt("10");
        double op2 = Double.parseDouble("11.2");
        //역으로 String으로 변환하기
        String str1 = String.valueOf(10);























    }
}
