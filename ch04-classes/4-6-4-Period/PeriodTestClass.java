import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

class PeriodTestClass {
    
  public static void main(String args[]) {
    
    // Instantianting Period
    
    // of()   of_XX()
    Period period1 = Period.of(1, 27, 7);
    Period period2 = Period.ofYears(2);
    Period period3 = Period.ofMonths(5);
    Period period4 = Period.ofWeeks(10);
    Period period5 = Period.ofDays(15);
    System.out.println("of: \t" + period1);
    System.out.println("ofYears: \t" + period2);
    System.out.println("ofMonths: \t" + period3);
    System.out.println("ofWeeks: \t" + period4);
    System.out.println("ofDays: \t" + period5);
    System.out.println("\n- - - - - - - - - -");
    
    // parse()
    Period p5Yrs1 = Period.parse("P5y");
    Period p5Yrs2 = Period.parse("p5y");
    Period p5Yrs3 = Period.parse("P5Y");
    Period p5Yrs4 = Period.parse("+P5Y");
    Period p5Yrs5 = Period.parse("P+5Y");
    Period p5Yrs6 = Period.parse("-P-5Y");
    System.out.println("parse: " + p5Yrs1 + ":" + p5Yrs2 + ":" + p5Yrs3 + ":" + p5Yrs4 + ":" + p5Yrs5 + ":" + p5Yrs6);
    
    Period p5Yrs7 = Period.parse("P5y1m2d");
    Period p5Yrs8 = Period.parse("p9m"); 
    Period p5Yrs9 = Period.parse("P60m");
    Period p5Yrs10 = Period.parse("-P5W"); 
    System.out.println("parse: " + p5Yrs7 + ":" + p5Yrs8 + ":" + p5Yrs9 + ":" + p5Yrs10);
    System.out.println("\n- - - - - - - - - -");
    
    // between ()
    LocalDate carnivalStart = LocalDate.of(205, 12, 31);
    LocalDate carnivalEnd = LocalDate.of(2051, 1, 2);
    Period periodBetween = Period.between(carnivalStart, carnivalEnd);
    System.out.println("between: " + periodBetween);
    System.out.println("between: " + periodBetween.getYears() + " years, " + periodBetween.getMonths() + " month, " + periodBetween.getDays() + " days.");
    System.out.println("\n- - - - - - - - - -");
    
    
    // Manipulating LocalDate and LocalDateTime using Period
    
    LocalDate date = LocalDate.of(2052, 01, 31);
    System.out.println("Using (.plus)Period.ofDays: " + date.plus(Period.ofDays(1)));
    System.out.println("Using .plusDays: " + date.plusDays(1));
    LocalDateTime dateTime = LocalDateTime.parse("2052-01-31T14:18:36");
    System.out.println("Using (.plus)Period.ofMonths: " + dateTime.plus(Period.ofMonths(1)));
    System.out.println("Using (.plus)Period.parse   : " + dateTime.plus(Period.parse("P1M")));
    System.out.println("\n- - - - - - - - - -");
    
    
    // Querying Periods instances
    
    // get_XX()
    Period period = Period.of(2, 4, 40);
    System.out.println("getYears: " + period.getYears());
    System.out.println("getMonths: " + period.getMonths());
    System.out.println("getDays: " + period.getDays());
    System.out.println("\n- - - - - - - - - -");
    
    // isZero()   isNegative()    
    Period days5 = Period.of(0, 0, 5);
    System.out.println("isZero: " + days5.isZero());
    
    Period daysMinus5 = Period.of(0, 0, -5);
    System.out.println("isNegative: " + daysMinus5.isNegative());
    System.out.println("\n- - - - - - - - - -");
    
    
    //  Manipulating Period
    
    // (LOCALDATE.)minus()
    LocalDate bday = LocalDate.of(2020, 10, 29);
    LocalDate today = LocalDate.now();
    Period period10Days = Period.of(0, 0, 10);
    if(bday.minus(period10Days).isBefore(today))
      System.out.println("Time to sent out reminders to friends");
    else
      System.out.println("Not yet");
    System.out.println("\n- - - - - - - - - -");
    
    // minus()   minus_XX()
    Period period10Days2 = Period.of(0, 0, 10);
    Period period1Month = Period.of(0, 1, 0);
    System.out.println("minus: " + period10Days2.minus(period1Month));
    System.out.println("minusDays: " + period10Days2.minusDays(5));
    System.out.println("minusMonths: " + period10Days2.minusMonths(5));
    System.out.println("minusYears: " + period10Days2.minusYears(5));
    System.out.println("\n- - - - - - - - - -");
    
    // plus()   plus_XX()
    Period period5Month = Period.of(0, 5, 0);
    Period period10Months = Period.of(0, 10, 0);
    Period period10Days3 = Period.of(0, 0, 10);
    System.out.println("plus: " + period5Month.plus(period10Months));
    System.out.println("plusDays: " + period10Days.plusDays(35));
    System.out.println("plusMonths: " + period10Days.plusMonths(5));
    System.out.println("plusYears: " + period10Days.plusYears(5));
    System.out.println("\n- - - - - - - - - -");    
    
    // with_XX()
    System.out.println("withDays: " + period10Days.withDays(5));
    System.out.println("withMonths: " + period10Days.withMonths(5));
    System.out.println("\n- - - - - - - - - -");    
    
    // Converting to another Type
    System.out.println("toTotalMonths: " + Period.of(10, 5, 402).toTotalMonths());
    System.out.println("\n- - - - - - - - - -");  
    
    
    
    
    //test code
    period10Days = period10Days.plusYears(5);
    System.out.println("period10Days: " + period10Days + "");
    
  }
}