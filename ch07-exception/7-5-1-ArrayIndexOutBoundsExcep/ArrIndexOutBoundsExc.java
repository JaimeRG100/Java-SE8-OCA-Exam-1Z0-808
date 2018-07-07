import java.util.ArrayList;

class ArrIndexOutBoundsExc {
  
  public static void main(String... args) {
    
    String[] season = {"Spring", "Summer"};
    ArrayList<String> exams = new ArrayList<>();
    exams.add("SCJP");
    exams.add("SCWCD");
    
    //ArrayIndexOutOfBoundsException
    try {
      System.out.println(season[5]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e);
    }
    
    try {
      System.out.println(season[-9]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e);
    }
    
    // IndexOutOfBoundsException
    try {
      System.out.println(exams.get(-1));
    } catch (IndexOutOfBoundsException e) {
      System.out.println(e);
    }
    
    try {
      System.out.println(exams.get(4));
    } catch (IndexOutOfBoundsException e) {
      System.out.println(e);
    }
    
    
    
    
    
  }
  
}