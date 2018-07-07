import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class FlowControl {
  
  public static void main(String args[]) {
    
    String[] s1 = new String [] {"hello, ","how ","are ","you?"};
    if (s1.length > 1) 
      System.out.println("ok");
    
    
    //if
    if(true == true) 
      System.out.println("true");
    else
      System.out.println("false");
    
    if(true){}
    else
      System.out.println("false 2");
    ;;{};;;;;;
    
    // array doubt
    int[][] x = new int [][] {{1},{},{1}};
    x[0][0] = 1;
    x[2][0] = 3;
    
    // ternary operator
    System.out.println(2 > 1 ? "2 is bigger" : "1 is bigger");
    
    // int discount = (1800 > 2000) ? 10 : printMsg();
    //(1800 > 2000) ? 10 : printMsg();
    //Long discount = (5000>2000) ? new Integer(10) : new Integer(15);
    
    int four = 5;
    String result = 
      (four == 1) ? "one" : 
      (four == 2) ? "two" :
      (four == 3) ? "three" :
      (four == 4) ? "four" :
      "higher than four";
    System.out.println(result);
    
    
    
    String weekDay = "MON";
    switch (weekDay){
      case "MON":
      case "TUE":
        System.out.println("Monday o Tuesday");
        break;
      case "WED":
      case "THUE":
      case "FRI":
        System.out.println("Between Wednesday or Friday");
        break;
      case "SUN":
      //case "MON":  Error: duplicate case label
        System.out.println("Testing days");
        break;
      default:
        System.out.println("Between Wednesday or Friday");
    }
    
    
    //FlowControl a = new FlowControl();
    long val = 10L;
    switch ((int)val) {
      case 1: 
        System.out.println("true");
        break;
      case 2:
        System.out.println("false");
        break;
    
    }
    
    String s = null;
    //switch(s) {    <<<--- ERROR: must not be null
    switch(s+"") {      
    }
    
    
    // String Array and switch()
    if (args.length > 0) {
      final int x1 = Integer.parseInt(args[0]);
      final int x2 = 5;
      System.out.print("arg[0]: " + x);
      switch (5) {
        //case x1:        //  Error: constant expression required
        case x2: 
          System.out.print("arg[0] == 5");
          break;
        default:
          System.out.print("arg[0] == 5");
          break; //test purppose
      
      }
    }
      
         
    
    // for loop
    boolean flag = true;
    for(int i = 0; i < 5 || flag; i++){
      System.out.print(i + ", ");
      if (i > 9) 
        flag = false;
    }
    
    System.out.println();
    for(int ctr=12, j=10, k =14; j<=k; ++j, k=k-1, ctr--, printMsg()){
      System.out.println(j + " : " + k + " : " + ctr);
    }
    
    // nested for loop and multi array
    
    System.out.println("- - - - - ");
    int multiArr[][] = new int[2][3];
    for (int i = 0; i < multiArr.length; i++) {
      for (int j = 0; j < multiArr[i].length; j++) 
         System.out.println("arr: [ " + i + " ][ " + j + " ]");
      System.out.println("- -");
    }
    
    
    // for loop not enhanced
    ArrayList<String> myList = new ArrayList<String>();
    myList.add("Java");
    myList.add("Loop");
    for(Iterator<String> i = myList.iterator(); i.hasNext();){
      System.out.println(i.next());
    }
    System.out.println("- - - - - ");
    
    for(ListIterator li = myList.listIterator(); li.hasNext();){
      System.out.println(li.next());
    }
    System.out.println("- - - - - ");
    
    // enhanced for
    for (String ss: myList) {
      System.out.println(ss);
    }
    
    
    
    ArrayList<StringBuilder> myListSB = new ArrayList<>();
    myListSB.add(new StringBuilder("One"));
    myListSB.add(new StringBuilder("Two"));
    System.out.println("- - - - - FOR:1");
    for (StringBuilder value : myListSB) 
      System.out.println(value);
    System.out.println("- - - - - FOR:2");
    for (StringBuilder value : myListSB) 
      value.delete(0,value.length());    
    System.out.println("- - - - - FOR:3");
    for (StringBuilder value : myListSB) 
      System.out.println(value);
    
    
         
      
    

      
    
  }
  
  static void printMsg(){}
}