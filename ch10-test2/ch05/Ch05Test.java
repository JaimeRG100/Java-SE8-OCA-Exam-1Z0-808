class Ch05Test {
  
  
  public static void main(String[] args) {
    
    
    
    String[] programmers = {"Outer", "Inner"};

    outer:
    for(String outer : programmers){
      for(String inner : programmers) {
        if (inner.equals("Inner"))
              break outer;
        System.out.print(inner + ":");
      }
    }
    
    Boolean b = true;
    
    if(b)
      System.out.println("if true");
    
    System.out.println(b?"ternary true":"ternary false");
    
    for(;b;){
      System.out.println("for true");
      b = false;
    }
    b = true;
    
    while(b) {
      System.out.println("while true");
      b = false;
    }
    
     System.out.println("do while false");
    while(b);
    
    
    //switch
    switch(11) {
      default:
         System.out.println("not ten");
      case 10: 
        System.out.println("ten");
        break;
      
    }
    
  }
}