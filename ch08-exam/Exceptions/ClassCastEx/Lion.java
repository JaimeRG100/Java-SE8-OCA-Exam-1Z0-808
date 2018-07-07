interface Jumpable {}
class Animal {}
public class Lion extends Animal implements Jumpable {
  
  // test code
  public static void main(String... str) {
    // Normal Usage
    Animal var1 = new Animal();
    Lion var2 = new Lion();
    Jumpable var3 = new Lion();
    
    Jumpable var4 = (Jumpable)(new Animal()); 
    // Compile but throws Runtime Exception (ClassCastException: Animal cannot be cast to Jumpable)
    //  You can explicitly cast any objec to an interface (the code will compile), but if the class 
    //  doesn't implement the interface, the code will throw CastCastException

  }

}