package homeWork14;

import array_methods.ArrayMethods;

// Часть1 Заполните массив целыми числами от 1 до 100. Создайте второй массив с размером на 1 больше, чем имеющийся.
// Скопируйте первый массив в новый массив.
//
//Часть 2 Добавьте случайное целое число в интервале от 1 до 100 на случайное место в исходный массив.
//
//Часть 3 В полученном массиве найдите наиболее коротким способом, какое число было добавлено в массив.
public class Task01 {
    public static void main(String[] args) {

        int[] firstArray = ArrayMethods.fillArray(1, 100, 20); //Fill the first array
        System.out.println("First array: ");
        ArrayMethods.printArray(firstArray);

        int[] secondArray = ArrayMethods.fillArray(1, 100, 21); //Fill the second array
        System.out.println("Second array: ");
        ArrayMethods.printArray(secondArray);

        int[] resArray = new int[firstArray.length + secondArray.length]; //Create a new array

        for (int i = 0; i < firstArray.length; i++) { //Copy the first array into resArray
            resArray[i] = firstArray[i];
        }

        for (int i = 0; i < secondArray.length; i++) { //Copy the first array into resArray
            resArray[firstArray.length + i] = secondArray[i];
        }

        System.out.println("Сoncatenation of two arrays: ");
        ArrayMethods.printArray(resArray);

        int randomNumber = (int) (Math.random() * 100) + 1; // Generate a random number
        int randomIndex = (int) (Math.random() * resArray.length); // Generate a random index but not more as new array length

        System.out.println("Random number is " + randomNumber + " and index is " + randomIndex);

        int[] newArray = new int[resArray.length]; //Create new array
        for (int i = 0; i < resArray.length; i++) { //Copy array from resArray to newArray
            newArray[i] = resArray[i];
        }
        newArray[randomIndex] = randomNumber; //Add random number with random index
        ArrayMethods.printArray(newArray);

        int addedNumber = findAddedNumber(resArray, newArray); //Find which number was added
        System.out.println("Random number was " + addedNumber);


    }

    private static int findAddedNumber(int[] resArray, int[] newArray) { //Method to find which number was added
        int i;
        for (i = 0; i < resArray.length; i++) {
            for (int j = 0; j < newArray.length; j++) {
                if (resArray[i] != newArray[i]) {
                    return newArray[i];
                }
            }

        }
        return - 1;
    }
}
