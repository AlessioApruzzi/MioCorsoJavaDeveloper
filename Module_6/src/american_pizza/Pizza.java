package american_pizza;

public class Pizza extends Prodotti {

    private double calorie = 1104;
    private double prezzo = 4.99;


    private Topping[] pizza = new Topping[0];
    private boolean formatoFamiglia= false;

    Pizza(){
    }

    Pizza(String nome,Topping[] toppings, double prezzo){
        setNome(nome);
        for (int i = 0; i < toppings.length; i++) {
            addTopping(toppings[i]);
        }
        this.calorie=calorie;
        this.prezzo=prezzo;
    }




    public void addTopping(Topping topping){
        Topping[] temp = new Topping[pizza.length+1];
        for (int i = 0; i < pizza.length; i++) {
            temp[i]=pizza[i];
        }
        temp[pizza.length]= topping;
        pizza=temp;
        calorie+=topping.getCalorie();
        prezzo+=topping.getPrezzo();
    }

    public void addToppings(Topping[] topping){
        Topping[] temp = new Topping[pizza.length+ topping.length];
        for (int i = 0; i < pizza.length; i++) {
            temp[i]=pizza[i];
        }
        for (int i = 0; i < topping.length; i++) {
            temp[pizza.length+i]=topping[i];
            calorie+=topping[i].getCalorie();
            prezzo+=topping[i].getPrezzo();
        }
        pizza=temp;
    }



    public Topping getTopping(int k){
        return pizza[k];
    }

    public double getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public Topping[] getPizza() {
        return pizza;
    }

    public void setPizza(Topping[] pizza) {
        this.pizza = pizza;
    }

    public boolean isFormatoFamiglia() {
        return formatoFamiglia;
    }

    public void setFormatoFamiglia(boolean formatoFamiglia) {
        if (formatoFamiglia){
            setPrezzo(4.15);
            calorie *= 1.95;
        }
        this.formatoFamiglia = formatoFamiglia;
    }


    @Override
    public String toString() {
        return   getNome() +
                " calorie=" + calorie +
                ", prezzo=" + prezzo + "\n";
    }
}
