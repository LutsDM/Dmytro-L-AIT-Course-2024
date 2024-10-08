package homeWork_18;

import java.util.Scanner;

//Реализовать приложение, которое запрашивает информацию о вас, и выводит итоговую строку.
//Пример:
//Введите ваше имя:
//Иван
//Введите вашу фамилию:
//Иванов
//Введите ваш город:
//Берлин
//Введите ваш возраст:
//29
//Введите ваш рост (в метрах):
//1.80
//Вывод в консоль:
//Меня зовут Иван Иванов, мне 29 лет, мой город Берлин, мой рост 180 см.
public class InputYourName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Input your last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Input your city: ");
        String city = scanner.nextLine();

        System.out.println("Input your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your height (in meters): ");
        double height = scanner.nextDouble();

        System.out.printf("Меня зовут %s %s , мне %d лет, мой город %s, мой рост %d см. %n", firstName, lastName, age
                , city,(int)(height * 100));
    }
}
