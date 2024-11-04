package homework_38.day_temperature;

import java.time.LocalDate;
import java.util.Objects;

public class DayTemperature implements Comparable<DayTemperature> {

    private LocalDate date;
    private double temperature;

    public DayTemperature(LocalDate date, double temperature) {
        this.date = date;
        this.temperature = temperature;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DayTemperature that)) return false;

        return Double.compare(temperature, that.temperature) == 0 && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(date);
        result = 31 * result + Double.hashCode(temperature);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DayTemperature{");
        sb.append("date=").append(date);
        sb.append(", temperature=").append(temperature);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(DayTemperature o) {
        return this.date.compareTo(o.getDate());
    }

}
