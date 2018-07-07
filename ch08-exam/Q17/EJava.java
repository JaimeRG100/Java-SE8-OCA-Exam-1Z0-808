class EJava {
  static String name=""; // LINE 1
  
  public EJava() {
    System.out.println(name);
  }
  
  void calc() {
    // LINE 2
    if (8 > 2) {
      System.out.println(name);
    }
  }
  
  public static void main(String... args) {
    // LINE 3
    System.out.println(name);
  }
}