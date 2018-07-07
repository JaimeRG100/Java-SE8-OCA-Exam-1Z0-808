class TwistInTale7_3 {
  public static void main(String agrs[]) {
    try {
      myMethod();
    } catch (StackOverflowError s) {
      for(int i = 0; i<2; i++) {
        System.out.println(i);
      }
    }
  }
  
  public static void myMethod() {
    myMethod();
  }
}