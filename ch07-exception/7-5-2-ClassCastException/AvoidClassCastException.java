import java.util.ArrayList;

class AvoidClassCastException {
  
  public static void main(String[] args) {
    ArrayList<Ink> inks = new ArrayList<Ink>();
    inks.add(new ColorInk());
    inks.add(new BlackInk());
    if(inks.get(0) instanceof BlackInk) {
      BlackInk ink = (BlackInk)inks.get(0);
    }
    
  }
  
}

class Ink {}
class ColorInk extends Ink {}
class BlackInk extends Ink {}