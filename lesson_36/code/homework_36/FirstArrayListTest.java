package homework_36;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static homework_36.FirstArrayList.removeDuplicates;
import static org.junit.jupiter.api.Assertions.*;

class FirstArrayListTest {
    List<Integer> randomNumbers;
    List<Integer> uniqueNumbers;


    @BeforeEach
    void setUp() {
        randomNumbers = new ArrayList<>();

        randomNumbers.add(1);
        randomNumbers.add(2);
        randomNumbers.add(3);
        randomNumbers.add(4);

        randomNumbers.add(1);
        randomNumbers.add(2);
        randomNumbers.add(3);
        randomNumbers.add(4);


        uniqueNumbers = new ArrayList<>();

        uniqueNumbers.add(1);
        uniqueNumbers.add(2);
        uniqueNumbers.add(3);
        uniqueNumbers.add(4);


    }

    @Test
    void removeDuplicatesTest() {
        List<Integer> result = removeDuplicates(randomNumbers);
        assertEquals(uniqueNumbers, result);
    }
}