class DefaultConstruct {
  
  
  static public void main(String[] args) {
    
    char a = 'a';
    //Car c = new Car();   // wont compile
    Car c = new Car(a);
  }
  
  


} 

class Car {
  {
    run(1);
    
  } 
  
  void run(int r) {
    System.out.println("running " + r);
  }
  
  Car(int x){
    System.out.println("hello " + x);
  }
  
    {
    run(2);
    
  } 
  
}