public class VarScope{
  int x = 12;
  
  {
    System.out.println("loading class: " + x);
  }
  
  VarScope() {
    int x = 6;
    this.x = x;
    
  }
  
  public static void main(String... asas) {
    int x = 5;
    VarScope vs = new VarScope();
    System.out.println("construc execution: " + vs.x);
    vs.x = x;
    System.out.println("after direct change: " + vs.x);
    
  }
  
}
