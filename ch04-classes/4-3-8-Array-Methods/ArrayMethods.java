class ArrayMethods {
  
  static public void main(String... ____) {
    
    //length
    String str = new String("012345");
    int[] intArr = new int[] {0, 1, 2, 3, 4, 5};    
    
    System.out.println(str.length());
    System.out.println(intArr.length);
    System.out.println("- - - - - -");
    
    
    //clone
    
    int[] intArr2 = intArr.clone();
    intArr2[0] = 6;
    System.out.println(intArr[0]);
    System.out.println(intArr2[0]);
    
    
  }
}