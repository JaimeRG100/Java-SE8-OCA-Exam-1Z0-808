import java.io.*;

class ReThrowException {
  static FileInputStream soccer;
  
  public static void main(String[] args ) {
    try {
      myMethod();
    }
    catch(FileNotFoundException fnfe) {
      System.out.println("Catch rethrown exception");
    }
    
  }
  
  public static void myMethod() throws FileNotFoundException {
    try {
      soccer = new FileInputStream("soccer.txt");
    }
    catch(FileNotFoundException fnfe) {
      throw fnfe;
    }
  }
}