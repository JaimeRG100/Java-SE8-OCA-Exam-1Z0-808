import java.util.ArrayList;

class DeleteElemFromArrList2 {
  
  public static void main(String args[]) {
    ArrayList<MyPerson> myArrList = new ArrayList<MyPerson>();
    MyPerson p1 = new MyPerson("Shreya");
    MyPerson p2 = new MyPerson("Paul");
    MyPerson p3 = new MyPerson("Harry");
    myArrList.add(p1);
    myArrList.add(p2);
    myArrList.add(p3);
    myArrList.remove(new MyPerson("Paul")); //it remove "Paul" because MyPerson class implements equals() method
    for(MyPerson element: myArrList) {
      System.out.println(element.name);
    }
    
  }
}

class MyPerson {
  String name;
  MyPerson(String name) { this.name = name; }
  
  @Override
  public boolean equals(Object obj) {
    if(obj instanceof MyPerson) {
      MyPerson p = (MyPerson) obj;
      boolean isEqual = p.name.equals(this.name);
      return isEqual;
    }
    else
      return false;
  }
}
