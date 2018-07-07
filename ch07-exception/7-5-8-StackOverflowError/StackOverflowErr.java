public class StackOverflowErr {
  
  static void recursion() {
    recursion();
  }
  
  public static void main(String... args) {
    recursion();
  }
}