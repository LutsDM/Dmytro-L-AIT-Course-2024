package classwork_28.car_garage.ait.cars.test;

import classwork_28.car_garage.ait.cars.dao.Garage;
import classwork_28.car_garage.ait.cars.dao.GarageImpl;
import classwork_28.car_garage.ait.cars.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarageImplTest {

    private Garage garage;
    private Car[] cars;

    @BeforeEach
    void setUp() {

        garage = new GarageImpl(5);
        cars = new Car[4];
        cars[0] = new Car("Number1", "Model1", "Company1", 1.5, "Red");
        cars[1] = new Car("Number2", "Model2", "Company1", 2.5, "Green");
        cars[2] = new Car("Number3", "Model1", "Company2", 1.5, "Red");
        cars[3] = new Car("Number4", "Model4", "Company2", 2.0, "Green");

        // TODO add cars to garage
        for (int i = 0; i < 4; i++) {
            garage.addCar(cars[i]);
        }

    }

    @Test
    void addCarTest() {
        Car newCar = new Car("Number5", "Model5", "Company2", 2.0, "Green");
        assertTrue(garage.addCar(newCar));
        assertNotNull(garage.findCarByRegNumber(newCar.getRegNumber()));
    }

    @Test
    void removeCarTest() {
        assertEquals(cars[3],garage.removeCar("Number4"));
        assertEquals(3, garage.size());
        assertNull(garage.findCarByRegNumber("Number4"));

    }

    @Test
    void findCarByRegNumberTest() {
        assertEquals(cars[3], garage.findCarByRegNumber("Number4"));
    }

    @Test
    void findCarsByModelTest() {
        Car[] expected = {cars[0], cars[2]};
        Car[] actual = garage.findCarsByModel("Model1");
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarsByCompanyTest() {
        Car[] expected = {cars[0], cars[1]};
        Car[] actual = garage.findCarsByCompany("Company1");
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarsByEngineTest() {
        Car[] expected = {cars[1]};
        Car[] actual = garage.findCarsByEngine(2.0, 3.0);
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarsByColorTest() {
        Car[] expected = {cars[0], cars[2]};
        Car[] actual = garage.findCarsByColor("Red");
        assertArrayEquals(expected, actual);
    }

    @Test
    void sizeTest(){
        assertEquals(4, garage.size());
    }

    @Test
    void printCarsTest(){
        garage.printCars();
    }

}// end of class
