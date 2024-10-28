package homework_33.toDoListe;

import classwork_33.coffee_maschine.Coffee;

import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        System.out.println("Welcome to ToDoList APP!");
        boolean flag = true;

        Menu[] options = Menu.values();

        Scanner scanner = new Scanner(System.in);
        while (flag) {
            System.out.println("Press button: ");

            Menu.printMenu();

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Add Task to ToDoList ");
                    // -> addTask метод добавления
                }
                case 2 -> {
                    System.out.println("View all tasks");
                    // -> viewTask метод вывода всех задач
                }
                case 3 -> {
                    System.out.println("Delete task ");
                    // -> deleteTask метод добавления
                }
                case 4 -> flag = false;
                default -> System.out.println("Exit");

            }


        }//end of while
    }//end of main
}// end of class
