package day12_mt;

public class Account {

  private int balance;

  public void setBalance(int balance) {
    if (AccountVO.MIN_BALANCE > balance || AccountVO.MAX_BALANCE < balance) {
      return;
    }
    this.balance = balance;
  }

  public int getBalance() {
    return balance;
  }
}
