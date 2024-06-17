package hw_0617;

public class LogicalOperatorExam {
    public boolean isAgeDiscountable(int age) {
        boolean isDiscount = false;
        // 아래 빈칸을 채워 코드를 완성하세요.
        if(age<20 || age >59)
        {
            isDiscount = true;
        }
        else {
            isDiscount = false;
        }
        return isDiscount;
    }
    public static void main(String[] args) {
        LogicalOperatorExam exam = new LogicalOperatorExam();
        exam.isAgeDiscountable(15);
        exam.isAgeDiscountable(27);
    }
}
