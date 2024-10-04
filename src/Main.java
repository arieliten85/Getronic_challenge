import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    // Load products
    private static List<Product> loadProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Drinks("Coca-Cola Zero", 1.5, 20));
        products.add(new Drinks("Coca-Cola", 1.5, 18));
        products.add(new Shampoo("Shampoo Sedal ", 500, 19));
        products.add(new Fruit("Frutillas", 64, "kilo"));
        return products;
    }
    // Main method
    public static void main(String[] args) {
        List<Product> products = loadProducts();
        for (Product product : products) {
            System.out.println(product);
        }
        Product mostExpensiveProduct = Collections.max(products);
        Product cheapestProduct = Collections.min(products);

        System.out.println("=============================");
        System.out.println("Producto más caro: " + mostExpensiveProduct.name);
        System.out.println("Producto más barato: " + cheapestProduct.name);
    }
}
