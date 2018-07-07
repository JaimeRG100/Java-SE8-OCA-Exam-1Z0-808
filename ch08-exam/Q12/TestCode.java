class Test {
  String pages = "test 0";
}

public class TestCode extends Test {
  String pages = "test 1";
  public static void main(String args[]) {
    Test myTest = new TestCode();
    System.out.println(myTest.pages);
    System.out.println(((TestCode)myTest).pages);
  }
}