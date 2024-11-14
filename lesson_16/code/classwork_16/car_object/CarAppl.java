package classwork_16.car_object;

import classwork_16.car_object.model.Car;

public class CarAppl {

    public static void main(String[] args) {

        Car myCar = new Car("VW",2014,15000,"black",false); //create object

        myCar.toString();

        System.out.println(myCar);

        myCar.move();
        myCar.stop();

    }// end of main


}// end of class

