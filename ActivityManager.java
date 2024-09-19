import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityManager{

    private List<AcademicActivity> activities;
    private NotificationSystem notificationSystem;

    public ActivityManager(NotificationSystem notificationSystem) {
        this.activities = new ArrayList<>();
        this.notificationSystem = notificationSystem;
    }
}
