import java.util.ArrayList;

class ArrayListTest {
  public static void main(String ... args) {
    ArrayList<StringBuilder>list = new ArrayList<>();
    list.add(new StringBuilder("Index 0"));
    list.add(new StringBuilder("Index 1"));
    list.add(new StringBuilder("Index 2"));
    list.add(new StringBuilder("Index 3"));
    System.out.println(list);
    System.out.println("- - - - - ");
    ArrayList<StringBuilder> list2 = (ArrayList<StringBuilder>)list.clone();
    list2.get(0).append("-ABC");
    list2.set(0, new StringBuilder("NEW ELEMENT"));
    StringBuilder sbPointer = list2.get(0);
    sbPointer.append("-added");
    System.out.println(list);
    System.out.println("- - - - - ");
    System.out.println(list2);
    
  }  
}