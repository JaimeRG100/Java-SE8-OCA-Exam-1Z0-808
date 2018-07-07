/**
 * Test overloaded method
 * Error: reference to calcAverage is ambiguous
 * both method calcAverage(int,double) in MyClass and method calcAverage(double,int) in MyClass match
 */
public class MyClass {
  
  double calcAverage(int a, double b){
    return (a + b) / 2.0;
  }
  
  double calcAverage(double a, int b){
    return (a + b) / 2.0;
  }
  
  public static void main(String... _) {
    MyClass mc = new MyClass();
    System.out.println(mc.calcAverage(2,3));
    
  }
  
}
