package homeWork07;

import java.util.Scanner;

//Программа получает на вход строку и число повторений этой строки.
// Программа должна вывести эту строку нужное количество раз.
//Пример: строка - молоко, кол-во раз 3 молоко молоко молоко
public class Milk {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your word:");
        String word = scanner.nextLine();
        System.out.println("Input number of repetitions:");
        int rep = scanner.nextInt();

        int count = 0;

        while (rep > count){
            System.out.println((count +1 + ".") + word);
            count++;

        }
    }//end of main
}//end of class
