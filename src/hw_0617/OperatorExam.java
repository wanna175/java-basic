package hw_0617;

public class OperatorExam {
    public int[] calculate() {
        int a = 7;
        int b = 3;

        //c는 a와 b의 합
        int c =a+b;
        //d는 a와 b의 차
        int d =a-b;
        //e는 a와 b의 곱
        int e =a*b;
        //f는 a를 b로 나눈 나머지
        int f =a%b;
        System.out.printf("c는: %d\n", c);
        System.out.printf("d는: %d\n", d);
        System.out.printf("e는: %d\n", e);
        System.out.printf("f는: %d\n", f);
        int ret[] = {c, d, e, f};
        return ret;
    }
    public static void main(String []args){
        new OperatorExam().calculate();
    }
}
