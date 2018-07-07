class Office {
  
  public static void main(String... args) {
    Employee emp = new HRExecutive();
    emp.name = "Pavni Gupta";
    System.out.println(emp.name);
    emp.conductInterview();
    //new HRExecutive().test();
  }
}


class Employee {
  String name;
  String address;
  String phoneNumber;
  float experience;
  public void conductInterview() {
    System.out.println("Employee - conducting interview");
  }
}

class HRExecutive extends Employee  {
  String[] specialization;
  public void test() {
    System.out.println("HRExecutive - test");
  }
  public void conductInterview() {
    System.out.println("HRExecutive - conducting interview");
  }
}