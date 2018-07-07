class ArrayDecAlloInit {
  public static void main(String[] args) {
    
    //Combining array declaration, allocation, and initilization
    int intArray[] = {0, 1};
    String[] strArray = {"Summer", "Winter"};
    int multiArray[][] = { {0, 1}, {3, 4, 5} };
    
    // Similar implementation
    int intArray2[] = new int[] {0, 1};
    String[] strArray2 = new String[] {"Summer", "Winter"};
    int multiArray2[][] = new int[][] { {0, 1}, {3, 4, 5} };
    
    //You can't specify the size of array when it is initializated in one line
    // - - - - -  - - -  - - -  - - -  - - -  - - -  - - -  - - -  - - -  - - - 
    //int intArray3[] = new int[2] {0, 1};
    //String[] strArray3 = new String[2] {"Summer", "Winter"};
    //int multiArray3[][] = new int[2][] { {0, 1}, {3, 4, 5} };
    
    //You can't initialize an array in a second line without the keyword new
    // - - - - -  - - -  - - -  - - -  - - -  - - -  - - -  - - -  - - -  - - - 
    int intArray4[];
    intArray4 = new int[] {0, 1};
    int intArray5[];
    // intArray5 = {0, 1};  // not valid
    
    
  }
  
}