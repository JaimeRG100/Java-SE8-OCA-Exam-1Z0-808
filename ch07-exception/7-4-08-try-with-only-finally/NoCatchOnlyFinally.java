class NoCatchOnlyFinally {
  public static String name = null;
  
  public static void main(String[] args ) {
    try {
      System.out.println("Try block: open resource 1");
      System.out.println("Try block: open resource 2");
      System.out.println("in try " + name.length());
      System.out.println("Try block: close resource1");
    }
    finally {
     System.out.println("finally: close resources");
    }    
    
  }
}