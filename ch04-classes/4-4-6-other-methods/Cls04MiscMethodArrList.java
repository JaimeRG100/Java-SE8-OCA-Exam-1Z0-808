import java.util.ArrayList;

public class Cls04MiscMethodArrList {
  
  public static void main(String args[]) {
    ArrayList<MyPerson> myArrList = new ArrayList<MyPerson>();
    MyPerson p1 = new MyPerson("Shreya");
    MyPerson p2 = new MyPerson("Paul");
    myArrList.add(p1);
    myArrList.add(p2);
    myArrList.add(p2);
    System.out.println(myArrList.contains(new MyPerson("Shreya")));
    System.out.println(myArrList.contains(p1));
    System.out.println(myArrList.indexOf(new MyPerson("Paul")));
    System.out.println(myArrList.indexOf(p2));
    System.out.println(myArrList.lastIndexOf(new MyPerson("Paul")));
    System.out.println(myArrList.lastIndexOf(p2));
    System.out.println("- - - - - - -");
    
    
    
    //test code
    MyPerson mp1 = new MyPerson("ABCD");
    MyPerson mp2 = new MyPerson("ABCD");
    System.out.println("mp1.equals(mp2): " + mp1.equals(mp2));
  }
  
}

class MyPerson {
  String name;
  MyPerson(String name) { this.name = name; }
  
  /* @Override annotation that instructs the compiler that you intend to override
   * a method in the superclass. If, for some reason, the compiler detects that the 
   * method does not exist in one of the superclasses, then it will generate an error. */
  @Override  
  public boolean equals(Object obj){
    if (obj instanceof MyPerson) {
      MyPerson p = (MyPerson)obj;
      boolean isEqual = p.name.equals(this.name);
      return isEqual;
    }
    else 
      return false;  
  }
}