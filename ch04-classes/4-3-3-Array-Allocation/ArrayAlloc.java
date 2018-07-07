class ArrayAlloc {
  public static void main(String[] args) {
    
    // Array declaration
    int intArray[];
    String[] strArray;
    int[] multArr[];
    
    // Array Allocation
    intArray = new int[2];
    strArray = new String[4];
    multArr = new int[2][3];
    
    // The following code won't compile
    //int[] intArray2 = new int[];
    //intArray3[2] = new int[];
    //int intArray4[] = new int[2.4];
    
    // Java accepts expressions to set the size
    String[] strArray2 = new String[ 2*5 ];
    int x = 10, y = 4;
    String[] strArray3 = new String[ x*y ];
    String[] strArray4 = new String[ Math.max(2,3) ];  //max() will return 3
    
    //Allocate multidimensional array
    int[] multiArr[];
    multiArr = new int[2][3];
    
    //ok to define only the size in the first square bracket
    int[] multiArr2[];
    multiArr2 = new int[2][];
    multiArr2[0] = new int[3];
    multiArr2[1] = new int[2];  
    multiArr2[0][0] = 0; multiArr2[0][1] = 1; multiArr2[0][2] = 2; 
    multiArr2[1][0] = 0; multiArr2[1][1] = 1;
    
    //You can't allocate multidimensional arrays as follows:
    int[] multiArr4[];
    //multiArr4 = new int[];     // nonmatching square brackets
    //multiArr4 = new int[][3];  // Size in first square brackets missing
    
  }
}