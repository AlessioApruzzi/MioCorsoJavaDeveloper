package just_delivery.model;

import java.util.*;

public class JustDelivery {

    private List<User> users;
    private List<Restaurant> restaurants;
    private List<Order> orders;

    public JustDelivery(List<User> users, List<Restaurant> restaurants) {
        this.users = users;
        this.restaurants = restaurants;
    }

    public JustDelivery() {
        users = new ArrayList<>();
        restaurants = new ArrayList<>();
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
        if (order.getRestaurant().getMenu().getProducts().contains(product)) {
            if (orders.contains(order)) {
                order.addProduct(product);
            } else {
                orders.add(order);
                order.addProduct(product);
            }
        }
    }


    public void stampaOrdine(Order order) {
        for (Product product : order.getProducts()) {
            System.out.println(product);
        }
    }

    public List<Order> getStoricoOrdiniByUtente(User user) {
        List<Order> ordersByUser = new ArrayList<>();
        for (Order order : orders) {
            if (order.getUser() == user) {
                ordersByUser.add(order);
            }
        }
        return ordersByUser;
    }


    public List<Restaurant> getRestaurantByUserOrderedByQuantity(User user) {
        List<Restaurant> restaurantsByOrderQuantity = new ArrayList<>();
        for (Order order : orders) {
            if (order.getUser() == user) {
                restaurantsByOrderQuantity.add(order.getRestaurant());
            }
        }
        restaurantsByOrderQuantity.sort(Comparator.comparing(restaurant -> restaurant.getOrdersSizeByUser(user)));
        return restaurantsByOrderQuantity;
    }

    public CuisineType getFavouriteCuisineByUser(User user) {
        List<CuisineType> cuisineTypes = new ArrayList<>();
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
        CuisineType mostPreferredType = getFavouriteCuisineByUser(user);
        for (Restaurant restaurant : restaurants) {
            boolean verifyType = false;
            boolean verifyOrder = false;
            for (Product product : restaurant.getMenu().getProducts()) {
                if (product.getCuisineType() == mostPreferredType) {
                    verifyType = true;
                }
            }
            if (verifyType) {
                for (Order order : restaurant.getOrders()) {
                    if (order.getUser() != user) {
                        verifyOrder = true;
                    }
                }
                if (verifyOrder) {
                    noTryRestaurant.add(restaurant);
                }
            }
        }
        return noTryRestaurant;
    }
}



