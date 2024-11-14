package homeWork14;

import array_methods.ArrayMethods;

// Найти произведение всех двузначных нечетных чисел кратных 17.
public class Task04 {
    public static void main(String[] args) {

        int[] myArray = new int[99];//Fill the new array with numbers from 1 to 99
        for (int i = 0; i < myArray.length; i++) {
            myArray[i]= i + 1;
        }

        int countOfNewArray = countArray(myArray); //Counting the length of the array with numbers divisible by 17 and odd.

        int[] newArray = new int[countOfNewArray]; //Create array containing numbers divisible by 17 and odd
        int index = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 17 == 0 && myArray[i] % 2 != 0) {
                newArray[index++] = myArray[i];
            }
        }

        System.out.println("Two-digit odd numbers divisible by 17: ");
        ArrayMethods.printArray(newArray);

        int product = 1;//Product of the elements of the array
        for (int i = 0; i < newArray.length; i++) {
            product *= newArray[i];
        }
        System.out.println("The product of all two-digit odd numbers divisible by 17: "+ product);
    }


    public static int countArray(int[] myArray) { //Method to сounting the length of the array with numbers divisible by 17 and odd.
        int count = 0;
        for (int i = 0; i < myArray.length; i++) {
            if(myArray[i] % 17 == 0 && myArray[i] % 2 != 0)  {
                count++;
            }
        }
        return count;
    }
}
