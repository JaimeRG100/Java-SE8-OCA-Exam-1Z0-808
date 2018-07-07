import java.io.*;

public class TwistInTheTale7_1 {
  
  public static void main(String... args) {
    FileInputStream fis = null;
    try {
      fis = new FileInputStream("file.txt");
      System.out.println("File Opened");
      fis.read();
      System.out.println("Read File");
    } /*finally {
      System.out.println("finally");               // <-- Error: 'catch' without 'try'
    } */ catch (FileNotFoundException e) {
      System.out.println("File not found");
    } catch (IOException e) {
      System.out.println("File Closing Exception");    
    }
  }
  
}