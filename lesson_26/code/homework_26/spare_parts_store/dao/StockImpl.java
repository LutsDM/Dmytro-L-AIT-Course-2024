package homework_26.spare_parts_store.dao;

import homework_26.spare_parts_store.model.Detail;

public class StockImpl implements Stock{

   private Detail[] details;
   private int size;

    public StockImpl(int capacity) {
        this.details = new Detail[capacity];
        this.size = size;
    }

    @Override
    public boolean addDetail(Detail detail) {
        if (detail == null) {
            return false;
        }
        if (size == details.length) {
            return false;
        }
        if (!(findDetail(detail.getBarCode()) == null)) {
            return false;
        }
        details[size] = detail;
        size++;
        return true;
    }

    @Override
    public Detail findDetail(long barCode) {
        for (int i = 0; i < size; i++) {
            if (details[i].getBarCode() == barCode) {
            return details[i];
            }
        }
        return null;
    }

    @Override
    public Detail updateDetail(Detail detail) {
        for (int i = 0; i < size; i++) {
            if (details[i].getBarCode() == detail.getBarCode()) {
                details[i] = detail;
                return detail;
            }
        }
        return null;
    }

    @Override
    public Detail removeDetail(long barCode) {
        for (int i = 0; i < size; i++) {
            if(details[i].getBarCode() == barCode){
                Detail victim = details[i];
                details[i] = details[size - 1];
                details[size -1] = null;
                size--;
                return victim;
            }
        }

        return null;
    }

    @Override
    public double totalWeight(Detail[] details) {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += details[i].getWeight();
        }
        return sum;
    }

    @Override
    public double averageWeight(Detail[] details) {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += details[i].getWeight();
        }
        return sum/size;
    }

    public int size() {
        return size;
    }
}
