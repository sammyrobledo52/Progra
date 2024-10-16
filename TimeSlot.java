import java.time.DayOfWeek;
import java.time.LocalTime;
public class TimeSlot{
  
  private DayOfWeek day;
  private LocalTime startTime;
  private LocalTime endTime;

  public TimeSlot(DayOfWeek day, LocalTime startTime, LocalTime endTime) {
      this.day = day;
      this.startTime = startTime;
      this.endTime = endTime;
    }
}
