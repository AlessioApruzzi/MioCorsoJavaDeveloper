package lampadina;

public class Lampadina{

    private boolean lampState = false;
    private final int MAX_ACTIVATIONS = 1000;
    private int numActivations = 0;
    private static boolean courrent = false;

    public Lampadina() {
        this.lampState = lampState;
        this.numActivations = numActivations;
    }

    public void lampSt(){
        if(courrent) {
            if (numActivations < MAX_ACTIVATIONS) {
                if (lampState) {
                    System.out.println("Lamp is on");
                } else {
                    System.out.println("Lamp is off");
                }
            } else {
                System.out.println("Broken lamp");
            }
        } else {
            System.out.println("No courrent");
        }
    }


    public void lampActuator(){
        if (numActivations < MAX_ACTIVATIONS){
            this.lampState = !lampState;
            numActivations++;
        } else {
            System.out.println("Broken lamp");
            numActivations++;
        }
    }

    public void interruttore(){
        lampActuator();
    }

    public void courrentSwitch(){
        courrent =! courrent;
    }

    public void isCourrent() {
        if (courrent) {
            System.out.println("Courrent is on.");
        } else {
            System.out.println("Courrent is off");
        }
    }

    public void setCourrent(boolean courrent) {
        Lampadina.courrent = courrent;
    }

    public void isLampState() {
        if(lampState){
            System.out.println("Lamp is on");
        } else {
            System.out.println("Lamp is off");
        }
    }

    public void setLampState(boolean lampState) {
        this.lampState = lampState;
    }

    public int getNumActivations() {
        /* if (numActivations < MAX_ACTIVATIONS) {
            return numActivations;
        } else {
            System.out.println("The lamp is broken!");
            return numActivations;
        }

         */
        return numActivations;
    }

    public void setNumActivations(int numActivations) {
        this.numActivations = numActivations;
    }


}
