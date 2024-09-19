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
