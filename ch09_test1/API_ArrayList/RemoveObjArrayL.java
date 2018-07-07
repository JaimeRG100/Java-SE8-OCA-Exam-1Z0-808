import java.util.ArrayList;

public class RemoveObjArrayL {
  
  public static void main(String args[]) {
    ArrayList<MyPerson> list = new ArrayList<MyPerson>();
    MyPerson p1 = new MyPerson("Paul");
    MyPerson p2 = new MyPerson("Shreya");
    MyPerson p3 = new MyPerson("Harry");
    list.add(p1);
    list.add(p2);
    list.add(p3);
    for(MyPerson p : list) 
      System.out.println(p.name);
    list.remove(new MyPerson("Shreya"));
    System.out.println("- - - - - -");
    for(MyPerson p : list) 
      System.out.println(p.name);
    System.out.println("- - - - - -");
    list.remove(1);
    for(MyPerson p : list) 
      System.out.println(p.name);
    
    System.out.println("- - - - - - ");
    list.add(new MyPerson("Joseph"));
    list.add(new MyPerson("Mariah"));
    list.add(new MyPerson("Paul"));
    System.out.println(list.indexOf(new MyPerson("Paul")));
    System.out.println(list.lastIndexOf(new MyPerson("Paul")));
    int pos = list.lastIndexOf(new MyPerson("Paul"));
    System.out.println(list.get(pos).name);
    System.out.println("- - - - - - ");
    list.remove(pos);
    for(MyPerson p : list) 
      System.out.println(p.name);
  }
  
  
}

class MyPerson {
  String name;
   @Override
   public boolean equals(Object obj) {
     if (obj instanceof MyPerson) {
       MyPerson p = (MyPerson) obj;
       return p.name.equals(this.name);
       
     }
     else 
       return false;
   }
   
   MyPerson(String val) {name = val;}
}

