package day12_mt.class20;

public class Account {

  private String AccNo;
  private String name;
  private int balance;

  public Account(String accNo, String name, int balance) {
    this.AccNo = accNo;
    this.name = name;
    this.balance = balance;
  }

  public String getAccNo() {
    return AccNo;
  }

  public void setAccNo(String accNo) {
    AccNo = accNo;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance += balance;
  }
}
