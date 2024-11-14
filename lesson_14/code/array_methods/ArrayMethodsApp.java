package array_methods;

public class ArrayMethodsApp {
    public static void main(String[] args) {
    // create array with random numbers
        int[] myArray = ArrayMethods.fillArray(0,100,10);
    //print array
    ArrayMethods.printArray(myArray);

    //sort array
    ArrayMethods.bubbleSort(myArray);

    //print array
    ArrayMethods.printArray(myArray);



    }
}

        /* int[] myArray = {10, 20, 30, 40, 50, 60};
        System.out.println(ArrayMethods.linearSearch(myArray, 3));
        System.out.println(ArrayMethods.linearSearch(myArray, 10));

        System.out.println("--------------------------------------");

        int index = ArrayMethods.binarySearch(myArray, 58);
        System.out.println(index);

        System.out.println("---------------------------------------");


        //Task01
        int[] newArray = ArrayMethods.copyOfArray(myArray, 4);
        ArrayMethods.printArray(newArray);

    }

    }

         */

