package homework_27.marathon.items_delivery.dao;


import homework_27.marathon.items_delivery.entity.Item;

import java.util.Arrays;
import java.util.function.Predicate;

public class DeliveryImpl implements Delivery {

    private Item[] items;
    private int size;


    public DeliveryImpl(int capacity) {
        this.items = new Item[capacity];
        //this.size = size;
    }

    @Override
    public boolean addItem(Item item) {

        //negative cases
        if(item == null) {
            return false;
        }
        if(size == items.length){
            return false;
        }
        if (!(findItem(item.getId()) == null)){
            return false;
        }

        //positive case
        items[size++] = item;
        return true;

    }

    @Override
    public Item removeItem(long id) {

        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                Item victim = items[i];
                items[i] = items[size - 1];
                items[size - 1] = null;
                size--;
                return victim;
            }
        }

        return null;
    }

    @Override
    public Item findItem(long id) {
        for (int i = 0; i < size; i++) {
            if(items[i].getId() == id){
                return items[i];
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public void printItem() {
       Arrays.sort(items, 0, size);
        for (int i = 0; i < size; i++) {
            System.out.println(items[i]);
        }
    }

    @Override
    public double totalPrice() {
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += items[i].getPrice();
        }
        return total;
    }

    @Override
    public double totalDiscount() {
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += items[i].calcDiscount();
        }
        return Math.round(total * 100.0) / 100.0;
    }

    @Override
    public Item findMaxDiscount() {
        Item maxDiscount = items[0];
        for (int i = 0; i < size; i++) {
          if(items[i] != null && items[i].calcDiscount() > maxDiscount.calcDiscount()) {
              maxDiscount = items[i];
          }
        }
         return maxDiscount;

    }

    @Override
    public Item findMinDiscount() {
        Item minDiscount = items[0];
        for (int i = 0; i < size; i++) {
            if(items[i] != null && items[i].calcDiscount() < minDiscount.calcDiscount()) {
                minDiscount = items[i];
            }
        }
        return minDiscount;
    }

    @Override
    public Item[]findItemsByName (String name) {
        return findItemByPredicate (item -> item.getName().equals(name));
    }

    private Item[] findItemByPredicate (Predicate<Item> predicate) {
        int count  = 0;
        for (int i = 0; i < size; i++) {
            if(predicate.test(items[i])) {
                count++;
            }
        }

        Item[] res = new Item[count];
        for (int i = 0, j = 0 ; j < res.length; i++) {
            if(predicate.test(items[i])){
                res[j++] = items[i];
            }
        }
        return res;

    }
}
