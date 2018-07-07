public class TestIfMod {
  public static void main(String args[]) {
    int a = 10;
    for (; a <= 20; ++a) {
      if (a%3 ==0) a++; else if (a%2 == 0) a=a*2;
      System.out.println(a);
    }
  }
}