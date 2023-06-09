package just_delivery.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashSet;
import java.util.Set;

@Getter
@AllArgsConstructor
public class Menu {

    private Set<Product> products;
   // private static File menu;
 //   private Restaurant restaurant;

    public Menu(){
        products= new HashSet<>();
  //      this.restaurant=restaurant;

        //String filePath = "Module_9/src/just_delivery/resources";
        //Path path = Paths.get("Module_9","src","just_delivery","resources");
        //createMenu(filePath);

    }


    public void addProduct(Product product){
        products.add(product);
    }

    public void printMenu(){
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public Product getProductByName(String name){
        for (Product product : products) {
            if (product.getNome().equals(name)){
                return product;
            }
        }
        return null;
    }

  /*  public void createMenu(String path){

        String pathNew = path+"/"+restaurant.getNome() ;
        menu = new File(pathNew);
        try {
            menu.createNewFile();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

   */

  /*  public void addProdotto(String path, Product product){
        prodotti.add(product);
        try (BufferedWriter bw = Files.newBufferedWriter(Paths.get(path), StandardOpenOption.APPEND)) {
            bw.write(product.toString());
            bw.newLine(); // Vado a capo perchè ho messo io l'istruzione!

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

   */



}


