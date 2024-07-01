package hw_0701;

public abstract class Wheeler {

  protected int velocity;
  protected String carName;
  protected int wheelNumber;


  abstract public void speedUp(int speed);

  abstract public void speedDown(int speed);

  public void stop() {
    velocity = 0;
    System.out.println("정지상태로 속도를 0으로 초기화 합니다.");
  }

  public void printVelocity() {
    System.out.println(carName + "의 현재 속도는 " + this.velocity + " 입니다.");
  }
}
