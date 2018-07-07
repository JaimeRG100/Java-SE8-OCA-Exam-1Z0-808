public class WrapTest2 {
  
  public static void main(String ... args) {
    new WrapTest2();
    // Boolean ==
    Boolean bool1 = new Boolean("truE");
    Boolean bool2 = new Boolean(true);
    System.out.println(bool1 == bool2);
    bool1 = true;
    bool2 = true;
    System.out.println(bool1 == bool2);  
      
      
    // float = int
    byte b = 12;
    short s = b;
    int i = s + b;
    float f = i;
    f = 10;
    f = 10.0f;
    double d = i ;
    d = 10.0;
    d = b + s;
    
      
    // primitive = wrapper
    Integer z = 12;
    i = z;
    i = z.intValue();
    i = new Integer(12);
    f  = new Integer(12);
    f  = Integer.parseInt("12");
    
    
    while(true)
      break;
    
    
  }
  
  
  WrapTest2() {
    System.out.println("constructor: " + myMethod());
  }
  
  int myMethod(){return 1;}
}


interface Interface1 {
  void getName();
}

interface Interface2 {
  void getName();
}

interface Mix extends Interface1, Interface2 {
  void getName();
}