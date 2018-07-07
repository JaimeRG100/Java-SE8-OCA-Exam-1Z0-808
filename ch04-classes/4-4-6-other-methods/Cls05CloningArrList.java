import java.util.ArrayList;

public class Cls05CloningArrList {
  
  public static void main(String args[]) {
    
    ArrayList<StringBuilder> myArrList = new ArrayList<StringBuilder>();
    StringBuilder sb1 = new StringBuilder("Jan");
    StringBuilder sb2 = new StringBuilder("Feb");
    myArrList.add(sb1);
    myArrList.add(sb2);
    myArrList.add(sb2);
    
    ArrayList<StringBuilder> assignedArrList = myArrList;  //object reference to myArrList
    ArrayList<StringBuilder> clonedArrList = (ArrayList<StringBuilder>)myArrList.clone();   // clone() returns Object, so you have to cast it.
    System.out.println(myArrList == assignedArrList);
    System.out.println(myArrList == clonedArrList);
    StringBuilder myArrVal = myArrList.get(0);               //
    StringBuilder assignedArrVal = assignedArrList.get(0);   //  All of these variables refer to the same object
    StringBuilder clonedArrVal = clonedArrList.get(0);       //
    System.out.println(myArrVal == assignedArrVal);
    System.out.println(myArrVal == clonedArrVal);
    
    
    //test code
    System.out.println("\n- - - - - - - -");
    System.out.println(myArrVal);
    myArrVal.append("-hello");
    System.out.println(assignedArrVal);
    assignedArrVal.append("-bye.");
    System.out.println(clonedArrVal);
    myArrList.get(0).append("[...]");
    System.out.println(myArrList.get(0));
    
    System.out.println("\n- - - - - - - -");
    clonedArrList.clear();
    myArrList.add(new StringBuilder("This text will not be added to cloneArrList"));
    System.out.println("clonedArrList.size(): " + clonedArrList.size());
    System.out.println("myArrList.size(): " + myArrList.size());
    
  }
}