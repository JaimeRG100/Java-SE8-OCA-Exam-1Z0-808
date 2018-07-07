class c02CountingStringObjects {
  
  public static void main(String... args) {
    
    String summer = new String("Summer");     // object #1
    String summer2 = "Summer";                // object #2
    System.out.println("Summer");
    System.out.println("autumn");             // object #3
    System.out.println("autumn" == "summer"); // object #4
    String autum = new String("Summer");      // object #5

  }
}