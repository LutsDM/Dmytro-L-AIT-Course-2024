package homeWork_22;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Random100Test {
    //т.к. для тестирования функциональности метода не имеет значение размер массива мы можем для тестов использовать
// набор заданного диапазона от -10 до 10
// тем не менее можно устроить тестирование приняв величину массива за значимый фактор для чего можно создать
// понятный массив из 100 элементов заполненных 1 и -1.
// протестируем на обоих массивах

    Random100 random100;

    // Исходный массив для тестирования диапазона от -10 до 10
    int[] testArray1 = {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    // Массив из 100 элементов, заполненный 1 и -1
    int[] testArray2 = new int[100];

    @BeforeEach
    void setUp() {
        random100 = new Random100();
        myTestArray(testArray2);
    }

    // Метод для заполнения массива 1 и -1
    private static void myTestArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            // Заполнение массива 1 и -1
            if (i % 2 == 0) {
                array[i] = 1;
            } else {
                array[i] = -1;
            }
        }
    }

    @Test
    void testCountOfPositiveNumbers() {
        assertEquals(10, random100.countPositiveNumbers(testArray1)); // Проверка исходного массива
        assertEquals(50, random100.countPositiveNumbers(testArray2)); // Проверка массива 1 и -1
    }

    @Test
    void testCountOfNegativeNumbers() {
        assertEquals(10, random100.countNegativeNumbers(testArray1)); // Проверка исходного массива
        assertEquals(50, random100.countNegativeNumbers(testArray2)); // Проверка массива 1 и -1
    }

    @Test
    void testCountOfOddNumbers() {
        assertEquals(10, random100.countOddNumbers(testArray1)); // Проверка исходного массива
        assertEquals(100, random100.countOddNumbers(testArray2)); // Проверка массива 1 и -1
    }

    @Test
    void testCountOfEvenNumbers() {
        assertEquals(11, random100.countEvenNumbers(testArray1)); // Проверка исходного массива
        assertEquals(0, random100.countEvenNumbers(testArray2)); // Проверка массива 1 и -1
    }

    @Test
    void testCountOfZero() {
        assertEquals(1, random100.countOfZero(testArray1)); // Проверка исходного массива
        assertEquals(0, random100.countOfZero(testArray2)); // Проверка массива 1 и -1
    }
}
