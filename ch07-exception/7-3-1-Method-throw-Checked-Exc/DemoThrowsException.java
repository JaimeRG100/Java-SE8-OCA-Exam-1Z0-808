import java.io.FileNotFoundException;

class DemoThrowsException {
  
  public static void main(String... args){
    try {
      readFile("TextFile.txt");
    }
    catch (FileNotFoundException e){
      System.out.println("FileNotFoundException");
    }
  }
  
  public static void readFile(String file) throws FileNotFoundException {
    boolean found = findFile(file);
    if(!found)
      throw new FileNotFoundException("Missing file");
    else {
      // code to read file
    }
  }
  
  static boolean findFile(String file){
    //simulated code to return true if file can be located
    return false;
  }
}