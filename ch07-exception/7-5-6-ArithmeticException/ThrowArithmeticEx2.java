class ThrowArithmeticEx2 {
  public static void main(String args[]) {
    int a = 10;
    int y = a++;
    int z = y--;
    
    int x1 = a - 2*y - z;
    int x2 = a - 11;
    //System.out.println(x1);
    //System.out.println(x2);
    // x = -17 / 0
    int x = x1 / x2;    
    System.out.println(x);
  }
}