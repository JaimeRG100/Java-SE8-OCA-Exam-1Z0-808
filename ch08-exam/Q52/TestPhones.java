class Phone {
  void call() {
    System.out.println("Call-Phone");
  }
}

class SmartPhone extends Phone {
  void call() {
    System.out.println("Call-SmartPhone");
  }
}

public class TestPhones {
  public static void main(String[] args) {
   Phone phone = new Phone();
   Phone smartPhone = new SmartPhone();
   phone.call();
   smartPhone.call();
  }
}