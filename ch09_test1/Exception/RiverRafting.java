import java.io.*;

class FallInRiverException extends Exception {}

public class RiverRafting {
  void crossRapid(int degree) throws FallInRiverException {
    if (degree > 10) throw new FallInRiverException();
  }
  
  
  public static void main (String ... args) {
    RiverRafting rr = new RiverRafting();
    try {
      rr.crossRapid(11);
    } catch (FallInRiverException e) {
      System.out.println(e);
    }  catch (Exception e) {
      System.out.println(e);
    }
  }
}