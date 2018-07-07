import java.io.*; 

public class ReturnFromCatchBlock {
  public static void main(String[] args) {
    openFile();
    System.out.println("Back to main()");
  }
  
  private static void openFile() {
    FileInputStream fis = null;
    try {
      fis = new FileInputStream("file.txt");
    }
    catch(FileNotFoundException e) {
      System.out.println("file not found");
      return;
    }
    finally {
      System.out.println("finally");
    }
    System.out.println("Next task");
  }
  
}