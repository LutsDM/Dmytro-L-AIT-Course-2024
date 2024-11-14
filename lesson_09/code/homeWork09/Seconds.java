package homeWork09;
//Программа запрашивает у пользователя количество секунд, прошедших с начала суток.
// Нужно вывести часы, минуты и секунды.
// Проверьте, что число введенных пользователем секунд не более 86 400.

import java.util.Scanner;

public class Seconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input seconds: ");
        int seconds = scanner.nextInt();

        int secondsInHour = 60 * 60;
        int secondsInMin = 60;
        int hour = 0;
        int min = 0;


        if (seconds > 86400) {
            System.out.println("Wrong input! Try again: ");
            seconds = scanner.nextInt();
        }


        while ((seconds - secondsInHour) >= 0 ) { // считаем сколько есть целых часов
            seconds = seconds - secondsInHour;
            hour++;
        }

        while ((seconds - secondsInMin) >= 0 ) { // считаем сколько было целых минут
            seconds = seconds - secondsInMin;
            min++;
        }

        System.out.println("Current time: " + hour + ":" + min + ":" + seconds );

    }

}

