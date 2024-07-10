package hw_0702.hw01;

public abstract class Animal {

  protected int speed;
  protected double distance;

  public Animal(int speed) {
    this.speed = speed;
    this.distance = 0.0;
  }

  abstract void run(int hours);

  double getDistance() {
    return this.distance;
  }
}
