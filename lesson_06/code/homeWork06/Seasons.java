package homeWork06;
//Задача 2. Пользователь с клавиатуры вводит число от 1 до 12, программа сообщает,
//какому времени года принадлежит введенный месяц.

import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input month: ");
        int month = scanner.nextInt();

        switch (month) {
            case 1, 2, 12 -> {
                System.out.println("This is: Winter");
            }
            case 3, 4, 5 -> {
                System.out.println("This is: Spring");
            }
            case 6, 7, 8 -> {
                System.out.println("This is: Summer");
            }
            case 9, 10, 11 -> {
                System.out.println("This is: Autumn");
            }
            default -> {
                System.out.println("Wrong input! ");
            }
        }
    }//end of main
}//end of class
