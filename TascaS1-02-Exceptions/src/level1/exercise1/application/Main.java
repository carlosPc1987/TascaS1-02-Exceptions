package level1.exercise1.application;

import level1.exercise1.exceptions.EmptySaleException;
import level1.exercise1.model.Product;
import level1.exercise1.model.Sale;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sale sale = new Sale();

        try {
            sale.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println("Caught EmptySaleException: " + e.getMessage());
        }

        sale.addProduct(new Product("Laptop", 1500.99));
        sale.addProduct(new Product("Mouse", 49.99));
        sale.addProduct(new Product("Keyboard", 59.99));

        try {
            sale.calculateTotal();
            System.out.println("Total sale price: $" + sale.getTotalPrice());
            List<Product> products = sale.getProducts();
            System.out.println("Trying to access index 5 (doesn't exist):");
            Product nonExistentProduct = products.get(5);
        } catch (EmptySaleException e) {
            System.out.println("Caught EmptySaleException: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught IndexOutOfBoundsException: " + e.getMessage());
        }
    }
}