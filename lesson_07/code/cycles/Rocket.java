package cycles;

public class Rocket {
    public static void main(String[] args) {

        //задаем начальные условия
        int countDown = 10;
        System.out.println("We have" + countDown + "sec before start");

        while (countDown > 0){
            countDown--;
            System.out.println("We have " + countDown + " till start");
        }

        System.out.println("Go!");
    }
}
