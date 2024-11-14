package homeWork12;
//Вводится n - натуральное число.
// Напишите метод, который получает на вход n и вычисляет n! = 1 * 2 * 3 *... * n.
// Вызовите полученный метод.
// При каком значении n происходит переполнение памяти (результат станет отрицательным), выделяемой для значения n! типа int?
// Использовать цикл for.

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number: ");
        int n = scanner.nextInt();

        int res = 1;

        for (int i = 1; i <= n; i++) {
        res *= i;
        }
        System.out.println(res);

    }
}
