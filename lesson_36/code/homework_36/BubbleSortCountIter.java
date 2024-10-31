package homework_36;

import java.util.Random;

public class BubbleSortCountIter {
    public static void main(String[] args) {
        int[] randomNumbers10 = generateRandomArray(10);
        int[] randomNumbers100 = generateRandomArray(100);
        int[] randomNumbers1000 = generateRandomArray(1000);

        int iterations10 = bubbleSort(randomNumbers10);
        int iterations100 = bubbleSort(randomNumbers100);
        int iterations1000 = bubbleSort(randomNumbers1000);

        System.out.println(
             "Number of iterations with 10 elements in array: " + iterations10 + "\n" +
             "Number of iterations with 100 elements in array: " + iterations100 + "\n" +
             "Number of iterations with 1000 elements in array: " + iterations1000 + "\n"
        );
    }


    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = random.nextInt(100) + 1;
        }
        return randomNumbers;
    }


    public static int bubbleSort(int[] randomNumbers) {
        int iterationCount = 0;
        for (int i = 0; i < randomNumbers.length; i++) {
            for (int j = 0; j < randomNumbers.length - 1 - i; j++) {
                if (randomNumbers[j] > randomNumbers[j + 1]) {
                    int temp = randomNumbers[j];
                    randomNumbers[j] = randomNumbers[j + 1];
                    randomNumbers[j + 1] = temp;
                }
                iterationCount++;
            }
            iterationCount++;
        }
        return iterationCount;
    }
}
