package classWork_19.homeWork_19.Product;
//Задача 1. Создать класс Product, с полями:
//
//private double price
//private String name
//private long barCode; Создать класс Food расширяющий класс Product с полем private String expDate, которое хранит дату истечения срока годности. Создать класс MeatFood расширяющий класс Food с полем private String meatType, которое хранит тип мяса, из которого изготовлен продукт. Создать класс MilkFood расширяющий класс Food с полями private String milkType, private double fat, которые хранят тип молока и жирность продукта соответственно. Во всех классах переопределить метод toString. Создать класс MarketAppl и в нем метод main. В методе main создать массив в котором хранятся по одному объекту для каждого продукта. Реализовать методы:
//печатающий все продукты из массива, и
//метод возвращающий сумму цен всех продуктов.
//Задача 2. В Задаче 1 переопределить метод equals для сравнения объектов во всех классах. В классе MarketAppl создать метод принимающий баркод и возвращающий продукт с данным баркодом. В методе main вызвать новые методы. Результат их работы напечатать в консоль.
//Задача 3. (*) В классе MarketAppl создать метод печатающий в консоль все не пищевые продукты.

import classWork_19.homeWork_19.Product.model.Food;
import classWork_19.homeWork_19.Product.model.MeatFood;
import classWork_19.homeWork_19.Product.model.MilkFood;
import classWork_19.homeWork_19.Product.model.Product;

import java.util.Scanner;

public class MarketAppl {
    public static void main(String[] args) {

        Product[] products = new Product[8];
        products[0] = new MeatFood(12.50, "Mymy-meat", 54565465564547L, "12 Nov 2024", "Beef");
        products[1] = new MeatFood(7.50, "Coco-meat", 12345674546548L, "15 Nov 2024", "Chicken");
        products[2] = new MilkFood(1.50, "BioMilk", 545646668445L, "18 Dec 2024", "Cow milk", 1.5);
        products[3] = new MilkFood(1.50, "Cocos Milk +", 5111111111445L, "20 Dec 2024", "Cocos milk", 5);
        products[4] = new Product(15,"Gillete", 544878745544554L);
        products[5] = new Product(6, "Malboro",697878854545778L);
        products[6] = new Food(1.99,"Lay`s",7878454546111245L,"16 Jan 2025");
        products[7] = new Food(1,"Apples",5486746186745L,"16 Jan 2025");

        printAllProduct(products);                                          //printing all products

        System.out.println("-------------------------------------");

        double totalPrice = totalProductPrice(products);                    //calculating the total price
        System.out.println("Total product price: " + totalPrice);

        System.out.println("--------------------------------------");

        noFoodProduct(products);                                             //printing all non-food
        // products

        System.out.println("---------------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input bar code: ");
        long scanBarCode = scanner.nextLong();

        findProductByBarCode(products, scanBarCode);               //searching a product by barcode

    }


       private static void printAllProduct(Product[] products) {               // printing all products
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }

    private static double totalProductPrice(Product[] products) {           //method of calculating the total price
        double total = 0;
        for (int i = 0; i < products.length; i++) {
            total += products[i].getPrice();
        }
        return total;
    }

    private static String findProductByBarCode(Product[] products, long scanBarCode){  // method for searching a
        // product by barcode
        for (int i = 0; i < products.length; i++) {
            if (products[i].getBarCode() == scanBarCode) {
                System.out.println("Product with barcode - " + scanBarCode + ": " + products[i].toString());
                return products[i].toString();
            }
        }
        System.out.println("Product not found");
        return null;
    }

    private static void noFoodProduct(Product[] products) {  //method of printing all non-food products
        System.out.println("Non-food products: ");
        for (int i = 0; i < products.length; i++) {
            if (!(products[i] instanceof Food)) {
                System.out.println(products[i].toString());
            }
        }
    }
}
