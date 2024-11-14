package homeWork_20;
//Задание 2. Разработайте приложение, которое принимает от пользователя строку (некое предложение, например: "Мама мыла раму.") и выводит:
//
//количество символов в строке;
//количество символов в верхнем регистре;
//количество цифр в строке;
//количество пробелов в строке (код пробела = 32);
//в зависимости от последнего символа в строке сообщает, какое это предложение:
//повествовательное;
//вопросительное;
//восклицательное. Используйте методы класса Character.

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your sentence: ");
        String str = scanner.nextLine();

        System.out.println("------------------------");
        System.out.printf("The sentence '%s' has '%d' characters", str, str.length());

        foundOfString(str);


    }

    private static void foundOfString(String str) {
        int countOfUpperCase = 0;
        int countOfDigits = 0;
        int counOfSpaces = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                countOfUpperCase++;
            }
            if (Character.isDigit(str.charAt(i))) {
                countOfDigits++;
            }
            if (Character.isSpaceChar(str.charAt(i))) {
                counOfSpaces++;
            }
        }

        System.out.println("Number of UpperCase: " + countOfUpperCase);
        System.out.println("Number of Digits:" + countOfDigits);
        System.out.println("Space" + counOfSpaces);
    }
}



