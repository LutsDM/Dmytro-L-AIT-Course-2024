package homework_27.marathon.computer_shop;

import homework_27.marathon.computer_shop.dao.Store;
import homework_27.marathon.computer_shop.dao.StoreImpl;
import homework_27.marathon.computer_shop.entity.Computer;

public class ComputerShopAppl {

    public static void main(String[] args) {

        Store store = new StoreImpl(5);
        Computer[] computers = new Computer[4];

        computers[0] = new Computer(1001L, "Dell Inspiron", 800, 10); // 10% скидка
        computers[1] = new Computer(1002L, "HP Spectre", 1200, 0); // Без скидки
        computers[2] = new Computer(1003L, "MacBook Pro", 2500, 20); // 20% скидка
        computers[3] = new Computer(1004L, "Asus ZenBook", 1000, 0); // Без скидки

        for (int i = 0; i < computers.length; i++) {
            store.addComputer(computers[i]);
        }

        store.printComputer();
        System.out.println("----------------Add new computer----------------------");

        Computer newComputer = new Computer(1005L, "Lenovo ThinkPad", 1500, 15);
        store.addComputer(newComputer);

        store.printComputer();
        System.out.println("----------------Delete computer----------------------");

        store.removeComputer(1005L);
        store.printComputer();
        System.out.println("-----------------Find computer---------------------");

        long articleToFind = 1001L;
        Computer foundComputer = store.findComputer(articleToFind);
        System.out.println("Found computer with article " + articleToFind + ": " + foundComputer);
        System.out.println("--------------------------------------");

        System.out.println("Computers with discounts:");
        Computer[] discountedComputers = store.computersAtDiscounts();

        for (int i = 0; i < discountedComputers.length; i++) {
            System.out.println(discountedComputers[i]);
        }
        System.out.println("--------------------------------------");

    }
}
