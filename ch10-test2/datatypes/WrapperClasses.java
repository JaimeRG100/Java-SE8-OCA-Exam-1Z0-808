
public class WrapperClasses{
  
  public static void main(String[] args) {
    Boolean b = true;
    if (b == true) {
      System.out.println("Boolean b == true");
    }
    
    Character c = 'c';
    if (c == 'c') {
      System.out.println("Character c == 'c'");
    }
    
    Integer i = 0;
    i++;
    i++;
    i++;
    System.out.println("Integer i == " + i);
    
    Double d1 = 10.9828 + 0.0282;
    System.out.println("Double d1 == " + d1);
    
    Boolean b2 = new Boolean(false);
    Character c2 = new Character('c');
    Integer i2 = new Integer(1234);
    b2 = !b2;
    System.out.println("- - - - - - - - - - - - -");
    
     if (b2 == true) {
      System.out.println("Boolean b2 == true");
    }
    c2++;
    System.out.println("Character c2 = " + c2);
    i2 = i2 * 2;
    System.out.println("Integer i2 = " + i2);
    System.out.println("- - - - - - - - - - - - -");
    
    Boolean b3 = Boolean.valueOf("tRuE");
    Character c3 = Character.valueOf('h');
    Integer i3 = Integer.valueOf("1234");
    System.out.println("Boolean b3 = " + b3);
    System.out.println("Character c3 = " + c3);
    System.out.println("Integer i3 = " + i3);
    System.out.println("- - - - - - - - - - - - -");
    
    int primitiveInt = 3;
    Integer classInt = 3;
    if (primitiveInt == classInt) {
      System.out.println("primitive and class wrapper are equal");
      
    }
   

  
  }
  
}
