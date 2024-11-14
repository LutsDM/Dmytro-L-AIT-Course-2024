package homeWork09;
/*Написать программу-бот, который помогает выбрасывать мусор в баки разных цветов:
упаковки в желтый бак
пищевые отходы в коричневый бак
бумага в зеленый бак
прочие отходы в черный бак
Используйте цифры для кодирования вариантов действий.
 */

import java.util.Scanner;
public class TrashBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the type of waste being disposed of (1 - packaging, 2 - food waste, 3 - paper, 4 - other waste) :");
        int typeOfWaste = scanner.nextInt();

        switch (typeOfWaste){
            case 1 -> System.out.println("Waste disposed of in the yellow bin.");
            case 2 -> System.out.println("Waste disposed of in the brown bin.");
            case 3 -> System.out.println("Waste disposed of in the green bin.");
            case 4 -> System.out.println("Waste disposed of in the black bin.");
            default -> System.out.println("Input wrong!");


        }

    }

}
