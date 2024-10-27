package homework_27.marathon.ticket_agency.entity;

import java.util.Objects;

public class Bus extends Ticket {

    private String busNumber;
    private boolean isFixedSeat;

    public Bus(String ticketNumber, double basicPrice, String departureDate, String departureLocation, int travelTime, String busNumber, boolean isFixedSeat) {
        super(ticketNumber, basicPrice, departureDate, departureLocation, travelTime);
        this.busNumber = busNumber;
        this.isFixedSeat = isFixedSeat;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public boolean isFixedSeat() {
        return isFixedSeat;
    }

    public void setFixedSeat(boolean fixedSeat) {
        isFixedSeat = fixedSeat;
    }

    @Override
    public double calcCost() {
        double cost = getBasicPrice(); // Начальная цена - базовая стоимость из родительского класса

        if (isFixedSeat) {
            cost += cost + 15; // Увеличение на 15 евро за бронирования места
        }

        return cost; // Итоговая стоимость
    }


    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bus bus)) return false;
        if (!super.equals(o)) return false;

        return isFixedSeat == bus.isFixedSeat && Objects.equals(busNumber, bus.busNumber);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(busNumber);
        result = 31 * result + Boolean.hashCode(isFixedSeat);
        return result;
    }


    @Override
    public int compareTo(Ticket other) {
        // Используйте реализацию родительского класса, если логика сравнения в Ticket подходит
        return super.compareTo(other);
    }
}