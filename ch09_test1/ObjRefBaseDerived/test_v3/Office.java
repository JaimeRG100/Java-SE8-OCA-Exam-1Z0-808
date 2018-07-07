class Office {  
  public static void main(String... args) {
    Derived d = new Derived();
    d.method();
    Base b = new Derived();
    ((Derived)b).method();
  }
}


class Base {
  
}

class Derived extends Base {
  void method() {
    System.out.println("This exists only on Derived class");
  }
}