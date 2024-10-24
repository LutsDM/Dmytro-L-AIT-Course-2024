package homework_30.Task2;

import java.util.Arrays;

//Задание 2. Создайте массив действительных чисел на базе класса-обертки Double на 10 элементов, заполните его случайными числами в интервале от 0 до 10. Выполните сортровки:
//
//ascending; //
//descending. //
public class DoubleArray {
    public static void main(String[] args) {

        Double[] numbers = {
                25.11,
                44.12,
                135.351,
                1.0001,
                15.333,
                98.89,
                Double.MAX_VALUE,
                54584.548,
                Double.MIN_VALUE
        };

        System.out.println("------------List as is------------");
        System.out.println(Arrays.toString(numbers));


        System.out.println("------------List in ascending order------------");
        Arrays.sort(numbers, (n1, n2) -> Double.compare(n1, n2));
        for (Double i : numbers) {
            System.out.println(i + " ");
        }

        System.out.println("------------List in descending order------------");
        Arrays.sort(numbers, (n1, n2) -> - Double.compare(n1, n2));
        for (Double i : numbers) {
            System.out.println(i + " ");
        }


    }

}
