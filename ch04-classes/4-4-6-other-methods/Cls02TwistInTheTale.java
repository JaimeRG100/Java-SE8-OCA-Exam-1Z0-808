import java.util.ArrayList;

class Cls02TwistInTheTale {
  
  public static void main(String asas[]) {
    
    ArrayList<String> myArrList = new ArrayList<String>();
    String one = "One";
    String two = "Two";
    myArrList.add(one);
    myArrList.add(two);
    
    ArrayList<String> yourArrList = myArrList;
    one.replace("O", "B");
    for(String val: myArrList) {
      System.out.print(val + ":");
    }
    for(String val: yourArrList) {
      System.out.print(val + ":");
    }

    
    
  }
}