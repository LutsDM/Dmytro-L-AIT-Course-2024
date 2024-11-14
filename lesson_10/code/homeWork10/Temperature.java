package homeWork10;
//Собрать в массив данные о дневной температуре в вашем городе да прошедшую неделю.
// Выведите на печать температуру, которая была во вторник и затем в четверг.
// Найти среднюю температуру за прошлую неделю.
public class Temperature {
    public static void main(String[] args) {

        int[] temperature = {18, 19, 20, 21, 16, 18, 20};

        int sumTemp = 0;

        //for (int i = 0; i < temperature.length; i++) {}

        System.out.println("Temperature on Tuesday: " + temperature[1]);
        System.out.println("Temperature on Thursday: " + temperature[3]);

        for (int i = 0; i < temperature.length; i++) {
            sumTemp = sumTemp + temperature[i];
        }

        double averageTemp = (double) sumTemp / temperature.length;
        System.out.printf("Average temperature for the week: %.2f%n", averageTemp);

    }
}
