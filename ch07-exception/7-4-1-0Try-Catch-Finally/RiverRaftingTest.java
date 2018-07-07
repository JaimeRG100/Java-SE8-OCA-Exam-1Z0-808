class RiverRaftingTest {
  public static void main(String... arsg) {
    
    RiverRafting riverRafting = new RiverRafting();
    try {
      riverRafting.crossRapid(11);
      riverRafting.rowRaft("happy");
      System.out.println("Enjoy River Rafting");
    }
    catch (FallInRiverException e) {
      System.out.println("Get back in the raft");
    }
    catch (DropOarException e) {
      System.out.println("Do not panic");
    }
    finally {
      System.out.println("Pay for the sport");
    }   
    System.out.println("After the try block");
  }
}

class RiverRafting {
  void crossRapid(int degree) throws FallInRiverException {
    System.out.println("Cross Rapid");
    if (degree > 10) throw new FallInRiverException();
  }
  
  void rowRaft(String state) throws DropOarException {
    System.out.println("Row Raft");
    if (state.equals("nervous")) throw new DropOarException();
  }
  
  
}

class FallInRiverException extends Exception {}
class DropOarException extends Exception {}