package just_delivery.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Getter

public class User {

    private String name;

    private UUID id;

    private List<Order> ordini;



    public User(String name){
        ordini= new ArrayList<>();
        id=UUID.randomUUID();
    }

    public void addOrdine(Order order){
        ordini.add(order);
    }




}
