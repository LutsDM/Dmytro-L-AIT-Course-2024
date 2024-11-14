package homeWork_lesson03;

public class CostTrip01 {
    public static void main(String[] args) {
        //подсчет расхода топлива и стоимости
        double fuelConsumption = 0.7;
        double km = 24;                 //distance
        double fuelPrice = 1.50;
        double fuelUsed = calculateFuelUsed(km, fuelConsumption);
        double costTrip = costOfTheTrip(fuelPrice, fuelUsed);
        System.out.println("Trip Cost:" + Math.round(costTrip * 100.0) / 100.0);
    }
    private static double calculateFuelUsed(double km, double fuelConsumption){
        return km * fuelConsumption;
    }
    private static double costOfTheTrip(double fuelPrice,double fuelUsed){
        return fuelPrice * fuelUsed;
    }
}
