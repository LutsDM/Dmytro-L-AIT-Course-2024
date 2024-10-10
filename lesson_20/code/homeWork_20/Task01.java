package homeWork_20;

import java.util.Scanner;

//Напишите программу, которая запрашивает у пользователя строку, содержащую целые числа, и выводит сумму всех этих введенных чисел. Используйте классы-обёртки для преобразования строк в соответствующие примитивы.
public class Task01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer numbers separated by space:");
        String str = scanner.nextLine();

        // split the String into individual numbers separated by space and store them in an array.
        String[] number = str.split(" ");

       //run a loop to sum all elements of the array.
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
        sum += Integer.parseInt(number[i]);
        }

        System.out.printf("The sum of the entered numbers %s is %d.", str, sum);

    }
}
