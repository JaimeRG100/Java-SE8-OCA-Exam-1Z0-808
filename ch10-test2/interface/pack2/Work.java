package pack2;
import pack1.*;
//import pack1.Work;   // Error: pack2.Work is already defined in this compilation unit

class Work extends Workeable {
  void method(){ 
    System.out.println("pack2");
  
  }
  
  public static void main(String... as){
    pack2.Work w = new pack2.Work();
    w.method();
  }
  
  
}

abstract class Workeable {
  abstract void method();
}

