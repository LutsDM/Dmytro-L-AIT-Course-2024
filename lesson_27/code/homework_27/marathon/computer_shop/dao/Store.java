package homework_27.marathon.computer_shop.dao;

import homework_27.marathon.computer_shop.entity.Computer;

public interface Store {

    boolean addComputer(Computer computer);

    Computer removeComputer (long article);

    Computer findComputer (long article);

    int size();

    void printComputer();

    Computer[] computersAtDiscounts();

}
