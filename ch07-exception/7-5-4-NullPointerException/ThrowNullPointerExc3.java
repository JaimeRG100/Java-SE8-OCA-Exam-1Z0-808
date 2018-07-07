import java.util.ArrayList;

class ThrowNullPointerExc3 {
  static ArrayList<String> list;  // list is implicitly assigned a null value
  
  public static void main(String... arg) {
    // Pevent NullPointerException
    if (list != null)
       list.add("1");
  }
  
}