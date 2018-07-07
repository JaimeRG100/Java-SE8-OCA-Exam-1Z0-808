import java.util.ArrayList;
import java.util.function.Predicate;

class LambdaPredicate2 {
  public static void main(String... asas){
    Emp e1 = new Emp("Shreya", 5, 9999.00);
    Emp e2 = new Emp("Paul", 4, 1234.00);
    Emp e3 = new Emp("Harry", 5, 8769.00);
    Emp e4 = new Emp("Selvan", 1, 237.00);
    
    ArrayList<Emp> empArrList = new ArrayList<>();
    empArrList.add(e1);
    empArrList.add(e2);
    empArrList.add(e3);
    empArrList.add(e4);
    
    Predicate<Emp> predicate = (e) -> { return e.getPerfomanceRating() >= 5; } ;
    filter(empArrList, predicate);
    
  }
  
  static void filter(ArrayList<Emp> list, Predicate<Emp> rule){
    for ( Emp e :list) {
      if(rule.test(e)) {
        System.out.println(e);
      }
    }
  }
}

interface Validate {
  public boolean check(Emp emp);

}

class Emp {
  String name;
  int perfomanceRating;
  double salary;
  
  Emp(String nm, int rating, double sal) {
    name = nm;
    perfomanceRating = rating;
    salary = sal;
  }
  
  public int getPerfomanceRating() { return perfomanceRating; }
  
  public String toString() {
    return name + ":" + perfomanceRating + ":" + salary;
  }
}