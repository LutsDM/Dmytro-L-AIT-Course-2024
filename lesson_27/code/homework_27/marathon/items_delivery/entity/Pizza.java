package homework_27.marathon.items_delivery.entity;

public class Pizza extends Item {

    private int diameter; //d: 32, 36, 45
    private boolean isSpicy;

    public Pizza(long id, String name, double price, int diameter, boolean isSpicy) {
        super(id, name, price);
        this.diameter = diameter;
        this.isSpicy = isSpicy;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public void setSpicy(boolean spicy) {
        isSpicy = spicy;
    }


    @Override
    public double calcDiscount() {
        if (diameter >= 36 && isSpicy) { //скидка на острую пиццу 36 и 45 см в 5%
            return getPrice() * 0.05;
        }

        if (diameter == 32 && !isSpicy) {
            return getPrice() * 0.10; //скидка на не острую пиццу 32 см в 10%
        }
        return 0;
    }
}
