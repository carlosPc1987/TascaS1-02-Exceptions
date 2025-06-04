package level1.exercise1.model;
import level1.exercise1.model.exceptions.EmptySaleException;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    private List<Product> products;
    private double totalPrice;

    public Sale() {
        this.products = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void calculateTotal() throws EmptySaleException {
        if (products.isEmpty()) {
            throw new EmptySaleException();
        }

        this.totalPrice = 0.0;
        for (Product product : products) {
            this.totalPrice += product.getPrice();
        }
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public List<Product> getProducts() {
        return products;
    }
}


