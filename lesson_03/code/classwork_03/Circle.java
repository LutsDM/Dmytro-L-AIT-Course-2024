package classwork_03;
//Вычислить длину окружности по ее радиусу.
//Задайте радиус окружности как переменную типа double.
//Реализуйте метод, который вернет тип double и вычислит длину окружности по ее радиусу.


public class Circle {
    public static void main(String[] args) {

        double PI = 3.14159;
        double r = 100;

        double lengthOfCircle = 2 * PI * r;

        System.out.println(lengthOfCircle);

        //solution with method

        double l = lengthOfCircleMethod(r);
        System.out.println("Length of circle with radius" + r + " = " + l);

    }//end of main

    public static double lengthOfCircleMethod(double r) {
        return 2 * Math.PI * r;

    }
    
}//end of class
