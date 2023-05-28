package lampadina;

public class Interruttore {

    private boolean interruttoreState = false;
    private Lampadina[] lampadinas;
    public Interruttore() {

        lampadinas = new Lampadina[1000];
        Lampadina lamp1 = lampadinas[0];

    }


    public void interruttoreSwitch(Lampadina lampadina) {
        interruttoreState = !interruttoreState;
        lampadina.setLampState(interruttoreState);

    }


    public void isInterruttoreState() {
        if (interruttoreState){
            System.out.println("Interruttore on");
        } else {
            System.out.println("Interruttore off");
        }
    }

    public void setInterruttoreState(boolean interruttoreState, Lampadina lampadina) {
        this.interruttoreState = interruttoreState;
        lampadina.setLampState(interruttoreState);
    }
}
