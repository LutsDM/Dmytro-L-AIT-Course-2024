package homeWork17.ReviewTasks;

import java.util.Scanner;

//**Задача 5.**
//Программа просит пользователя ввести строку
//“/|\’Hello’ ‘World’\|/ @*#&$%^_+-{[xx]} !”
//Если пользователь вводит строку правильно, то программа распечатывает на экран благодарность и завершает работу.
//Если вводится неверная строка, то программа просит ввести строку снова, до тех пор, пока у пользователя это не получится.
//Дополнительно: считать кол-во попыток, которые потребовались пользователю для введения правильной строки.
//По окончанию - вывести число попыток на экран.
public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input password:");
        String pass = scanner.nextLine();

        boolean flag = true;
        int count = 0;

        while (flag) {
            count++;
            if (pass.equals("/|\\’Hello’ ‘World’\\|/ @*#&$%^_+-{[xx]} !")) {
                System.out.println("Congratulations! You did it!");
                flag = false;
            } else {
                System.out.println("Uppps. Wrong Input. Try again");
                System.out.println("Input password:");
                pass = scanner.nextLine();
            }
        }

        System.out.println("Sum of attempts: " + count);
    }
}
