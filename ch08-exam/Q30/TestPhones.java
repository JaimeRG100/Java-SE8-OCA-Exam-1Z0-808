class Phone {
  static void call() {
    System.out.println("Call-Phone");
  }
  String c = "Phone";
}

class SmartPhone extends Phone {
  static void call() {
    System.out.println("Call-SmartPhone");
  }
  String c = "SmartPhone";
}

public class TestPhones {
  public static void main(String... args) {
    Phone phone = new Phone();
    Phone smartPhone = new SmartPhone();
    phone.call();
    smartPhone.call();
    
    // test code
    /*
    System.out.println("Test code:");
    System.out.println(phone.c);
    System.out.println(smartPhone.c);
    System.out.println(new Phone().c);
    System.out.println(((Phone)new SmartPhone()).c);
    */
  }

}