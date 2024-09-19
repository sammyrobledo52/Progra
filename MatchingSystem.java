import java.util.*;
import java.util.stream.Collectors;

public class MatchingSystem {
  private List<Student> students;
  private List<Tutor> tutors;

  public Marching System() {
    this.students = new ArrayList<>();
    this.tutors = new ArrayList<>();
  }
  public void addStudent(Student student) {
    students.add(student);
  }
  public void addTutor(Tutor tutor) {
    tutors.add(tutor);
  }
  public List<Tutor> findMatchesForStudent(Student student) {
    return tutors.stream()
            .filter(tutor -> hasCommonInterests(student, tutor))
            .filter(this::isAvailable)
            .sorted(Comparator.comparingDouble(tutor -> calculateMatchScore(student, tutor)))
            .collect(Collectors.toList());
  }
    public List<Student> findMatchesForStudent(Tutor tutor) {
    return students.stream()
            .filter(student -> hasCommonInterests(student, tutor))
            .sorted(Comparator.comparingDouble(student -> calculateMatchScore(student, tutor)))
            .collect(Collectors.toList());
  }
  private boolean hasCommonInterests(Student student, Tutor tutor) {
    Set<String> studentInterests = new HashSet<>(student.getInterests());
    Set<String> tutorSpecializations = new HashSet<>(tutor.getSpecializations());
    return !Collections.disjoint(studentInterests, tutorSpecializations);
  }
  private boolean isAvailable(Tutor tutor) {
    return !tutor.getAvailability().getAvailableTimes().isEmpty();
  }
  
  

  
