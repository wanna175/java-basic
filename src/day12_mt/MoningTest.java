package day12_mt;

import java.util.Scanner;

public class MoningTest {

  private int[] score = null;

  public static void main(String[] args) {
    MoningTest instance = new MoningTest();
    Scanner sc = new Scanner(System.in);
    int se = -1;

    while (se != 5) {
      instance.printMenu();
      System.out.print("선택> ");
      se = sc.nextInt();

      try {
        switch(se) {
          case 1 -> instance.inputStudentCnt();
          case 2 -> instance.inputStudentScore();
          case 3 -> instance.printScore();
          case 4 -> instance.scoreAnalysis();
          case 5 -> System.out.println("프로그램 종료");
        }
      } catch (NullPointerException e) {
        System.out.println("학생수부터 입력해줘요");
      }
    }
  }

  public void printMenu() {
    System.out.println("------------------------");
    System.out.println("1. 학생수 | 2.점수입력 | 3. 점수리스트 |4. 분석 | 5.종료 ");
    System.out.println("------------------------");
  }

  public void inputStudentCnt() {
    Scanner sc = new Scanner(System.in);
    System.out.print("학생수> ");
    score = new int[sc.nextInt()];
    System.out.println(score.length);
  }

  public void inputStudentScore() {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < score.length; ++i) {
      System.out.print("score[i]> ");
      score[i] = sc.nextInt();
    }
  }

  public void printScore() throws NullPointerException {
    for (int i = 0; i < score.length; ++i) {
      System.out.printf("score[i]> %d\n", score[i]);
    }
  }

  public void scoreAnalysis() throws NullPointerException {
    int sum = 0, maxV = -1;
    for (int i = 0; i < score.length; ++i) {
      sum += score[i];
      if (maxV < score[i]) {
        maxV = score[i];
      }
    }
    System.out.println("최댓값> " + maxV);
    System.out.printf("평균> %.1f\n", sum / (double) score.length);
  }
}
