package homework_27.marathon.computer_shop.test;

import ait.employee.model.Employee;
import ait.employee.model.Worker;
import homework_27.marathon.computer_shop.dao.Store;
import homework_27.marathon.computer_shop.dao.StoreImpl;
import homework_27.marathon.computer_shop.entity.Computer;
import homework_27.marathon.computer_shop.entity.Laptop;
import homework_27.marathon.computer_shop.entity.Smartphone;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class StoreImplTest {

    Store store;
    Computer[] computers;

    @BeforeEach
    void setUp() {
        store = new StoreImpl(7);
        computers = new Computer[6];

        computers[0] = new Computer(000_000_000_1L, "ASUS", 1500,2);
        computers[1] = new Laptop(000_000_000_2L, "Fujitsu", 2500,0);
        computers[2] = new Laptop(000_000_000_3L, "HP", 1600,5);
        computers[3] = new Computer(000_000_000_4L, "ASUS", 2500,0);
        computers[4] = new Smartphone(000_000_000_5L, "Iphone", 950,10);
        computers[5] = new Computer(000_000_000_6L, "ASUS", 2000,0);

        for (int i = 0; i < computers.length; i++) {
            store.addComputer(computers[i]);
        }
    }

    @Test
    void addComputerTest() {
        assertEquals(6, store.size());
        assertFalse(store.addComputer(null));
        Computer newComp = new Computer(000_000_000_7L, "AS", 2500,0);
        assertTrue(store.addComputer(newComp));
        assertEquals(7, store.size());
        Computer oneMoreComp = new Computer (000_000_000_7L, "SUS", 900,0);
        assertFalse(store.addComputer(oneMoreComp));
    }

    @Test
    void removeComputerTest() {
        assertEquals(computers[1], store.removeComputer(000_000_000_2L));
        assertEquals(5, store.size());
    }

    @Test
    void sizeTest() {
        assertEquals(6, store.size());
    }

    @Test
    void printComputerTest() {
        store.printComputer();
    }

    @Test
    void computersAtDiscountsTest() {
        Computer[] expected = {computers[0], computers[2], computers[4]};
        Computer[] actual = store.computersAtDiscounts();
        assertArrayEquals(expected, actual);
    }
}