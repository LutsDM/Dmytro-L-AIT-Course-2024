package homeWork_22;

import java.util.Random;

//Реализуйте в классе ArrayMethods следующие методы для массивов целых чисел:
//
//сумма всех элементов массива с нечетными индексами;
//поиск элемента в массиве по его индексу; Разработайте тесты для этих методов.
public class ArrayMethods {

    int[]array;

    public ArrayMethods(int[] array) {
        this.array = this.array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }


    public int totalOfAllElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    public  int findElementByIndex (int[] array, int randomIndex) {
        if (randomIndex >= 0 && randomIndex < array.length) {
            return array[randomIndex];
        } else {
            return -1; // Если индекс выходит за пределы массива
        }

    }

}//end of class
