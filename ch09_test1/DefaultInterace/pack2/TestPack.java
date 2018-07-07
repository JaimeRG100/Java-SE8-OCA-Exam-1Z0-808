package pack2;
import pack1.*;

public class TestPack {
  public static void main(String[] args) {
    DefInterface di = new DefInterface();
    di.myMethod();
    System.out.println("- - - - - - ");
    MyInterface mi = new DefInterface();
    mi.myMethod();
    ((DefInterface)mi).classMethod();
    
    
  }
}