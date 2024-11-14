package homeWork12;

import java.util.Scanner;

// Составьте программу, которая вычисляет сумму чисел от 1 до 1/n, n вводится с клавиатуры.
// Пример: n = 10 sum = 1 + 1/2 + 1/3 + ... + 1/10 Использовать цикл for.
public class Task01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of values for summation:");
        int number = scanner.nextInt();

        double sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += 1.0 / i;


        }
        System.out.println("Sum of the series 1 + 1/2 + 1/3 + ... + 1/" + number + " is: " + sum);
    }
}