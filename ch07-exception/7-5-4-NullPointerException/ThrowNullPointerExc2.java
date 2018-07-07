import java.util.ArrayList;

class ThrowNullPointerExc2 {
  static ArrayList<String> list;  // list is implicitly assigned a null value
  
  public static void main(String... arg) {
    // java.lang.NullPointerException
    list.add("1");  // Attempt to call method on null ArrayList
  }
  
}