package homework_43;
//Задание 2. Имеется набор целых чисел: 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20. Требуется из этого списка отобрать только простые числа. Используйте методы stream()

import java.util.ArrayList;
import java.util.stream.Stream;

public class PrimeNumber {
    public static void main(String[] args) {
        Stream<Integer> primeNumbers = Stream.of(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20).filter(n -> isPrime(n));

        primeNumbers.forEach(System.out::println);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) { // Проверяем только нечетные числа
            if (n % i == 0) {
                return false; // Делится на i, значит не простое
            }
        }
        return true; // Если не делится на все i, значит простое
    }
    }


