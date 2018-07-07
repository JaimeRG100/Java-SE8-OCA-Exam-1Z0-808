class MyClass {
  
  public static void main(String... args) {
    
    //test code
    try {
      String [] names = {"Andre", null, };
      System.out.println(names.length);
      System.out.println(names[5]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("3 ArrayIndexOutOfBounds");
    }

    
  }
}