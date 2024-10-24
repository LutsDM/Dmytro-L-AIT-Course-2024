package homework_26.spare_parts_store.model;

import java.util.Objects;

public abstract class Detail {

    protected long barCode;
    protected double size;
    protected String material;
    protected String vendor;
    protected double weight;

    public Detail(long barCode, double size, String material, String vendor, double weight) {
        this.barCode = barCode;
        this.size = size;
        this.material = material;
        this.vendor = vendor;
        this.weight = weight;
    }

    public long getBarCode() {
        return barCode;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Detail detail)) return false;
        return barCode == detail.barCode;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(barCode);
    }

    @Override
    public String toString() {
        return "Detail{" +
                "barCode=" + barCode +
                ", size=" + size +
                ", material='" + material + '\'' +
                ", vendor='" + vendor + '\'' +
                ", weight=" + weight +
                '}';
    }
}