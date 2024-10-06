package homeWork17.ReviewTasks;

import java.util.Scanner;

//Распечатать 10 строк: “Task1”. “Task2". … “Task10”.
//Использовать цикл while.
//**Задача 2.**
//Распечатать только 7 чисел от 1 до 100, которые делятся на 5 без остатка.
//Использовать цикл do...while.
//**Задача 3.**
//С помощью цикла while написать программу, выводящую на экран куб числа от 1 до заданного числа n.
//Пример:для числа n = 3
//1 в кубе 1
//2 в кубе 8
//3 в кубе 27
public class CyclesPartI {

    public static void main(String[] args) {
        //Task 1
        System.out.println("-----------Task1------------");
        int count = 1;
        while (count <= 10) {
            System.out.println("Task" + count);
            count++;
        }

        //Task 2
        System.out.println("-----------Task2------------");
        count = 5;                      //count from 5 to 100
        int res = 0;                    //result
        int count2 = 0;                 //count from 1 to 7
        do {
            if (count % 5 == 0) {
            res = count;
            System.out.println(res);
            count2++;
            }
            count++;
        } while (count2 < 7);

        //Task 3
        System.out.println("-----------Task3------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n:");
        int n = scanner.nextInt();
        count = 1;

        while (count <= n) {
            int cube = count * count * count;
            System.out.println(count + " в кубе " + cube);
            count++;
        }

    }
}
