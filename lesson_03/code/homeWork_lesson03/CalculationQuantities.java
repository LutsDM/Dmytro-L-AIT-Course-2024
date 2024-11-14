package homeWork_lesson03;
/* Write an application (class) with methods for calculating various quantities
    1.A method for calculating the area of a square based on its side;
    2.A method for calculating the area of a circle based on its radius;
    3.A method for calculating the perimeter of a rectangle based on two sides; In the main method, call the above methods with different arguments, and output the results to the console. For example:
        the area of a circle for R = 200 is ...
        the area of a square with a side of 500 is ...
        the perimeter of a rectangle with sides of 1000 and 2000 is ...
    Add methods that calculate (*)
    1.The value of the 3rd angle of a triangle based on the first two.
    2.The area of a triangle based on the side and height of the triangle.
    3.The hypotenuse based on two legs (Pythagoras' theorem).*/

public class CalculationQuantities {
    public static void main(String[] args) {

        //area of a square
        double a = 187;                                         //side of a square
        double areaSquare = areaOfsquard(a);
        System.out.println("Area of squard:" + areaSquare);

        //area of a circle
        double r = 95;                                          //radius
        double areaCircle = areaOfCircle(r);
        System.out.println("Area of circle:" + areaCircle);

        //perimeter of a rectangle
        double b = 15;                                          //side of a rectangle 1
        double c = 25;                                          //side of a rectangle 2
        double perimetrRectangle = perimetrOfRectangle(b, c);
        System.out.println("Perimeter of a rectangle:" + perimetrRectangle);

        //the value of the 3rd angle of a triangle
        double x = 12;                                          //first angle
        double y = 18;                                          //second angle
        double valueAngle = valueOfAngle(x, y);
        System.out.println("The Value of the 3rd angle:" + valueAngle);

        //the area of a triangle based on the side and height of the triangle.
        double z = 24;                                          //side of triangle
        double j = 65;                                          //height of triangle
        double areaTriangle = areaOfTriangle(z, j);
        System.out.println("The atea of a triangle:" + areaTriangle);

        //the hypotenuse based on two legs (Pythagoras' theorem).
        double k = 33;                                          //lengths of the legs 1
        double h = 75;                                          //lengths of the legs 2
        double valueHypotenuse = valueOfHypotenuse(k, h);
        System.out.println("Value of hypotenuse:" + valueHypotenuse);

    }//end of main

    private static double areaOfTriangle(double z, double j) {
        return  0.5 * z * j ;
    }

    public static double areaOfsquard(double a) {
        return a * a;
    }

    private static double areaOfCircle(double r) {
        return 2 * Math.PI * r;
    }

    private static double perimetrOfRectangle(double b, double c) {
        return 2 * (b + c);
    }

    private static double valueOfAngle(double x, double y) {
        return 180 - x - y;
    }

    private static double valueOfHypotenuse(double k, double h) {
        return Math.sqrt(k * k + h * h);
    }

}//end of class
