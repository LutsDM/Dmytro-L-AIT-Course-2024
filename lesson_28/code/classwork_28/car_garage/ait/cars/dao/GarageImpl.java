package classwork_28.car_garage.ait.cars.dao;

import classwork_28.car_garage.ait.cars.model.Car;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class GarageImpl implements Garage{

    private Car[] cars;
    private int size;

    public GarageImpl(int capacity) {
        this.cars = new Car[capacity];
        this.size = size;
    }

    @Override
    public boolean addCar(Car car) {
        if(car == null || size == cars.length || findCarByRegNumber(car.getRegNumber()) != null) {
            return false;
        }
        cars[size++] = car;
        // size++;
        return true;
    }

    @Override
    public Car removeCar(String regNumber) {
        for  (int i = 0; i < size; i++) {
            if (cars[i].getRegNumber().equals(regNumber)) {
                Car victim = cars[i];
                cars[i] = cars[size - 1];
                cars[size - 1] = null;
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Car findCarByRegNumber(String regNumber) {
        for (int i = 0; i < size; i++) {
            if(cars[i].getRegNumber().equals(regNumber)){
                return cars[i];
            }
        }
        return null;
    }

    @Override
    public Car[] findCarsByModel(String model) {
        return findCarsByPredicate(car -> car.getModel().equals(model));
    }

    @Override
    public Car[] findCarsByCompany(String company) {
        return findCarsByPredicate(car -> car.getCompany().equals(company));
    }

    @Override
    public Car[] findCarsByEngine(double min, double max) {
        return findCarsByPredicate (car -> car.getEngine() > min && car.getEngine() < max);
    }

    @Override
    public Car[] findCarsByColor(String color) {
        return findCarsByPredicate (car -> car.getColor().equals(color));
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printCars() {
        for (int i = 0; i < size; i++) {
            System.out.println(cars[i]);
        }
    }


       @Override
    public void sortByColor() {

        Comparator<Car> comparatorByColor = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getColor().compareTo(o2.getColor());
            }

        };
           Arrays.sort(cars, 0, size, comparatorByColor);

       }

    @Override
    public void sortByCompany() {

        Comparator<Car> comparatorByCompany = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getCompany().compareTo(o2.getCompany());
            }

        };
        Arrays.sort(cars, 0, size, comparatorByCompany);

    }

    @Override
    public void sortByModel() {

        Comparator<Car> comparatorByModel = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getModel().compareTo(o2.getModel());
            }

        };
        Arrays.sort(cars, 0, size, comparatorByModel);

    }


    // в этот метод передаем логическое выражение, которое будет тестировать объекты типа Car
    private Car[] findCarsByPredicate(Predicate<Car> predicate){
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(predicate.test(cars[i])){ // объект проходит тест
                count++;
            }
        }
        // читаем массив и перекладываем рез-ты в новый
        Car[] res = new Car[count];
        for (int i = 0, j = 0 ; j < res.length; i++) {
            if(predicate.test(cars[i])){
                res[j++] = cars[i];
            }
        }
        return res;
    }


} // end of class
