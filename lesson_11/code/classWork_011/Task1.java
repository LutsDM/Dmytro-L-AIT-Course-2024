package classWork_011;

public class Task1 {
    public static void main(String[] args) {

        int[] array = { 75, 34, -15, -123, 57, -145, 86, 77, -145, 48, -59, -145};

        int minOfArray = array[0]; // guess
        int indexOfMinElement = 0; // guess

        for (int i = 0; i < array.length; i++) {

            if (array[i] <= minOfArray) {
                minOfArray = array[i];
                indexOfMinElement = i;

            }

        }

        System.out.println("Min element of array = " + minOfArray + ", index of min element = " + indexOfMinElement);

        int maxOfArray = array[0]; // guess
        int indexOfMaxElement = 0; // guess

        for (int i = 0; i < array.length; i++) {

            if (array[i] > maxOfArray) {
                maxOfArray = array[i];
                indexOfMaxElement = i;

            }


        }

        System.out.println("Max element of array = " + maxOfArray + ", index of max element = " + indexOfMaxElement);
    
        
    }
}
