package homeWork17.ReviewTasks;

import java.util.Scanner;

//По данному числу n закончите фразу “На лугу пасется...” одним из возможных продолжений: “n коров“, “n корова“, “n коровы“,
// правильно склоняя слово “корова“.
//Входные данные: Дано целое положительное число n (n <= 10),
//Выходные данные: Программа должна вывести введенное число n и одно из слов: коров, корова или коровы, например,
// 1 корова, 2 коровы, 5 коров.
public class GrazingInTheMeadow {
    public static void main(String[] args) {

        System.out.println("На лугу пасется...");
        String declensions = "";

        Scanner scanner = new Scanner(System.in);

        boolean flag = true;

        while (flag) {
            System.out.println("Input the number of cows from 1 to 10: ");
            System.out.println("(if you want to finish, enter 0.)");
            int numbers = scanner.nextInt();

            if (numbers < 0 || numbers > 10){
                System.out.println("Wrong input. Try again.");

            } else if (numbers == 0) {
                System.out.println("Thank you for counting the cows. Please come again!");
                flag = false;

            } else {
                switch (numbers) {
                    case 1 -> declensions = "а";
                    case 2, 3, 4 -> declensions = "ы";
                    default -> declensions = "";
                }
                System.out.println("На лугу пасется " + numbers + " коров" + declensions);
                System.out.println("-----------------------------------------");
            }
        }//while
    }//end of main
}//end of class
