package homeWork07;

import java.sql.PreparedStatement;
import java.util.Scanner;

//Вводится положительное целое число, найдите сумму его цифр. Пример: 1725, сумма цифр = 15
public class PositivNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your number:");
        int number = scanner.nextInt();

        int res = 0;
        int newNumber = number;


        while (newNumber > 0) {
            res += newNumber % 10;
            newNumber = newNumber / 10;
        }


        System.out.println("The sum of the digits of your number: " + res);

    }//end of main
}//end of class


