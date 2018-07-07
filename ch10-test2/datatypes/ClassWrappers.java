import java.util.ArrayList;  // for ArrayList only

public class ClassWrappers {
  public static Boolean getBool(){
    return new Boolean(true);
  }
  
  
  public static void main(String... asas) {
    Boolean a, b, c;
    a = getBool();
    
    a = true;
    b = new Boolean(true);
    c = Boolean.parseBoolean("tRuE");
    
    if(a instanceof Object)
      System.out.println("a Boolean is an Objet");
    
    
    
    Integer x = new Integer(3434);
    Integer y = new Integer(3434);
    Integer z = new Integer(5027);
    if(Integer.valueOf(x) == Integer.valueOf(y))             // valueOf() returns a cached copy for int // This doesn't work with high values
      System.out.println("x == y  (Integer.valueOf(x))");    
    if(x.intValue() == y.intValue())                         // This is the best way to use
      System.out.println("x == y  (x.intValue()");
    if(x.equals(y))                                          // This onlye works for equal types
      System.out.println("x == y  (x.equals(y))");
    
    int x1 = Integer.valueOf(x);
    int x2 = x.intValue();
    int x3 = x + y;
    System.out.println("x + z = " + x3);
    
    
    Integer y1 = Integer.valueOf(127);
    Integer y2 = Integer.valueOf(127);
    if(y1 == y2)
      System.out.println("y1 == y2");
    y2 = 3892;
    y2++;
    if(y1 == y2)
      System.out.println("y1 (" + y1 + ") == y2 (" + y2 + ")");
    else
      System.out.println("y1 (" + y1 + ") <> y2 (" + y2 + ")");
    
    
    Integer obj1 = 357;
    Short obj2 = 357;
    if(obj1.equals(obj2)) 
      System.out.println("obj1 equals obj2");
    //System.out.println(obj1 == obj2);   //Error: incomparable types: 
    if(obj1.intValue() == obj2.shortValue())
      System.out.println("obj1 =(typeValue= obj2");
    
    
    ArrayList <Double> list = new ArrayList<Double>();
  }
  
}
