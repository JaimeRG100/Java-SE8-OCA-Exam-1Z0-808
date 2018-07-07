import java.util.ArrayList;

class ThrowNullPointerExc {
  static ArrayList<String> list = null;
  
  public static void main(String... arg) {
    // java.lang.NullPointerException
    list.add("1");  // Attempt to call method on null ArrayList
  }
  
}