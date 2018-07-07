class Office {
  
  public static void main(String... args) {
    Employee emp = new HRExecutive();
    ((HRExecutive)emp).specialization = new String[] {"Staffing"};
    System.out.println(((HRExecutive)emp).specialization[0]);
    emp.name = "Pavni Gupta";
    System.out.println(emp.name);
    emp.test();
  }
}


class Employee {
  String name;
  String address;
  String phoneNumber;
  float experience;
}

interface Interviewer {
  public void conductInterview();
}

class HRExecutive extends Employee implements Interviewer {
  String[] specialization;
  public void test() {
    System.out.println("HRExecutive - test");
  }
  public void conductInterview() {
    System.out.println("HRExecutive - conducting interview");
  }
}