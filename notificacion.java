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

