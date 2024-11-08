package homework_42;
// В классе DigitsFreqApp сгенерировать один миллион положительных целых чисел в интервале от 100 до 1000, и подсчитать частоту встречаемости цифр в этих числах.

import java.util.*;

public class DigitsFreqApp {
    private static final int N_NUMBERS = 1_000_000;
    private static final Random random = new Random();
    private static final int MIN = 100;
    private static final int MAX = 1000;

    public static void main(String[] args) {

        List<Integer> randomList = new ArrayList<>();

        fillList(randomList);

        Map<Integer, Integer> randomMap = new HashMap<>();

        for (Integer integer : randomList) {
            if(!randomMap.containsKey(integer)){
                randomMap.put(integer, 1);
            } else {randomMap.put(integer, randomMap.get(integer)+1); }
        }

        for (Integer integer : randomMap.keySet()) {
            System.out.println("Integer: " + integer + ", frequency: " + randomMap.get(integer)
            );

        }



    }//end of main

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < N_NUMBERS; i++) {
            list.add(random.nextInt(MIN, MAX));
        }


    }


}
