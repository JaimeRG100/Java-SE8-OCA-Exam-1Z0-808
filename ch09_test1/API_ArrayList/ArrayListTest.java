import java.util.ArrayList;
import java.util.ListIterator;

class ArrayListTest {
  public static void main(String ... args) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("one");
    list.add("two");
    list.add("four");
    list.add(3,"three");
    System.out.println(list);
    System.out.println("- - - - - -");
    for(String s : list) {
      System.out.println(s);      
    }
    System.out.println("- - - - - -");
    ListIterator<String> iterator = list.listIterator();
    while( iterator.hasNext()) {
      System.out.println(iterator.next());      
    }
    System.out.println("- - - - - -");
    ListIterator iterator2 = list.listIterator();
    while( iterator2.hasNext()) {
      System.out.println(iterator2.next());     
    }
    System.out.println("- - - - - -");
    list.remove(3);
    System.out.println(list);
    System.out.println("- - - - - -");
    list.clear();
    ArrayList<String> otherList = new ArrayList<>();
    list.add("one");
    list.add("four");
    list.add("five");
    System.out.println(list);
    System.out.println("- - - - - -");
    otherList.add("two");
    otherList.add("three");
    list.addAll(1,otherList);
    System.out.println(list);
    System.out.println(list.size());
    System.out.println(list.contains("two"));
    System.out.println(list.get(0));

  }  
}