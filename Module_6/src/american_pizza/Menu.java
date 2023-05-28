package american_pizza;

import java.util.Arrays;

public class Menu {

    private Pizza[] pizzas;
    private Drink[] drinks;
    private Prodotti[] prodottis;
    private Topping[] toppings;

    public Menu(){

        Topping pomodoro = new Topping("Tomato");
        Topping mozzarella = new Topping("Mozzarella");
        Topping cheese = new Topping("Cheese" ,92, 0.69);
        Topping ham = new Topping("Ham",35, 0.99);
        Topping onions = new Topping("Onions",22, 0.69);
        Topping pineapple = new Topping("Pineapple" ,24, 0.79);
        Topping salame = new Topping("Salame" ,86, 0.99);

        toppings= new Topping[]{pomodoro,mozzarella,cheese,ham,onions,pineapple,salame};

        //Pizzas
        Pizza margherita = new Pizza("Margherita",new Topping[]{pomodoro,mozzarella}, 4.99);
        Pizza hawaiian = new Pizza("Hawaiian Pizza",new Topping[]{pomodoro, mozzarella, ham, pineapple}, 6.49);
        Pizza salami = new Pizza("Salami Pizza",new Topping[]{pomodoro,mozzarella,salame}, 5.99);

        pizzas = new Pizza[]{margherita,hawaiian,salami};

        //Drinks
        Drink lemonade = new Drink("Lemonade (0.33l)", 1.29, 128);
        Drink water = new Drink("Water (0,5l)", 1.29, 0);
        Drink wine = new Drink("Wine (0,75l , 13%)", 7.49, 607);

        drinks= new Drink[]{lemonade,water,wine};

        //Products
        Prodotti shirt = new Prodotti("Shirt",21.99);
        Prodotti mug = new Prodotti("Mug",4.99);

        prodottis= new Prodotti[]{shirt,mug};

    }



    public Pizza[] getPizzas() {
        return pizzas;
    }

    public Drink[] getDrinks() {
        return drinks;
    }

    public Prodotti[] getProdottis() {
        return prodottis;
    }

    public Topping[] getToppings() {
        return toppings;
    }

    @Override
    public String toString() {
        return "Menu" + "\n" +
                "Pizzas" + "\n" + Arrays.toString(pizzas) + "\n" +
                "Drinks" + "\n" + Arrays.toString(drinks) + "\n" +
                "Prodottis" + "\n" + Arrays.toString(prodottis) + "\n" +
                "Toppings" + "\n" + Arrays.toString(toppings) ;
    }
}
