import java.util.ArrayList;
import java.util.ListIterator;

class ArrayList_Access {
  
  public static void main(String... args) {
    
    // Accessing elements using the enhanced for loop
    ArrayList<String> myArrayList = new ArrayList<>();
    myArrayList.add("one");
    myArrayList.add("two");
    myArrayList.add("four");
    myArrayList.add(2, "three");
    
    for(String str : myArrayList) {
      System.out.println(str);
    }
    System.out.println("- - - - - -");
    
    
    // Accessing elements using ListIterator
    //- - - - - - - - - - - - - - - - - - - - - -
    //import java.util.ListIterator;  //required *
    ListIterator<String> iterator = myArrayList.listIterator();
    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }
    System.out.println("- - - - - -");
    
    
    iterator = myArrayList.listIterator();
    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }
    System.out.println("- - - - - -");
    
    
    
    
    
    
  }
}