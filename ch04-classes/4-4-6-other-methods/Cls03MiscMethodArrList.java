import java.util.ArrayList;

class Cls03MiscMethodArrList {
  
  public static void main(String args[]) {
    
    // clear()
    ArrayList<String> myArrList = new ArrayList<String>();
    myArrList.add("One");
    myArrList.add("Two");
    System.out.println("myArrList before clear()");
    print(myArrList);
    myArrList.clear();
    System.out.println("myArrList after clear()");
    for(String val : myArrList) {
      System.out.println(val);
    }
    System.out.println("- - - - - - - - - - - ");
    
    
    // get()
    myArrList = new ArrayList<String>();
    myArrList.add("One");
    myArrList.add("Two");
    String valFromList = myArrList.get(1);
    System.out.println("get(1): " + valFromList);
    
    // size()
    System.out.println("size(): " + myArrList.size());
    System.out.println("- - - - - - - - - - - ");
    
    
    
    ArrayList<StringBuilder> myArrList2 =new ArrayList<StringBuilder>();
    StringBuilder sb1 = new StringBuilder("Jan");
    StringBuilder sb2 = new StringBuilder("Feb");
    myArrList2.add(sb1);
    myArrList2.add(sb2);
    myArrList2.add(sb2);
    
    // contains()
    System.out.println(myArrList2.contains(new StringBuilder("Jan")));
    System.out.println(myArrList2.contains(sb1));
    
    // indexOf()
    System.out.println(myArrList2.indexOf(new StringBuilder("Feb")));
    System.out.println(myArrList2.indexOf(sb2));
    
    // lastIndexOf()
    System.out.println(myArrList2.lastIndexOf(new StringBuilder("Feb")));
    System.out.println(myArrList2.lastIndexOf(sb2));   
    
    //test code
    System.out.println();
    System.out.println("- - - - - - - - ");
    StringBuilder sbRef = sb1;
    System.out.println(myArrList2.contains(sbRef));
    
  }
  
  
  
  // test code
  public static void print(ArrayList<String> arrList) {
    for(String val : arrList) {
      System.out.println(val);
    }
  }
  
}