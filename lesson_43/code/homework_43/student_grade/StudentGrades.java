package homework_43.student_grade;
//Задание 1. Имеется набор оценок 20 студентов в диапазоне от 5 до 1 балла за семестр по 10 предметам. Смоделируйте этот набор данных, найдите студентов с максимальным/минимальным средним баллом. Используйте методы stream()


import java.util.*;
import java.util.stream.Collectors;

public class StudentGrades {
    public static void main(String[] args) {
        Random random = new Random();

        List<Student> students = new ArrayList<>();
        // генерим наших 20 студентов
        for (int i = 0; i < 20; i++) {
            List<Integer> grades = random.ints(10, 1, 6) // нужно ставить 6, так как диапазон тут полузакрытый
                    .boxed()
                    .collect(Collectors.toList()); // собираем все в лист
            students.add(new Student("Student " + (i + 1), grades)); // шлепаем каждого нового студента i+1
        }

        // Находим студента с максимальным средним баллом
        Student maxAvgStudent = students.stream()
                    .max(Comparator.comparingDouble(student -> student.getAverageGrade()))
                    .orElse(null);

        // Находим студента с минимальным средним баллом
        Student minAvgStudent = students.stream()
                    .min(Comparator.comparingDouble(student -> student.getAverageGrade()))
                    .orElse(null);

            System.out.println("Student with max average grade: " + maxAvgStudent.getName() + " (" + maxAvgStudent.getAverageGrade() + ") ");
            System.out.println("Student with min average grade: " + minAvgStudent.getName() + " (" + minAvgStudent.getAverageGrade() + ") ");

    }
}