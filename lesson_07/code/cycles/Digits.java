package cycles;

import java.util.Scanner;

//Пользователь вводит натуральное число (целое, положительное).
//Выясните, сколько цифр в числе.
public class Digits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positiv integer number: ");
        int number = scanner.nextInt();

        int count = 0;

        while (number > 0){

            number = number/10; // number - параметр цикла
            System.out.println(number);
            count++;

        }
        System.out.println("Digits in number " + count);

    }//end of main
}//end of class
