import java.io.*;

public class MultipleExceptions {
  
  public static void main(String... args){
    FileInputStream fis = null;
    try {
      fis = new FileInputStream("/file.txt");
      fis.read();
      System.out.println("Read File ");
    }
    catch (FileNotFoundException e) {
      System.out.println("File Not Found Exception");
    }
    catch (IOException e) {
      System.out.println("I/O Exception");
    }
    finally {
      System.out.println("finally");
    }
  }
}