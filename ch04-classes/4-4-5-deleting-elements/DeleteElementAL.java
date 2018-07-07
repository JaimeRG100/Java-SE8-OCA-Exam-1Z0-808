import java.util.ArrayList;

class DeleteElementAL {
  
  public static void main(String[] args){
    ArrayList<StringBuilder> myArrList = new ArrayList<>();
    StringBuilder sb1 = new StringBuilder("One");
    StringBuilder sb2 = new StringBuilder("Two");
    StringBuilder sb3 = new StringBuilder("Three");
    StringBuilder sb4 = new StringBuilder("Four");
    
    myArrList.add(sb1);
    myArrList.add(sb2);
    myArrList.add(sb3);
    myArrList.add(sb4);
    
    //remove(index)
    myArrList.remove(1);
    
    for(StringBuilder element: myArrList) 
      System.out.println(element);
    
    //remove(onject)
    myArrList.remove(sb3);    
    myArrList.remove(new StringBuilder("Four"));  // Doesn't remove it because it doesn't implement equals() method
    
    System.out.println();
    for(StringBuilder element: myArrList) 
      System.out.println(element);
    
    System.out.println("- - - - - - - - -");
                   
  }
}