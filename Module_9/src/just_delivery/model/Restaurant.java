package just_delivery.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Getter
public class Restaurant {

    private String nome;
    private Menu menu;
    private List<Order> orders;

    public Restaurant(){
        menu = new Menu(this);
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

    public void addMenu(Menu menu){
        this.menu=menu;
    }

    public void addOrder(Order order){
        orders.add(order);
    }



}
