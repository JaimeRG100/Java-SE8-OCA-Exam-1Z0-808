class FCTest {
  
  public static void main(String... args) {
    if (true) 
    {
      if(false) {
        if (true) {
          System.out.println("1");
        }
        else {
          System.out.println("2");
        }          
      } else {
        System.out.println("3");        
      }
    }
    if (true) if(false) if (true) System.out.println("1"); else System.out.println("2"); else System.out.println("3");
    if (false) ; else System.out.println("4");
    if (false) {} else System.out.println("4");
    int x = 4;
    System.out.println(x==1 ? "ok 1" : 
                         x == 2  ? "ok 2" : 
                         x == 3  ? "ok 3" : "false" + getNumber());
    
    x = 1;
    switch(getNumber()) {
      default: System.out.println("default");
      case 3: System.out.println("case 3"); break;
      case 4: System.out.println("case 4");
      case 5/3: System.out.println( 5 / 3);
    }
    
    for(getNumber(); true; getNumber()) {
      break;
    }
    
    for(int xx= 0, y =0; true; getNumber()) {
      break;
    }
    
    for(int i = 1; i <4; i++) {
      System.out.println(i); 
      continue;
    }
    
    System.out.println("- - - - "); 
    for(int i = 1; i <4; ++i, i++, getNumber(),System.out.print("....")) {
      System.out.println(i); 
      continue;
    }
    
    for(int i = 1; i<20; i++) {
      System.out.print(i + "[");
      for(; i<16; i+=3){
        System.out.print(i + ",");      
      }
      System.out.println(i + "]");
      
    }
    
    int[] myArr = new int[] {0, 1, 2, 3, 4, 5};
    for (int e: myArr) {
      System.out.println("Before: " + e);
      myArr[e] = 55;
    }
    for (int e: myArr) {
      System.out.println("After: " + e);
    }
    
    do ; while(false);
    do {} while(false);
    
      
      
      
  }
  
  public static int getNumber() {
    return 23;
  }
}
