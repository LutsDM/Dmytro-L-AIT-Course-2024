package homework_29.car.car_sorting;

import homework_29.car.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    static Car[] cars;

    @BeforeEach
    void setUp() {
        cars = new Car[6];

        cars[0] = new Car("AA234U", "Black", 10000, 2021);
        cars[1] = new Car("BB567T", "Black", 12000, 2020);
        cars[2] = new Car("CC890K", "Red", 15000, 2019);
        cars[3] = new Car("DD123L", "Black", 18000, 2018);
        cars[4] = new Car("EE456M", "Red", 20000, 2021);
        cars[5] = new Car("FF789N", "Blue", 22000, 2022);
    }

    @Test
    void printCars() {
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    @Test
    void sortCarTestByModel() {
        Arrays.sort(cars, Comparator.comparing(Car::getModel)); // sorting

        System.out.println("-----------List cars sorted by model----------------");
        printCars(); // print
    }

    @Test
    void sortCarByColor() {
        Comparator<Car> comparatorByColor = new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                return c1.getColor().compareTo(c2.getColor());
            }
        };

        System.out.println("-----------List cars as is----------------");
        printCars(); // print

        Arrays.sort(cars, comparatorByColor); // sorting

        System.out.println("-----------List cars sorted by color----------------");
        printCars(); // print
    }

    @Test
    void sortCarByPrice() {
        Comparator<Car> comparatorByPrice = new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                return Double.compare(c1.getPrice(), c2.getPrice());
            }
        };

        System.out.println("-----------List cars as is----------------");
        printCars(); // print

        Arrays.sort(cars, comparatorByPrice); // sorting

        System.out.println("-----------List cars sorted by price----------------");
        printCars(); // print
    }

    @Test
    void sortCarsByYearsOfProduction(){
        Comparator<Car> comparatorByYearsOfProduction = new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                return c1.getYearsOfProduction() - c2.getYearsOfProduction();
            }
        };
        System.out.println("-----------List cars as is----------------");
        printCars(); // print

        Arrays.sort(cars, comparatorByYearsOfProduction); // sorting

        System.out.println("-----------List cars sorted by years----------------");
        printCars(); // print

    }
}
