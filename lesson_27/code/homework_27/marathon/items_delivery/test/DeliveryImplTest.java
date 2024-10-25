package homework_27.marathon.items_delivery.test;

import homework_27.marathon.document_archive.model.Document;
import homework_27.marathon.items_delivery.dao.Delivery;
import homework_27.marathon.items_delivery.dao.DeliveryImpl;
import homework_27.marathon.items_delivery.entity.Drink;
import homework_27.marathon.items_delivery.entity.Item;
import homework_27.marathon.items_delivery.entity.Pizza;
import homework_27.marathon.items_delivery.entity.SushiSet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryImplTest {

    Delivery delivery;
    Item[] item;


    @BeforeEach
    void setUp() {
        delivery = new DeliveryImpl(7);
        item = new Item[6];

        item[0] = new Pizza(1000_100001L, "Paperony", 7.50,32,false); //dis 0.75
        item[1] = new Pizza(1000_100021L,"Paperony",10.50, 45,true); //dis 0.525
        item[2] = new SushiSet(1000_100010L,"Namayori",15.90,9,true); // 0.795
        item[3] = new SushiSet(1000_100002L, "YokoOno",12.99,9,false); // 0.9093
        item[4] = new Drink(1001_100005L,"Coca_Cola",1.25,0.5,false); // 0.025
        item[5] = new Drink(1001_100007L,"Beer",1.35,0.5,true); // 0.027

        for (Item i : item) {
            delivery.addItem(i);
        }

    }


    @Test
    void addItemTest() {
        assertFalse(delivery.addItem(null));
        assertFalse(delivery.addItem(item[3]));
        Item newItem = new Pizza(1000_100011L, "Margarita", 5.50,32,false);
        assertTrue(delivery.addItem(newItem));
        assertEquals(7, delivery.quantity());
        Item oneMoreItem = new Pizza(1000_100001L, "Paperoni", 7.50,32,false);
        assertFalse(delivery. addItem(oneMoreItem));
    }

    @Test
    void removeItemTest() {
        assertEquals(item[2], delivery.removeItem(1000_100010L));
        assertEquals( 5, delivery.quantity());
        assertNull(delivery.removeItem(1000_100010L));
    }

    @Test
    void findItemTest() {
        assertEquals(item[2], delivery.findItem(1000_100010L));
        assertNull(delivery.findItem(7));
        }

    @Test
    void quantityTest() {
        assertEquals(6, delivery.quantity());
    }

    @Test
    void printItemTest() {
        delivery.printItem();
    }

    @Test
    void totalPriceTest() {
        assertEquals(49.49, delivery.totalPrice() );
    }

    @Test
    void totalDiscountTest() {
        assertEquals(3.07, delivery.totalDiscount());
    }

    @Test
    void findMaxDiscountTest() {
        assertEquals(item[3], delivery.findMaxDiscount());
    }

    @Test
    void findMinDiscountTest() {
        assertEquals(item[4], delivery.findMinDiscount());
    }

    @Test
    void findItemsByName() {
        Item[] expected = {item[0], item[1]};
        Item[] actual = delivery.findItemsByName("Paperony");
        assertArrayEquals(expected,actual);
    }

}