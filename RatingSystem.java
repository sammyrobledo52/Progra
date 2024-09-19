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
    
}
