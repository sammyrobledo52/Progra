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
