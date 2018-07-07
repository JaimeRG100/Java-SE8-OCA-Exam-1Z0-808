import java.util.ArrayList;

class ThrowNullPointerExc4 {
  
  public static void main(String... arg) {
    ArrayList<String> list;
    // Fails to compile
    if (list != null)            // Error: variable list might not have been initialized
       list.add("1");
  }
  
}