package homework_29.oddEven;

import java.util.Arrays;
import java.util.Random;

public class OddEvenAppl {
    public static void main(String[] args) {


        Random random = new Random();
        OddEvenComparator[] randomNumbers = new OddEvenComparator[10];

        for (int i = 0; i < randomNumbers.length; i++) {
            int randomNumber = random.nextInt(100) + 1;
            randomNumbers[i] = new OddEvenComparator(randomNumber);
        }

        System.out.println("--------------List of random numbers as is----------------");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.println(randomNumbers[i].getNumbers());
        }

        Arrays.sort(randomNumbers);

        System.out.println("----------Array of 10 random numbers sorted by even/odd:---------");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.println(randomNumbers[i].getNumbers());
        }
    }
}