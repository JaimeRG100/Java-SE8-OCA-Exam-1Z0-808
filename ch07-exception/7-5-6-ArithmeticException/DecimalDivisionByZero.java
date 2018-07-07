class DecimalDivisionByZero {
  public static void main(String args[]) {
    System.out.println( 77.0 / 0);   // Infinity
    System.out.println( -77.0 / 0);  // -Infinity
    System.out.println( 0.0 / 0);    // NaN
    System.out.println( 77 / 0.0);
    System.out.println( 77.0 / 0.0);
  }
}