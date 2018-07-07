package bookstore;

public class Book {
  public void method_1() {
    System.out.println("Method 1");
  }
  protected void method_2() {
    System.out.println("Method 2");
  }
  private void method_3() {
    System.out.println("Method 3");
  }
  void method_4() {
    System.out.println("Method 4");
  }
  
  public static void main(String... CMD) { 
    
    Book b = new Book();
    b.method_1();  // public
    b.method_2();  // protected
    b.method_3();  // private
    b.method_4();  // default
    System.out.println("- - - - - - - -");
    
    Book2 b2 = new Book2();
    b2.main("hi");
    }

}

class Book2 extends Book {
  
  public void hello() {
    method_1();  // public
    method_2();  // protected
    //method_3();// private
    method_4();// default    
    
  }
  
  public static void main(String... CMD) {
    Book b = new Book();
    b.method_1();  // public
    b.method_2();// protected
    //b.method_3();// private
    b.method_4();  // default
  }
  
}