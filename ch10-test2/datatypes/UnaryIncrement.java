
public class UnaryIncrement {
  
  public static void main(String[] args) {
    int a = 1;
    
    if (a++ == 1) 
      System.out.println("'a' was equal to '1'");
    else
      System.out.println("'a' was not equal to '1'");
    System.out.println("actual value of 'a': " + a);
    
    a = 1;
    System.out.println("- - - - - - - -");
    if (++a == 1) 
      System.out.println("'a' was equal to '1'");
    else
      System.out.println("'a' was not equal to '1'");
    System.out.println("actual value of 'a': " + a);
    
    
    char c = 'a';
    
    System.out.println(c+c);
    System.out.println(c-c);
    System.out.println(c-7);
    System.out.println(c+3);
    
    byte b1 = 12;
    byte b2 = 8;
    //byte s = b1 + b2;  //Error: incompatible types
    System.out.println(b1 + b2);
    
    float f1 = 1.0f;
    float f2 = 2.5f;
    float f3 = f1 + f2;
    
    final byte byte1 = 127;
  
  }
  
}
