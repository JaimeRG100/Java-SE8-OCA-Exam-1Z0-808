public class ObjectReferences2 {
  
  public static void main(String args[]) {
    Animal a;
    //a.walk();  //Error: variable a might not have been initialized
    a = new Animal(3);
    a.walk();
    System.out.println("--------");
    Animal ah = new Horse();
    System.out.println("--------");
    ah = new Horse(5);
    System.out.println("--------");
    System.out.println("a.age = " + a.age);
    System.out.println("ah.age = " + ah.age);
    System.out.println("((Horse)ah).age = " + ((Horse)ah).age);
    
  }
  
}

class Animal {
  int age = 8;
  Animal() {
    System.out.println("Animal()"); 
  }  
  

  Animal(int x){
    System.out.println("Animal(" + x + ")"); 
  }
  
  void walk() {
    System.out.println("Animal.walk()"); 
  }
}

class Horse extends Animal {
  int age = 6;
  Horse() {
    //super(6);
    System.out.println("Horse()"); 
  }
  
  Horse(int x){
    //super(x);
    System.out.println("Horse(" + x + ")"); 
  }
}