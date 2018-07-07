public class TestTypesClass {
  public static void main(String... aaa){
    long x = 0b0_11111L;
    //int y = x;
    boolean y = true;
    if (y=true)
      System.out.println("ok");
    System.out.println(x);
    
    int a=10;
    int b=20;
    System.out.println(a++ > 10 || ++b < 30);
    
    Integer i1 = 200;
    Integer i2 = 200;
    System.out.println(i1==i2);
    i1 = new Integer(200);
    i2 = new Integer(200);
    System.out.println(i1==i2);
    System.out.println(i1.intValue()==i2.intValue());
    
    double a5 = 10;
  
  }
}