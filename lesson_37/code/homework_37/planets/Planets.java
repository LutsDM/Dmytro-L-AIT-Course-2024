package homework_37.planets;

import java.util.Objects;

public class Planets implements Comparable<Planets>{

    private String name;
    private double distance;
    private double weight;
    private int numbersOfSputnik;

    public Planets(String name, double distance, double weight, int numbersOfSputnik) {
        this.name = name;
        this.distance = distance;
        this.weight = weight;
        this.numbersOfSputnik = numbersOfSputnik;
    }

    public String getName() {
        return name;
    }

    public double getDistance() {
        return distance;
    }

    public double getWeight() {
        return weight;
    }

    public int getNumbersOfSputnik() {
        return numbersOfSputnik;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Planets planets)) return false;

        return Objects.equals(name, planets.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Planets{");
        sb.append("name='").append(name).append('\'');
        sb.append(", distance=").append(distance);
        sb.append(", weight=").append(weight);
        sb.append(", numbersOfSputnik=").append(numbersOfSputnik);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Planets o) {
        return Double.compare(getDistance(), o.getDistance());
    }
}
