import java.time.*;

public class Camera {
  public static void main(String[] args) {
    int hours;
    LocalDateTime now = LocalDateTime.of(2020, 10, 01, 0, 0);
    LocalDate before = now.toLocalDate().minusDays(1);
    LocalTime after = now.toLocalTime().plusHours(1);
    ++hours;
    while (before.isBefore(after) && hours < 4) {
      ++hours;
    }
    
  }  
}