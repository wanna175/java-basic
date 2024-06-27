package day12_mt;

public class ShopService {

  private static ShopService instance = null;

  public static ShopService getInstance() {
    if (instance == null) {
      instance = new ShopService();
    }
    return instance;
  }

}
