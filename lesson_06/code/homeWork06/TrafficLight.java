package homeWork06;

import java.util.Scanner;

//Задание 3. Напишите программу для машины на светофоре. Что делать водителю, если горит красный, жёлтый или зелёный свет.
// Цвет светофора задается в программе, затем с клавиатуры.
public class TrafficLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input traffic light color with lowercase letter: ");
        String color = scanner.nextLine();

        String takeAction = "";

        if (color.equals("red")) {
            takeAction = "stop";
        } else if (color.equals("yellow")) {
            takeAction = "caution";
        } else if (color.equals("green")) {
            takeAction = "go";
        } else {
            takeAction = "invalid color";
        }

        System.out.println(takeAction);
    }// end of mein
}// end of class
