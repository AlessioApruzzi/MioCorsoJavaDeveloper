package just_delivery.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Product {

    private String nome;
    private CuisineType cuisineType;
    private double prezzo;


    @Override
    public String toString() {
        return "Product{" +
                "nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }
}
