class TestRiverRafting {
  
  public static void main(String... args) {
    // EXAMPLE 0
    // RiverRafting riverRafting = new RiverRafting();
    // riverRafting.crossRapid(9);                      // <-- Error: unreported exception FallInRiverException; must be caught or declared to be thrown
    new Handle().main(args);
    try {
      new Declare().main(args);
    }
    catch (FallInRiverException e) {
      System.out.println("(Declare) Exception: " + e);
    }
    try {
      new Declare().main(args);
    }
    catch (FallInRiverException e) {
      System.out.println("(HandAndDeclare<Outside>) Exception: " + e);
    }
  }
}

class FallInRiverException extends Exception {}

class RiverRafting {
  void crossRapid(int degree) throws FallInRiverException {
    if (degree > 10) throw new FallInRiverException();
  }
}

class Handle {
  public static void main(String... args) {
    RiverRafting riverRafting = new RiverRafting();
    // EXAMPLE 1
    try {
      riverRafting.crossRapid(11);
    }
    catch (FallInRiverException e) {
      System.out.println("(Handle) Exception: " + e);
    }
  }
}

class Declare {
  public static void main(String... args) throws FallInRiverException {
    RiverRafting riverRafting = new RiverRafting();
    // EXAMPLE 2
    riverRafting.crossRapid(11);
  }
}

class HandleAndDeclare {
  public static void main(String... args) throws FallInRiverException {
    RiverRafting riverRafting = new RiverRafting();
    // EXAMPLE 3
    try {
      riverRafting.crossRapid(11);
    }
    catch (FallInRiverException e) {
      System.out.println("(HandleAndDeclare) Exception: " + e);      
    }
  }
}