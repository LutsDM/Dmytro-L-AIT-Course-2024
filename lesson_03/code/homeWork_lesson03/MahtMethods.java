package homeWork_lesson03;

public class MahtMethods {
    public static void main(String[] args) {

        //перевод доллара в евро
        double incom = 100;             //sum $
        double rate = 1.11;             //rate
        double convertDoEu = convertDoltoEur(incom, rate);
        System.out.println(Math.round(convertDoEu));

        //подсчет каллорий
        double e1 = 234;                //calories element 1
        double e2 = 221;                //calories element 1
        double e3 = 827;                //calories element 1
        double summCalories = calculateCalories(e1, e2, e3);
        System.out.println(summCalories);

        //подсчет расхода топлива и стоимости
        double fuelСonsumption = 0.7;
        double km = 24;                 //distance
        double fuelPrice = 1.50;
        double fuelUsed = km * fuelСonsumption;
        double costTrip = costOfTheTrip(fuelPrice, fuelUsed);
        System.out.println("Trip Cost:" + Math.round(costTrip * 100.0) / 100.0);

    }//end of main
    private static double convertDoltoEur(double incom, double rate){
        return incom / rate;
    }

    private static double calculateCalories(double e1, double e2, double e3){
        return e1 + e2 +e3;
    }

    private static double fuelUsed (double km, double fuelСonsumption){
        return km * fuelСonsumption;
    }

    private static double costOfTheTrip(double fuelPrice,double fuelUsed){
        return fuelPrice * fuelUsed;
    }
}//end of class
