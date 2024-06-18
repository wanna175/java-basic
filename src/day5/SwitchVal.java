package day5;

public class SwitchVal {
    public static void main(String[] args) {
        String grade = "B";
        int score2 = switch (grade){
            case "A" -> 100;
            case "B" -> {
                int result = 80;
                yield result;
            }
            default -> 60;
        };
        System.out.println("Score2의 값 : "+score2);
    }
}
