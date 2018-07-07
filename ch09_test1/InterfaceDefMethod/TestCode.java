class TestCode implements MyInterface{
  
  public static void main(String... args) {
    TestCode tc = new TestCode();
    tc.getName();
    MyInterface mi = new TestCode();
    mi.getName();
    ((TestCode)mi).getName();
    System.out.println(mi.text);
    System.out.println(MyInterface.text);
    System.out.println(TestCode.text);
    System.out.println(tc.text);
    
  }
}

interface BaseInterface1 {
  default void getName(){
    System.out.println("Base 1");
  }
}

interface BaseInterface2 {
  default void getName(){
    System.out.println("Base 2");
  }
}

interface MyInterface extends BaseInterface1, BaseInterface2 {
  String text = "hello";
  default void getName() {
    System.out.println("Just Me");
  }
}