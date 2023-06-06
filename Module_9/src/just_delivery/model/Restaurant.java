package just_delivery.model;

import lombok.Getter;

import java.util.Set;

@Getter
public class Restaurant {

    private String nome;
    private Menu menu;

    public Restaurant(){
        menu = new Menu();
    }


    public void addMenu(Menu menu){
        this.menu=menu;
    }

}
