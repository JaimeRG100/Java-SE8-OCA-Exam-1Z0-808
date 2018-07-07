import java.time.LocalTime;

class TestTrip {
  
  public static void main(String... args){
   Trip trip = new Trip();
   // example of Custom RuntimeException
   trip.goTrekking(LocalTime.of(5,24));
  }
}

class FeelingHungryException extends RuntimeException {} 

class Trip {
  void goTrekking(LocalTime startTime) {
    // compare time now and start time
    // throw FeelingHungryException if difference is > 2 hrs
    int hrs = LocalTime.now().getHour() - startTime.getHour();
    System.out.println("Difference of hours: " + hrs + " (" + LocalTime.now().getHour() + " - " + startTime.getHour() + ")"); 
    if (hrs >= 2) throw new FeelingHungryException();
  }
}

