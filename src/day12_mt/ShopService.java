package day12_mt;

public class ShopService {

  private static ShopService instance = null;

  private ShopService() {
    System.out.println("객체가 생성되었습니다.");
  }

  public static ShopService getInstance() {
    if (instance == null) {
      instance = new ShopService();
    }
    return instance;
  }

}
