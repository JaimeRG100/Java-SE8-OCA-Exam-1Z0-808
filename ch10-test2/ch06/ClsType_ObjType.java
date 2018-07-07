class ClsType_ObjType {
  public static void main(String... xyz) {
    Employee emp1 = new Employee();
    Employee emp2 = new Programmer();
    
    System.out.println(emp1.name);       //Employee
    System.out.println(emp2.name);       //Employee
    
    System.out.println(emp1.getName());  //Employee
    System.out.println(emp2.getName());  //Programmer
    
    GuessClass.printCls(emp1);  // Employee
    GuessClass.printCls(emp2);  // Employee
  }
}

class Employee {
  String name = "Employee";
  
  String getName(){
    return name;
  }
}

class Programmer extends Employee{
  String name = "Programmer";
  
  String getName(){
    return name;
  }
}

class GuessClass {
  
  public static void printCls(Object obj){
    if (obj instanceof Employee)
      System.out.println("Employee..");
    else if (obj instanceof Programmer)
      System.out.println("Programmer...");
  }
  
}