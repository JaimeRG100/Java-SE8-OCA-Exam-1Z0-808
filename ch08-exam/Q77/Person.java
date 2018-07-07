interface Movable {
  default int distance() {
    return 10;
  }
}

interface Jumpable {
  default int distance() {
    return 10;
  }
}

public class Person implements Movable, Jumpable{
  public int distance() {
      return 10;
    }
  
  // test code
  public static void main(String args[]) {
    
  }
}

