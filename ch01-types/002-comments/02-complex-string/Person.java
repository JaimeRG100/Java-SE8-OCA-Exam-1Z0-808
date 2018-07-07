class Person {
  
  public static void main(String[] cmd) {
    
    // Outputs "Paul"
    // - - - - - - - - - - - - - - - -
    String name = /* Harry */ "Paul" ;
    System.out.println(name);
    
    // Outputs "/* Harry */Paul"
    // - - - - - - - - - - - - - - - -
    name = "/* Harry */Paul" ;
    System.out.println(name);
    
    // Won't compile : unclosed string literal error
    // - - - - - - - - - - - - - - - -
    // name = "Shre /* ya
    //  */ Paul";
    // */
    // System.out.println(name);
  }
}
