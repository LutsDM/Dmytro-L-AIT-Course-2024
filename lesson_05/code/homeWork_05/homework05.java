package homeWork05;
/*
Задача 1. Написать метод, возвращающий минимальное из двух целых чисел. Числа задаются в программе.

Задача 2. Задать в программе три стороны треугольника.
Проверить выполнимость неравенства треугольника - любая из сторон должна быть меньше суммы двух других.
Сообщить результат - существует или нет треугольник с заданными сторонами.

Задача 3. Сделайте расчет покупки товаров со скидками.
Товар А стоит X евро и на него скидка D%, а товар B стоит Y евро и на него скидка С%.
Клиент взял N товаров A и M товаров B. Если сумма покупки превысила 100 евро, то полагается дополнительная скидка 5%.
Вычислите итоговую стоимость покупки и величину полученной скидки.

Задание 4.(*) Разработать аппликацию для решения квадратного уравнения по коэффициентам квадратного трехчлена а, b и с. Дискриминант вычислить по формуле: d = bb - 4ac Если d > 0, то x1 = (-b + Math.sqrt(d))/(2a), x2 = (-b - Math.sqrt(d))/(2a). Если d = 0, то x = -b / (2a). Если d < 0, то сообщить, что корней нет.
*/

public class homework05 {
    public static void main(String[] args) {

       //Задание 1
        int a = 101;
        int b = 87;
        int min = (a < b) ? a : b;

        System.out.println("Minimum: " + min);

        //Задание 2
        int side1 = 1;
        int side2 = 1;
        int side3 = 11;

        System.out.println((side1 < side2 + side3 &&
                side2 < side1 + side3 &&
                side3 < side1 + side2) ?
                "The given triangle exists" :
                "The given triangle does not exist");

        //Задание 3
         a = 56;          //цена товара а
        double a1 = 2;       //скидка на товар а
         b = 180;          //цена товара b
        double b1 = 3;       //скидка на товар b
        int N = 3;       //количество товара a
        int M = 2;       //количество товара b

        double totalA = (a * N) * (1 - a1 / 100);  // итоговая цена товаров A
        double totalB = (b * M) * (1 - b1 / 100);  // итоговая цена товаров B

        double purchaseAmount = totalA + totalB;     // без доп скидок
        System.out.println("Cумма покупки: " + Math.round(purchaseAmount));

        // если покупка больше 100
        if (purchaseAmount > 100) {
            purchaseAmount = purchaseAmount * 0.95;
        }
        // подсчет скидки до 100
        double discountA = (a * N) - totalA;  // скидка на товар A
        double discountB = (b * M) - totalB;  // скидка на товар B
        double totalDiscount = discountA + discountB;

        System.out.println("Итого скидка: " + Math.round(totalDiscount));
        System.out.println("Итоговая сумма покупки: " + Math.round(purchaseAmount));
        }

    }// end of class



