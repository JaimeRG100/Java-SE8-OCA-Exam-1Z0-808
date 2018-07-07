class c01ReplaceMethod {
  
  public static void main(String... args) {
    MyString ms = new MyString("This is my String");
    System.out.println(ms.getValue());
    ms.replace(12, 16, "World");
    System.out.println(ms.getValue());
  }
  
}

class MyString {
  private String value;
  
  MyString() {
    this.value = "";
  }
  
  MyString(String value) {
    this.value = value;
  }
  
  public String getValue(){
    return value;
  }
  
  public boolean replace(int start, int end, String textToReplace){
    int len = value.length() ;
    if(start > (len -1) || end > (len -1))
      return false;
    //new String object
    value = value.substring(0, start-1) + textToReplace + value.substring(end + 1, len);
    return true;    
  }
  
}