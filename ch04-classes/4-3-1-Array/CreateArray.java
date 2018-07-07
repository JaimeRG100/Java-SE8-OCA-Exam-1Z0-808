class CreateArray {
  public static void main(String args[]) {
    int intArray[] = new int[] {4, 8, 107};
    for(int c:intArray)
      System.out.println(c);
    System.out.println("- - - - -");
    
    int intArray2[] = {4, 8, 107};
    for(int c:intArray)
      System.out.println(c);
    System.out.println("- - - - -");
    
    String[] strArray= new String[] {"Harry", "Shereya", "Paul", "Selvan"};
    for(String s:strArray)
      System.out.println(s);
    System.out.println("- - - - -");
    
    //String[] strArray = new Str[]; //Error: array dimension missing
    
  }
}