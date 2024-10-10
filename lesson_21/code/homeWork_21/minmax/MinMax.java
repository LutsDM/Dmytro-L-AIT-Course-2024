package homeWork_21.minmax;

public class MinMax {

    private int[] array;

    public MinMax(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    // method to find min value
    public int findMin(int[] array) {

        if (array.length == 0) {
            System.out.println("Array is Empty.");
            return -1;
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    // method to find max value
    public int findMax(int[] array) {
        if (array.length == 0) {
            System.out.println("Array is Empty.");
            return -1;
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
