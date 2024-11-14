package homeWork14;
//Найти в Интернете алгоритм selection sort. https://www.geeksforgeeks.org/selection-sort/
// Задать массив из случайных целых чисел.
//Реализовать метод, получающий на вход массив и сортирующий его по алгоритму selection sort.

import array_methods.ArrayMethods;

public class Task03 {
    public static void main(String[] args) {

        int[] myArray = ArrayMethods.fillArray(1, 20,20); //Fill array
        System.out.println("Random array: ");
        ArrayMethods.printArray(myArray);

        int [] sortedArray = selectionSorting(myArray);//Sorting the array
        System.out.println("Sorted array: ");
        ArrayMethods.printArray(sortedArray);

    }

    public static int[] selectionSorting (int[] myArray){
        for (int i = 0; i < myArray.length - 1; i++) {
            int min_ind = i;

            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[j] < myArray[min_ind]) {
                    min_ind = j;
                }

            }

            if (min_ind != i) {
                int temp = myArray[i];
                myArray[i] = myArray[min_ind];
                myArray[min_ind] = temp;
            }
        }
        return myArray;
    }

}
