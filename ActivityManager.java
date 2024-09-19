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

    public void createActivity(Tutor tutor, String title, String description, int maxCapacity, LocalDateTime startDateTime, LocalDateTime endDateTime) {
        AcademicActivity activity = new AcademicActivity(tutor, title, description, maxCapacity, startDateTime, endDateTime);
        activities.add(activity);
        notifyInterestedStudents(activity);
    }

     private void notifyInterestedStudents(AcademicActivity activity) {
        for (Student student : findInterestedStudents(activity)) {
            notificationSystem.sendNotification(student, 
                "New activity available: " + activity.getTitle() + " by " + activity.getTutor().getName());
        }
    }
        private List<Student> findInterestedStudents(AcademicActivity activity) {
        return new ArrayList<>();
    }
}
