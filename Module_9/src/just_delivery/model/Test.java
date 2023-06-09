package just_delivery.model;
import java.util.*;

public class Test {

        public static void main(String[] args) {

            // Creazione di alcuni oggetti di esempio per il test
            User user1 = new User("Alice");
            User user2 = new User("Bob");
            User user3 = new User("Charlie");

            Restaurant restaurant1 = new Restaurant("Ristorante 1");
            Restaurant restaurant2 = new Restaurant("Ristorante 2");
            Restaurant restaurant3 = new Restaurant("Ristorante 3");

            Menu menu1 = new Menu();
            menu1.addProduct(new Product("Pizza Margherita", CuisineType.ITALIAN, 4.5));
            menu1.addProduct(new Product("Pasta al Pomodoro", CuisineType.ITALIAN, 8));
            menu1.addProduct(new Product("Tiramisù", CuisineType.ITALIAN, 4));

            Menu menu2 = new Menu();
            menu2.addProduct(new Product("Sushi Misto", CuisineType.JAPANESE, 12));
            menu2.addProduct(new Product("Gyoza", CuisineType.JAPANESE, 3));
            menu2.addProduct(new Product("Mochi", CuisineType.JAPANESE, 2.5));

            restaurant1.addMenu(menu1);
            restaurant2.addMenu(menu2);

            JustDelivery justDelivery = new JustDelivery();
            justDelivery.addUser(user1);
            justDelivery.addUser(user2);
            justDelivery.addRestaurant(restaurant1);
            justDelivery.addRestaurant(restaurant2);
            justDelivery.addRestaurant(restaurant3);
            justDelivery.insertMenuInRestaurant(menu1, restaurant1);
            justDelivery.insertMenuInRestaurant(menu2, restaurant2);

            // Test del metodo findRestaurantByCousine
            Set<Restaurant> italianRestaurants = justDelivery.findRestaurantByCousine(CuisineType.ITALIAN);
            System.out.println("Ristoranti italiani:");
            for (Restaurant restaurant : italianRestaurants) {
                System.out.println(restaurant.getName());
            }

            //Test print menu
            System.out.println("print menu1");
            justDelivery.printMenu(menu1);
            System.out.println("print menu2");
            justDelivery.printMenu(menu2);


            // Test del metodo addProductsToOrder
            Order order1 = new Order( restaurant1,user1);
            Order order2 = new Order( restaurant2,user1);
            justDelivery.addProductsToOrder(menu1.getProductByName("Pizza Margherita"), restaurant1, order1, user1);
            justDelivery.addProductsToOrder(menu2.getProductByName("Sushi Misto"), restaurant2, order2, user1);
            System.out.println("Prodotti nell'ordine:");
            justDelivery.stampaOrdine(order2);

            // Test del metodo getStoricoOrdiniByUtente
            List<Order> user1Orders = justDelivery.getStoricoOrdiniByUtente(user1);
            System.out.println("Storico ordini per User1:");
            for (Order o : user1Orders) {
                System.out.println(o);
            }

            // Test del metodo getRestaurantByUserOrderedByQuantity
            List<Restaurant> restaurantsOrderedByQuantity = justDelivery.getRestaurantByUserOrderedByQuantity(user1);
            System.out.println("Ristoranti ordinati per quantità di ordini da parte di User1:");
            for (Restaurant restaurant : restaurantsOrderedByQuantity) {
                System.out.println(restaurant.getName());
            }

            // Test del metodo getFavouriteCuisineByUser
            CuisineType user1FavouriteCuisine = justDelivery.getFavouriteCuisineByUser(user1);
            System.out.println("Cucina preferita di User1: " + user1FavouriteCuisine);


            restaurant3.addMenu(menu2);
            // Test del metodo getRestauransWithFavouriteCuisineByUserWithNoOrder
            List<Restaurant> restaurantsWithNoOrder = justDelivery.getRestauransWithFavouriteCuisineByUserWithNoOrder(user1);
            System.out.println("Ristoranti con la cucina preferita di User1 e senza ordini da parte di User1:");
            for (Restaurant restaurant : restaurantsWithNoOrder) {
                System.out.println(restaurant.getName());
            }


        }
    }




