import java.io.*;

public class MultipleExceptions {
  
  public static void main(String... args) {
    FileInputStream fis = null;
    try {
      fis = new FileInputStream("file.txt");
      fis.read();
      System.out.println("File Opened");
    }
    catch(FileNotFoundException e) {
      System.out.println("File not found");
    }
    catch(IOException e) {
      System.out.println("I/O Exception");
    }
    finally {
      System.out.println("finally");
      //code to close  fis
    }
    
  }
  
  
}