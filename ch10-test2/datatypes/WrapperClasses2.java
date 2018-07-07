
public class WrapperClasses2{
  
  public static void main(String[] args) {
    Long var1 = Long.valueOf(123);
    Long var2 = Long.valueOf("123");
    System.out.println(var1 == var2);

    
    Long var3 = Long.valueOf(456);
    Long var4 = Long.valueOf("456");
    System.out.println(var3 == var4);
    
    long var5 = 123;
    System.out.println(var1 == var5);
    System.out.println(var2 == var5);
    long var6 = 456;
    System.out.println(var3 == var5);
    System.out.println(var4 == var5);
    
  }
  
}
