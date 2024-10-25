package homework_27.marathon.items_delivery.entity;

import java.util.Objects;

public abstract class Item implements Comparable<Item> {

    private long id;
    private String name;
    private double price;

    public Item(long Id, String name, double price) {
        this.id = Id;
        this.name = name;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calcDiscount();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item items)) return false;
        return id == items.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Items{");
        sb.append("itemId=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Item o) {
        return Long.compare(this.getId(), o.getId());
    }

}
