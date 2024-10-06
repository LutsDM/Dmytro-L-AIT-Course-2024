package homeWork17.ReviewTasks;
//**Задача 4.**
//С помощью цикла while написать программу, выводящую на экран результат умножения
// данного натурального числа n на все целые числа от 0 до n.
//Пример: для числа 3 результат будет 0, 3, 6, 9.
//А затем подсчитать сумму всех натуральных чисел от 0 до n.

import java.util.Scanner;

public class CyclesNaturalNumbers {
    public static void main(String[] args) {
        //Task 4
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input natural number:");
        int n = 0;
        if (!scanner.hasNextInt()) {                          //check of natural number
            System.out.println("Wrong input. Please try again");
        } else {
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Wrong input. Please try again");
            }
        }

        int count = 0;
        int sum = 0;

        System.out.println("Result for number " + n + ":" );
        while (count <= n) {
            int res = count * n;
            System.out.print(res + " ");
            sum += res;                                         //sum up the result
            count++;
        }
        System.out.println();
        System.out.println("----------------");
        System.out.println("Sum: " + sum);
    }//end main
}//end class
