package homeWork_11;
//Задан массив целых чисел: 65, 37, 51, -17, 73, -41, 52, 56, -55, 83.
// Найдите максимальный элемент массива и его индекс.
// Поставьте этот элемент в начало массива вместо имеющегося.
public class Task1 {
    public static void main(String[] args) {

        int[] numbers = {65, 37, 51, -17, 73, -41, 52, 56, -55, 83};
        int max = 0;
        int maxIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }

        }System.out.println("Maximal number is " + max);

        int temp = numbers[0];
        numbers[0] = max;
        numbers[maxIndex] = temp;

        System.out.println("New array: :");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print (numbers[i] + " ");
        }


    }
}
