package classWork_10;
//Имеются оценки абитуриента из его аттестата.
//Найдите средний балл абитуриента.

public class StudentMarks {
    public static void main(String[] args) {

    int[] marks = { 4, 1, 6, 5, 2, 4, 5, 2, 5, 2, 1, 5, 2};

    int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }

        System.out.println("Sum = " + sum);

        double averageMark = (double) sum / marks.length;
        System.out.println("Average mark = " + averageMark);


    }
}
