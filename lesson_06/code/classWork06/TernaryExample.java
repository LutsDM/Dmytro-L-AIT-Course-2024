package classWork06;

import java.util.Scanner;

//**Задание 2.**
//  В программе задаются два целых числа.
//  Найдите минимальное из них с помощью тернарного оператора.
//  Дополните программу возможностью ввода чисел пользователем.
public class TernaryExample {
    public static void main(String[] args) {
        int a = 12;
        int b = 90;

        int min = (a < b) ? a : b;
        System.out.println(min);

        //input data
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1st number: ");
        a = scanner.nextInt();
        System.out.println("Input 2st number: ");
        b = scanner.nextInt();

        min = minAB(a, b);
        System.out.println("Min = " + min);

    }//end of main

    public static int minAB(int a, int b){
        return (a < b) ? a : b;
    }
}//end of class
