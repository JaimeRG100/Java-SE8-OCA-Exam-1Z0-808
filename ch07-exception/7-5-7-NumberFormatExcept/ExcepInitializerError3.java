class ExcepInitializerError3 {
  static String name = getName();
  
  static String getName() {
    throw new MyException();    
  }
  
  public static void main(String ... args) {
  }
}

class MyException extends RuntimeException{}