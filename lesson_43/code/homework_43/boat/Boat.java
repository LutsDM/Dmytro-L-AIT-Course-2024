package homework_43.boat;

import java.util.Objects;

public class Boat {

    private String shipyard;
    private String country;
    private int year;
    private String material;
    private Double cost;

    public Boat(String shipyard, String country, int year, String material, Double cost) {
        this.shipyard = shipyard;
        this.country = country;
        this.year = year;
        this.material = material;
        this.cost = cost;
    }

    public String getShipyard() {
        return shipyard;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public String getMaterial() {
        return material;
    }

    public Double getCost() {
        return cost;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Boat boat)) return false;

        return year == boat.year && Objects.equals(shipyard, boat.shipyard) && Objects.equals(cost, boat.cost);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(shipyard);
        result = 31 * result + year;
        result = 31 * result + Objects.hashCode(cost);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Boat{");
        sb.append("shipyard='").append(shipyard).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", year=").append(year);
        sb.append(", material='").append(material).append('\'');
        sb.append(", cost=").append(cost);
        sb.append('}');
        return sb.toString();
    }
}
