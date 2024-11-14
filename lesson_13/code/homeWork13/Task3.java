package homeWork13;
//Задача 3(*). Написать метод, принимающий на вход массив строк.
// Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.
// Создайте массив типа String и заполните его названиями знакомых вам городов.
// Проверьте работу написанного метода на этом массиве.
public class Task3 {
    public static void main(String[] args) {
        String[] cities = {"Berlin", "Wuppertal", "München", "Hamburg", "Cologne", "Düsseldorf"};
        String[] result = ArrayMethods.stringMaxMin(cities);

        System.out.println("Shortest city: " + result[0]);
        System.out.println("Longest city: " + result[1]);

    }
}
