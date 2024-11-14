package homework_36;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class FirstArrayList {
    public static void main(String[] args) {

            //Task 1
        List<Character> alphabet = new ArrayList<>();
        for (int i = 65; i < 91; i++) {
            alphabet.add((char)i);
        }
        System.out.println(alphabet);

            //Task 2
        List<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            randomNumbers.add(random.nextInt(10) + 1);
        }

        List<Integer> uniqueNumbers = removeDuplicates(randomNumbers);

        System.out.println(uniqueNumbers);


    }

    public static  List<Integer>  removeDuplicates (List<Integer> randomNumbers) {
        Collections.sort(randomNumbers);
        List<Integer> uniqueNumbers = new ArrayList<>();

        for (int i = 0; i < randomNumbers.size(); i++) {
            if (i == randomNumbers.size() - 1 || randomNumbers.get(i) != randomNumbers.get(i + 1)) {
                uniqueNumbers.add(randomNumbers.get(i));
            }
        }
        return uniqueNumbers;
    }





}
