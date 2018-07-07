class ForLoopIncrement {
  public static void main(String... args) {
    int ctr = 10;
    char[] arrC1 = new char[] {'P','a','u','l'};
    char[] arrC2 = {'H','a','r','r','y'};
    
    // Output expected: 14
    
    // INSERT CODE HERE (RIGHT)
    ctr = 10;
    for (char c1 : arrC1) {
      for (char c2 : arrC2) {
        if (c2 == 'a') break;
        ++ctr;
      }
    }
    System.out.println(ctr);
    
    // INSERT CODE HERE (RIGHT)
    ctr = 10;
    for (char c1 : arrC1)
      for (char c2 : arrC2) {
        if (c2 == 'a') break;
        ++ctr;
      }
    System.out.println(ctr);
    
    // INSERT CODE HERE (WRONG)
    ctr = 10;
    for (char c1 : arrC1)
      for (char c2 : arrC2)
        if (c2 == 'a') break;
        ++ctr;
    System.out.println(ctr);
    
    // INSERT CODE HERE (WRONG)
    ctr = 10;
    for (char c1 : arrC1) {
      for (char c2 : arrC2) {
        if (c2 == 'a') continue;
        ++ctr;
      }
    }
    System.out.println(ctr);
  }
}