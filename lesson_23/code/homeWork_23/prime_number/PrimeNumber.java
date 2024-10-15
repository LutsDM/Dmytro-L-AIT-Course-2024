package homeWork_23.prime_number;
//Для метода проверки, является ли число простым, написать тест. Использовать assert для логических выражений.

public class PrimeNumber {
    public boolean isPrimeNumber (int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
