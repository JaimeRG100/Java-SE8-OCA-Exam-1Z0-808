package protectedPack;
import protectedPack.protect.TestProtected;

class TestClass extends TestProtected{
  
  public void myMethod() {
    System.out.println("getClassName: " + getClassName());
  }
  
  public static void main(String arg[]) {
    TestClass t = new TestClass();
    System.out.println(t.getClassName());
    t.myMethod();
  }
}

class TestClass22 {
  public static void main(String arg[]) {
    TestProtected t = new TestProtected();
    //t.getClassName();   // Error: getClassName() has protected access in
  }
}