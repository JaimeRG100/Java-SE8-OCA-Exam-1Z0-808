import java.io.*;

class ReThrowException2 {
  
  public static void main(String[] args) {
    try {
      new ReThrowException2().myMethod();
    }
    catch (IOException e) {
      System.out.println(e);
    }
  }
  
  public void myMethod() throws IOException {
    FileInputStream soccer = new FileInputStream("Soccer.txt");
    soccer.close();
  }
}