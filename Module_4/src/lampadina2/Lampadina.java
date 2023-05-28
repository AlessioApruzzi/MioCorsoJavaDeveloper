package lampadina2;

public class Lampadina {

    private static boolean corrente = true;
    private StatoLampadina stato = StatoLampadina.SPENTA;
    private StatoLampadina statoSenzaCorrente;
    private final int maxUtilizzi = 5;
    // private final static int MAX_UTILIZZI_DEFAULT = 5;
    private int countUtilizzi = 0;

    Lampadina() {

    }

  /*  Lampadina(int maxUtilizzi) {
        this.maxUtilizzi = maxUtilizzi;

    }*/

    public StatoLampadina getStato() {
        return stato;
    }


    public void toggleCorrente(){
        corrente = !corrente;

        if (!corrente){
            if(stato != StatoLampadina.ROTTA){
                statoSenzaCorrente = stato;
                stato= StatoLampadina.SPENTA;
            }
        } else {
            stato =statoSenzaCorrente;
        }
    }
    public void azione() {


        //posso usare il ++ nell'if
        // countUtilizzi++;

        if (++countUtilizzi > maxUtilizzi) {
            stato = StatoLampadina.ROTTA;
        } else {
            //    //l'operatore ternario puo essere piu leggibile rispetto ad un if su 4 righe se condizione e calori sono piccoli
            //    stato = stato == StatoLampadina.ACCESA ? StatoLampadina.SPENTA : StatoLampadina.ACCESA;

            if (stato == StatoLampadina.ACCESA) {
                stato = StatoLampadina.SPENTA;
            } else if (corrente) {
                stato = StatoLampadina.ACCESA;
            }

        }
    }

    public static void main(String[] args) {
        Lampadina lampadina = new Lampadina();
        System.out.println(lampadina.getStato());  //spenta
        lampadina.azione();
        System.out.println(lampadina.getStato());  // accesa
        lampadina.toggleCorrente();
        System.out.println(lampadina.getStato());  // spenta
        lampadina.azione();
        System.out.println(lampadina.getStato());  // spenta
        lampadina.toggleCorrente();
        System.out.println(lampadina.getStato());  // accesa
    }
}
