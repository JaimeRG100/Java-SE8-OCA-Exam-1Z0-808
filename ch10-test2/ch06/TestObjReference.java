class TestObjReference {
  
  public static void main(String[] args) {
    Employee emp1 = new Employee();
    Employee emp2 = new Programmer();
  
    System.out.println(emp1.name);  // Employee
    System.out.println(emp2.name);  // Employee
  
    System.out.println(emp1.getName()); // Employee
    System.out.println(emp2.getName()); // Programmer
    
    Nameable nx = new Employee();
    System.out.println(nx.getName());
    
  }
}

class Employee implements Nameable{
  String name = "Employee";
  public String getName(){
    return name;
  }
}

class Programmer extends Employee{
  String name = "Programmer";
  public String getName(){
    return name;
  }
}

interface Nameable {
  default String getName() {
    return "Nameable";
  }

}