package homework_29.car;

public class Car implements Comparable <Car> {

    private String model;
    private String color;
    private double price;
    private int yearsOfProduction;

    public Car(String model, String color, double price, int yearsOfProduction) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.yearsOfProduction = yearsOfProduction;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearsOfProduction() {
        return yearsOfProduction;
    }

    public void setYearsOfProduction(int yearsOfProduction) {
        this.yearsOfProduction = yearsOfProduction;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("model='").append(model).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", price=").append(price);
        sb.append(", yearsOfProduction=").append(yearsOfProduction);
        sb.append('}');
        return sb.toString();
    }


    @Override
    public int compareTo(Car car) {
        return this.getModel().compareTo(car.getModel());
    }
}
