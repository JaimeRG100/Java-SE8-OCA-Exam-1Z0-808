class Person {
  final StringBuilder name = new StringBuilder("Sh");
  Person() {
    name.append("reya");
    //name = new StringBuilder();  // Error: cannot assign a value to final variable name
  }
  
  public static void main(String... args) {
    Person p = new Person();
    System.out.println(p.name);
  }
  
}
  
  