public class TestClassInterface {
  public static void main(String ... args) {
    Programmer test1 = new Programmer();
    test1.run();
    Person test2 = new Programmer();
    test2.run();
    
  }
}

class Person {
 public void run() {System.out.println("Person running");}
 public final void walk() {System.out.println("Person walking");}
}

class Programmer extends Person {
  public void run() {System.out.println("Programmer running");}
}