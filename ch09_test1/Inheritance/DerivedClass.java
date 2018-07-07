public class DerivedClass extends BaseClass {
  
  DerivedClass(){
    System.out.println("DerivedClass");
  }
  
  public static void main(String... args) {
    DerivedClass dv = new DerivedClass();
    System.out.println("- - - - - -");
    BaseClass bc = new BaseClass();
    System.out.println("- - - - - -");
    BaseClass mix = new DerivedClass();
    System.out.println("- - - - - -");    
  }
}

class BaseClass {
  public void BaseClass() {
    System.out.println("BaseClass");
  }
  
}
