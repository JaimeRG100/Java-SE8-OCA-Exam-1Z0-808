class ArrayInit {
  public static void main(String[] args) {
    
    
    // Array declaration
    int intArray[];
    // Array allocation
    intArray = new int[2];
    // Array initialization
    for(int i = 0; i < intArray.length; i++) {
      intArray[i] = i +5;
    }
    // Reinitializes individual elements
    intArray[0] = 10;
    intArray[0] = 1870;
    
    
    // Array declaration
    String[] strArray;
    // Array allocation
    strArray = new String[4];
    // Array initialization
    for(int i = 0; i < strArray.length; i++) {
      strArray[i] = "Hello" + i;
    }
    // Reinitializes individual elements
    strArray[1] = "Summer";
    strArray[3] = "Winter";
    strArray[0] = "Autumn";
    strArray[2] = "Spring";
    
    
    // TWO DIMENSIONAL ARRAY
    // Array declaration
    int[] multArr[];
    // Array allocation
    multArr = new int[2][3];
    // Array initialization
    for(int i = 0; i < multArr.length; i++) {
      for(int j = 0; j < multArr[i].length; j++) {
        multArr[i][j] = i + j;
      }
    }
    // Reinitializes individual elements
    multArr[0][0] = 10;
    multArr[1][2] = 1210;
    multArr[0][1] = 110;
    multArr[0][2] = 1087;    
    
    
    // Error at runtime 
    // - - - - - - - - -
    int intArray2[] = new int[2];
    //System.out.println(intArray2[3]);
    
    // Java compiler doesnt check the range of array's index
    int intArray3[] = new int[2];
    //System.out.println(intArray3[-10]);
    
    // Won't compile
    // - - - - - - - 
    int intArray4[] = new int[2];
    //System.out.println(intArray[1.2]);
    
    
    // You can't remove array positions
    String[] strArray2 = new String[] {"Autumn", "Summer", "Spring", "Winter"};
    strArray2[2] = null;
    for(String val : strArray2) {
      System.out.println(val);
    }
    
    
  }
  
}