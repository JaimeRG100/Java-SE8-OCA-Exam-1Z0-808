class ArrayAsysmMult {
  public static void main(String[] args) {
    
    //Asymetrical multidimensional arrays
    String multStrArr[][] = new String[][] {
                                            {"A", "B"},
                                            null,
                                            {"Jan", "Feb", "Mar"}
                                           };
    System.out.println(multStrArr[0][0]);
    System.out.println(multStrArr[1]);
    System.out.println(multStrArr[2][0]);
    System.out.println("- - - - - ");
    
    
    
    String multStrArr2[][] = new String[][] {
                                            {"A", "B"},
                                            {null},
                                            {"Jan", "Feb", "Mar"}
                                           };
    for(String[] strArr : multStrArr2){
      for(String str : strArr) {
        System.out.print(str + ", ");
      }
      System.out.println();
    }
    
  }
  
}