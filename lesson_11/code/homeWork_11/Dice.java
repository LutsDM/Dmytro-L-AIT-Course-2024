package homeWork_11;
//Смоделируйте бросок игрального кубика 20 раз. Подсчитайте, сколько раз выпала каждая грань?
// Проверьте, равны ли вероятности выпадений граней кубика?


import java.util.Random;

public class Dice {
    public static void main(String[] args) {

        Random random = new Random();

        int[] dieRandom = new int[20];

        for (int i = 0; i < dieRandom.length; i++) {
            dieRandom[i] = random.nextInt(6) + 1;  //Filling an array with 20 random numbers from 1 to 6
        }

        System.out.println("The result of the dice roll: "); //We print our random array
        for (int i = 0; i < dieRandom.length; i++) {
            System.out.print(dieRandom[i] + " ");
        }

        int[] dieFace = {1, 2, 3, 4, 5, 6};  //An array of possible die values
        int[] faceCount = new int [6];   //An array where we count how many times each face of the die has appeared

        for (int i = 0; i < dieFace.length; i++) {
            for (int j = 0; j < dieRandom.length; j++) {
                if (dieFace[i] == dieRandom[j]){
                    faceCount[i]++; //We count the occurrence of each die face and add it to the array

                }
            }

        }
        System.out.println();
        System.out.println();

        System.out.println("The result of counting how many times each face of the die has appeared: ");
        System.out.println();
        for (int i = 0; i < faceCount.length; i++) {
            System.out.println("Face with a value of " + (i + 1) +" appeared " + faceCount[i] + " times ");

        }

        System.out.println();

        System.out.println("Probability calculation: ");
        System.out.println();
        for (int i = 0; i < faceCount.length; i++) {
            double percent = (((double) faceCount[i] / 20 ) * 100);
            System.out.println("The probability of rolling a value of " + (i + 1) + " on the die is " + percent + " %");
        }


    }
}
