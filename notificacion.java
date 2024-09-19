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
