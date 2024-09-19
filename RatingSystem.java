/**
 * Sistema de calificación para tutores.
 * Permite a los estudiantes agregar calificaciones y comentarios sobre un tutor,
 * y almacena dichas calificaciones en un mapa. El sistema también actualiza la 
 * calificación promedio del tutor en función de las calificaciones recibidas.
 */
import java.time.LocalDateTime;
import java.util.*;

public class RatingSystem {
    // Mapa que almacena las calificaciones de los tutores, donde cada tutor está asociado a una lista de calificaciones.
    private Map<Tutor, List<Rating>> tutorRatings;

    /**
     * Constructor que inicializa el mapa de calificaciones de tutores.
     */
    public RatingSystem() {
        this.tutorRatings = new HashMap<>();
    }

    /**
     * Añade una nueva calificación para un tutor.
     *
     * @param tutor   El tutor que recibe la calificación.
     * @param student El estudiante que realiza la calificación.
     * @param score   La puntuación dada al tutor (entre 1 y 5).
     * @param comment El comentario asociado a la calificación.
     */
    public void addRating(Tutor tutor, Student student, int score, String comment) {
        Rating rating = new Rating(student, score, comment);
        tutorRatings.computeIfAbsent(tutor, k -> new ArrayList<>()).add(rating);
        updateTutorRating(tutor);
    }

    /**
     * Actualiza la calificación promedio del tutor en función de las calificaciones recibidas.
     *
     * @param tutor El tutor cuyo promedio de calificaciones será actualizado.
     */
    private void updateTutorRating(Tutor tutor) {
        List<Rating> ratings = tutorRatings.get(tutor);
        if (ratings != null && !ratings.isEmpty()) {
            double averageRating = ratings.stream()
                .mapToInt(Rating::getScore)
                .average()
                .orElse(0.0);
            tutor.setRating((float) averageRating);
        }
    }

    /**
     * Devuelve la lista de calificaciones para un tutor específico.
     *
     * @param tutor El tutor cuyas calificaciones se desean obtener.
     * @return Una lista de calificaciones del tutor, o una lista vacía si el tutor no tiene calificaciones.
     */
    public List<Rating> getRatingsForTutor(Tutor tutor) {
        return tutorRatings.getOrDefault(tutor, new ArrayList<>());
    }

    /**
     * Clase interna que representa una calificación, compuesta por el estudiante que la realizó, 
     * la puntuación otorgada, un comentario y una marca de tiempo.
     */
    public static class Rating {
        private Student student;
        private int score;
        private String comment;
        private LocalDateTime timestamp;

        /**
         * Constructor para crear una nueva calificación.
         *
         * @param student  El estudiante que realiza la calificación.
         * @param score    La puntuación otorgada (entre 1 y 5).
         * @param comment  El comentario asociado a la calificación.
         */
        public Rating(Student student, int score, String comment) {
            this.student = student;
            this.score = score;
            this.comment = comment;
            this.timestamp = LocalDateTime.now();
        }

    }
}
