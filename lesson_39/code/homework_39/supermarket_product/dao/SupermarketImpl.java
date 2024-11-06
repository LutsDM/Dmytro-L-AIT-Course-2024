package homework_39.supermarket_product.dao;

import homework_39.supermarket_product.model.Product;

public class SupermarketImpl implements Supermarket {

    private Product[] products;
    private int size;

    public SupermarketImpl(int capacity) {
        this.products = new Product[capacity];
        this.size = 0;
    }

    @Override
    public boolean addProduct(Product product) {
        return false;
    }

    @Override
    public Product removeProduct(long barCode) {
        return null;
    }

    @Override
    public Product findByBarCode(long barCode) {
        return null;
    }

    @Override
    public Iterable<Product> findByCategoru(String category) {
        return null;
    }

    @Override
    public Iterable<Product> findByBrand(String brand) {
        return null;
    }

    @Override
    public Iterable<Product> findProductsWithExpireDate() {
        return null;
    }

    @Override
    public int skuQuantity() {
        return 0;
    }
}
