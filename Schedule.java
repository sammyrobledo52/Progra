/**
 * Clase que representa un horario de disponibilidad.
 * Permite agregar y eliminar franjas horarias disponibles para un tutor o estudiante.
 */

import java.util.ArrayList;
import java.util.List;

public class Schedule {
    // Lista que almacena las franjas horarias disponibles.
    private List<TimeSlot> availableTimes;

    /**
     * Constructor que inicializa la lista de franjas horarias disponibles.
     */
    public Schedule() {
        this.availableTimes = new ArrayList<>();
    }


    /**
     * Añade una nueva franja horaria disponible al horario.
     *
     * @param slot La franja horaria que se desea agregar.
     */
    public void addTimeSlot(TimeSlot slot) {
        availableTimes.add(slot);
    }

    /**
     * Elimina una franja horaria del horario disponible.
     *
     * @param slot La franja horaria que se desea eliminar.
     */
    public void removeTimeSlot(TimeSlot slot) {
        availableTimes.remove(slot);
    }

    /**
     * Devuelve la lista de franjas horarias disponibles.
     *
     * @return Una lista de franjas horarias disponibles.
     */
    public List<TimeSlot> getAvailableTimes() {
        return new ArrayList<>(availableTimes);
    }

}
