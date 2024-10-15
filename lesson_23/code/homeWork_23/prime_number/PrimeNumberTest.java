package homeWork_23.prime_number;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {

    PrimeNumber primeNumber;

    //простые
    int number1 = 2;
    int number2 = 3;
    int number3 = 5;
    int number4 = 13;

    //составные
    int number5 = 1;
    int number6 = 4;
    int number7 = 9;
    int number8 = 20;

    @BeforeEach
    void setUp() {

        primeNumber = new PrimeNumber();

    }

    @Test
    void testPrimeNumbers() {
        assertTrue(primeNumber.isPrimeNumber(number1)); // Проверка простых чисел
        assertTrue(primeNumber.isPrimeNumber(number2));
        assertTrue(primeNumber.isPrimeNumber(number3));
        assertTrue(primeNumber.isPrimeNumber(number4));
    }

    @Test
    void testNonPrimeNumbers() {
        assertFalse(primeNumber.isPrimeNumber(number5)); // Проверка составных чисел
        assertFalse(primeNumber.isPrimeNumber(number6));
        assertFalse(primeNumber.isPrimeNumber(number7));
        assertFalse(primeNumber.isPrimeNumber(number8));
    }

}