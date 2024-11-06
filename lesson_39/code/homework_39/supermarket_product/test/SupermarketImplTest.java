package homework_39.supermarket_product.test;

import homework_39.supermarket_product.dao.Supermarket;
import homework_39.supermarket_product.dao.SupermarketImpl;
import homework_39.supermarket_product.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketImplTest {

    Supermarket supermarket;
    Product[] products;

    @BeforeEach
    void setUp() {
        supermarket = new SupermarketImpl(5);

        products = new Product[] {
                new Product(1001L, "Dairy", "BrandA", "ASUS", 100, LocalDate.of(2023, 11, 25)),
                new Product(1002L, "Beverages", "BrandB", "BrandB", 50, LocalDate.of(2024, 6, 15)),
                new Product(1003L, "Snacks", "BrandC", "Sony", 30, LocalDate.of(2023, 12, 30)),
                new Product(1004L, "Dairy", "BrandA", "HP", 70, LocalDate.of(2025, 3, 20)),
                new Product(1005L, "Frozen", "BrandD", "LG", 80, LocalDate.of(2025, 8, 10))
        };

        for (Product product : products) {
            supermarket.addProduct(product);
        }
    }

    @Test
    void addProductTest() {
         assertFalse(supermarket.addProduct(products[0]));
        Product newProduct = new Product(1006L, "Canned", "BrandE", "Samsung", 60, LocalDate.of(2024, 2, 14));
        assertTrue(supermarket.addProduct(newProduct));
        assertEquals(6, supermarket.skuQuantity());
    }

    @Test
    void removeProductTest() {

        assertEquals(products[2], supermarket.removeProduct(1003L));
        assertEquals(4, supermarket.skuQuantity());
        assertNull(supermarket.removeProduct(1003L));
    }

    @Test
    void findByBarCodeTest() {
        assertEquals(products[2], supermarket.findByBarCode(1003L));
        assertNull(supermarket.findByBarCode(9999L));
    }

    @Test
    void findByCategoryTest() {

    }

    @Test
    void findByBrandTest() {

    }


}
