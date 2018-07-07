package scope;

public class OverloadedConstructor {
  
  public static void main(String[] asas) {
    Car c1 = new Car();
    Car c2 = new Car(2012);
    Car c3 = new Car("Corolla");
    Car c4 = new Car("Sentra", 2005);
    
    System.out.println("- - - - - - - - ");
    System.out.println(c1.getName() + " (" + c1.getYear() + ")");
    System.out.println(c2.getName() + " (" + c2.getYear() + ")");
    System.out.println(c3.getName() + " (" + c3.getYear() + ")");
    System.out.println(c4.getName() + " (" + c4.getYear() + ")");
  }
}

//package scope;
class Car {  
  private String name;
  private int year;
  
  Car(){
    this(null,0);
    System.out.println("Initializing... " + getName() + " ... " + getYear());
  }
  
  public Car(int year){
    this(null,year);
    System.out.println("Initializing... " + getName() + " ... " + getYear());
  }
  
  protected Car(String name){
    this(name,0);
    System.out.println("Initializing... " + getName() + " ... " + getYear());
  }
  
  protected Car(String name, int year){
    this.name = name;
    System.out.println("Initializing... " + getName() + " ... " + getYear());
    this.year = year;
  }
  
  String getName(){
    return this.name;
  }
  
  int getYear(){
    return this.year;
    
  }
  
  
  
  
}