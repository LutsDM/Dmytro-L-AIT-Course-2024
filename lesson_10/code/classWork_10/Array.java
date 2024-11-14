package classWork_10;

//Создайте массив и заполните его целыми числами от 1 до 20.

public class Array {
    public static void main(String[] args) {

        int[] numbers = new int[20];

        //numbers[0] - 1st element of array
        //numbers[numbers .length - 1]

        // fill in
        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = i + 1;
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        //print array numbers
        for (int i = 0; i < numbers.length; i++) {

            System.out.print(numbers[i] + " ");
        }



    }//end of main
}//end of class
