package homework_27.marathon.items_delivery;

import homework_27.marathon.items_delivery.dao.Delivery;
import homework_27.marathon.items_delivery.dao.DeliveryImpl;
import homework_27.marathon.items_delivery.entity.Item;
import homework_27.marathon.items_delivery.entity.Pizza;
import homework_27.marathon.items_delivery.entity.SushiSet;
import homework_27.marathon.items_delivery.entity.Drink;

public class DeliveryAppl {
    public static void main(String[] args) {

        Item[] items = new Item[6];
        Delivery delivery = new DeliveryImpl(7);

        items[0] = new Pizza(1000_100001L, "Paperony", 7.50, 32, false);
        items[1] = new Pizza(1000_100021L, "Paperony", 10.50, 45, true);
        items[2] = new SushiSet(1000_100010L, "Namayori", 15.90, 9, true);
        items[3] = new SushiSet(1000_100002L, "YokoOno", 12.99, 9, false);
        items[4] = new Drink(1001_100005L, "Coca_Cola", 1.25, 0.5, false);
        items[5] = new Drink(1001_100007L, "Beer", 1.35, 0.5, true);

        for (Item item : items) {
            delivery.addItem(item);
        }

        System.out.println("All items in the delivery:");
        delivery.printItem();
        System.out.println("Total quantity: " + delivery.quantity());
        System.out.println("----------------------------");

        // Добавление нового товара
        Item newItem = new Pizza(1000_100023L, "Margarita", 8.50, 30, false);
        delivery.addItem(newItem);

        System.out.println("Delivery with new items:");
        delivery.printItem();
        System.out.println("Total quantity: " + delivery.quantity());
        System.out.println("----------------------------");

        // Поиск товаров по названию
        System.out.println("\nItems with name 'Paperony':");
        Item[] itemsByName = delivery.findItemsByName("Paperony");
        for (Item item : itemsByName) {
            System.out.println(item);
        }

        // Удаление товара по ID
        System.out.println("\nRemoving item with ID 1000_100002:");
        delivery.removeItem(1000_100002L);
        delivery.printItem();

        // Вывод максимальной и минимальной скидки
        System.out.println("\nItem with maximum discount: " + delivery.findMaxDiscount());
        System.out.println("Item with minimum discount: " + delivery.findMinDiscount());

        // Общая сумма скидок
        System.out.println("Total discount: " + delivery.totalDiscount());
    }
}

