class ArrayOfIntAbsCls {
  
  static public void main(String... ____) {
    
    //Example 1
    MyInterface[] interfaceArray = new MyInterface[] 
    {
      new MyClass1(),
      null,
        new MyClass2(),
    };    
    interfaceArray[0].printHello();
    interfaceArray[2].printHello();
    
    
    //Example 2
    Vehicle[] vehicleArray = 
    {
      new Car(),
      new Bus(),
      null
    };
    
    
    //Example 3
    Object[] objArray = new Object[] {
      new MyClass1(),
      null,
      new Car(),
      new java.util.Date(),
      new String("name"),
      new Integer[] {0,1,2,3,4,5,6}
    };
    ((MyClass1)(objArray[0])).printHello();
    System.out.println(objArray[4]);

  }
}

//Example 1
interface MyInterface { abstract void printHello();}
class MyClass1 implements MyInterface { public void printHello(){System.out.println("Hello 1");} }
class MyClass2 implements MyInterface { public void printHello(){System.out.println("Hello 2");} }


//Example 2
abstract class Vehicle{}
class Car extends Vehicle {}
class Bus extends Vehicle {}