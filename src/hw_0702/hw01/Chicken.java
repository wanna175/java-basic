package hw_0702.hw01;

public class Chicken extends Animal implements Cheatable {

  public Chicken(int speed) {
    super(speed);
  }

  @Override
  void run(int hours) {
    this.distance += this.speed * hours;
  }

  @Override
  public void fly() {
    this.speed *= 2;
  }
}
