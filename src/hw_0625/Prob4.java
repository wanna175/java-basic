package hw_0625;

public class Prob4 {

  public static void main(String[] args) {
    char[][] alphabet = new char[5][5];
    char start = 'A';

    //1.배열에 알파벳 입력
    for (int i = 0; i < 5; ++i) {
      for (int j = 0; j < 5; ++j) {
        alphabet[i][j] = start++;
      }
    }

    //2.원본 배열 출력
    System.out.println("      원본 배열");
    printArr(alphabet);
    //3. 배열 수정
    for (int i = 0; i < 5; ++i) {
      alphabet[i][i] = '*';
    }

    //4. 수정된 배열 출력
    System.out.println("      수정된 배열");
    printArr(alphabet);
  }

  public static void printArr(char[][] arr) {
    System.out.println("==========================");
    for (int i = 0; i < 5; ++i) {
      for (int j = 0; j < 5; ++j) {
        System.out.printf("%c\t", arr[i][j]);
      }
      System.out.println();
    }
  }
}
