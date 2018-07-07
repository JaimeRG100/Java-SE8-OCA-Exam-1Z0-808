import java.util.ArrayList;
import java.util.ListIterator;

class test {
  
  
  public static void main(String... args){
    ArrayList<Object> myList = new ArrayList<>();
    ArrayList<String> myList2 = new ArrayList<>();
  
    myList.add("one");
    myList.add("two");
    myList.add("three");
  
    myList2.add("Number:1");
    myList2.add("Number:2");
    myList2.add("Number:3");
    
    myList.add(2, myList2);
    
    // traverse myList (who has a ArrayList inside)
    System.out.println("FOR(STRING: ARRAYLIST):");
    for(Object o : myList) {
      if (o instanceof String)
        System.out.println("String: " + o);
      else {
        System.out.print("-> ");
        for(Object o2 : myList2) { System.out.print(o2 + " , "); }
        System.out.println(" <-");
      }
    }
    System.out.println("- - - - - - - -\n");
      
      
    // traverser only myList2 (only Strings values)
    ListIterator <String> iterator = myList2.listIterator();
    System.out.println("WHILE(ITERATOR):");
    while(iterator.hasNext()){
      System.out.println(iterator.next());
      }
    System.out.println("- - - - - - - -\n");
      
    System.out.println("PRINTLN(MYLIST):");
    System.out.println(myList);
    System.out.println("- - - - - - - -\n");
  
  }
  
}
