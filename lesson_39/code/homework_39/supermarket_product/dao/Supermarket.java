package homework_39.supermarket_product.dao;

import homework_39.supermarket_product.model.Product;

public interface Supermarket {
    boolean addProduct (Product product);
    Product removeProduct (long barCode);
    Product findByBarCode (long barCode);
    Iterable <Product> findByCategoru (String category);
    Iterable <Product> findByBrand (String brand);
    Iterable <Product> findProductsWithExpireDate();
    int skuQuantity();

}
