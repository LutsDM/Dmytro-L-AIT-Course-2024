package classwork_41.treeset;

import java.util.Objects;

public class Car implements Comparable<Car> {
    private String regNumber;
    private String model;
    private String company;
    private double engine;
    private String color;

    public Car(String regNumber, String model, String company, double engine, String color) {
        this.regNumber = regNumber;
        this.model = model;
        this.company = company;
        this.engine = engine;
        this.color = color;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getModel() {
        return model;
    }

    public String getCompany() {
        return company;
    }

    public double getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;

        return Objects.equals(regNumber, car.regNumber) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(regNumber);
        result = 31 * result + Objects.hashCode(color);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("regNumber='").append(regNumber).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", company='").append(company).append('\'');
        sb.append(", engine=").append(engine);
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Car o) {
        int res = this.getRegNumber().compareTo(o.regNumber);
        return res < 0 ? res : this.getColor().compareTo(o.getColor());
    }
}
