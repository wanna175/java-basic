package day13;

public class CheckingAccount extends Account {

  private String cardNo;

  @Override
  public void calcRate() {

  }

  public CheckingAccount(String accid, String ownerName, long balance, String cardNo) {
    super(accid, balance, ownerName);
    this.cardNo = cardNo;
  }

  public void pay(long amount, String cardNo) {
    if (!cardNo.equals(this.cardNo) || getBalance() < amount) {
      System.out.println("지불이 불가능 합니다.");
      return;
    }
    setBalance(getBalance() - amount);
    System.out.println("현재잔액====>" + getBalance());
  }

  public String getCardNo() {
    return cardNo;
  }

  public void setCardNo(String cardNo) {
    this.cardNo = cardNo;
  }
}
