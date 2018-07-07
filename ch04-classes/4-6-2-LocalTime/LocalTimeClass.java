import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;

class LocalTimeClass {
    
  public static void main(String args[]) {
    
    // Creating LocalTime
    
    // of()
    LocalTime timeHrsMin = LocalTime.of(12, 12);
    LocalTime timeHrsMinSec = LocalTime.of(0, 12, 6);
    LocalTime timeHrsMinSecNano = LocalTime.of(14, 7, 10, 998654578);
    System.out.println("timeHrsMin: " + timeHrsMin);
    System.out.println("timeHrsMinSec: " + timeHrsMinSec);
    System.out.println("timeHrsMinSecNano: " + timeHrsMinSecNano);
    System.out.println("\n- - - - - - - - - -");
    
    // Runtime exception - - - - - - - - - - - - - - - - - -
    // LocalTime timeHrsMin2 = LocalTime.of(120, 12);
    // Compilation error - - - - - - - - - - - - - - - - - -
    // LocalTime timeHrsMin3 = LocalTime.of(9986545781, 12);
    
    // now()
    LocalTime date3 = LocalTime.now();
    System.out.println("now: " + date3);
    System.out.println("\n- - - - - - - - - -");
    
    // parse()
    LocalTime time = LocalTime.parse("15:08:23");
    System.out.println("time: " + time);
    System.out.println("\n- - - - - - - - - -");
    
    
    // LocalTime Constant
    
    System.out.println(".MIN: " + LocalTime.MIN);
    System.out.println(".MAX: " + LocalTime.MAX);
    System.out.println(".MIDNIGHT: " + LocalTime.MIDNIGHT);
    System.out.println(".NOON: " + LocalTime.NOON);
    System.out.println(".MIN.equals(.MIDNIGHT): " + LocalTime.MIN.equals(LocalTime.MIDNIGHT));
    System.out.println("\n- - - - - - - - - -");
    
    // Querying LocalTime
    
    // get_XX()
    LocalTime time2  = LocalTime.of(16, 20, 12, 98547);
    System.out.println("getHour: " + time.getHour());
    System.out.println("getMinute: " + time.getMinute());
    System.out.println("getSecond: " + time.getSecond());
    System.out.println("getNano: " + time.getNano());
    System.out.println("\n- - - - - - - - - -");
    
    // isAfter()  isBefore()
    LocalTime shreyaFinishTime = LocalTime.parse("17:09:04");
    LocalTime paulFinishTime = LocalTime.parse("17:09:12");
    if (shreyaFinishTime.isBefore(paulFinishTime))
      System.out.println("Shreya wins (isBefore)");
    else 
      System.out.println("Paul wins (isAfter)");
    System.out.println("\n- - - - - - - - - -");
    
    
    // Manipulating LocalTime
    
    // minus_XX()
    LocalTime movieStartTime = LocalTime.parse("21:00:00");
    int commuteMin = 35;
    LocalTime shreyaStartTime = movieStartTime.minusMinutes(commuteMin);
    System.out.println("Start by " + shreyaStartTime + " from office (minusMinutes)");
    System.out.println("\n- - - - - - - - - -");
    
    // plus_XX()  isAfter()  isBefore()
    int worldRecord = 10;
    LocalTime raceStartTime = LocalTime.of(8, 10, 55);
    LocalTime raceEndTime = LocalTime.of(8, 11, 11);
    if (raceStartTime.plusSeconds(worldRecord).isAfter(raceEndTime))
      System.out.println("New world record");
    else 
      System.out.println("Try harder");
    System.out.println("\n- - - - - - - - - -");
    
    // with_XX()
    LocalTime startTime = LocalTime.of(5, 7, 9);
    if (startTime.getMinute() < 30)
      startTime = startTime.withMinute(0);
    System.out.println(startTime + " (withMinute)");
    System.out.println("\n- - - - - - - - - -");
    
    
    // Combininig with another Type
    LocalTime timeX = LocalTime.of(14, 10, 0);
    LocalDate dateX = LocalDate.of(2016, 02, 28);
    LocalDateTime dateTime = timeX.atDate(dateX);
    System.out.println(dateTime);
    
    
    
    
    
        
  }
}
