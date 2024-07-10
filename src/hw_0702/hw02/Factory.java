package hw_0702.hw02;

public abstract class Factory {

  protected int openHour;
  protected int closeHour;
  protected String name;

  protected Factory(String name, int openHour, int closeHour) {
    this.name = name;
    this.openHour = openHour;
    this.closeHour = closeHour;
  }

  public String getFactoryName() {
    return this.name;
  }

  public int getWorkingTime() {
    return closeHour - openHour;
  }

  abstract int makeProducts(char skill);
}
