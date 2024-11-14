package classWork06;

import java.util.Scanner;

//**Задание 5.**
//Рассчитайте величину скидки и стоимость покупки с учетом скидки по следующим правилам:
//- сумма покупки до 100 евро - скидка 0%
//- сумма покупки от 101 евро до 200 евро - скидка 2%
//- сумма покупки от 201 евро до 500 евро - скидка 5%
//- сумма покупки от 501 евро до 1000 евро - скидка 10%
//- сумма покупки от более 1000 евро - скидка 20%
//Сумма покупки вводится с клавиатуры.
public class Discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Input amount of purchase: ");
        double sum = scanner.nextDouble();

        double discount = 0;

        if (sum > 0 && sum <= 100) {
            discount = 0;
            System.out.println("Your discount: " + discount * 100 + "%");
        } else if (sum > 100 && sum <= 200) {
            discount = 0.02;
            System.out.println("Your discount: " + discount * 100 + "%");
        } else if (sum > 200 && sum <= 500) {
            discount = 0.05;
            System.out.println("Your discount: " + discount * 100 + "%");
        } else if (sum > 500 && sum <= 1000) {
            discount = 0.1;
            System.out.println("Your discount: " + discount * 100 + "%");
        } else if (sum > 1000) {
            discount = 0.2;
            System.out.println("Your discount: " + discount * 100 + "%" );
        }

        double discountedAmount = DiscountCalculator(sum, discount);

        System.out.println("Total amount due: " + Math.round(discountedAmount));
    }//end of main

    private static double DiscountCalculator(double sum, double discount) {
        return sum * (1 - discount);
    }

}//end of class
