package pack1;

interface Workeable {
  int x=2;
  void method();
  public static void hello(){
    System.out.println("OKK");
  }
}


class Car implements Workeable {
  public static void hello(){
    System.out.println("OKK");
  }
  
  public void method(){}
  
  public static void main(String... asas) {
    Car.hello();
    
  }
}
  