class MyClass {
  
  public static void main(String... args) {
    
    try {
      String [] names = {"Andre", null};
      System.out.println(names[1].substring(0, 2));
    } catch (NullPointerException e){
      System.out.println(1 + " (NullPointerException)");
    }
    
    
  }
}