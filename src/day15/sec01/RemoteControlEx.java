package day15.sec01;

public class RemoteControlEx {

  public static void main(String[] args) {
    RemoteControl rc;

    rc = new Television();
    rc.turnOn();

    //rc변수에 audio 객체를 대입
    rc = new Audio();
    rc.turnOn();
  }

}
