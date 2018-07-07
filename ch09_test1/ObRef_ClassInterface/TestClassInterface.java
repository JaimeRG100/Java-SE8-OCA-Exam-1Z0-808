public class TestClassInterface {
  public static void main(String ... args) {
    Programmer test1 = new Programmer();
    test1.run();
    Person test2 = new Programmer();
    test2.run();
    Runable test3 = new Programmer();
    test3.run();
    System.out.println("- - - - - - - ");
    Person test4 = new Person();
    test4.run();
    System.out.println("- - - - - - - ");
    ((Runable)test2).run();
    ((Person)test2).run();
    ((Programmer)test2).run();
    System.out.println("- - - - - - - ");
    test2.walk();   
    ((Person)test2).walk();
    System.out.println("- - - - - - - ");
    test3.stop();
    test3.run();
    System.out.println("- - - - - - - ");
    Runable [] r = new Runable[1];
    r[0] = new Programmer();
    r[0].run();
    ((Programmer)r[0]).walk();
    System.out.println("- - - - - - - ");
    
  }
}

interface Runable {
  public default void run() {System.out.println("Interface running");}
  public default void stop() {System.out.println("Interface stopping");}
}

class Person {
 public void run() {System.out.println("Person running");}
 public final void walk() {System.out.println("Person walking");}
}

class Programmer extends Person implements Runable {
  public void run() {System.out.println("Programmer running");}
}