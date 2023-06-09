package just_delivery.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
@Getter
public class Order {

    private Restaurant restaurant;
    private List<Product> products;
    private User user;

    public Order(Restaurant restaurant, User user) {
        this.restaurant = restaurant;
        products= new ArrayList<>();
        this.user= user;
    }

    public Order() {
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void addProduct (Product product){
        products.add(product);
    }

    @Override
    public String toString() {
        return "Order{" +
                "restaurant=" + restaurant +
                ", products=" + products +
                '}';
    }
}
