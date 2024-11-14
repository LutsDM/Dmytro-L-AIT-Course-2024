package homeWork10;
//Заполнить массив четными числами от 0 до 50. 0, 2, 4, 8, ... , 42, 44, 48, 50
//Распечатать массив в порядке возрастания, затем в порядке убывания.
public class EvenNumbersArray {
    public static void main(String[] args) {

        int[] evenNumbers = new int[26]; // 0 + 25 numbers = 26 length

        System.out.print("Ascending order: ");
        for (int i = 0; i < evenNumbers.length; i++) {
            evenNumbers[i] = i * 2;
            System.out.print(evenNumbers[i] + " ");
        }

        System.out.println();

        System.out.print("Descending order: ");
        for (int i = evenNumbers.length - 1; i >= 0; i--) {
            System.out.print(evenNumbers[i] + " ");
        }

    }
}
