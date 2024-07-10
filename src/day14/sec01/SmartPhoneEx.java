package day14.sec01;

public class SmartPhoneEx {

  public static void main(String[] args) {
    SmartPhone smartPhone = new SmartPhone("갤럭시24", "black");
    Phone phone = new SmartPhone("rrr", "red");
    Phone phone1 = new Phone("ddd", "green");
    System.out.println(smartPhone.model + " " + smartPhone.color);

    smartPhone.bell();
    smartPhone.sendVoice("안녕 친구야 이번주 토요일 몇시?");
    smartPhone.receiveVoice("토요일 2시 어때?");
    smartPhone.hangUp();

    System.out.println(phone1 instanceof Phone);
    System.out.println(phone1 instanceof SmartPhone);
  }

}
