package homework_27.marathon.ticket_agency.entity;

import java.util.Objects;

public class Train extends Ticket{

    private String trainNumber;
    private boolean isExpress;
    private boolean isVipClass;

    public Train(String ticketNumber, double basicPrice, String departureDate, String departureLocation, int travelTime, String trainNumber, boolean isExpress, boolean isVipClass) {
        super(ticketNumber, basicPrice, departureDate, departureLocation, travelTime);
        this.trainNumber = trainNumber;
        this.isExpress = isExpress;
        this.isVipClass = isVipClass;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }

    public boolean isVipClass() {
        return isVipClass;
    }

    public void setVipClass(boolean vipClass) {
        isVipClass = vipClass;
    }

    public double calcCost() {
        double cost = getBasicPrice(); // Начальная цена - базовая стоимость из родительского класса

        if (isExpress) {
            cost += cost * 0.10; // Увеличение на 10% за скоростной поезд
        }

        if (isVipClass) {
            cost += cost * 0.10; // Дополнительные 10% к текущей стоимости за VIP-класс
        }

        return cost; // Итоговая стоимость
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Train train)) return false;
        if (!super.equals(o)) return false;

        return isExpress == train.isExpress && isVipClass == train.isVipClass && Objects.equals(trainNumber, train.trainNumber);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(trainNumber);
        result = 31 * result + Boolean.hashCode(isExpress);
        result = 31 * result + Boolean.hashCode(isVipClass);
        return result;
    }


    @Override
    public int compareTo(Ticket other) {
        // Используйте реализацию родительского класса, если логика сравнения в Ticket подходит
        return super.compareTo(other);
    }
}
