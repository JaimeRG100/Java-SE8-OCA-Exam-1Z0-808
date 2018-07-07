public class TestCode implements MyInterface{
  String name;
  public String getName() {
    return name;
  }
  
  public static void main(String ... args) {
    TestCode tc = new TestCode();
    tc.name = "Jimmy";
    System.out.println(tc.getName());
    MyInterface mi = new TestCode();
    ((TestCode)mi).name = "Err";
    System.out.println(mi.getName());
    
    
  }
}


interface BaseInterface1 {
  String getName();
}

interface BaseInterface2 {
  String getName();
}

interface MyInterface extends BaseInterface1, BaseInterface2 {}
