class ArrayTest {
  public static void main(String ... args) {
    int x[][] = new int[][] {{0, 1, 2, 3} , {1, 2, 3}}  ;
    x = new int[][] {{0, 1, 2, 3} , {5},  {1, 2, 3}}  ;
    
    String[][] s = {null, {"A","B","C"}, {"Z"}, new String[]{"X","Y","Z"}};
    System.out.println(s[1][1]);
    
    int intArray[] = {0,1};
    String strArray[] = {"Summer", "Winter"};
    int multArr[][] = {{1,2},{3,5,6}};
    multArr = new int[][]{{1,2},{3,5,6}};
    multArr = new int[][]{{1,2},{3},{3,5,6}};

  }  
}