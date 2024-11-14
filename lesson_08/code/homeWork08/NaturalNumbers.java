package homeWork08;
//Распечатайте все натуральные числа меньшие 200 и кратные 13. Используйте циклы while и do while.
public class NaturalNumbers {
    public static void main(String[] args) {

        //with while
        int number = 13;
        System.out.println("natural numbers with while: ");
        while (number < 200){
            System.out.print(number + " ");
            number += 13;
        }

        System.out.println();// просто для красоты вывода результатов с новой строки

        //with do while
        number = 13;
        System.out.println("natural numbers with do while: ");
        do {
            System.out.print(number + " ");
             number += 13;
        } while (number < 200);

        }
    }

