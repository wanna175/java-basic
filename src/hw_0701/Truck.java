package hw_0701;

public class Truck extends Wheeler {

  public Truck(String carName, int velocity, int wheelNumber) {
    this.carName = carName;
    this.velocity = velocity;
    this.wheelNumber = wheelNumber;
  }

  @Override
  public void speedUp(int speed) {
    this.velocity += 5 * speed;
    if (this.velocity > 100) {
      this.velocity = 100;
      System.out.println(this.carName + "의 최고속도 위반으로 " + this.velocity + "를 100으로 내립니다.");
    }
  }

  @Override
  public void speedDown(int speed) {
    this.velocity -= 5 * speed;
    if (this.velocity < 50) {
      this.velocity = 50;
      System.out.println(this.carName + "의 최저속도위반으로 속도를 " + this.velocity + "으로 올립니다.");
    }
    System.out.println();
  }

}
