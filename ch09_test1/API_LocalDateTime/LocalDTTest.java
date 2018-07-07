import java.time.LocalDateTime;
import java.time.LocalDate;

class LocalDTTest {
  
  public static void main(String... args) {
    LocalDateTime dt1 = LocalDateTime.of(2017,12,10,12,12);
    System.out.println(dt1);
    // of()   parse()   
    // plus()   minus()   
    // get()   with()   
    // XXX atTime() XXX atDate() XXX
    System.out.println(LocalDateTime.parse("2017-01-01T01:02:03"));
    System.out.println(dt1.now());
    dt1 = LocalDateTime.now();
    System.out.println("- - - - - ");
    System.out.println(dt1.getYear());
    System.out.println(dt1.getMonth() + " (" + dt1.getMonthValue() + ")");
    System.out.println(dt1.getDayOfMonth());
    System.out.println(dt1.getHour());
    System.out.println(dt1.getMinute());
    System.out.println(dt1.getSecond());
    System.out.println("- - - - - ");
    System.out.println(dt1.withYear(2007));
    System.out.println(dt1.withMonth(12));
    System.out.println(dt1.withDayOfMonth(7));
    System.out.println(dt1.withDayOfYear(7));
    System.out.println(dt1.withHour(23));
    System.out.println(dt1.withMinute(12));
    System.out.println(dt1.withSecond(7));
    System.out.println(dt1.withNano(8));
    System.out.println("- - - - - ");
    dt1 = dt1.parse("2000-01-01T00:00");
    System.out.println(dt1);
    System.out.println(dt1.plusYears(7));
    System.out.println(dt1.plusMonths(6));
    System.out.println(dt1.plusDays(5));
    System.out.println(dt1.plusHours(4));
    System.out.println(dt1.plusMinutes(3));
    System.out.println(dt1.plusSeconds(2));
    System.out.println(dt1.plusNanos(1));
    System.out.println("- - - - - ");
    dt1 = dt1.parse("2007-12-12T20:20");
    System.out.println(dt1);
    System.out.println(dt1.minusYears(7));
    System.out.println(dt1.minusMonths(6));
    System.out.println(dt1.minusDays(5));
    System.out.println(dt1.minusHours(4));
    System.out.println(dt1.minusMinutes(3));
    System.out.println(dt1.minusSeconds(2));
    System.out.println(dt1.minusNanos(1));
    System.out.println("- - - - - ");
    LocalDateTime dt2 = LocalDateTime.of(2020,12,1,9,0);
    System.out.println(dt1.isAfter(dt2));
    System.out.println(dt1.isBefore(dt2));
    System.out.println("- - - - - ");

    
  }
}