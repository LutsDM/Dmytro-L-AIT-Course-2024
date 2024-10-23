package homework_27.marathon.computer_shop.entity;

public class Smartphone extends Computer{

    private long imei;


    public Smartphone(long article, String brand, double price, double discount) {
        super(article, brand, price, discount);
    }

    public long getImei() {
        return imei;
    }

    public void setImei(long imei) {
        this.imei = imei;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Smartphone{");
        sb.append("imei=").append(imei);
        sb.append('}');
        return sb.toString();
    }
}
