import java.util.ArrayList;

class CastCastException {
  
  public static void main(String[] args) {
    ArrayList<Ink> inks = new ArrayList<Ink>();
    inks.add(new ColorInk());
    inks.add(new BlackInk());
    Ink ink = (BlackInk)inks.get(0);   // throws ClassCastException
    
  }
  
}

class Ink {}
class ColorInk extends Ink {}
class BlackInk extends Ink {}