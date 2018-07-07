class Shoe {}

class Boot extends Shoe {}

public class ShoeFactory {
  
  ShoeFactory(Boot val) {
    System.out.println("boot");
  }
  
  ShoeFactory(Shoe val) {
    System.out.println("shoe");
  }
  
}