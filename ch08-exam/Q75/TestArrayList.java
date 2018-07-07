import java.util.*;
import java.time.LocalDate;

class Person {}

class Emp extends Person {}

public class TestArrayList {
  public static void main(String args[]) {
    ArrayList<Object> list = new ArrayList<>();
    list.add(new String("1234"));
    list.add(new Person());
    list.add(new Emp());
    list.add(new String[] {"abcd","xyz"});
    // System.out.println(LocalDate.now().plus(1));  // Error: no suitable method found for plus(int)
  }
}

