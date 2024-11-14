package classWork14;
//Создать массив из 20-ти случайных целых чисел из интервала от -100 до 100.
//Реализуйте метод, который получает на вход исходный массив и возвращает массив,
//содержащий только положительные числа из исходного массива.

import array_methods.ArrayMethods;

public class PositivNumbers {
    public static void main(String[] args) {

        int[] numbers = ArrayMethods.fillArray(-100,100,20);
        ArrayMethods.printArray(numbers);

        int positiveCount = countPositivNumbers (numbers);
        System.out.println("Positive numbers in array: " + positiveCount);

        int[] positiveArray = new int[positiveCount];
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > 0) {
                positiveArray[index] = numbers[i];
                index++;
            }
        }

        System.out.print("Positive Array: ");
        ArrayMethods.printArray(positiveArray);


    }

    public static int countPositivNumbers (int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 0) {
                count++;
            }
        }
        return count;
    }
}
