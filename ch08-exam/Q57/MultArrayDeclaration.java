class MultArrayDeclaration {
  public static void main(String args[]) {
    String ejg1[][] = new String [1][2];
    String ejg2[][] = new String[][] {{},{}};
    String ejg3[][] = new String[2][2];
    String ejg4[][] = new String[][] {{null}, new String[]{"a","b","c"}, {new String()}};
    //String ejg5[][] = new String[][2];
    //String ejg6[][] = new String[][] {"A","B"};
    //String ejg7[][] = new String[] {{"A","B"}};
    
    // test code
    ejg2[1] = new String[5];
    ejg2[1][4] = "hello";
    System.out.println("test code: " + ejg2[1][4]);
  }
}