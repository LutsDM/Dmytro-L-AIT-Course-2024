package homeWork13;
// У вас есть массив банковских переводов клиента.
// Определите следующие закономерности и аномалии:
// - регулярные транзакции
// - аномально большие для пользователя транзакции


public class Presents {
    public static void main(String[] args) {
        double[] Array = { 450, 700, 65.50, 80, 10000, 12.50, 450 , 432, 95, 120, 80, 450, 23000, 1.25, 65.50, 450, 65, 23, 87.32, 87.90, 450, 1, 67, 450, 35000, 78, 450, 65, 100, 101, 65, 450 };

        double[] elementsArray = ArrayMethods.arrayOfUniqueElements(Array);
        System.out.println("количество групп: " + elementsArray.length);
        System.out.println("-------------------------------");
        System.out.println("Unique age groups: ");
        ArrayMethods.printArray(elementsArray);

        double[] ageCount = ArrayMethods.countingOfEachElement(Array, elementsArray);
        ArrayMethods.printArray(ageCount);
    }
}
