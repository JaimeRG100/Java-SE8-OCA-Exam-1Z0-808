import java.util.ArrayList;

class ReplaceElementAL {
  
  public static void main(String[] args){
    ArrayList <String> myArrList = new ArrayList<>();
    myArrList.add("One");
    myArrList.add("Two");
    myArrList.add("Three");
    
    // Example 1 - Replace element
    myArrList.set(1, "One and Half");
    for (String element : myArrList) {
      System.out.println(element);
    }
    System.out.println("- - - - - - - - -");
    
    
    // Example 2 - Use mutable StringBuilder
    ArrayList<StringBuilder> myArrList2 = new ArrayList<StringBuilder>();
    myArrList2.add(new StringBuilder("One"));
    myArrList2.add(new StringBuilder("Two"));
    myArrList2.add(new StringBuilder("Three"));
    for (StringBuilder element : myArrList2) {
      System.out.println(element.append(element.length()));      
    }
    System.out.println("- - - - - - - - -");
    
    //test code
    System.out.print("myArrList: " + myArrList + "  . . .  ");
    System.out.println("myArrList2: " + myArrList2);
    System.out.println("- - - - - - - - -");
    
    myArrList2.set(0, new StringBuilder("hello "));
    myArrList2.set(1, new StringBuilder("World of "));
    myArrList2.set(2, new StringBuilder("JAva 8!"));
    System.out.println("myArrList2: " + myArrList2);
    System.out.println("- - - - - - - - -");
                   
  }
}