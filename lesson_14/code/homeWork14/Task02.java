package homeWork14;

// Задача про поиск "счастливого пельменя".
// Хозяйка налепила для гостей 30 пельменей.
// В один из пельменей она положила монету, которая увеличивает вес пельменя на 15 грамм.
// Напишите программу, которая ищет счастливый пельмень.

import array_methods.ArrayMethods;

public class Task02 {
    public static void main(String[] args) {

        int[] arrayOfPelmeni = ArrayMethods.fillArray(12, 15, 30); //Fill the array with pelmeni, each weighing 12 - 15 g.
        ArrayMethods.printArray(arrayOfPelmeni);

        int indexForLakyPelmen = (int) (Math.random() * 30) + 1;
        System.out.println("Index for Laсky Pelmen: " + indexForLakyPelmen);

        int weightCoin = 15;

        arrayOfPelmeni[indexForLakyPelmen] += weightCoin; //add coin in pelmeni
        System.out.println("Pelmeni with a surprise ");
        ArrayMethods.printArray(arrayOfPelmeni);


        int lakyPelmen = findLakyPelmen (arrayOfPelmeni,weightCoin);
        System.out.println("Laсky Pelmen was: " + lakyPelmen);
    }

    public static int findLakyPelmen (int[] arrayOfPelmeni, int weightCoin){ //Find coin in Pelmeni
        for (int i = 0; i < arrayOfPelmeni.length; i++) {
            if (arrayOfPelmeni[i] > weightCoin) {
                return i;
            }
        }
        return -1;
    }
}
