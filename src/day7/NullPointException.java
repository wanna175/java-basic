package day7;

public class NullPointException {

  public static void main(String[] args) {
    int[] intArray = null;

    intArray = new int[5];
    int[] intArrayClone = intArray;

    System.out.println(intArray + " " + intArray.hashCode());
    intArray[0] = 10;
    intArray[1] = 20;
    intArray[2] = 30;
    intArray[3] = 40;
    intArray[4] = 50;
    for (int value : intArrayClone) {
      System.out.println(value);
    }
    if (intArray == intArrayClone) {
      System.out.println("주소값이 같다.");
    } else {
      System.out.println("다르다");
    }
    intArrayClone = null;
    for (int value : intArrayClone) {
      System.out.println(value);
    }//nullPointException이 발생한다.
  }

}
