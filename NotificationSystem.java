import java.util.*;

public class NotificationSystem {
    private Map<User, List<Notification>> userNotifications;
public NotificationSystem() {
        this.userNotifications = new HashMap<>();
    }

    public void sendNotification(User recipient, String message) {
        Notification notification = new Notification(recipient, message);
        userNotifications.computeIfAbsent(recipient, k -> new ArrayList<>()).add(notification);
    }
}
