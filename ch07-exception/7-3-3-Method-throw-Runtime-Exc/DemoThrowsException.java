import java.io.FileNotFoundException;

class DemoThrowsException {
  
  public static void main(String... args){
    try {
      readFile(null);
    }
    catch (FileNotFoundException e){
      System.out.println("FileNotFoundException");
    }
    catch (NullPointerException e){
      System.out.println("NullPointerException");
    }
  }
  
  //public static void readFile(String file) throws FileNotFoundException, NullPointerException {
  // NullPointerException is a Runtime Exception, and isn't required
  
  public static void readFile(String file) throws FileNotFoundException {
    boolean found = findFile(file);
    //runtime exception
    if (file == null)
      throw new NullPointerException();
    
    //checked exception
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