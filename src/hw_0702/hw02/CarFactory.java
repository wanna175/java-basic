package hw_0702.hw02;

public class CarFactory extends Factory implements IWorkingTogether {

  public CarFactory(String name, int openHour, int closeHour) {
    super(name, openHour, closeHour);
  }

  @Override
  int makeProducts(char skill) {
    return -(this.getWorkingTime() * (99 - skill));
  }

  @Override
  public int workTogether(IWorkingTogether partner) {
    return 0;
  }
}
