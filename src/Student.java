import java.util.Objects;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int yearLevel;
    private static int studentCount;

    public Student(String firstName, String lastName, int age, int yearLevel){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.yearLevel = yearLevel;
        this.id = studentCount++;
    }
//    public Student(){
//        firstName = "";
//        lastName = "";
//        age = 0;
//        yearLevel = 0;
//    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        id = i;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public boolean equals(Student other){
        int cnt = 0;
        if (id == other.getId()) cnt++;
        if (Objects.equals(firstName, other.getFirstName())) cnt++;
        if (Objects.equals(lastName, other.getLastName())) cnt++;
        if (age == other.getAge()) cnt++;
        if (yearLevel == other.getYearLevel()) cnt++;
        return (cnt == 5);
    }

    public String toString() {
        return "Student{id=" + id + ", firstName=\'" + firstName + "\', lastName=\'" + lastName + "\', age=" + age + "}";
    }
}
