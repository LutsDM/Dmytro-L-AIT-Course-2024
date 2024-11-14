package homeWork13;

public class ArrayMethods {

    // search in String
    public static String[] stringMaxMin(String[] myArray){
        String max = myArray[0];
        String min = myArray[0];

        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i].length() < min.length()) {
                min = myArray[i];
            }
            if (myArray[i].length() > max.length()) {
                max = myArray[i];
            }
        }
        return new String[]{min, max};
    }

    // counting the occurrence of each element in an array
    public static int[] countingOfEachElement(int[] myArray, int[] elementsArray) {
        int[] count = new int[elementsArray.length];
        for (int i = 0; i < elementsArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                if (elementsArray[i] == myArray[j]) {
                    count[i]++;
                }
            }
        }
        return count;
    }

    // counting the occurrence of each element in an array
    public static double[] countingOfEachElement(double[] myArray, double[] elementsArray) {
        double[] count = new double[elementsArray.length];
        for (int i = 0; i < elementsArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                if (elementsArray[i] == myArray[j]) {
                    count[i]++;
                }
            }
        }
        return count;
    }

    // Array of unique elements
    public static double[] arrayOfUniqueElements(double[] myArray) {
        double[] tempArray = new double[myArray.length]; // Initialize a temporary array
        int count = 0;

        for (int i = 0; i < myArray.length; i++) { // Loop through the original array:
            boolean unique = true;
            for (int j = 0; j < count; j++) { // Check if the element is unique:
                if (myArray[i] == tempArray[j]) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                tempArray[count] = myArray[i]; // Add the unique element to the temporary array:
                count++;
            }
        }

        double[] elementsArray = new double[count];
        for (int i = 0; i < count; i++) { // Transfer the unique elements to a new array:
            elementsArray[i] = tempArray[i];
        }

        return elementsArray; // Return the array of unique elements
    }
    // Array of unique elements
    public static int[] arrayOfUniqueElements(int[] myArray) {
        int[] tempArray = new int[myArray.length]; // Initialize a temporary array
        int count = 0;

        for (int i = 0; i < myArray.length; i++) { // Loop through the original array:
            boolean unique = true;
            for (int j = 0; j < count; j++) { // Check if the element is unique:
                if (myArray[i] == tempArray[j]) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                tempArray[count] = myArray[i]; // Add the unique element to the temporary array:
                count++;
            }
        }

        int[] elementsArray = new int[count];
        for (int i = 0; i < count; i++) { // Transfer the unique elements to a new array:
            elementsArray[i] = tempArray[i];
        }

        return elementsArray; // Return the array of unique elements
    }




    // Copy of array
    public static int[] copyOfArray(int[] array, int newLength) {
        int[] newArray = new int[newLength];

        for (int i = 0; i < newLength; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    // Binary search
    public static int binarySearch(int[] array, int n) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;

        while (leftIndex <= rightIndex) {
            int midIndex = (leftIndex + rightIndex) / 2;
            if (array[midIndex] == n) {
                return midIndex;
            } else if (n < array[midIndex]) {
                rightIndex = midIndex - 1; // Discard the right half
            } else {
                leftIndex = midIndex + 1; // Discard the left half
            }
        }
        return -leftIndex - 1; // Element not found
    }

    // Linear search, return index (if element is absent return -1)
    public static int linearSearch(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return i;
            }
        }
        return -1;
    }

    // Fill array with random int values
    public static int[] fillArray(int a, int b, int n) {
        int[] res = new int[n];
        for (int i = 0; i < res.length; i++) {
            res[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        return res;
    }

    // Fill array with random double values
    public static double[] fillArray(double a, double b, int n) {
        double[] res = new double[n];
        for (int i = 0; i < res.length; i++) {
            res[i] = Math.random() * (b - a + 1) + a;
        }
        return res;
    }

    // Print array of integers
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("------------------------------------");
    }

    // Print array of doubles
    public static void printArray(double[] array) {
        for (double i : array) {
            System.out.printf("%.2f ", i);
        }
        System.out.println();
        System.out.println("------------------------------------");
    }

    // Summation of array elements
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    // Calculate average of array elements
    public static double averageValue(int[] array) {
        int sum = sumArray(array); // Using the sumArray method
        return (double) sum / array.length;
    }

    // Calculate percentage increase for each element in the array
    public static double[] calculatePercent(int[] array, double x) {
        double[] res = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            res[i] = array[i] * (1 + x / 100);
        }
        return res;
    }

    // Search for an element in the array
    public static boolean searchInArray(int[] array, int n) {
        for (int i : array) {
            if (i == n) {
                return true;
            }
        }
        return false;
    }
}
