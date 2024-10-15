
public class Tutor extends User {
    private Schedule availability;
    private List<String> specializations;
    private String subjectExpertise; // Materia en la que es experto el tutor
    private float rating;

    // Constructor
    public Tutor(String id, String name, String email, String password, List<String> specializations,String subjectExpertise) {
        super(id, name, email, password);
        this.availability = new Schedule();
        this.specializations = specializations; 
        this.subjectExpertise = subjectExpertise;
        this.rating = 0;
    }

    // Getter y Setter para 'subjectExpertise'
    public String getSubjectExpertise() {
        return subjectExpertise;
    }

    public void setSubjectExpertise(String subjectExpertise) {
        this.subjectExpertise = subjectExpertise;
    }

    public List<String> getSpecializations() {
        return specializations;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject Expertise: " + subjectExpertise);
        System.out.println("Specializations: " + String.join(", ", specializations));
        System.out.println("Rating: " + rating);
    }
    
    public Schedule getAvailability() {
        return availability;
    }

    public void setAvailability(Schedule availability) {
        this.availability = availability;
    }
    
    public void setRating(float rating) {
        this.rating = rating;
    }
     public float getRating() {
        return this.rating;
    }
}
