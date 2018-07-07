class ColorPack {
  int shadeCount = 12; // this code doesn't compile. This variable must be static
  static int getShadeCount() {
    return shadeCount;
  }  
}

public class Artist {
  public static void main(String args[]) {
    ColorPack pack1 = new ColorPack();
    System.out.println(pack1.getShadeCount());
  }
}