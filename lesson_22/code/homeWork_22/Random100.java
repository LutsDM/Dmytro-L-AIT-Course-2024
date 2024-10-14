package homeWork_22;

import homeWork10.EvenNumbersArray;

import java.util.Random;

public class Random100 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] randomArray = new int[100];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(21) - 10;
        }

        int negativeNumbers = countNegativeNumbers(randomArray);
        int positiveNumbers = countPositiveNumbers(randomArray);
        int oddNumbers = countOddNumbers(randomArray);
        int evenNumbers = countEvenNumbers(randomArray);
        int zero = countOfZero(randomArray);


        System.out.println("In array: ");
        System.out.println(negativeNumbers + " negative numbers");
        System.out.println(positiveNumbers + " positive numbers");
        System.out.println(oddNumbers + " odd numbers");
        System.out.println(evenNumbers + " even numbers");
        System.out.println(zero + " zero");

    }// end of main

    public static int countNegativeNumbers(int[] randomArray) {
        int negativeNumbers = 0;
        for (int num : randomArray) {
            if (num < 0) {
                negativeNumbers++;
            }
        }
        return negativeNumbers;
    }

    public static int countPositiveNumbers(int[] randomArray) {
        int PositiveNumbers = 0;
        for (int num : randomArray) {
            if (num > 0) {
                PositiveNumbers++;
            }
        }
        return PositiveNumbers;
    }

    public static int countOddNumbers(int[] randomArray) {
        int OddNumbers = 0;
        for (int num : randomArray) {
            if (num % 2 != 0) {
                OddNumbers++;
            }
        }
        return OddNumbers;
    }


    public static int countEvenNumbers(int[] randomArray) {
        int evenNumbers = 0;
        for (int num : randomArray) {
            if (num % 2 == 0) {
                evenNumbers++;
            }
        }
        return evenNumbers;
    }


    public static int countOfZero(int[] randomArray) {
        int zero = 0;
        for (int num : randomArray) {
            if (num == 0) {
                zero++;
            }
        }
        return zero;
    }


}// end of class
