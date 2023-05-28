package lampadina2;

public class Interruttore {

    private boolean acceso = true;
    private Lampadina[] lampadine;

    Interruttore(){}

    Interruttore(Lampadina lampadina){

        this.lampadine = new Lampadina[]{lampadina};
    }

    Interruttore(Lampadina[] lampadina){
        this.lampadine= lampadine;
    }

    public void toggle(){
        for (int i = 0; i < this.lampadine.length; i++) {
            this.lampadine[i].azione();
        }

        /*
        //  for each
        for (Lampadina.Lampadina lampadina : this.lampadine) {
            lampadine.azione;
        }
        */
    }
}
