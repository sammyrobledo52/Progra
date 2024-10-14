public class Tutor extends User {
    private String subjectExpertise; // Materia en la que es experto el tutor

    // Constructor
    public Tutor(String id, String name, String email, String password, String subjectExpertise) {
        super(id, name, email, password);
        this.subjectExpertise = subjectExpertise;
    }

    // Getter y Setter para 'subjectExpertise'
    public String getSubjectExpertise() {
        return subjectExpertise;
    }

    public void setSubjectExpertise(String subjectExpertise) {
        this.subjectExpertise = subjectExpertise;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject Expertise: " + subjectExpertise);
    }
}
