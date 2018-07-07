class ContinueBreak {
  
  public static void main(String[] args) {
    for (int ctr = 2; ctr <= 30; ++ctr) {
      if (ctr % 7 != 0)
        continue;
      if (ctr % 14 == 0)
        System.out.println(ctr);
    }  
  }
}