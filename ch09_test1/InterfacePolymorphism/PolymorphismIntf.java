// Polymorphism with Interfaces
class PolymorphismIntf {
  public static void main(String... args) {
    Employee expert1 = new Programmer();
    Employee expert2 = new Manager();
    expert1.deliverMobileApp();
    expert2.deliverMobileApp();
    
  }
}

interface MobileAppExpert {
  void deliverMobileApp();
}

class Employee implements MobileAppExpert {
  public void deliverMobileApp() {
    
  }
}

class Programmer extends Employee  {
  public void deliverMobileApp() {  
    System.out.println("testing complete on real device");
  } 
  
}

class Manager extends Employee  {
  public void deliverMobileApp() {
    System.out.println("QA complete");
    System.out.println("code delivered with release notes");
  } 
}