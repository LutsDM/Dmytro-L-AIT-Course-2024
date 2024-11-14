package homeWork08;

import java.util.Scanner;

//Определение времени суток.
// Напишите программу, которая принимает на вход текущий час (от 0 до 23) и
// выводит приветствие в зависимости от времени суток (утро, день, вечер, ночь).
public class TimeOfDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input hour:");
        int hour = scanner.nextInt();

        //check correct number
        while (hour > 23 || hour < 0) {
            System.out.println("Wrong input!");
            System.out.println("Try again.");
            hour = scanner.nextInt();
        }

        //with switch case
        switch (hour) {
            case 0, 1, 2, 3, 4, 5, 6 -> {
                System.out.println("It's night now");
            }
            case 7, 8, 9, 10, 11, 12 -> {
                System.out.println("It's morning now");
            }
            case 13, 14, 15, 16, 17, 18 -> {
                System.out.println("It's aftermoon now");
            }
            case 19, 20, 21, 22, 23  -> {
                System.out.println("It's evening now");
            }
        }

        //with while
        //while ()
    }
}
