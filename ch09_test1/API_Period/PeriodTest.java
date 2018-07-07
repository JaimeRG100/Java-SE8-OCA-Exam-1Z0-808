import java.time.Period;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

class PeriodTest {
  public static void main(String... args) {
    Period p = Period.parse("P12Y11M10D");
    System.out.println(p);
    p = Period.parse("P11M10D");
    System.out.println(p);
    p = Period.parse("P2012Y-10D");
    System.out.println(p);
    p = Period.parse("-P2012Y5M10D");
    System.out.println(p);
    p = Period.parse("-P-2012Y-5M-10D");
    System.out.println(p);
    System.out.println("- - - - ");
    p = Period.of(13,12,-11);
    System.out.println(p);
    System.out.println("- - - - ");
    System.out.println(Period.ofYears(2017));
    System.out.println(Period.ofMonths(12));
    System.out.println(Period.ofDays(11));
    System.out.println(Period.ofWeeks(10));
    System.out.println("- - - - ");
    System.out.println(Period.between(LocalDate.now(), LocalDate.now().withYear(2017).withMonth(10).withDayOfMonth(12)));
    System.out.println("- - - - ");
    LocalDate date1 = LocalDate.of(2017,12,01);
    System.out.println(date1.plus(Period.ofDays(12)));
    LocalDateTime dt1 = LocalDateTime.parse("2017-12-10T12:12");
    System.out.println(dt1.plus(Period.ofMonths(-11)));
    System.out.println(dt1.minus(Period.ofMonths(11)));
    System.out.println("- - - - ");
    System.out.println(p.getYears());
    System.out.println(p.getMonths());
    System.out.println(p.getDays());
    System.out.println(p.isZero());
    System.out.println(p.isNegative());
    System.out.println("- - - - ");
    System.out.println(p.plusDays(11));
    System.out.println(p.minusDays(-11));
    System.out.println(p.plusDays(60));
    System.out.println("- - - - ");
    System.out.println(p.multipliedBy(5));
    p = Period.of(1,1,5);
    System.out.println(p.toTotalMonths());
    System.out.println("- - - - ");
    System.out.println(p.plus(Period.of(12,0,1)));
    System.out.println("- - - - ");
    LocalTime lt1 = LocalTime.of(12, 00);
    //System.out.println(lt1.plus(p));
  }
}