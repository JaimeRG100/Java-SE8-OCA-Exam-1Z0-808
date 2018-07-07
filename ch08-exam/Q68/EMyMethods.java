class EMyMethods {
  static String name = "m1";
  void riverRafting() {
    String name = "m2";   // Error: variable name is already defined in method riverRafting()
    if ( 8 > 2) {
      String name = "m3";
      System.out.println(name);
    }
  }
  
  public static void main(String[] args) {
    EMyMethods m1 = new EMyMethods();
    m1.riverRafting();
  }
}