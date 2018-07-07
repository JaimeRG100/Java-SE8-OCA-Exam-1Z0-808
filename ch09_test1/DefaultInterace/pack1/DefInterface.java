package pack1;

public class DefInterface implements MyInterface{
  public static void main(String[] args) {
    
  }
  
  public void classMethod() {
    System.out.println("Class Method");
  }
}



interface MyInterface {
  default void myMethod(){
    System.out.println("My Interface Method");
  }
}