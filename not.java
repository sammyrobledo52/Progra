public Notification(User recipient, String message) {
        this.id = UUID.randomUUID().toString();
        this.recipient = recipient;
        this.message = message;
        this.timestamp = LocalDateTime.now();
        this.isRead = false;
    }

// base de donde parte la notificacion con sus atributos 
