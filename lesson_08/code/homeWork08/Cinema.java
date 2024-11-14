package homeWork08;

import java.util.Scanner;

//В кинотеатре есть разные типы билетов: стандартный, студенческий (-10%) и для пенсионеров(-25%).
//Каждый тип билета имеет свою стоимость. Клиент может также выбрать место в VIP-зоне, что увеличит стоимость билета на 25%.
//Создайте метод calculateTicketPrice, который принимает возраст клиента, статус студента и флаг VIP-места, а возвращает итоговую стоимость билета.
//Реализуйте приложение-бот, которое задает необходимые вопросы и объявляет стоимость билета.

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // чистим буфер, чтобы вопросы шли по очереди.

        System.out.println("Do you have a student ID? (Yes/No):");   //не переводил в int, чтобы поработать с разными класами ну и так красивее
        String studentID = scanner.nextLine();

        System.out.println("Would you like to book a VIP seat? (Yes/No):");
        String vipSeat = scanner.nextLine();

        int standartPrice = 100;

        double totalPrise = calculateTicketPrice(age, studentID, vipSeat, standartPrice);
        System.out.println(totalPrise);
    }

    private static double calculateTicketPrice(int age, String studentID, String vipSeat, int standartPrice) {

        double res = standartPrice;

        if (age > 60) {
            res = res * (1 - 0.25);                    // если клиент пенсионер -25%
        }
        if (studentID.equals("Yes")) {
            res = res * (1 - 0.10);                    // если клиент студент еще -10%
        }

        if (vipSeat.equals("Yes")) {
            res += res * 0.25;                  // +25% за вип место
        }

        return res;

    }

}
