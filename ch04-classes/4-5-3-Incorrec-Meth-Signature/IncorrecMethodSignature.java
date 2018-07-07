import java.util.ArrayList;

class IncorrecMethodSignature {
  
  public static void main(String args[]) {
    
    BankAccount b1 = new BankAccount();
    b1.acctNumber = "0023490"; 
    b1.acctType = 4;
    ArrayList <BankAccount> list = new ArrayList<BankAccount>();
    list.add(b1);
    BankAccount b2 = new BankAccount();
    b2.acctNumber = "0023490";
    b2.acctType = 4;
    System.out.println("list.contains(b2): " + list.contains(b2) + "  . . . <- Bad implementation.");
    
    // test code
    System.out.println("b1.equals(b2): " + b1.equals(b2));
    
    
  }
  
}

class BankAccount {
  String acctNumber;
  int acctType;
  
  // @Override - Error: method does not override or implement a method from a supertype
  public boolean equals(BankAccount obj) {
    if (obj != null) {
      return (acctNumber.equals(obj.acctNumber) &&
              acctType == obj.acctType);
    }
    else
      return false;
  }
}