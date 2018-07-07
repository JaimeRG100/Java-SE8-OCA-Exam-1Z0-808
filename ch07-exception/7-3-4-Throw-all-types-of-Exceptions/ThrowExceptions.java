import java.io.FileNotFoundException;

class HandleExceptions {
  void method6() {
    try {}
    catch (Error e) {}
  }
  
  void method7() {
    try {}
    catch (Exception e) {}
  }
  
  void method8() {
    try {}
    catch (Throwable e) {}
  }
  
  void method9() {
    try {}
    catch (RuntimeException e) {}
  }
  
  void method10() {
    try {
      throw new FileNotFoundException();
    }
    catch (FileNotFoundException e) {}   // Won't compile if the try block doesn't define a code to throw the exception declared
  }
}

class ThrowExceptions {
  
  public static void main(String... args){
    System.out.println(""); 
  }
  
  static void method1() throws Error {}
  static void method2() throws Exception {}
  static void method3() throws Throwable {}
  static void method4() throws RuntimeException {}
  static void method5() throws FileNotFoundException {}
}