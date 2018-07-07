import java.time.LocalDate;

class LocalDateTest {
  
  public static void main(String... args) {
    LocalDate date1 = LocalDate.of(2015, 12, 27);
    LocalDate date2 = LocalDate.of(2017, 8, 31);
    System.out.println(date1 + " <--> " + date2);
    date1 = LocalDate.parse("2017-08-29");
    date2 = LocalDate.now();
    System.out.println(date1 + " <--> " + date2);
    System.out.println("- - - -  - ");
    System.out.println(date2.getDayOfYear());
    System.out.println(date2.getDayOfMonth());
    System.out.println(date2.getDayOfWeek());
    System.out.println(date2.getMonth());
    System.out.println(date2.getYear());
    System.out.println("- - - -  - ");
    System.out.println(date1.isAfter(date2));
    System.out.println(date1.isBefore(date2));
    System.out.println(date2.isAfter(date1));
    System.out.println(date2.isBefore(date1));
    System.out.println("- - - -  - ");
    System.out.println(date2);
    System.out.println(date2.minusDays(10));
    System.out.println(date2);
    date2 = date2.minusDays(10);
    System.out.println(date2);
    date2 = date2.plusDays(10);
    System.out.println("- - - -  - ");
    System.out.println(date2.minusMonths(1));
    System.out.println(date2.minusWeeks(1));
    System.out.println(date2.minusYears(1));
    System.out.println("- - - -  - ");
    System.out.println(date2.plusDays(1));
    System.out.println(date2.plusMonths(1));
    System.out.println(date2.plusYears(1));
    System.out.println(date2.plusWeeks(1));
    System.out.println("- - - -  - ");
    System.out.println(date2.withDayOfMonth(1));
    System.out.println(date2.withDayOfYear(1));
    System.out.println(date2.withMonth(1));
    System.out.println(date2.withYear(1));
    System.out.println("- - - -  - ");
    System.out.println(date2.atTime(9,0));
    System.out.println(date2.atTime(9,0,0));
    System.out.println(date2.atTime(9,0,0,12));
    System.out.println("- - - -  - ");
    System.out.println(date2.toEpochDay());
    
  }
  
  
}