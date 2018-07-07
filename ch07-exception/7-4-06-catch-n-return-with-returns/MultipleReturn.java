public class MultipleReturn {
  public static void main(String[] args) {
    int i = getInt();
    System.out.println("Back to main(). getInt() return value: " + i);
  }
  
  static int getInt() {
    try {
      String[] students = {"Harry", "Paul"};
      System.out.println(students[5]);
    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("I'm in catch block");
      return 10;
    }
    finally {
      System.out.println("I'm in finally block");
      return 20;
    }
  }
}
