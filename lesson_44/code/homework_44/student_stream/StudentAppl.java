package homework_44.student_stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentAppl {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student(100_000_101,"John", 2006, 4.6),
                new Student(100_000_102, "Alice", 2005, 3.8),
                new Student(100_000_103, "Bob", 2006, 4.6),
                new Student(100_000_104, "Charlie", 2009, 3.9),
                new Student(100_000_105, "Diana", 2005, 4.7),
                new Student(100_000_106, "Eve", 2009, 4.1),
                new Student(100_000_107, "Frank", 2009, 3.9)
        );

        students.forEach(System.out::println);

        System.out.println();
        System.out.println("-----------------all students by 2009----------------------------");
        students.stream()
                        .filter(s -> s.getYearOfBirth() == 2009)
                        .forEach(System.out::println);

        System.out.println();
        System.out.println("-----------------list of students name in revers----------------------------");
        students.stream()
                .map(Student::getName)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        System.out.println();
        System.out.println("-----------------all student between 2006 and 2009---------------------------");
        students.stream()
                .filter(s -> s.getYearOfBirth() >= 2006 && s.getYearOfBirth() <= 2009)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("-----------------sorted by grade, name---------------------------");
        students.stream()
                .sorted(Comparator.comparingDouble(Student::getGradeAverage).reversed()
                        .thenComparing(Student::getName))
                .forEach(System.out::println);

        System.out.println();
        System.out.println("-----------------number of students by age---------------------------");
        Map<Integer, Long> studentsByAge = students.stream()
                        .map(Student::getYearOfBirth)
                        .collect(Collectors.groupingBy(yearsOfBirth -> yearsOfBirth, Collectors.counting()));

        studentsByAge.forEach((yearsOfBirth, count) -> System.out.println(yearsOfBirth + " : " + count));


        System.out.println();
        System.out.println("-----------------senior and junior student---------------------------");
        students.stream()
                        .min(Comparator.comparing(Student::getYearOfBirth))
                        .ifPresent(s -> System.out.println("The oldest student: " + s));

        students.stream()
                        .max(Comparator.comparing(Student::getYearOfBirth))
                        .ifPresent(s -> System.out.println("The youngest student: " + s));


        System.out.println();
        System.out.println("-----------------is there a student with the name Bob?---------------------------");
                boolean hasBob = students.stream()
                        .anyMatch(s -> s.getName().equals("Bob"));
        System.out.println("Is there a student named Bob?: " + hasBob);


    }
}
