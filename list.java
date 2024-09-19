public List<Notification> getNotificationsForUser(User user) {
        return userNotifications.getOrDefault(user, new ArrayList<>());
    }

//Listado de las notificaciones con sus constructores
