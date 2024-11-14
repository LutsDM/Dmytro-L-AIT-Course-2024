package homework_26.spare_parts_store.test;

import homework_26.spare_parts_store.dao.Stock;
import homework_26.spare_parts_store.dao.StockImpl;
import homework_26.spare_parts_store.model.Detail;
import homework_26.spare_parts_store.model.Gear;
import homework_26.spare_parts_store.model.Lever;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockImplTest {

    Stock stock;
    Detail[] details;

    @BeforeEach
    void setUp() {
        stock = new StockImpl(5);
        details = new Detail[4];
        details[0] = new Gear(11_101L,15, "metal","V1",10,2,5);
        details[1] = new Gear(11_102L,12, "metalvv","V2",10,2,5);
        details[2] = new Lever(11_103L,10,"metalbv","V2",10,12);
        details[3] = new Lever(11_104L,15,"metal","V1",10,2);

        for (Detail detail : details) {
            stock.addDetail(detail);
        }

    }

    @Test
    void addDetailTest() {
        assertFalse(stock.addDetail(null));
        assertFalse(stock.addDetail(details[2]));
        Detail newDetail = new Gear(11_105L,9, "metalvv","V2",450,2,5);
        assertTrue(stock.addDetail(newDetail));
        assertEquals(5, stock.size());
        Detail oneMoreDetail = new Gear(11_106L,90, "metalvv","V2",450,2,5);
        assertFalse(stock. addDetail(oneMoreDetail));

    }

    @Test
    void findDetailTest() {
        assertEquals(details[1], stock.findDetail(11_102L));
        assertNull(stock.findDetail(999L));
    }

    @Test
    void updateDetailTest() {
        Detail newDetail = new Gear(11_101L,9, "metalvv","V2",450,2,5);
        assertEquals(details[0], stock.updateDetail(newDetail));

    }

    @Test
    void removeDetailTest() {
        assertEquals(details[1], stock.removeDetail(11_102L));
        assertEquals( 3, stock.size());
        assertNull(stock.removeDetail(11_102L));
    }

    @Test
    void totalWeightTest() {
        assertEquals(40, stock.totalWeight(details));
    }

    @Test
    void averageWeightTest() {
        assertEquals(10, stock.averageWeight(details));
    }

    @Test
    void sizeTest(){
        assertEquals(4, stock.size());
    }
}