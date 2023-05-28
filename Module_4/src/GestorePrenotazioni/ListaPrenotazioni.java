package GestorePrenotazioni;

public class ListaPrenotazioni {

    private Prenotazione[] prenotazioni = new Prenotazione[0];

    public ListaPrenotazioni(){

    }

    public int length(){
        return prenotazioni.length;
    }



    public void add(Prenotazione prenotazione) {
        if (prenotazione != null) {
            for (int i = 0; i < prenotazioni.length; i++) {
                if (prenotazioni[i] == prenotazione) {

                    return;
                }
            }


            Prenotazione[] temp = new Prenotazione[prenotazioni.length + 1];
            for (int i = 0; i < prenotazioni.length; i++) {
                temp[i] = prenotazioni[i];
            }
            temp[prenotazioni.length] = prenotazione;
            prenotazioni = temp;
        }
    }




    public boolean remove(Prenotazione prenotazione){
        if (prenotazione != null) {
            Prenotazione[] temp = new Prenotazione[prenotazioni.length - 1];
            int counter = 0;
            for (int i = 0; i < prenotazioni.length; i++) {
                if (prenotazioni[i]!=prenotazione) {
                    temp[counter] = prenotazioni[i];
                    counter++;
                }
            }
            prenotazioni = temp;
            return true;
        }
        return false;
    }


    public Prenotazione get(int i){
        if (i>prenotazioni.length){
            return null;
        } else{
            return prenotazioni[i];
        }
    }


}
