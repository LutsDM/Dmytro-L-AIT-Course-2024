package classWork12.array_methods;
//  - заполнение массива случайными целыми числами из интервала от a до b +
//  - печать массива целых чисел +
//  - поиск элемента
public class ArrayMethods {

    // fill array
    //a - left border, b - right, n - quantity
    public static int[] fillArray(int a, int b, int n) {
        int[] res = new int[n];
        for (int i = 0; i < res.length; i++) {
            res[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        return res;
    }

    //fill array double
    public static double[] fillArray(double a, double b, int n) {
        double[] res = new double[n];
        for (int i = 0; i < res.length; i++) {
            res[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        return res;
    }

    // print array int
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("------------------------------------");

    }

    // search in array
    public static boolean searchInArray(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return true;
            }
        }
        return false;
    } // end of method

    //calculatePercent
    public static double[] calculatePercent(int[] array, double x) {
        double[] res = new double[array.length];

        for (int i = 0; i < array.length; i++) {
            res[i] = array[i] * (1 + x / 100);
        }
        return res;
    }

    // print array double
    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("  %.2f", array[i]);
        }
        System.out.println();
        System.out.println("------------------------------------");

    }


    //summation of the elements of the array
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    //calculation of the average of the elements of the array.
    public static double averageValue(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        return (double) sum / array.length;
    }
}