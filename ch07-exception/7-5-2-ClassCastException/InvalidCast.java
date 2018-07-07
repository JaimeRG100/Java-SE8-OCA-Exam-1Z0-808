import java.util.ArrayList;

class InvalidCast {
  
  public static void main(String[] args) {
    ArrayList<ColorInk> inks = new ArrayList<ColorInk>();
    inks.add(new ColorInk());
    Ink ink = (BlackInk)inks.get(0);   // Compilation issue
    
  }
  
}

class Ink {}
class ColorInk extends Ink {}
class BlackInk extends Ink {}