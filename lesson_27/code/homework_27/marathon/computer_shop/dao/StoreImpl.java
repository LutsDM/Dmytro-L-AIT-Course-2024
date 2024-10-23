package homework_27.marathon.computer_shop.dao;

import ait.employee.model.Employee;
import homework_27.marathon.computer_shop.entity.Computer;

import java.util.function.Predicate;

public class StoreImpl implements Store{

    private Computer[] computers;
    private int size;

    public StoreImpl(int capacity) {
        this.computers = new Computer[capacity];
        this.size = size();
    }

    @Override
    public boolean addComputer(Computer computer) {
        if (computer == null) {
            return false;
        }
        if (size == computers.length) {
            return false;
        }

        computers[size] = computer;
        size++;
        return true;
    }

    @Override
    public Computer removeComputer(long article) {
        for (int i = 0; i < size; i++) {
            if (computers[i].getArticle() == article) {
                Computer victim = computers[i];
                computers[i] = computers[size - 1];
                computers[size - 1] = null;
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Computer findComputer(long article) {
        for (int i = 0; i < size; i++) {
            if (computers[i].getArticle() == article) {
                return computers[i];
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printComputer() {
        for (int i = 0; i < size; i++) {
            System.out.println(computers[i]);

        }
    }

    @Override
    public Computer[] computersAtDiscounts() {
        return findComputerByDiscounts(computer -> computer.getDiscount() > 0);
    }

    private Computer[] findComputerByDiscounts (Predicate<Computer> predicate) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(computers[i])) { // объект проходит тест
                count++;
            }
        }

        // читаем массив и перекладываем рез-ты в новый
        Computer[] res = new Computer[count];
        for (int i = 0, j = 0 ; j < res.length; i++) {
            if(predicate.test(computers[i])){
                res[j++] = computers[i];
            }
        }
        return res;
    }
}
