package homework_27.marathon.ticket_agency.entity;

import java.util.Objects;

public abstract class Ticket implements Comparable <Ticket> {

    private String ticketNumber;
    private double basicPrice;
    private String departureDate;
    private String departureLocation;
    private int travelTime;

    public Ticket(String ticketNumber, double basicPrice, String departureDate, String departureLocation, int travelTime) {
        this.ticketNumber = ticketNumber;
        this.basicPrice = basicPrice;
        this.departureDate = departureDate;
        this.departureLocation = departureLocation;
        this.travelTime = travelTime;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public void setBasicPrice(double basicPrice) {
        this.basicPrice = basicPrice;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    public abstract double calcCost();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ticket ticket)) return false;

        return Objects.equals(ticketNumber, ticket.ticketNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ticketNumber);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ticket{");
        sb.append("ticketNumber='").append(ticketNumber).append('\'');
        sb.append(", basicPrice=").append(basicPrice);
        sb.append(", departureDate='").append(departureDate).append('\'');
        sb.append(", departureLocation='").append(departureLocation).append('\'');
        sb.append(", travelTime=").append(travelTime);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Ticket o) {
        return this.getTicketNumber().compareTo(o.getTicketNumber());
        //return Integer.compare(this.getPopulation(),o.getPopulation());
    }
}
