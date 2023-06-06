package just_delivery.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JustDelivery {

    private List<User> users;
    private List<Restaurant> restaurants;

    public JustDelivery(List<User> users, List<Restaurant> restaurants) {
        this.users = users;
        this.restaurants = restaurants;
    }

    public JustDelivery() {
        users = new ArrayList<>();
        restaurants = new ArrayList<>();
    }

    public void addUser(User user){
        users.add(user);
    }

    public void addRestaurant(Restaurant restaurant){
        restaurants.add(restaurant);
    }

    public void insertMenuInRestaurant(Menu menu, Restaurant restaurant){
        restaurant.addMenu(menu);
    }

    public Set<Restaurant> findRestaurantByCousine(CuisineType cuisineType){
        Set<Restaurant> restaurantsByCousine = new HashSet<>();
        for (Restaurant restaurant : restaurants) {
            for (Product product : restaurant.getMenu().getProdotti()) {
                if (product.getCuisineType()==cuisineType){
                    restaurantsByCousine.add(restaurant);
                }
            }
        }
        return restaurantsByCousine;
    }

    public void printMenu(Menu menu){
        for (Product product : menu.getProdotti()) {
            System.out.println(product);
        }
    }

    public void addProdotti (){

    }

    public void stampaOrdine(){

    }

  /*  public List<Order> getStoricoOrdiniByUtente(User utente){

    }


    public List<Restaurant> getRestaurantByUserOrderedByQuantity(User user){

    }

    public void getFavouriteCuisineByUser (User user){

    }

    public List<Restaurant> getRestauransWithFavouriteCuisineByUserWithNoOrder(User user){

    }


   */

}
