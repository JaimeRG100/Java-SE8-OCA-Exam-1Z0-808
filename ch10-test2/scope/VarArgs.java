class VarArgs {
  private String name;
  
  public void setName(String val) {
    name = val;
  }
  
  //public int dayOffWork(int[] days) {    // array{} type is no the same that VariableArguments....
                                           // you can't pass multiple arguments to a array parameter method
                                           // void dayWork(int[] days){}     can be instantiate by      dayWork(1,2,3,4);
  public int dayOffWork(int... days) {
    int sum = 0;
    for (int i=0; i < days.length; i++) {
      sum += days[i];
    }
    System.out.println(sum);
    return sum;
  }  
  
  public static void main(String args[]){
    new VarArgs().dayOffWork(1,2,3,4,5);
    int[] x = {1,2,3,4};
    new VarArgs().dayOffWork(x);
    //new VarArgs().dayOffWork(5,6,7,x);      // not allowed to mix array wit varargs
  }  
  
}