interface Moveable {
  int move(int distance); 
}

class Person {
  static int MIN_DISTANCE = 5;
  int age;
  float height;
  boolean result;
  String name;
}

public class EJava {
  public static void main(String arguments[]) {
    Person person = new Person();
    Moveable moveable = (x) -> Person.MIN_DISTANCE + x;
    System.out.println(person.name +
                       person.height +
                       person.result +
                       person.age +
                       moveable.move(20));
                         
  }
}