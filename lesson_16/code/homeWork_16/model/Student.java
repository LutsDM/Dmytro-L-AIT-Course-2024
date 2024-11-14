package homeWork_16.model;

public class Student {

    private int id;
    private String firstName;
    private String secondName;
    private int birth_year;
    private String specialization;

    public Student(int id, String firstName, String secondName, int birth_year, String specialization) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.birth_year = birth_year;
        this.specialization = specialization;
    }

    public Student(int id, String gans, String fritz, int birthYear, int i) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(int birth_year) {
        this.birth_year = birth_year;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", birth_year=" + birth_year +
                ", specialization='" + specialization + '\'' +
                '}';
    }

    public String displayStudent() {
        return String.format("ID: %d, First Name: %s, Second Name: %s, Birth Year: %d, Specialization: %s",
                id, firstName, secondName, birth_year, specialization);
    }

    public void study() {
        System.out.println(firstName + " is studying in the specialization: " + specialization);
    }

     public void takeVacation() {
        System.out.println(firstName + " is on vacation.");
    }


    public void passExam() {
        System.out.println(firstName + " has passed the exam in " + specialization);
    }


}
