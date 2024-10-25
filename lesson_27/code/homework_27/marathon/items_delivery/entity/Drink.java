package homework_27.marathon.items_delivery.entity;

public class Drink extends Item{

    private double volume;
    private boolean isAlcohol;

    public Drink(long id, String name, double price, double volume, boolean isAlcohol) {
        super(id, name, price);
        this.volume = volume;
        this.isAlcohol = isAlcohol;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public boolean isAlcohol() {
        return isAlcohol;
    }

    public void setAlcohol(boolean alcohol) {
        isAlcohol = alcohol;
    }

    @Override
    public double calcDiscount() {
        if (volume == 0.5 && isAlcohol) { //на алкоголь в таре 0.5 л скидка 5%
            return getPrice() * 0.05;
        }

        if (!isAlcohol) {// на все безалкогольные 2%
            return getPrice() * 0.02;
        }

        return 0;
    }

}
