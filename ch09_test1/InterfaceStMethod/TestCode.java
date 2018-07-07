class TestCode implements MyInterface{
  
  public static void main(String... args) {
    TestCode tc = new TestCode();
    BaseInterface1.status();
    BaseInterface2.status();
    MyInterface.status();
  }
}


interface BaseInterface1 {
  static void status() {
    System.out.println("Base 1");
  }
}

interface BaseInterface2 {
  static void status() {
    System.out.println("Base 2");
  }
}

interface MyInterface extends BaseInterface1, BaseInterface2 {
  static void status() {
    System.out.println("MyInterface 3");
  }
}