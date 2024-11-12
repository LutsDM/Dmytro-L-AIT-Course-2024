package homework_44.student_stream;

public class Student {

    private long studentId;
    private String name;
    private int yearOfBirth;
    private double gradeAverage;

    public Student(int studentId, String name, int yearOfBirth, double gradeAverage) {
        this.studentId = studentId;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gradeAverage = gradeAverage;
    }

    public long getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public double getGradeAverage() {
        return gradeAverage;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;

        return studentId == student.studentId;
    }

    @Override
    public int hashCode() {
        return (int) studentId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("studentId=").append(studentId);
        sb.append(", name='").append(name).append('\'');
        sb.append(", yearOfBirth=").append(yearOfBirth);
        sb.append(", gradeAverage=").append(gradeAverage);
        sb.append('}');
        return sb.toString();
    }
}
