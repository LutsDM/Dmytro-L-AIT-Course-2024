package homeWork13;



//Подбросьте монетку 100 раз и подсчитайте, сколько раз выпал орел и сколько решка.
//Запишите результаты в массив.
//Рассчитайте вероятность выпадения орла и решки.
public class Coin {
    public static void main(String[] args) {

        int[] coinFlip = ArrayMethods.fillArray(0, 1, 100); //Generate an array of length 100 consisting of 1 and 0

        int[] sidesOfACoin = {0, 1};

        int[] cauntCoin = ArrayMethods.countingOfEachElement(coinFlip, sidesOfACoin);

        System.out.print("Number of tails: ");
        System.out.print(cauntCoin[0]);
        System.out.println();
        System.out.print("Probability of occurrence: ");
        System.out.print(((double) cauntCoin[0] / 100 ) * 100);

        System.out.println();

        System.out.print("Number of heads: ");
        System.out.print(cauntCoin[1]);
        System.out.println();
        System.out.print("Probability of occurrence: ");
        System.out.println();
        System.out.print(((double) cauntCoin[1] / 100 ) * 100);

    }
}












