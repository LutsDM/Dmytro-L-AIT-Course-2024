package homework_39.studentsList;

import java.util.*;

//Напишите программу, которая: Создает список студентов, зарегистрированных на два разных курса: "Математика" и "Информатика". Выводит: Список студентов, которые записаны на оба курса. Список студентов, которые записаны только на один из курсов. Условия: Используйте два HashSet для хранения студентов каждого курса. Программа должна использовать операции пересечения и разности множеств для вывода нужных списков.
public class StudentsList {

    public static void main(String[] args) {
        Set<String> mathematics = new HashSet<>(Arrays.asList("Bob", "Rob", "Mike", "Stive", "Julia", "Jesica", "Leonid"));
        Set<String> informatics = new HashSet<>(Arrays.asList("Nill", "Rob", "Sam", "Tanja", "Julia", "Leopold", "Bob"));

        Set<String>  studentsInBothCourses  = intersection(mathematics, informatics);
        Set<String> studentsInOneCourses  = differencOfSets(mathematics, informatics);

        System.out.println("List of students who are enrolled in both courses:" + studentsInBothCourses);
        System.out.println("List of students who are enrolled in only one of the courses:" + studentsInOneCourses);


    }

    private static Set<String> differencOfSets(Set<String> mathematics, Set<String> informatics) {

        Set<String> oneCourse = new HashSet<>(mathematics);
        oneCourse.addAll(informatics);  // Объединяем оба множества
        oneCourse.removeAll(intersection(mathematics, informatics));  // Удаляем пересечение
        return oneCourse;
    }

    public static Set<String> intersection (Set<String> mathematics, Set<String> informatics) {

        Set<String> commonStudent = new HashSet<>();

        for (String s : mathematics) {
            if(informatics.contains(s)) {
                commonStudent.add(s);
            }
        }
     return commonStudent;
    }








}
