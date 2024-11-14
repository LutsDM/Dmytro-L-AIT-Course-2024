package homeWork07;

import java.util.Scanner;

//В первый день спортсмен пробежал s километров, а затем он каждый день увеличивал пробег на 10 % от предыдущего значения.
// Определите номер того дня, на который пробег спортсмена составит не менее target километров.
// Программа получает на вход действительные числа s и target и должна вывести одно натуральное число.
public class Atlete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input result of 1st day (km):");
        double s = scanner.nextDouble();
        System.out.println("Input your target result (km):");
        int target = scanner.nextInt();

        int finalDay = 1;


        while (target > s){
            s = s + (s * 0.1);
            finalDay++;

        }
        System.out.println("The day when you achieve your goal:" + finalDay);
    }//end of main
}//end of class
