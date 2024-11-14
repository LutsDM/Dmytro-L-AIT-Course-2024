package classwork_42.MapExamples;

import java.util.HashMap;
import java.util.Map;

public class WordsFrequancyAppl {
    public static void main(String[] args) {
        String[] words = {"a", "abc", "ab", "limit", "ab", "a", "ab", "limit", "a", "a", "a"};

        printWordFrequency(words);

    }

    private static void printWordFrequency(String[] words) {
        // Key - Это слово, value - это сколько раз оно попалось в массив
        Map< String , Integer > resultMap = new HashMap<>();


        for (String word : words) {
        if(!resultMap.containsKey(word)) {
            resultMap.put(word, 1);
        } else {
            resultMap.put(word, resultMap.get(word) +1);
        }
        }


        //print

        for (String word : resultMap.keySet()) {
            System.out.println("Word: " + word + ", frequency: " + resultMap.get(word)
            );

        }





    }

}
