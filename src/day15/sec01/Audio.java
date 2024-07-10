package day15.sec01;

public class Audio implements RemoteControl {

  @Override
  public void turnOn() {
    System.out.println("오디오의 전원을 끕니다.");
  }
}
