import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.LocalDate;
import java.time.LocalTime;

class DTFormatterCls {
    
  public static void main(String args[]) {
    
    //Instantiate or Access DateTimeFormatter
    
    // ofLocalized_XXX()
    DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
    DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);
    DateTimeFormatter formatter3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
    DateTimeFormatter formatter4 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.SHORT);
    
    // static field of DateTimeFOrmatter
    DateTimeFormatter formatter5 = DateTimeFormatter.ISO_DATE;
    
    // ofPattern()
    DateTimeFormatter formatter6 = DateTimeFormatter.ofPattern("yyyy MM dd");
    
    // format (DTF) 
    DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
    LocalDate date = LocalDate.of(2057, 8, 11);
    System.out.println("ofLocalizedDate(FormatStyle.LONG): " + date.format(formatter));
    System.out.println("- - - - - - - - -");
    
    // Runtime exception
    //DateTimeFormatter formatter_2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);   // runtime (should pass oLTime not olDate
    DateTimeFormatter formatter_2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
    LocalTime time = LocalTime.now();
    System.out.println(".ofLocalizedTime(FormatStyle.SHORT): " + time.format(formatter_2));
    System.out.println("- - - - - - - - -");
    
    // format ( LD / LT )
    
    LocalDate dateX = LocalDate.of(2057, 8, 11);
    LocalTime timeX = LocalTime.of(14, 30, 15);
    
    DateTimeFormatter d1 = DateTimeFormatter.ofPattern("y");
    DateTimeFormatter d2 = DateTimeFormatter.ofPattern("YYYY");
    DateTimeFormatter d3 = DateTimeFormatter.ofPattern("Y M D");
    DateTimeFormatter d4 = DateTimeFormatter.ofPattern("e");
    
    DateTimeFormatter t1 = DateTimeFormatter.ofPattern("H h m s");
    DateTimeFormatter t2 = DateTimeFormatter.ofPattern("'Time now:' HH mm a");
    
    System.out.println(d1.format(dateX));
    System.out.println(d2.format(dateX));
    System.out.println(d3.format(dateX));
    System.out.println(d4.format(dateX));
    
    System.out.println(t1.format(timeX));
    System.out.println(t2.format(timeX));
    System.out.println("- - - - - - - - -");
    
    
    // parse(date, DTF)
    DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yy---MM---dd");
    LocalDate dateL1 = LocalDate.parse("57---01---29", dtf1);
    System.out.println("parse(date, DTF): " + dateL1);
    
    DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy");
    //LocalDate dateL2 = LocalDate.parse("2057",d1);              // runtime error - must specify al components y-m-d
    //System.out.println(dateL2);
    System.out.println("- - - - - - - - -");
    
    // test code
    DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd 'de:' MMMM 'de:' YYYY");
    System.out.println("ofPattern(): " + date.format(myFormatter));
    System.out.println("- - - - - - - - -");
    
  }
}