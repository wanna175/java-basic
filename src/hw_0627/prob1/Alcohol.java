package hw_0627.prob1;

public class Alcohol extends Drink {

  private double alcper;

  public Alcohol(String name, int price, int count, double alcper) {
    super(name, price, count);
    this.alcper = alcper;
  }


  public static void printTitle() {
    System.out.println("상품명(도수) 단가 수량 금액");
  }

  @Override
  public void printData() {
    System.out.print(
        name + "(" + alcper + ")" + price + " " + count + " " + getTotalPrice() + "\n");
  }
}
