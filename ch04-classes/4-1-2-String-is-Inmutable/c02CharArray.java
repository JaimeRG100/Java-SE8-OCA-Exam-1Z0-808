class c02CharArray {
  
  public static void main(String... args) {
    MyCharArray mca = new MyCharArray();
    System.out.println(mca.getValue());
    mca.replace("hello");
    System.out.println(mca.getValue());
    mca.replace("ABCDEFGHIJ");
    System.out.println(mca.getValue());
    mca.replace("01234567890123456789");  // MAX 10 CHAR
    System.out.println(mca.getValue());
  }
  
}

class MyCharArray {
  //just for test purposes
  private char[] value = {'0','1','2','3','4','5','6','7','8','9', 0};
  
  public void replace(String value) {
    this.value[0] = 0;
    this.value[1] = 0;
    this.value[2] = 0;
    this.value[3] = 0;
    this.value[4] = 0;
    this.value[5] = 0;
    this.value[6] = 0;
    this.value[7] = 0;
    this.value[8] = 0;
    this.value[9] = 0;    
    int len;
    if(value.length() < 11)
      len = value.length();
    else
      len = 10;
    for(int i = 0; i < len; i++)
      this.value[i] = value.charAt(i);
  }
  
  public String getValue(){
    String temp = "";
    for(int i = 0; value[i] != 0; i++)
        temp += value[i];        
    return temp;
  }
  

}