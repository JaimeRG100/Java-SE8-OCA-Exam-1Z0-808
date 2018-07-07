public class Person {
  static final int MAX_AGE = 70;
  final int MAX_WIDTH = 100;
  
  public static void main(String... args) {
    x = 30;
    System.out.println(getX());
    
  }
  
  private static int x = 10;
  public static int getX() {
    return x;
  }
}