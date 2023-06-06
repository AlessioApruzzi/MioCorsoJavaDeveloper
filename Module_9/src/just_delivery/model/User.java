package just_delivery.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Getter
@EqualsAndHashCode
public class User {

    @EqualsAndHashCode.Include
    private String name;

    private UUID id;

    private List<Order> ordini;



    public User(){
        ordini= new ArrayList<>();
        id=UUID.randomUUID();
    }




}
