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

import static java.awt.SystemColor.text;

public class MamaMylaRamu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your sentence: ");
        String str = scanner.nextLine();

        System.out.println("-----------------------------------------");

        //print the number of characters
        System.out.printf("The sentence '%s' has %d characters", str, str.length());

        System.out.println();

        //found the number of uppercase letters
        int numberOfUppercaseCharacters = countUPChar(str);
        System.out.printf("The sentence '%s' has %d uppercase letters", str, numberOfUppercaseCharacters);

        System.out.println();

        //found the number of digits in the sentence
        int numberOfDigits = countDigits(str);
        System.out.printf("The sentence '%s' has %d digits", str, numberOfDigits);

        System.out.println();

        //number of spaces in the sentence
        // можно найти через метод isSpaceChar класса-обертки Character
        int numberOfSpacesWrapper = countSpaces1(str);
        System.out.printf("The sentence '%s' has %d spaces (wrapper):", str, numberOfSpacesWrapper);
        System.out.println();

        // или через поиск значения пробела в системе ascii
        int numberOfSpacesAscii = countSpaces2(str);
        System.out.printf("The sentence '%s' has %d spaces (ascii):", str, numberOfSpacesAscii);
        System.out.println();

        //definition of sentence type
        char lastChar = str.charAt(str.length() - 1);
        String type = "";
        if (Character.compare(lastChar, '?') == 0) {
            type = "interrogative";
        } else if (Character.compare(lastChar, '!') == 0) {
            type = "exclamatory";
        } else {
            type = "declarative";
        }

        System.out.printf("The sentence '%s' is %s", str, type);
    }

    private static int countUPChar(String str) {  //method to count uppercase letters in a String
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                count++;
            }
        }
        return count;

    }


    private static int countDigits(String str) {  //method to count digits in a String
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }
        return count;

    }

    //wrapper
    private static int countSpaces1(String str) {  //method to count spaces in a String
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isSpaceChar(str.charAt(i))) {
                count++;
            }
        }
        return count;

    }

    //ascii
    private static int countSpaces2(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 32) {
                count++;
            }
        }
        return count;
    }
}