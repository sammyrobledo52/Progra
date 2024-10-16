public class Main {

  /**
   * Lista de usuarios que participan en el sistema.
   * Contiene instancias de la clase {@link User}, que puede incluir tanto estudiantes como tutores.
   */
    private static ArrayList<User> users = new ArrayList<>();
   /**
    * Lista de actividades académicas disponibles en el sistema.
    * Contiene instancias de la clase {@link AcademicActivity}, que representan diferentes actividades académicas.
    */
    private static ArrayList<AcademicActivity> activities = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

   /**
    * Objeto {@link Scanner} utilizado para leer entradas desde la consola.
    * Se utiliza en varios métodos para recibir entradas del usuario.
    */
    public static void main(String[] args) {

     }

  
    private static void findMatches() {
        MatchingSystem matchingSystem = new MatchingSystem();
    
        // Agregar estudiantes y tutores al sistema de emparejamiento
        for (User user : users) {
            if (user instanceof Student) {
                matchingSystem.addStudent((Student) user);
            } else if (user instanceof Tutor) {
                matchingSystem.addTutor((Tutor) user);
            }
        }
    
        // Menú para encontrar coincidencias
        System.out.println("\n--- Encontrar coincidencias ---");
        System.out.println("1. Encontrar coincidencias para un estudiante");
        System.out.println("2. Encontrar coincidencias para un tutor");
        System.out.print("Seleccione una opción: ");

        int option = scanner.nextInt();
        scanner.nextLine(); 
        
        switch (option) {
            case 1:
                // Buscar coincidencias para un estudiante
                System.out.print("Ingrese el ID del estudiante: ");
                String studentId = scanner.nextLine();
                Student student = null;
                for (User user : users) {
                    if (user instanceof Student && user.getId().equals(studentId)) {
                        student = (Student) user;
                        break;
                    }
                }
                if (student != null) {
                    List<Tutor> matches = matchingSystem.findMatchesForStudent(student);
                    System.out.println("Coincidencias encontradas para el estudiante " + student.getName() + ":");
                    for (Tutor match : matches) {
                        System.out.println(match.getName());
                    }
                } else {
                    System.out.println("Estudiante no encontrado.");
                }
                break;
        }

    }


}
