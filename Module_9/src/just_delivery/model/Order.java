package just_delivery.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
@Getter
public class Order {

    private Restaurant restaurant;
    private List<Product> products;
    private User user;

    public Order(Restaurant restaurant, List<Product> products) {
        this.restaurant = restaurant;
        this.products = products;
    }

    public Order() {
    }

    public void addProduct (Product product){
        products.add(product);
    }
}
