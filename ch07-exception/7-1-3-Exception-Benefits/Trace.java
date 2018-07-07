class Trace {
  
  public static void main(String... args){
    method1();
  }
  
  public static void method1() {
    method2();
  }
  
  public static void method2() {
    String[] students = {"Shreya", "Joseph"};
    System.out.println(students[5]);
  }
}

/* Tracing the line of code that threw an exception at runtime
 - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
 java.lang.ArrayIndexOutOfBoundsException: 5
 at Trace.method2(Trace.java:13)
 at Trace.method1(Trace.java:8)
 at Trace.main(Trace.java:4) 
 
 */