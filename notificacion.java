 Notification.java
import java.time.LocalDateTime;
import java.util.UUID;

public class Notification {
    private String id;
    private User recipient;
    private String message;
    private LocalDateTime timestamp;
    private boolean isRead;

    public Notification(User recipient, String message) {
        this.id = UUID.randomUUID().toString();
        this.recipient = recipient;
        this.message = message;
        this.timestamp = LocalDateTime.now();
        this.isRead = false;
    //Create class notificacion 

 // Notification.java
import java.time.LocalDateTime;
import java.util.UUID;
    public void markAsRead() {
        this.isRead = true;
    }
    // Getters
    public String getId() { return id; }
    public User getRecipient() { return recipient; }
    public String getMessage() { return message; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public boolean isRead() { return isRead; }

     import java.util.*;
public class NotificationSystem {
    private Map<User, List<Notification>> userNotifications;
  // Listado notificaciones usar los atributos


 public void markNotificationAsRead(User user, String notificationId) {
        List<Notification> notifications = userNotifications.get(user);
// Sistema de marcaje de notificaciones 


 public List<Notification> getNotificationsForUser(User user) {
        return userNotifications.getOrDefault(user, new ArrayList<>());
    }
//Listado de las notificaciones con sus constructores



 public NotificationSystem() {
        this.userNotifications = new HashMap<>();
    }
    public void sendNotification(User recipient, String message) {
        Notification notification = new Notification(recipient, message);
        userNotifications.computeIfAbsent(recipient, k -> new ArrayList<>()).add(notification);
    }
// Crear el sistema de notificaciones usando una funcion 


 if (notifications != null) {
            for (Notification notification : notifications) {
                if (notification.getId().equals(notificationId)) {
                    notification.markAsRead();
                    break;
                }
            }
        }
    }
}
// Marcaje de notificaciones con funciones if y igualaciones


public class Notification {
    private String id;
    private User recipient;
    private String message;
    private LocalDateTime timestamp;
    private boolean isRead;
// clase para funcionamiento del archivo 



