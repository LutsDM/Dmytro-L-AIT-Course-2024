package homeWork_22;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMethodsTest {
    ArrayMethods arrayMethods;

    int[] array = {1, 2, 2, 5, 5, 10, 3,};

    @BeforeEach
    void setUp() {
        arrayMethods = new ArrayMethods(array);
    }

    @Test
    void setValidArray() {
    arrayMethods.setArray(array);
    assertArrayEquals(array,arrayMethods.getArray());

    }

    @Test
    void testSumOfElementsAtOddIndices() {
        arrayMethods.setArray(array);
        assertEquals(14, arrayMethods.totalOfAllElements(array));
    }

    @Test
    void testSumOfElementsWhenOddNegative() {
        int[] array = {-1, 2, 2, -5, -5, 10, -3};
        arrayMethods.setArray(array);
        assertEquals(-14, arrayMethods.totalOfAllElements(array));
    }

    @Test
    void testSumOfElementsWhenAllElementsEven () {
        int[] array = {2, 8, 14, 6, 6, 12, 4};
        arrayMethods.setArray(array);
        assertEquals(0, arrayMethods.totalOfAllElements(array));
    }

    @Test
    void testFindElementByIndex() {
        int randomIndex = 3;
        arrayMethods.setArray(array);
        assertEquals(5,arrayMethods.findElementByIndex(array, randomIndex));
    }

    @Test
    void testFindElementByIndexWhenAllNegativ() {
        int randomIndex = 3;
        int[] array = {-12, -22, -61, -74, -9, -10};
        arrayMethods.setArray(array);
        assertEquals(-74,arrayMethods.findElementByIndex(array, randomIndex));
    }

    @Test
    void testFindElementWithIndexZero() {
        int randomIndex = 0;
        int[] array = {-12, -22, -61, -74, -9, -10};
        arrayMethods.setArray(array);
        assertEquals(-12,arrayMethods.findElementByIndex(array, randomIndex));
    }

    @Test
    void testFindElementWhenIndexOutseid() {
        int randomIndex = 12;
        arrayMethods.setArray(array);
        assertEquals(-1,arrayMethods.findElementByIndex(array, randomIndex));
    }


}