package esempi_classi;

public class Professore extends Persona{

    private int id;
    public Professore(String name){
        super(name);
    }

    @Override
    public void sayMyName(){
        super.sayMyName();
        System.out.println("Sono il professore " + name);
    }


}
