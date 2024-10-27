package homework_27.marathon.ticket_agency.entity;

import java.util.Objects;

public class Airplane extends Ticket {

    private String flightNumber;
    private boolean isBusinessClass;
    private boolean withBaggage;

    public Airplane(String ticketNumber, double basicPrice, String departureDate, String departureLocation, int travelTime, String flightNumber, boolean isBusinessClass, boolean withBaggage) {
        super(ticketNumber, basicPrice, departureDate, departureLocation, travelTime);
        this.flightNumber = flightNumber;
        this.isBusinessClass = isBusinessClass;
        this.withBaggage = withBaggage;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public boolean isBusinessClass() {
        return isBusinessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        isBusinessClass = businessClass;
    }

    public boolean isWithBaggage() {
        return withBaggage;
    }

    public void setWithBaggage(boolean withBaggage) {
        this.withBaggage = withBaggage;
    }

    public double calcCost() {
        double cost = getBasicPrice(); // Начальная цена - базовая стоимость из родительского класса

        if (isBusinessClass) {
            cost += cost * 0.15; // Увеличение на 15% за бизнес класс
        }

        if (withBaggage) {
            cost += cost * 0.08; // Дополнительные 8% к текущей стоимости за багаж
        }

        return cost; // Итоговая стоимость
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airplane airplane)) return false;
        if (!super.equals(o)) return false;

        return isBusinessClass == airplane.isBusinessClass && withBaggage == airplane.withBaggage && Objects.equals(flightNumber, airplane.flightNumber);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Objects.hashCode(flightNumber);
        result = 31 * result + Boolean.hashCode(isBusinessClass);
        result = 31 * result + Boolean.hashCode(withBaggage);
        return result;
    }


    @Override
    public int compareTo(Ticket other) {
        // Используйте реализацию родительского класса, если логика сравнения в Ticket подходит
        return super.compareTo(other);
    }
}