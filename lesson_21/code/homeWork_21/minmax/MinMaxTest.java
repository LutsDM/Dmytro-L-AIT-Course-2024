package homeWork_21.minmax;

import homeWork_21.minmax.MinMax;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxTest {

    MinMax minMax;
    int[] array = {-22, 110, 8, 0, 425, -54};

    @BeforeEach
    void setUp() {

        minMax = new MinMax(array);
    }

    @Test
    void testFindMin() {
        // expected
        int expected = -54;
        // actual
        int actual = minMax.findMin(array);

        assertEquals(expected, actual);

    }

    @Test
    void testFindMax() {
        // expected
        int expected = 425;
        // actual
        int actual = minMax.findMax(array);

        assertEquals(expected, actual);

    }

    @Test
    void testFindMaxWhenSame () {
        int[] array = {1, 1, 1, 1, 1, 1,};
        // expected
        int expected = 1;
        // actual
        int actual = minMax.findMax(array);
        assertEquals(expected, actual);

    }

    @Test
    void testFindMixWhenSame () {
        int[] array = {1, 1, 1, 1, 1, 1,};
        // expected
        int expected = 1;
        // actual
        int actual = minMax.findMin(array);
        assertEquals(expected, actual);

    }

    @Test
    void testFindMaxWhenNull () {
        int[] array = {};
        // expected
        int expected = -1;
        // actual
        int actual = minMax.findMax(array);
        assertEquals(expected, actual);

    }

    @Test
    void testFindMixWhenNull () {
        int[] array = {};
        // expected
        int expected = -1;
        // actual
        int actual = minMax.findMin(array);
        assertEquals(expected, actual);

    }


}