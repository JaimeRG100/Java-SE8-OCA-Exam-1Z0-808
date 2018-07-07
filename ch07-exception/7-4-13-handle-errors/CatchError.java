class CatchError {
  public static void main(String[] args) {
    try {
      new CatchError().myMethod();
    }
    catch(StackOverflowError s) {
      System.out.println(s);
    }    
  }
  
  void myMethod() {
    String[] s1 = new String[] {"AAKSHAJSHAAS", "akjslasakjshajhsashj","nanxbcnxcbnmxcbnc","msdnjsdjsdhksd","kljsdjhsjkdhsjdsjd"};
    double d1[] = {29882373.343223, 29882373.343223, 29882373.343223, 29882373.343223};
    long l1= 29323092389203L;
    System.out.println("myMethod()");
    new CatchError().myMethod();
  }
  
}