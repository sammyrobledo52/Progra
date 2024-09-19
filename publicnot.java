 public NotificationSystem() {
        this.userNotifications = new HashMap<>();
    }

    public void sendNotification(User recipient, String message) {
        Notification notification = new Notification(recipient, message);
        userNotifications.computeIfAbsent(recipient, k -> new ArrayList<>()).add(notification);
    }

// Crear el sistema de notificaciones usando una funcion 
