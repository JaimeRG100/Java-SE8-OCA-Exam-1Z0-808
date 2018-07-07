public class SwapObjectReference {
  
    static public void swap(Person  p1, Person p2) {
    Person temp = p1;
    p1 = p2;
    p2 = temp;
  }
  
  public static void main(String... args) {
    
    Person person1 = new Person("John");
    Person person2 = new Person("Paul");
    System.out.println(person1.getName() + " : " + person2.getName());
    swap(person1, person2);
    System.out.println(person1.getName() + " : " + person2.getName());
    
    //extra code - local swap
    Person temp = person1;
    person1 = person2;
    person2 = temp;
    System.out.println(person1.getName() + " : " + person2.getName());   
    
  }
  
}


class Person {
  private String name;
  
  Person(String name) {
    this.name = name;
  }
  
  public void setName(String name){
    this.name = name;
  }
  
  public String getName(){
    return name;
  }
}