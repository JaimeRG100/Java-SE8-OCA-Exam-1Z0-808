interface Jumpable {}
class Animal {}
public class Lion extends Animal implements Jumpable {
  
  // test code
  public static void main(String... str) {
    //Jumpable var1 = new Jumpable();           // a) Error: Jumpable is abstract; cannot be instantiated
    Animal var2 = new Animal();                 // b) selected [ok] <---
    //Lion var3 = new Animal();                 // c) Error: incompatible types: Animal cannot be converted to Lion
    //Jumpable var4 = new Animal();             // d) Error: incompatible types: Animal cannot be converted to Jumpable
    Jumpable var5 = new Lion();                 // e) selected [ok] <---
    //Jumpable var6 = (Jumpable)(new Animal()); // f) Compile but throws Runtime Exception (ClassCastException: Animal cannot be cast to Jumpable)
                                                //  You can explicitly cast any objec to an interface (the code will compile), but if the class 
                                                //  doesn't implement the interface, the code will throw CastCastException
    
    // this added code, works 
    Jumpable var777 = (Jumpable)(new Lion());
  }

}