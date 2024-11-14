package classWork12.array_methods;

import java.util.Scanner;

public class ArrayMethodsApp {
    public static void main(String[] args) {

        /* int[] myArray = ArrayMethods.fillArray(10, 20,30);
        ArrayMethods.printArray(myArray);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number for searching: ");
        int n = scanner.nextInt();

        boolean isInArray = ArrayMethods.searchInArray(myArray, n);
        System.out.println("Number " + n + " is in array" + isInArray);

        */


        // Calculate bank account interest

        int[] myArrayBalances = ArrayMethods.fillArray(1000,10000,9);

        int percent = 7;

        double[] BalanceWithInterest = ArrayMethods.calculatePercent(myArrayBalances, percent);
        System.out.println("Account balances after interest accrual:");
        ArrayMethods.printArray(BalanceWithInterest);

        // summation and average

       int[] myArray = ArrayMethods.fillArray(10, 20,30);
        int sumMyArray = ArrayMethods.sumArray(myArray);
        double avgMyArray = ArrayMethods.averageValue(myArray);
        System.out.println("Sum of the array: " + sumMyArray);
        System.out.println("Average of the array: " + avgMyArray);


    }

}
