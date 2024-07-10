package hw_0702.hw02;

public class TVFactory extends Factory implements IWorkingTogether {

  public TVFactory(String name, int openHour, int closeHour) {
    super(name, openHour, closeHour);
  }

  @Override
  int makeProducts(char skill) {
    return -(this.getWorkingTime() * (100 - skill));
  }

  @Override
  public int workTogether(IWorkingTogether partner) {
    return 0;
  }
}
