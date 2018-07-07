public class ObjectReferences {
  
  public static void main(String args[]) {
    Child c = new Child();
    c.Parent();
    System.out.println("- - - - - -"); 
    c = new Child(2);
    System.out.println("- - - - - -"); 
    Parent p = new Child();
    p.Parent();
    System.out.println("- - - - - -"); 
    //c.str = "CHANGED";  //Error: cannot assign a value to final variable str
    System.out.println(c.str);
    System.out.println(p.str);
    System.out.println("- - - - - -"); 
    Runable.count();
    // p.count();  // static methods in interface arent inherited
  }
  
}


interface Runable{
  String str = "StaticSTR";  // final
  static int i = 0;
  default void Parent(){
    System.out.println("Interface"); 
  }
  
  static void count(){ System.out.println("Static count interface"); }
}

class Parent implements Runable {
  Parent() {
    System.out.println("Parent"); 
  }
  
  Parent(int x){
    System.out.println("Parent: " + x); 
  }
}

class Child extends Parent {
  Child() {
    System.out.println("Child"); 
  }
  
  Child(int x){
    System.out.println("Child: " + x); 
  }
}