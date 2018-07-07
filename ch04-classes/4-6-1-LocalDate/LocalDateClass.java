import java.time.LocalDate;
import java.time.LocalTime;  // used in an example 

class LocalDateClass {
  
  
  public static void main(String args[]) {
    
    //Creating LocalDate
    
    // of()
    LocalDate date1 = LocalDate.of(2015, 12, 27);
    LocalDate date2 = LocalDate.of(2015, /*Month.DECEMBER*/ 12, 27);
    
    // now()
    LocalDate date3 = LocalDate.now();
    
    // parse()
    LocalDate date4 = LocalDate.parse("2025-08-09");
    
    System.out.println(date1);
    System.out.println(date3);
    System.out.println(date4);
    System.out.println("- - - - - - -\n");
    
    //Querying LocalDate
   
    // get_XX()
    LocalDate date = LocalDate.parse("2020-08-30");
    System.out.println("getDayOfMonth(): \t" + date.getDayOfMonth());
    System.out.println("getDayOfWeek(): \t" + date.getDayOfWeek());
    System.out.println("getDayOfYear(): \t" + date.getDayOfYear());
    System.out.println("getMonth(): \t" + date.getMonth());
    System.out.println("getMonthValue(): \t" + date.getMonthValue());
    System.out.println("getYear(): \t" + date.getYear());
    System.out.println("- - - - - - -\n");
    
    // isAfter()   isBefore()
    LocalDate shreyaBday = LocalDate.parse("2002-08-30");
    LocalDate paulBday = LocalDate.parse("2002-07-29");
    System.out.println("isAfter: " + shreyaBday.isAfter(paulBday));
    System.out.println("isBefore: " + shreyaBday.isBefore(paulBday));
    System.out.println("isBefore: " + shreyaBday.isBefore(shreyaBday));
    System.out.println("- - - - - - -\n");
    
    // Manipulating LocalDateManipulating LocalDate
    
    // minus_XX()
    LocalDate bDay = LocalDate.of(2052, 03,10);
    System.out.println("minusDays: \t" + bDay.minusDays(10));
    System.out.println("minusMonths: \t" + bDay.minusMonths(2));
    System.out.println("minusWeeks: \t" + bDay.minusWeeks(30));
    System.out.println("minusYears: \t" + bDay.minusYears(1));
    System.out.println("- - - - - - -\n");
    
    // minus_XX()
    LocalDate launchCompany = LocalDate.of(2016, 02, 29);
    System.out.println("plusDays: \t\t" + launchCompany.plusDays(1));
    System.out.println("plusMonths: \t" + launchCompany.plusMonths(1));
    System.out.println("plusWeeks: \t" + launchCompany.plusWeeks(7));
    System.out.println("plusYears: \t" + launchCompany.plusYears(1));
    System.out.println("- - - - - - -\n");
    
    // with_XX()
    LocalDate firstSex = LocalDate.of(2036, 02, 28);
    System.out.println("withDayOfMonth: \t" + firstSex.withDayOfMonth(1));
    System.out.println("withDayOfYear: \t" + firstSex.withDayOfYear(1));
    System.out.println("withMonth: \t" + firstSex.withMonth(7));
    System.out.println("withYear: \t\t" + firstSex.withYear(1));
    System.out.println("- - - - - - -\n");
    
    // Converting to Another Type
    
    // atTime()
    LocalDate interviewDate = LocalDate.of(2016, 02, 28);
    System.out.println("atTime: \t" + interviewDate.atTime(16, 30));
    System.out.println("atTime: \t" + interviewDate.atTime(16, 30, 20));
    System.out.println("atTime: \t" + interviewDate.atTime(16, 30, 20, 300));
    System.out.println("atTime: \t" + interviewDate.atTime(LocalTime.of(16,30)));
    System.out.println("- - - - - - -\n");
    
    // toEpochDate()
    LocalDate launchBook = LocalDate.of(2016, 2, 8);
    LocalDate aDate = LocalDate.of(1970, 1, 8);
    System.out.println("toEpochDay: \t" + launchBook.toEpochDay());
    System.out.println("toEpochDay: \t" + aDate.toEpochDay());
    
  }
}