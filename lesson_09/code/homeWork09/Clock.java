package homeWork09;

import java.util.Scanner;

//В программе задаются часы, минуты и секунды. Нужно вывести общее количество секунд, прошедших с начала суток.
// Вычисление произведите в методе, который получает на вход часы, минуты и секунды.
public class Clock {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input hour (0-23):");
        int hour = scanner.nextInt();
        while (hour < 0 || hour > 23) {  //check input hour
            System.out.println("Invalid input. Please input hour (0-23):");
            hour = scanner.nextInt();}

        System.out.println("Input minutes:");
        int min = scanner.nextInt();
        while (min < 0 || min > 60) { //check input minutes
            System.out.println("Invalid input. Please input min (0-60):");
            min = scanner.nextInt();}

        System.out.println("Input seconds:");
        int sec = scanner.nextInt();
        while (sec < 0 || sec > 60) {  // check input seconds
            System.out.println("Invalid input. Please input sec (0-60):");
            sec = scanner.nextInt();}


        int secondsFromStart = totalSeconds(hour, min, sec);
        System.out.println("The number of seconds since the start of the day: " + secondsFromStart);
    }

    private static int totalSeconds(int hour, int min, int sec) {
        return hour * 3600 + min * 60 + sec;
    }

}
