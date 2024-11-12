package homework_44.containers_and_parcels;
//Создайте класс Container с полями: String label (маркировка) и List - список коробок с посылками.
// Создайте класс Box с полем: List - список посылок. Классы Container и Box являются итерируемыми.
// Создайте класс Parcel (посылка) с полем double weight - вес посылки. Создайте класс ShipmentAppl с методом main.
// Задумайте случайное количество контейнеров (от 10 до 20). В каждом контейнере задумайте случайное количество коробок (от 10 до 20).
// В каждой коробке задумайте случайное количество посылок (от 5 до 10). Предположим, что каждая посылка в среднем имеет вес = 2 кг.
//
//Подсчитайте общее количество посылок во всех ящиках и их общий вес. Найдите label того из контейнеров,
// в котором оказалось максимальное количество посылок. Найдите все контейнеры с максимальным количеством посылок.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ShipmentAppl {
    private static final int MIN_CONTAINER = 10;
    private static final int MAX_CONTAINER = 20;
    private static final int MIN_BOX = 10;
    private static final int MAX_BOX = 20;
    private static final int MIN_PARCEL = 5;
    private static final int MAX_PARCEL = 10;
    private static final double WEIGHT_PARCEL = 2.0;
    private static final Random random = new Random();

    public static void main(String[] args) {
        //Заполняем список контейнеров а значит и список коробок и посылок в них
        List<Container> containers = fillRandomContainers();

        //Достаем значения общего количества посылок, метод которого у нас лежит в классе Контейнер
        int totalParcels = containers.stream().mapToInt(Container::getTotalParcels).sum();

        //примитивно считаем вес всех посылок
        double totalWeight = totalParcels * WEIGHT_PARCEL;

        //все при помощи того же getTotalParcels находим контейнер с максимальным количеством посылок
        int maxParcels = containers.stream()
                .mapToInt(Container::getTotalParcels)
                .max()
                .orElse(0);

        //собираем лист со всеми контейнерами в которых количество посылок равно максимальному
        List<Container> maxParcelContainers = containers.stream()
                .filter(c -> c.getTotalParcels() == maxParcels)
                .collect(Collectors.toList());

        //все печатаем
        System.out.println("Total number of parcels: " + totalParcels);
        System.out.println("Total weight of parcels: " + totalWeight + " kg");
        System.out.println("Container(s) with max parcels:");
        maxParcelContainers.forEach(c -> System.out.println("Label: " + c.getLabel() + ", Parcels: " + c.getTotalParcels()));



    }//end of main

    //методы генерации посылка-коробка-контейнер работают по принципу "Матрешки". Сначала создаем рондомное количество
    // контейнеров. В каждом контейнере рандомное количество коробок, сгенерированном на методе следующего уровня
    // Матрешки

    private static List<Container> fillRandomContainers() {
        int containerCount = random.nextInt(MAX_CONTAINER - MIN_CONTAINER + 1) + MIN_CONTAINER; //от 10 до 20 конт
        List<Container> containers = new ArrayList<>();
        for (int i = 0; i < containerCount; i++) {
            String label = "Container" + (i + 1); //маркируем контейнеры по порядку
            List<Box> boxes = fillRandomBoxes(); //количество коробок рандомяться в след методе
            containers.add(new Container(label, boxes));// циклом "укладываем" в список контейнеров маркированные
            // контейнеры с рандомным количеством коробок
        }
        return containers;
    }

    //середина Матрешки. Генерим количество коробок для контейнеров из рандомного количества посылок определенного в
    // следующем методе.
    private static List<Box> fillRandomBoxes() {
        int boxCount = random.nextInt(MAX_BOX - MIN_BOX + 1) + MIN_BOX;
        List<Box> boxes = new ArrayList<>();
        for (int i = 0; i < boxCount; i++) {
            List<Parcel> parcels = fillRandomParcels();
            boxes.add(new Box(parcels));
        }
        return boxes;
    }

    //Генерим для боксов посылки по 2 кг в рандомном порядке
    private static List<Parcel> fillRandomParcels() {
        int parcelCount = random.nextInt(MAX_PARCEL - MIN_PARCEL + 1) + MIN_PARCEL;
        List<Parcel> parcels = new ArrayList<>();
        for (int i = 0; i < parcelCount; i++) {
            parcels.add(new Parcel(WEIGHT_PARCEL));
        }
        return parcels;
    }


}//end of class
