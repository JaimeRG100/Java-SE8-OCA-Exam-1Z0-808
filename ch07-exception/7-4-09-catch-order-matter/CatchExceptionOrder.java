import java.io.*;

class CatchExceptionOrder {
  public static void main(String[] args ) {
    FileInputStream fis = null;
    try {
      fis = new FileInputStream("file.txt");
      fis.close();
    }
    catch (IOException e) {
      System.out.println("IOException");
    }
    // ERROR FileNotFoundException has already been caught
    /*
    catch (FileNotFoundException e) {
      System.out.println("FileNotFoundException");
    }
    */
    
  }
  
}