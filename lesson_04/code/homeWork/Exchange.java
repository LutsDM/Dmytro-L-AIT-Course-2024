package homeWork;
/* Напишите методы для конвертации валюты:
евро в доллары США
евро в британские фунты
евро в китайские юани и проверьте их работу, вызвав их в main.
Напишите метод, который переводит градусы Цельсия в градусы по Фаренгейту. Формулу пересчета найти в Интернете. Вызовите метод в main.

Создайте метод, который пересчитывает морские мили в километры. 1 морская миля = 1852 метра.
 */
public class Exchange {
    public static void main(String[] args) {

        //  exchange euros for dollars
        double incomEuroDollars = 125;
        double rateDollars = 1.11;
        double convertEuroDollars = convertEuroToDollars(incomEuroDollars, rateDollars);
        System.out.println("Amount to be paid out in dollars: " + Math.round(convertEuroDollars));

        // exchange euros for British pounds
        double incomEuroPounds = 125;
        double ratePounds = 0.84;
        double convertEuroPounds = convertEuroToPounds(incomEuroPounds, ratePounds);
        System.out.println("Amount to be paid out in pounds: " + Math.round(convertEuroPounds));

        // exchange euros for Chinese yuan
        double incomEuroYuan = 125;
        double rateYuan = 7.86;
        double convertEuroYuan = convertEuroToYuan(incomEuroYuan, rateYuan);
        System.out.println("Amount to be paid out in yuan: " + Math.round(convertEuroYuan));

        //conversion of miles to kilometers
        double valueMiles = 100;
        double conversionRate = 1.60934; //miles to kilometers conversion rate.
        double convertMilesKilometers = convertMilesToKilometers(valueMiles, conversionRate);
        System.out.println("Kilometers: " + Math.round(convertMilesKilometers));


    }// end of main

    public static double convertEuroToDollars(double ncomEuroDollars, double rateDollars){
        return ncomEuroDollars * rateDollars;
    }

    public static double convertEuroToPounds(double incomEuroPounds, double ratePounds){
        return incomEuroPounds * ratePounds;
    }

    public static double convertEuroToYuan(double incomEuroYuan, double rateYuan){
        return incomEuroYuan * rateYuan;
    }

    public static double convertMilesToKilometers(double valueMiles, double conversionRate){
        return valueMiles * conversionRate;
    }
}// end of class
