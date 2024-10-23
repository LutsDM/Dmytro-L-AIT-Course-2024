package homework_27.marathon.computer_shop.entity;

public class Laptop extends Computer {
    private int displaySize;
    private double weight;
    private int batteryLife;


    public Laptop(long article, String brand, double price, double discount) {
        super(article, brand, price, discount);
    }

    public int getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(int displaySize) {
        this.displaySize = displaySize;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Laptop{");
        sb.append("displaySize=").append(displaySize);
        sb.append(", weight=").append(weight);
        sb.append(", batteryLife=").append(batteryLife);
        sb.append('}');
        return sb.toString();
    }
}
