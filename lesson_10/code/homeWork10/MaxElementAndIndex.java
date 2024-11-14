package homeWork10;
//Задан массив целых чисел: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38.
//Найдите максимальный элемент массива и его индекс.
public class MaxElementAndIndex {
    public static void main(String[] args) {

        int[] randomArray = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};

        int max = 0;
        int index = 0;

        System.out.print("Maximal number: ");
        for (int i = 0; i < randomArray.length; i++) {

            if (randomArray[i] > max) {
                max = randomArray[i];
                index = i;
            }
        }


        System.out.println(max);
        System.out.println("Index of max number: " + index);

    }

}
