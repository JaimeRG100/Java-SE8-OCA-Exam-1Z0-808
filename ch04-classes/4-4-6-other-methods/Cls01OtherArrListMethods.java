import java.util.ArrayList;

public class Cls01OtherArrListMethods {
  
  public static void main(String... xyz) {
    
    ArrayList<String> myArrList = new ArrayList<String>();
    myArrList.add("One");
    myArrList.add("Two");
    myArrList.add("Five");
    ArrayList<String> yourArrList= new ArrayList<String>();
    yourArrList.add("Three");
    yourArrList.add("Four");
    myArrList.addAll(1, yourArrList);
    
    for(String val : myArrList) {
      System.out.println(val);
    }
    System.out.println("- - - - - - - ");
    
    //test code
    ArrayList<StringBuilder> myArrList2 = new ArrayList<StringBuilder>();
    myArrList2.add(new StringBuilder("One-1"));
    myArrList2.add(new StringBuilder("Two-2"));
    myArrList2.add(new StringBuilder("Five-5"));
    ArrayList<StringBuilder> yourArrList2= new ArrayList<StringBuilder>();
    yourArrList2.add(new StringBuilder("Three-3"));
    StringBuilder four = new StringBuilder("Four-4");
    yourArrList2.add(four);
    myArrList2.addAll(1, yourArrList2);
    
    for(StringBuilder val2 : myArrList2) {
      System.out.println(val2);
    }
    System.out.println("- - - - - - - ");
    
    yourArrList.set(1, "Four > 4");
    four.replace(4, 4, "<DATA-MODIFIED-FROM-OUTSIDE>");
    for(StringBuilder val2 : myArrList2) {
      System.out.println(val2);
    }
    
  }
  
  
}