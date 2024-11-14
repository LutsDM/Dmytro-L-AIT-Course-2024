package classWork_21.arrays_tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTddTest {

    ArrayTdd arrayTdd;
    int[] array = {-10, -10, 88, 15, 45, 22};

    @BeforeEach
    void setUp() {

        arrayTdd = new ArrayTdd(array);

    }

    @Test
    void countPositive() {
        // expected
        int expected = 4;
        // actual
        int actual = arrayTdd.countPositive(array);

        assertEquals(expected, actual, "check expected");

    }
}