package homeWork15;

import java.util.Locale;

//Дана строка "I'm proud to learn Java! Java is the most famous programming language!!!"
// Выполнить практикум с этой строкой:
//
//Распечатать последний символ строки.
//Найти позицию подстроки “Java” в строке.
//Проверить, содержит ли заданная строка подстроку “Java”.
//Заменить все символы “o” на “a”.
//Преобразуйте строку к верхнему регистру.
//Преобразуйте строку к нижнему регистру.
//Вырезать подстроку Java c помощью метода substring().
//Проверить, заканчивается ли строка подстрокой “!!!”.
//Проверить, начинается ли строка подстрокой “I'm proud”.
public class Task01 {
    public static void main(String[] args) {

        String str = "I'm proud to learn Java! Java is the most famous programming language !!!";

        // last char
        char lastCh = str.charAt(str.length() -1);
        System.out.println("Last ch is: " + lastCh);

        //substring Java
        int indexJ = str.indexOf('J');                  //Beginning of a substring
        System.out.println("Index ch J: " + indexJ + ". Index of 'Java' is: " + indexJ + " - " + (indexJ+4));

        //check Java in str
        boolean containsJava = str.contains("Java");
        System.out.println("String str contain 'Java'? " + containsJava);

        //Replace all characters "o" with "a".
        String replacedStr = str.replace('o', 'a');
        System.out.println("String after replacing 'o' with 'a': " + replacedStr);

        //Convert the string to uppercase.
        str = str.toUpperCase();
        System.out.println("String to uppercase: " + str);

        //Convert the string to lowercase.
        str = str.toLowerCase();
        System.out.println("String to lowercase: " + str);

        //Cut the substring "Java" using the substring() method.
        String strCut = str.substring(19,23);
        System.out.println("Cut substring: " + strCut);

        //Check if the string ends with the substring "!!!".
        boolean checker = str.contains("!!!");
        System.out.println("Does string contain '!!!': " + checker );

        //Check if the string starts with the substring "I'm proud".
        boolean startsWithProud = str.startsWith("I'm proud");
        System.out.println("Does the string start with 'I'm proud': " + startsWithProud); //false т.к. мы меняли регистр в предыдущем задании


    }
}


