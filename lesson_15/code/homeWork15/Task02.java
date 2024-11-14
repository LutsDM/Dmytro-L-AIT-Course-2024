package homeWork15;

import java.util.Scanner;

//Напишите программу, которая запрашивает строку от пользователя и затем:
//
//сообщает сколько слов в строке
//сообщает сколько букв (символов) в строке
//печатает строку задом наперед, начиная с последнего слова.
public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your string: ");
        String str = scanner.nextLine();

        String[] words = str.split(" ");                                //split user string

        int countWords = words.length;
        System.out.println("Number of words in the string: " + countWords); //count words in the string

        int countChars = str.length();
        System.out.println("Number of chars in the string: " + countChars); //count chars in the string

        System.out.print("Reversed string: ");
        printReversedString(words);

    }

    private static void printReversedString(String[] words) {               //Method to print reversed string
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
        System.out.println();
    }
}

