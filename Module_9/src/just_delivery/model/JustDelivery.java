package just_delivery.model;

import lombok.Getter;

import java.util.*;
@Getter
public class JustDelivery {

    private List<User> users;
    private List<Restaurant> restaurants;
    private List<Order> orders;

    public JustDelivery(List<User> users, List<Restaurant> restaurants) {
        users = new ArrayList<>();
        this.users = users;
        restaurants = new ArrayList<>();
        this.restaurants = restaurants;
        orders = new ArrayList<>();
    }

    public JustDelivery() {
        users = new ArrayList<>();
        restaurants = new ArrayList<>();
        orders = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    public void insertMenuInRestaurant(Menu menu, Restaurant restaurant) {
        restaurant.addMenu(menu);
    }

    public Set<Restaurant> findRestaurantByCousine(CuisineType cuisineType) {
        Set<Restaurant> restaurantsByCousine = new HashSet<>();
        for (Restaurant restaurant : restaurants) {
            for (Product product : restaurant.getMenu().getProducts()) {
                if (product.getCuisineType() == cuisineType) {
                    restaurantsByCousine.add(restaurant);
                }
            }
        }
        return restaurantsByCousine;
    }

    public void printMenu(Menu menu) {

        for (Product product : menu.getProducts()) {
            System.out.println(product);
        }
    }

    public void addProductsToOrder(Product product, Restaurant restaurant, Order order, User user) {
        if (restaurant.getMenu().getProducts().contains(product)) {
            if (user.getOrdini().contains(order) && order.getRestaurant()==restaurant){
                order.setRestaurant(restaurant);
                order.addProduct(product);
                user.addOrdine(order);
                restaurant.addOrder(order);
            } else if(!user.getOrdini().contains(order) ){
                order.setRestaurant(restaurant);
                user.addOrdine(order);
                order.addProduct(product);
                restaurant.addOrder(order);
            }
        /*    if (user.getOrdini().contains(order)) {
                for (Order order1 : user.getOrdini()) {
                    if (order1 == order) {
                     //   order1.addProduct(product);
                    }
                }
            } else user.addOrdine(order);
        }

         */
        }
    }


    public void stampaOrdine(Order order) {
        for (Product product : order.getProducts()) {
            System.out.println(product);
        }
    }

    public List<Order> getStoricoOrdiniByUtente(User user) {

        return user.getOrdini();
    }


    public List<Restaurant> getRestaurantByUserOrderedByQuantity(User user) {
        List<Restaurant> restaurantsByOrderQuantity = new ArrayList<>();
        for (Order order : user.getOrdini()) {
            if (order.getUser() == user) {
                restaurantsByOrderQuantity.add(order.getRestaurant());
            }
        }
        restaurantsByOrderQuantity.sort(Comparator.comparing(restaurant -> restaurant.getOrdersSizeByUser(user)));

        return restaurantsByOrderQuantity;
    }



    public CuisineType getFavouriteCuisineByUser(User user) {
       // List<CuisineType> cuisineTypes = new ArrayList<>();
        Map<CuisineType, Integer> cuisineTypeIntegerMap = new HashMap<>();
        for (Order order : user.getOrdini()) {
            for (Product product : order.getProducts()) {
                Integer count = cuisineTypeIntegerMap.get(product.getCuisineType());
                if (count == null) {
                    cuisineTypeIntegerMap.put(product.getCuisineType(), 1);
                } else {
                    cuisineTypeIntegerMap.put(product.getCuisineType(), count + 1);
                }
            }
        }
        CuisineType chiaveMax = null;
        int valoreMax = Integer.MIN_VALUE;
        for (Map.Entry<CuisineType, Integer> entry : cuisineTypeIntegerMap.entrySet()) {
            if (entry.getValue() > valoreMax) {
                valoreMax = entry.getValue();
                chiaveMax = entry.getKey();
            }
        }
        return chiaveMax;
    }

    public List<Restaurant> getRestauransWithFavouriteCuisineByUserWithNoOrder(User user) {
        List<Restaurant> noTryRestaurant = new ArrayList<>();
     //   CuisineType mostPreferredType = getFavouriteCuisineByUser(user);
        for (Restaurant restaurant : restaurants) {
            boolean verify = false;
            if (restaurant.getCousineType().contains(getFavouriteCuisineByUser(user))) {
                for (Order order : restaurant.getOrders()) {
                    if (order.getUser() == user) {
                        verify = true;
                    }
                }
                if (!verify) {
                    noTryRestaurant.add(restaurant);
                }
            }
        }
        return noTryRestaurant;
    }

}



