package homework_27.marathon.computer_shop.entity;

import java.util.Objects;

public class Computer {
    private long article;
    private String brand;
    private double price;
    private double discount;

    public Computer(long article, String brand, double price, double discount) {
        this.article = article;
        this.brand = brand;
        this.price = price;
        this.discount = discount;
    }

    public long getArticle() {
        return article;
    }

    public void setArticle(long article) {
        this.article = article;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer computer)) return false;
        return article == computer.article;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(article);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computer{");
        sb.append("article=").append(article);
        sb.append(", brand='").append(brand).append('\'');
        sb.append(", price=").append(price);
        sb.append(", discount=").append(discount);
        sb.append('}');
        return sb.toString();
    }
}
