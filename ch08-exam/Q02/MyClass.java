class MyClass {
  
  public static void main(String... args) {
    
    try {
      String [][] names = {{"Andre"},{"Mike"}, null, {"Pedro"}};
      System.out.println(names[2][1].substring(0, 2));
    } catch (NullPointerException e){
      System.out.println(1 + " (NullPointerException)");
    }
    
    //test code
    try {
      String [][] names = {{"Andre"},{"Mike"}, null, {"Pedro"}};
      System.out.println(names[2][0]);
    } catch (NullPointerException e){
      System.out.println(2 + " (NullPointerException)");
    }
    
    //test code
    try {
      String [][] names = {{"Andre"}, {"Mike"}, null, {"Pedro"}};
      System.out.println(names[0][5]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("3 ArrayIndexOutOfBounds");
    }
    
    //test code
    String s = null;      
    System.out.println(s);
    
  }
}