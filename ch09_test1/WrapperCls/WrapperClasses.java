public class WrapperClasses {
  
  public static void main(String ... args) {
    // values create with new creates object references
    Boolean bool1 = new Boolean("truE");
    Boolean bool2 = new Boolean(true);
    System.out.println("Boolean()");
    System.out.println("equals(): " + bool1.equals(bool2)); 
    System.out.println("== " + (bool1 == bool2)); 
    
    // values using valueOf (autoboxing)
    System.out.println("- - - - - ");
    Boolean bool3 = true;
    Boolean bool4 = true;
    System.out.println(bool3 == bool4); 
    Boolean bool5 = Boolean.valueOf(false);
    Boolean bool6 = Boolean.valueOf(false);
    System.out.println(bool5 == bool6); 
    System.out.println(Boolean.valueOf(true) == Boolean.valueOf(true)); 
    System.out.println("- - - - - ");
    
    // new () creates new object references 
    Integer i1 = new Integer(100);
    Integer i2 = new Integer(100);
    System.out.println("Integer()");
    System.out.println(i1 == i2);
    
    // valueOf (autoboxing) cache values less than 127
    Integer i3 = Integer.valueOf(126);
    Integer i4 = Integer.valueOf(126);
    System.out.println(i3 == i4);
    Integer i5 = Integer.valueOf(128);
    Integer i6 = Integer.valueOf(128);
    System.out.println(i5 == i6);
    System.out.println(Integer.valueOf(128) == Integer.valueOf(128));
    System.out.println(i3.equals(i4));
    System.out.println(i3.intValue() == i4.intValue());
    i3 = 126;
    i4 = 126;
    i5 = 128;
    i6 = 128;
      
    
    //using math operators
    System.out.println(i3.intValue() + i4.intValue());
    System.out.println(i3.intValue() + i4.intValue());
    
    // declaring multiple WP types
    Float flo1 = new Float(13.45);
    Float flo2 = new Float(13.46f); flo2 = Float.valueOf(13.46f);
    Float flo3 = new Float("13.4"); flo3 = Float.valueOf("13.4");
    Float flo4 = new Float("13");
    Float flo5 = new Float(812.122d);
    Float flo6 = new Float(123_4.3_2);
    
    Byte byt1 = new Byte((byte)126);
    Short sho1 = new Short((short)129);
    Character cha1 = new Character('a');
    Double dou1 = new Double(12.242);
    Double dou2 = new Double(12.24342d);
    Double dou3 = new Double("13.24342");
    Long  lon1 = new Long(1231232889L);
    Long  lon2 = new Long("923123288");
        
    // mixing Wrapper Classes
    lon1 = new Long(i3); System.out.println(lon1);
    dou1 = Double.valueOf(flo2); System.out.println(dou1);
    i1 = 100;
    lon1 = 100L;
    //if ( i1 == lon1) System.out.println("==");  // Incomparable types
    if (i1.equals(lon1)) System.out.println("equals"); else System.out.println("not equals");
    if (i1.intValue() == lon1.intValue())  System.out.println("intValue() == true"); else System.out.println("intValue() == true");
    
  }
}