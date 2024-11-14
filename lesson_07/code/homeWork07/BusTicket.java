package homeWork07;

import java.util.Scanner;

//Вводится шестизначное число (номер автобусного билета).
// Определите, является ли этот билет "счастливым" (сумма первых трех цифр равна сумме трех последних цифр).
public class BusTicket {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of Ticket (6 digits):");
        int ticket = scanner.nextInt();

        if (ticket < 100000 || ticket > 999999) {
            System.out.println("Wrong Input!");} // проверка шестизначности

        //складываем первую часть
        int count = 0;
        int firstHalf = ticket/1000; // отбираем первые 3 цифры
        int sumFirstHalf = 0; //сумма первых 3 чисел

        while (count < 3){
            sumFirstHalf += firstHalf % 10;
            count++;
            firstHalf /= 10;
        }

        //складываем вторую часть
        int sumSecondHalf = 0;

        count = 0;

        while (count < 3){
            sumSecondHalf += ticket % 10;
            count++;
            ticket /= 10;

        }

       if (sumFirstHalf == sumSecondHalf){  //сравниваем две части
           System.out.println("This is a lucky ticket.");
       } else {
           System.out.println("This is not a lucky ticket");
       }


    }//end of main
}//end of class
