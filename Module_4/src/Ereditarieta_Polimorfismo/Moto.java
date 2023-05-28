package Ereditarieta_Polimorfismo;

public class Moto extends Veicolo{

    private int cilindrata;

    public Moto(String marca, String modello, int cilindrata) {
        super(marca, modello);  // chiamata al costruttore della classe (Veicolo)
        // Posso aggiungere quello che voglio
        this.cilindrata=cilindrata;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void avviaMoto(){
        System.out.println("Sto avviando la moto..");
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    @Override
    public String toString() {
        // super.toString()
        return "Moto{" +
                "cilindrata=" + cilindrata +
                '}';
    }
}
