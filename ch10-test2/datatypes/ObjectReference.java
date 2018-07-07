public class ObjectReference{
  public static void main(String[] as) {
    Car myCar = new Car();
    myCar.name = "Sentra";
    System.out.println("Before: " + myCar.name);
    Technician.fixCar(myCar, "Corolla");
    System.out.println("After: " + myCar.name);
    
  }
}


class Car{
  public String name = "none";
}


class Technician {
  
  static void fixCar(Car c, String name){
    c.name= name;
  }
}