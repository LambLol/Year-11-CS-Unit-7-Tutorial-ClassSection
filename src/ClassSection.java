import java.util.ArrayList;

public class ClassSection {
    private String subject;
    private int capacity;
    private int yearLevel;
    ArrayList<Student> student = new ArrayList<>();

    public ClassSection(String subject, int capacity, int yearLevel){
        this.subject = subject;
        this.capacity = capacity;
        this.yearLevel = yearLevel;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public ArrayList<Student> getStudents() {
        return student;
    }

    public void setStudents(ArrayList<Student> student) {
        this.student = student;
    }

    public void addStudent(Student other){
        for (Student value : student) {
            if (value.equals(other)) {
                return;
            }
        }
        if (other.getYearLevel() != yearLevel) { return; }
        student.add(other);
    }
    public void removeStudent(Student other){
        student.remove(other);

    }
    public boolean isStudentEnrolled(Student o){
        for (Student value : student) {
            if (value.equals(o)) return true;
        }
        return false;
    }

    public String toString(){
        return "ClassSection{subject=\'" + subject + "\', capacity=" + capacity + ", students=" + student + "}";
    }
}
