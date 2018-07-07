class ContinueBreak {
  public static void main(String... args) {
    int num[] = {10, 15, 2, 17};
    int sum = 0;
    for (int number : num) {
      // INSERT CODE HERE
      if (number % 2 != 0)
        continue;
      sum += number;
    }
    System.out.println(sum);
  }
}