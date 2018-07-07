import java.io.*;

class TwistInTheTale7_2 {
  static FileInputStream players, coach;
  
  public static void main(String... str) {
    try {
      players = new FileInputStream("players.txt");
      System.out.println("players.txt found");
      try {
        coach.close();
      }
      catch (IOException e) {
        System.out.println("coach.txt not found");
      }
    }
    catch (FileNotFoundException e) {
      System.out.println("FileNotFoundException");
    }
    catch (NullPointerException ne) {
      System.out.println("NullPointerException");
    }
  }
}