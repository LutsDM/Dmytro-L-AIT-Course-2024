package homeWork06;

import java.util.Scanner;

/*
Задача 1. Напишите программу расчета выдачи денег работнику с учётом надбавки за стаж, если базовая зарплата 500$.
За 3 года работы надбавка 10%, за 5 лет работы надбавка 50%, за 10 лет работы надбавка 100%, за 15 лет работы надбавка 150%.
Сколько лет проработал работник вводится с клавиатуры.
 */
public class Salary {

    private static final int BASE_SALARY = 500;

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Input years of work: ");
        int yearsOfWork = scanner.nextInt();

        double bonus = 0;

        if (yearsOfWork >= 3 && yearsOfWork < 5){
            bonus = 0.10;
            System.out.println("Your bonus is: " + bonus * 100);
        } else if (yearsOfWork >= 5 && yearsOfWork < 10) {
            bonus = 0.50;
            System.out.println("Your bonus is: " + bonus * 100);
        } else if (yearsOfWork >= 10 && yearsOfWork < 15) {
            bonus = 1;
            System.out.println("Your bonus is: " + bonus * 100);
        } else if (yearsOfWork >= 15) {
            bonus = 1.5;
            System.out.println("Your bonus is: " + bonus * 100);
        }

        double salary = SalaryCalculator(BASE_SALARY, bonus);
        System.out.println("Your slary: " + salary);

        }//end of main

    private static double SalaryCalculator(int baseSalary, double bonus) {
        return BASE_SALARY + (BASE_SALARY * bonus);
    }

}// end of class


