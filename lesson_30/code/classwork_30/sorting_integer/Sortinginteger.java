package classwork_30.sorting_integer;

import java.util.Arrays;

public class Sortinginteger {
    public static void main(String[] args) {

        Integer[] numbers = {
                - 100,
                2,
                Integer.MAX_VALUE,
                2,
                15, 35,
                Integer.MIN_VALUE,
                71
        };
        Arrays.sort(numbers, (n1, n2) ->  Integer.compare(n2, n1));
        System.out.println(Arrays.toString(numbers));

        //for each
        for (Integer i : numbers) {
            System.out.print(i + " ");
        }



    }
}
