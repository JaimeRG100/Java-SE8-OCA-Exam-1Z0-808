class Pencil {}

public class ColorPencil extends Pencil {
  String color;
  ColorPencil(String color) {
    this.color = color;
  }
  
  public static void main(String... args) {
    // ColorPencil var1 = new ColorPencil();
    // ColorPencil var2 = new ColorPencil(RED);
    ColorPencil var3 = new ColorPencil("RED");
    Pencil var4 = new ColorPencil("BLUE");
    
    
    // System.out.println(Pencil.color);   // Error: cannot find symbol
  }
}

// c
// d 