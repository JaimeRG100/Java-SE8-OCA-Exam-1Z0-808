import deft.TestClass;

public class TestClass2 {
  public static void main(String... a){
    TestClass tc = new TestClass();
    System.out.println(tc.getInt());
    tc.setInt(5);
    System.out.println(tc.getInt());
  
  }
}