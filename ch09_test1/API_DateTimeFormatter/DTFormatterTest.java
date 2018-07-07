import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

class DTFormatterTest {
  
  public static void main(String... args) {
    DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
    DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
    DateTimeFormatter formatter3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
    DateTimeFormatter formatter4 = DateTimeFormatter.ISO_DATE;
    DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("HH:mm");
    LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();
    LocalDateTime dateTime = LocalDateTime.now();
    System.out.println(date);
    System.out.println(time);
    System.out.println(dateTime);
    System.out.println("- - - - - - ");
    System.out.println(date.format(formatter1));
    System.out.println(time.format(formatter2));
    System.out.println(dateTime.format(formatter3));
    System.out.println("- - - - - - ");
    System.out.println(formatter1.format(date));
    System.out.println(formatter2.format(time));
    System.out.println(formatter3.format(dateTime));
    System.out.println("- - - - - - ");
    DateTimeFormatter formatter6 = DateTimeFormatter.ofPattern("'The date is:' YYYY/MM/dd 'and' HH:ss 'of clock'");
    System.out.println(dateTime.format(formatter6));
    DateTimeFormatter formatter7 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDate dateTime2 = LocalDate.parse("2080/12/10", formatter7);
    System.out.println(dateTime2);
    System.out.println(dateTime2.getDayOfMonth());
  }
}