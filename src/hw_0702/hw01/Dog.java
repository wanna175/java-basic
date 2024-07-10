package hw_0702.hw01;

public class Dog extends Animal {

  public Dog(int speed) {
    super(speed);
  }

  @Override
  void run(int hours) {
    this.distance += this.speed * hours;
  }
}
