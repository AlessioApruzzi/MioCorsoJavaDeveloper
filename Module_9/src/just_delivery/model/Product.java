package just_delivery.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Product {

    private String nome;
    private CuisineType cuisineType;



    @Override
    public String toString() {
        return "Prodotto{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
