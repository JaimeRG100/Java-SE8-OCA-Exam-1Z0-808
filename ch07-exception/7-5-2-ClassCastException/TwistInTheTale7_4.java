class TwistInTheTale7_4 {
  
  public static void main(String args[]) {
    Printable printable = null;
    BlackInk blackInk = new BlackInk();
    printable = (Printable) blackInk;
    
  }
  
}

class Ink {}
interface Printable {}
class ColorInk extends Ink implements Printable {}
class BlackInk extends Ink {}