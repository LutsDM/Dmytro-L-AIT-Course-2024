package homeWork09;

import java.util.Scanner;

//Написать программу, выводящую на экран максимальное из трех целых чисел.
//Числа задайте самостоятельно внутри программы.
//Решите эту задачу с помощью if ... else и также с помощью тернарного оператора.
public class MaxNumbersTernaryMetod {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        while (flag) {

            System.out.println("Continue? y/n");
            char ch = scanner.next().charAt(0);
            if (ch == 'y') {                                       // зацикливаем операцию

                System.out.println("Input 1st number");
                int _1stNumber = scanner.nextInt();

                System.out.println("Input 2st number");
                int _2stNumber = scanner.nextInt();

                System.out.println("Input 3st number");
                int _3stNumber = scanner.nextInt();

                int maxNumber = maxOfThree(_1stNumber, _2stNumber, _3stNumber);
                System.out.println("The maximal number is: " + maxNumber);

                System.out.println();


            } else {
                flag = false;
            }
        }
    }
        private static int maxOfThree(int _1stNumber, int _2stNumber, int _3stNumber) {
            return (_1stNumber > _2stNumber)
                    ? (_1stNumber > _3stNumber ? _1stNumber : _3stNumber)
                    : (_2stNumber > _3stNumber ? _2stNumber : _3stNumber);

    }
}


