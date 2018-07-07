import java.io.*;

class NestedTryCatch {
  FileInputStream players, coach;
  
  public static void main(String[] args) {
    new NestedTryCatch().myMethod();
  }
  
  public void myMethod() {
    try {
      players = new FileInputStream("players.txt");
      // nested inner try block
      try {
        coach = new FileInputStream("coach.txt");
        // .. rest of the code
      } 
      catch (FileNotFoundException e) {
        System.out.println("coach.txt not found");
      }      
    }
    catch (FileNotFoundException e) {
      System.out.println("players.txt not found");
    }
    finally {
      // another nested inner try block
      try {
        players.close();
        coach.close();
      }
      catch (NullPointerException npe) {
        System.out.println(npe);
      }
      catch (IOException ioe) {
        System.out.println(ioe);
      }
      System.out.println("Exit application");
    }
  
  }
  
}