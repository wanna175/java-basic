package day15.sec01;

public class Television implements RemoteControl {

  @Override
  public void turnOn() {
    System.out.println("tv 전원을 끕니다.");
  }
}
