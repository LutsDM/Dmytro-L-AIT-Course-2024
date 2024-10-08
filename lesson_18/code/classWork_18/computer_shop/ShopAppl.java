package classWork_18.computer_shop;

import classWork_18.computer_shop.model.Computer;
import classWork_18.computer_shop.model.Laptop;
import classWork_18.computer_shop.model.Smartphone;

//Создать несколько экземпляров каждого класса.
//
//Какой общий объем памяти у всех устройств на складе?
//Какова общая стоимость всех устройств на складе?
public class ShopAppl {
    public static void main(String[] args) {

        Computer comp1 = new Computer("i7", 8, 256,"Acer", 1200);
        System.out.println(comp1);

        Laptop laptop1 = new Laptop("i5",8,256,"Apple AirBook", 2200, 14,2,10,"Blue");
        System.out.println(laptop1);

        Computer[] computers = new Computer[5];
        computers[0] = new Computer("i7", 8, 256,"Acer", 1200);
        computers[1] = new Computer("i4", 16, 256,"Intel", 1350);
        computers[2] = new Computer("i5", 32, 256,"ASUS", 1500);
        computers[3] = new Laptop("i5", 32, 256,"ASUS", 1500, 14, 1.5, 10, "white");
        computers[4] = new Laptop("i5", 32, 512,"MacBook", 2500, 21, 1.5, 10, "black");

        int totalSsd = 0;
        for (int i = 0; i < computers.length; i++) {
            totalSsd += computers[i].getSsd();

        }

        System.out.println("Total ssd: " + totalSsd);

        double totalPrice = 0;
        for (int i = 0; i < computers.length; i++) {
            totalPrice += computers[i].getPrice();

        }

        System.out.println("Total price: " + totalPrice);

        System.out.println("------------------------------------------------------");

        for (int i = 0; i < computers.length; i++) {
            System.out.println(computers[i]);

        }

        System.out.println("------------------------------------------------------");

        for (int i = 0; i < computers.length; i++) {
            System.out.println(computers[i].getBrand());

        }

        // В классной работе создать класс Smartphone, расширяющий класс Laptop с полем private long imei. В классе Smartphone переопределить метод toString. В методе main добавить объект Smartphone, и распечатать его в консоль.

        System.out.println("--------------------------------------------------------");
        Smartphone iPhoneX = new Smartphone("A11 Bionic", 3,256, "Apple", 500, 5, 174, 20, "Gold", 546546546L);

        System.out.println(iPhoneX);
    }
}
