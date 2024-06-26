package hw_0625_2;

public class Account {

  private String accNo;
  private int balance;

  public void save(int money) {
    this.balance += money;
  }

  public void deposit(int money) {
    if (money > balance) {
      return;
    }
    this.balance -= money;
  }

  public String getAccNo() {
    return this.accNo;
  }

  public void SetAccNo(String accNo) {
    this.accNo = accNo;
  }

  public int getBalance() {
    return balance;
  }
}
