public class If2 {
  public static void main(String args[]) {
    int a = 10; int b = 20; boolean c = false;
    if (b > a) if (++a == 10) if (c!=true) System.out.println(1);
    else System.out.println(2); else System.out.println(3);
  }
}

