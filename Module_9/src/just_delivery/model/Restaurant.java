package just_delivery.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
public class Restaurant {

    private String name;
    private Menu menu;
    private List<Order> orders;

    public Restaurant(String name){
        this.name=name;
        menu = new Menu();
        orders=new ArrayList<>();
    }

    public int getOrdersSizeByUser(User user) {
        int counter = 0;
        for (Order order : orders) {
            if (order.getUser()==user){
               counter++;
            }
        }
        return counter;
    }
    public Set<CuisineType> getCousineType(){
        Set<CuisineType> getCousineType =new HashSet<>();
        for (Product product : menu.getProducts()) {
            getCousineType.add(product.getCuisineType());
        }
        return getCousineType;
    }

    public void addMenu(Menu menu){
        this.menu=menu;
    }

    public void addOrder(Order order){
        orders.add(order);
    }


    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                '}';
    }
}
