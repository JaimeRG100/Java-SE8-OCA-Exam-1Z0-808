class NoInkException extends Exception{}

public class Pen {
  void write(String val) throws NoInkException {
    try {
    int c = (10 - 7) / (8 - 2 - 6);
    } catch (Exception e) {
      throw new NoInkException();
    }
  }
  
  void article() {
    // INSERT CODE HERE
    
    //option 1
    try {
      new Pen().write("story");
    } catch (Exception e)  {
      System.out.println("Exception");      
    }
    
    // option 2
    try {
      new Pen().write("story");
    } catch (NoInkException e)  {
      System.out.println("NoInkException");
    }
  }
  
  public static void main(String[] args) {
    // test code
    new Pen().article();
  }    
}