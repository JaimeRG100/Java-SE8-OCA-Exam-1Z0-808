package home;
import bookstore.*;


class Person {
  
  public static void main(String... CMD) {
    Book b = new Book();
    b.method_1();  // public
    //b.method_2();// protected
    //b.method_3();// private
    //b.method_4();// default
  }
}

class Person2 extends Book {
  
  public void hello() {
    method_1();  // public
    method_2();  // protected
    //method_3();// private
    //method_4();// default    
    
  }
  
  public static void main(String... CMD) {
    Book b = new Book();
    b.method_1();  // public
    //b.method_2();// protected
    //b.method_3();// private
    //b.method_4();  // default
  }
}