package esempi_classi;

public class Main {
    public static void main(String[] args) {

        Studente studente = new Studente("Alessio");
        studente.sayMyName();
        studente.printMatricola();

        Persona persona = studente;
        persona.sayMyName();
        // non c'e' il metodo printMatricola perche la classe persona no ha quel metodo
    }
}
