package homeWork12;

import classWork12.array_methods.ArrayMethods;

//Написать метод, принимающий массив целых чисел, и "разворачивающий" его.
//Последний элемент становится нулевым, предпоследний, первым, и т. д.
//Подсказка: этот метод должен изменить полученный массив, а не распечатать его в обратном порядке.
public class Task04 {
    public static void main(String[] args) {
        int[] array = {45, 33, 10, 5, 76, 0, 1, 54};
        int n = array.length;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < n - 1; j++) {
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
            n--;
        }
        ArrayMethods.printArray(array);
    }
}
