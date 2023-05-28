package american_pizza;

public class Drink extends Prodotti{

    private double calorie;


    Drink(){}

    Drink(String nome){
        setNome(nome);
    }


    Drink(String nome, double prezzo, int calorie){
        setNome(nome);
        setCalorie(calorie);
        setPrezzo(prezzo);
    }


    public double getCalorie() {
        return calorie;
    }

    public void setCalorie(double calorie) {
        this.calorie = calorie;
    }

    @Override
    public String toString() {
        return   getNome() + " calorie=" + calorie +
                ", prezzo=" + getPrezzo() + "\n";
    }
}
