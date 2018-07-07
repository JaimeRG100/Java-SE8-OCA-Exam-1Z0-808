class ArrayDeclaration {
  
  public static void main(String... args) {
    int eArr1[] = {10, 23, 10, 2};
    int eArr2[] = new int[10];
    int eArr3[] = new int[] {};
    //int eArr4[] = new int [10] {};
    // int eArr5[] = new int[2]  {10, 20};
    
    
    //test code
    int eArr4[] = new int [] {};
    int eArr5[] = new int[]  {10, 20};
    
    eArr2 = new int [20];
    eArr2[19] = 33;
    System.out.println(eArr2[19]);
  }
}