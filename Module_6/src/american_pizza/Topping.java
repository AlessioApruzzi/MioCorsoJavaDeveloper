package american_pizza;

public class Topping extends Prodotti{

    private double calorie;

    Topping(String nome){
        setNome(nome);
    }

    Topping(String nome ,double calorie, double prezzo){
        setNome(nome);
        this.setPrezzo(prezzo);
        this.calorie+=calorie;
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
