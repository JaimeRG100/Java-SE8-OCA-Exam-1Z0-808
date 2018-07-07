class Scope {
  
  
  
  static public void main(String[] args) {
    
     
    { int x = 5; }
    System.out.println("x is out of scope");
    Car.run();
    
    Car c = null;
    
    c.run();
     
   
    
    
  }
  
}

class Car {
  
  static void run(){
    System.out.println("running");
    
  }
  
}