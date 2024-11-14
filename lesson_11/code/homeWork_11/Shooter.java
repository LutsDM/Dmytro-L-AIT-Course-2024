package homeWork_11;

import java.util.Random;

//У стрелка есть 10 попыток поразить мишень. Смоделируйте 10 выстрелов с помощью датчика случайных чисел.
// Ответьте на вопрос, сколько очков набрал стрелок? Попал ли он хоть раз в центр мишени?
public class Shooter {
    public static void main(String[] args) {

        Random random = new Random();

        int[] shots = new int[10];
        int totalPoints = 0;
        boolean center = false;


        System.out.print("Hits: ");
        for (int i = 0; i < shots.length; i++) {
            shots[i] = random.nextInt(10) + 1;  //Filling an array with 20 random numbers from 1 to 10

            System.out.print(shots[i] + " "); //print hits

            totalPoints += shots[i]; //calculate hits

            if (shots[i] == 10) { //hit the center
                center = true;
            }
        }

        System.out.println();
        System.out.println("Total points: " + totalPoints);

        if (center) {
            System.out.println("Hit the center of the target.");
        } else {
            System.out.println("The shooter missed the center of the target.");
        }


    }
}
