class TestMyInterface implements MyInterface {
  public String getName(){
    return "name";  
  }
  
  public String getLastName(){
    return "LastName";  
  }
  
  
  public static void main(String str[]) {
    System.out.println(BaseInterface1.x);                        //constant test
    System.out.println(new TestMyInterface().getName());         //abstract test
    BaseInterface1.sayHello();                                   //static test
    BaseInterface2.sayHello();                                   
    new TestMyInterface().sayBye();                              //default test
    System.out.println("- - - - - ");
    
    // Object reference test
    MyInterface my = new TestMyInterface();
    System.out.println(my.x); 
    System.out.println(my.getName());
    BaseInterface1.sayHello();                 // static
    my.sayBye();
    System.out.println(((TestMyInterface)my).getLastName());
    
    
    
    
  }
}


interface MyInterface extends BaseInterface1, BaseInterface2 {
  int x = 30;
  public default void sayBye() {System.out.println("Bye 3");}
  
}

interface BaseInterface1{
  int x = 10;                                                       // constant
  String getName();                                                 // abstract
  public static void sayHello() {System.out.println("Hello 1");}    // static
  public default void sayBye() {System.out.println("Bye 1");}       // default
}

interface BaseInterface2{
  int x = 20;
  String getName();
  public static void sayHello() {System.out.println("Hello 2");}
  public default void sayBye() {System.out.println("Bye 1");}
}