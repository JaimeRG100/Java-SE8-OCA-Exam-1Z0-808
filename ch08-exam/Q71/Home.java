public class Home {
  public static void main(String[] args) {
    Person p = new Person();
    
    // option 1
    try {
      ((Father)p).dance();
    }
    catch (NullPointerException e) { System.out.println("NullPE"); }
    catch (ClassCastException e) { System.out.println("ClassCCE"); }
    catch (Exception e) { System.out.println("Exception"); }
    catch (Throwable e) { System.out.println("Throwable"); }
    
    // option 2
    try {
      ((Father)p).dance();
    }
    catch (ClassCastException e) { System.out.println("ClassCCE"); }
    catch (NullPointerException e) { System.out.println("NullPE"); }
    catch (Exception e) { System.out.println("Exception"); }
    catch (Throwable e) { System.out.println("Throwable"); }
    
    // option 3
    try {
      ((Father)p).dance();
    }
    finally { System.out.println("finally"); }
  }  
}

class Person {}

class Father extends Person {
  public void dance() throws ClassCastException {}
}

