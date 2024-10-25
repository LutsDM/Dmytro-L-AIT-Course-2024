package homework_27.marathon.items_delivery.dao;

import homework_27.marathon.items_delivery.entity.Item;

public interface Delivery {

    boolean addItem (Item item);

    Item removeItem (long id);

    Item findItem (long id);

    int quantity();

    void printItem();

    double totalPrice();

    double totalDiscount();

    Item findMaxDiscount(); //best offer

    Item findMinDiscount();

    Item[] findItemsByName (String name);

}
