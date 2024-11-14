package homeWork_11;
//Написать метод, принимающий массив целых чисел, и возвращающий среднее арифметическое всех его элементов.
// Проверьте его работу на массиве ageOfGroup = {47, 49, 37, 47, 52, 60, 44, 34, 38, 59, 18, 38, 35, 41, 18, 43};
public class Average {
    public static void main(String[] args) {

        int[] numbers = {47, 49, 37, 47, 52, 60, 44, 34, 38, 59, 18, 38, 35, 41, 18, 43};

        double avg = averageCalculate(numbers);

        System.out.println("Average: " + avg);

    }


    private static double averageCalculate(int[] numbers) {
        int sum = 0;


        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.length;
    }
}
