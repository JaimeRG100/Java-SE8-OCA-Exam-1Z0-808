package pack1;

public interface MyInterface {
  default void myMethod(){
    System.out.println("My Interface Method");
  }
}