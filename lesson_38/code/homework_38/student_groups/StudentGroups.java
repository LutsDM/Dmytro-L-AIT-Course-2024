package homework_38.student_groups;
//Задача 3.(*) Распределить группу студентов на две примерно равных группы (+/- 1 человек) случайным образом. Определить список студентов в программе. Получить на выходе 2 списка студентов.

import java.util.*;

public class StudentGroups {
    private static final int MIN = 5;
    private static final int MAX = 20;

    public static void main(String[] args) {
        int randomSizeGroup = getRandomNumber(MIN, MAX); //получаем рандомное количество студентов от 5 до 20
        System.out.println("Random size of group: " + randomSizeGroup);

        Integer[] twoGroupsSize = divideIntoTwoGroups(randomSizeGroup); // получаем размер 2-х групп +- 1 чел
        System.out.println("Size group 1: " + twoGroupsSize[0]);
        System.out.println("Size group 2: " + twoGroupsSize[1]);

        //Студенты складывают в шляпу бумажки с номерами 1 до общего числа игроков.
        // Все тянут номерки, и после этого игроки с четными номерами попадают в одну команду, а с нечетными — в другую.

        List<Integer> hat = fillHat(randomSizeGroup); // складываем в шляпу номера согласно количеству студентов

        System.out.println("In hat: " + hat);

        List<Integer> groupOne = new ArrayList<>();
        List<Integer> groupTwo = new ArrayList<>();

        divisionStudents(hat, groupOne, groupTwo);

        System.out.println("Group one: " + groupOne);
        System.out.println("Group two: " + groupTwo);

    }

    private static Integer[] divideIntoTwoGroups(int randomSizeGroup) {
        Integer x, y;
        if (randomSizeGroup % 2 == 0) {
            x = randomSizeGroup / 2;
            y = randomSizeGroup / 2;
        } else {
            x = randomSizeGroup / 2;
            y = (randomSizeGroup / 2) + 1;
        }
        return new Integer[]{x, y};
    }


    private static int getRandomNumber(int MIN, int MAX) {
        Random random = new Random();
        return random.nextInt((MAX - MIN) + 1) + MIN;
    }

    private static List<Integer> fillHat (int randomSizeGroup) {
        List<Integer> hat = new LinkedList<>();
        for (int i = 0; i < randomSizeGroup; i++) {
            hat.add(i+1);
        }
        return hat;
    }

    private static void divisionStudents(List<Integer> hat, List<Integer> groupOne, List<Integer> groupTwo) {
        for (int number : hat) {
            if (number % 2 == 0) {
                groupOne.add(number); // четные номера
            } else {
                groupTwo.add(number); // нечетные номера
            }
        }
    }

}



