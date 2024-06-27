package day12_mt.class20;

import java.util.Scanner;

public class BankApplication {

  Account[] accounts = new Account[100];
  int cnt;

  BankApplication(int cnt) {
    this.cnt = cnt;
  }

  public static void main(String[] args) {
    BankApplication instance = new BankApplication(0);
    Scanner sc = new Scanner(System.in);
    int se = -1;
    while (se != 5) {
      instance.printMenu();
      System.out.print("선택> ");
      se = Integer.parseInt(sc.nextLine());

      switch(se) {
        case 1 -> instance.createAccount();
        case 2 -> instance.printAccounts();
        case 3 -> instance.deposit();
        case 4 -> instance.withdraw();
        case 5 -> System.out.println("프로그램 종료");
      }
    }


  }

  public void printMenu() {
    System.out.println("---------------------------------------------");
    System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
    System.out.println("---------------------------------------------");
  }

  public void createAccount() {
    Scanner sc = new Scanner(System.in);
    String AccNo, name;
    int bal;
    System.out.println("---------------");
    System.out.println("계좌생성");
    System.out.println("---------------");
    System.out.print("계좌번호 : ");
    AccNo = sc.nextLine();
    System.out.print("계좌주 : ");
    name = sc.nextLine();
    System.out.print("초기입금액 : ");
    bal = Integer.parseInt(sc.nextLine());

    this.accounts[cnt++] = new Account(AccNo, name, bal);
  }

  public void printAccounts() {
    System.out.println("---------------");
    System.out.println("계좌목록");
    System.out.println("---------------");
    for (int i = 0; i < cnt; ++i) {
      System.out.println(
          accounts[i].getAccNo() + " " + accounts[i].getName() + " " + accounts[i].getBalance());
    }
  }

  public void deposit() {
    Scanner sc = new Scanner(System.in);
    String accNo;
    int depo;
    System.out.println("---------------");
    System.out.println("입금");
    System.out.println("---------------");
    System.out.print("계좌번호 : ");
    accNo = sc.nextLine();
    System.out.println("예금액 : ");
    depo = Integer.parseInt(sc.nextLine());

    for (int i = 0; i < cnt; ++i) {
      if (accounts[i].getAccNo().equals(accNo)) {
        accounts[i].setBalance(depo);
        break;
      }
    }

  }

  public void withdraw() {
    Scanner sc = new Scanner(System.in);
    String accNo;
    int wid;
    System.out.println("---------------");
    System.out.println("출금");
    System.out.println("---------------");
    System.out.print("계좌번호 : ");
    accNo = sc.nextLine();
    System.out.println("예금액 : ");
    wid = Integer.parseInt(sc.nextLine());

    for (int i = 0; i < cnt; ++i) {//마이너스 통장임
      if (accounts[i].getAccNo().equals(accNo)) {
        accounts[i].setBalance(-wid);
        break;
      }
    }
  }

}
