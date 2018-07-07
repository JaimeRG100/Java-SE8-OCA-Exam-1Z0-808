class Person {
  Person(String value) {}
}

class Employee extends Person{
  // Error: constructor Person in class Person cannot be applied to given types;
  // required: java.lang.String
  // found: no arguments
  // reason: actual and formal argument lists differ in length

}

public class Test {
  public static void main(String args[]) {
    Employee e = new Employee();
  }
}
