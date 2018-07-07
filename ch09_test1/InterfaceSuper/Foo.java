class Foo {
  public static void main(String... args) {
    Programmer p = new Programmer();
    System.out.println(Programmer.lastName2);
    p.getLastName();
    System.out.println(Programmer.lastName2);
    
    
  }
}

class Employee {
  String name;
  static String lastName2;
}

class Programmer extends Employee {
  String name;
  static String lastName;
  static void getName() {
    // this.name = "Programmer";  // Error: non-static variable this cannot be referenced from a static context
    // super.name = "Programmer";  //
  }
  
  void getLastName() {
    this.name = "OK";
    super.name = "OK";
    this.lastName = "OK";
    super.lastName2 = "OK";
  }
}