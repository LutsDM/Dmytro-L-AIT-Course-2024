package homework_27.marathon.items_delivery.entity;

public class SushiSet extends Item {

    private int sushiCountInSet; //2,4,6,9,12
    private boolean isVegan;

    public SushiSet(long id, String name, double price, int sushiCountInSet, boolean isVegan) {
        super(id, name, price);
        this.sushiCountInSet = sushiCountInSet;
        this.isVegan = isVegan;
    }

    public int getSushiCountInSet() {
        return sushiCountInSet;
    }

    public void setSushiCountInSet(int sushiCountInSet) {
        this.sushiCountInSet = sushiCountInSet;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    @Override
    public double calcDiscount() {
        if (sushiCountInSet > 6 && !isVegan) { //все невегетарианские сеты от 6 штук скидка 7%
        return getPrice() * 0.07;
        }

        if (isVegan) {
            return getPrice() * 0.05; //все вегетарианские сеты 5%
        }
        return 0;
    }
}
