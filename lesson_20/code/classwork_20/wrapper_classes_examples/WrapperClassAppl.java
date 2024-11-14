package classwork_20.wrapper_classes_examples;

import java.math.BigInteger;

public class WrapperClassAppl {

    public static void main(String[] arge) {

        int k = 1234567890;
        System.out.println(k);
        System.out.println("--------------------------------------");

        Integer integer = Integer.parseInt("1234567890");
        System.out.println(integer);
        integer = integer + 15;
        System.out.println(integer);

        // автоупаковка
        Integer x = 5;
        System.out.println(x * 10);


        // авторазпаковка
        integer = 7;

        int z = x + integer;
        System.out.println(z);

        System.out.println("--------------------------------------");
        BigInteger myBigInt = new BigInteger("12345678901234567890");
        System.out.println(myBigInt);

        // кол-во цифр в числе
        int a = 1234567890;
        Integer aInt = a;
        //смена типа
        String str = aInt.toString();
        int l = str.length();

        System.out.println("Number: " + a + " contains " + l + " digits.");

        Double d = 0.0;
        System.out.println("--------------------------------------------");
        System.out.println("Max value of int: " + d.MAX_VALUE);
        System.out.println("Min value of int: " + d.MIN_VALUE);


        //математические вычисления
        int n = 20;
        Integer m = 10;

        m = m + n;
        System.out.println(m);

        n = n + m;
        System.out.println(n + 1);

        Double pi = 3.14;
        double circleLenth = 2 * pi * 10;
        System.out.println(circleLenth);

        System.out.printf("Length of circle: %.2f", circleLenth);
        System.out.println();

        // Nan и Infinite
        double p = 20 / 0.0;
        if (Double.isNaN(p) || Double.isInfinite(p)) {
            System.out.println("Wrong operation, division by Zero");
        } else System.out.println(p);

        System.out.println("-----------------------------------");
        //Перевод стринга в число
        String str1 = "0098762100";
        long num = Long.parseLong(str1);
        System.out.println(num);

    }
}







