import java.time.LocalTime;
import java.time.LocalDate;

class LocalTimeTest {
  
  public static void main(String... args) {
    LocalTime time1 = LocalTime.of(9, 15);
    System.out.println(time1);
    LocalTime time2 = LocalTime.of(16, 00, 0);
    time2 = LocalTime.parse("16:00:01.234");
    time2 = LocalTime.parse("16:00:01");
    time2 = LocalTime.parse("16:00");
    LocalTime now = LocalTime.now();
    System.out.println(time2);
    System.out.println(now);
    System.out.println("- - - - - -");
    System.out.println(time2.getHour() + "->" + time2.getMinute() + "->" + time2.getSecond() + "->" + time2.getNano());
    System.out.println("- - - - - -");
    System.out.println(now.plusHours(1));
    System.out.println(now = now.plusHours(1));
    now = now.minusHours(1);
    System.out.println(now.plusMinutes(1));
    System.out.println(now.plusSeconds(1));
    System.out.println(now.plusNanos(1));
    System.out.println(now.plusNanos(1).minusNanos(1));
    System.out.println(now.minusSeconds(1));
    System.out.println(now.minusMinutes(1));
    System.out.println("- - - - - -");
    System.out.println(now.withHour(8));
    now = now.withHour(16);
    System.out.println(now.withMinute(6));
    System.out.println(now.withSecond(4));
    System.out.println(now.withNano(3));
    System.out.println(now.withHour(1).withMinute(2).withSecond(3).withNano(4));
    now = LocalTime.now();
    System.out.println(now.atDate(LocalDate.of(2017,12,12)));
    System.out.println("- - - - - -");
    System.out.println(time1.isAfter(time2));
    System.out.println(time1.isBefore(time2));
  }
}