class DivideByZeroPointZero {
  public static void main(String args[]) {
    int a = 10;
    int y = a++;
    int z = y--;
    int x1 = a - 2*y - z;
    int x2 = a - 11;
    
    double x3 = x2;
    double x = x1 / x3;
    
    System.out.println(x);
    System.out.println(x1);
    System.out.println(x3);
  }

}
