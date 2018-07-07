package pack;

public class MyMethods {
  public static int count = 0;
  
  public static int getCountPlusPlus() {
    return ++count;
  }
  
  public void nonStaticMethod(){
    System.out.println("nonStaticMethod");
  }
}