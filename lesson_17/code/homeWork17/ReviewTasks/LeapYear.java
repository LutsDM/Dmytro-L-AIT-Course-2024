package homeWork17.ReviewTasks;
//Написать программу, определяющую, является ли год високосным.
//Значение года задается в программе или вводится пользователем с клавиатуры.
//Для того чтобы год был високосным, он должен: делится без остатка на 4 и, либо не должен делится без остатка на 100,
// либо если он делится на 100, то он должен делится также на 400.
// Проверить на годах 1700, 1800, 1900 - не високосные, а 2000 високосный.

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;

        while (flag) {
        System.out.println("Input year: ");
        System.out.println("(if you want to finish, enter 0.)");

        int year = scanner.nextInt();
        if (year == 0) {
            System.out.println("Thank you. Please come again!");
            flag = false;
        } else {

            boolean isLeapYear = leapYearCheck (year);
            System.out.println("Is this year a leap?: " + isLeapYear);
            System.out.println("------------------------------------------");
        }
       } //end wheil
    }// end main

    private static boolean leapYearCheck(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }
}//end class