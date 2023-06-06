package just_delivery.model;

import java.util.List;

public class Order {

    private Restaurant restaurant;
    private List<Product> products;

    public Order(Restaurant restaurant, List<Product> products) {
        this.restaurant = restaurant;
        this.products = products;
    }

    public void addProduct (Product product){
        products.add(product);
    }
}
