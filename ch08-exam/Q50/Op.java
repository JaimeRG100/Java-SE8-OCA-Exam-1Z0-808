import java.util.function.Predicate;
class Op{
  public static void main(String[] args) {
    int a = 0;
    int b = 100;
    Predicate<Integer> compare = (var) -> var++ == 10;
    //if (!(b++ > 100) && compare.test(a)) {  // <-- This code woul compile
    if (!b++ > 100 && compare.test(a)) {
      System.out.println(a+b);
    }
  }
}