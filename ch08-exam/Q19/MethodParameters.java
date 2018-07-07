public class MethodParameters {
  long result;
  
  public static void main(String args[]) {
    
    MethodParameters mp = new MethodParameters();
    mp.result = mp.myMethod1("A",1,"B");
    mp.result = mp.myMethod5(5, "A","B");
    mp.result = mp.myMethod7(5, "A","B","C","D","E");
    
  }
  
  Short myMethod1(String str1, int str2, String str3) {
    return 1;
  }
  
  Long myMethod5(int str2, String str3, String str1) {
    // return 5;  // Error: incompatible types: int cannot be converted to java.lang.Long
    return 5L;
  } 
  
  Short myMethod7(int val1, String... val2){
    return 7;
  }
  
}