import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        boolean tryAgain = true;
        Scanner scanner = new Scanner(System.in);

        while (tryAgain) {
            int hiddenNumber = (int) (Math.random() * 100) + 1;
            System.out.println("Guess the number from 1 to 100.");
            System.out.println("You have 5 attempts.");

            int count = 0;
            int number = 0;
            boolean validInput = false;

            while (count < 5) {
                do {
                    System.out.println("Input your number: ");
                    if (scanner.hasNextInt()) {
                        number = scanner.nextInt();
                        if (number >= 1 && number <= 100) {
                            validInput = true;
                        } else {
                            System.out.println("The number must be between 1 and 100.");
                            validInput = false;
                        }
                    } else {
                        System.out.println("Invalid input! Please enter a number between 1 and 100.");
                        scanner.next();
                        validInput = false;
                    }
                } while (!validInput);

                count++;

                if (number > hiddenNumber) {
                    System.out.println("Too big!");
                } else if (number < hiddenNumber) {
                    System.out.println("Too small!");
                } else {
                    System.out.println("Guessed it. Congratulations.");
                    break;
                }
            }

            if (number != hiddenNumber) {
                System.out.println("I'm sorry you lost.");
            }

            System.out.println("Play again? (n,y): ");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase("n")) {
                tryAgain = false;
                System.out.println("See you later...");
            }
        }

        scanner.close();
    }
}
