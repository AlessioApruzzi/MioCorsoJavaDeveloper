package classifica_serie_a;

public class Squadra {

    private int id;
    private String nome;
    private RosaGiocatori rosaGiocatori;
    private int punteggio;
    private int golFatti;
    private int golSubiti;

    Squadra(){}

    Squadra(int id, String nome){
        this.id=id;
        this.nome=nome;
    }

    Squadra(int id, String nome, int golFatti, int golSubiti){
        this.id=id;
        this.nome=nome;
        this.golFatti=golFatti;
        this.golSubiti=golSubiti;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RosaGiocatori getRosaGiocatori() {
        return rosaGiocatori;
    }

    public void setRosaGiocatori(RosaGiocatori rosaGiocatori) {
        this.rosaGiocatori = rosaGiocatori;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(int punteggio) {
        this.punteggio = punteggio;
    }
    public void addPunteggio(int punteggio) {
        this.punteggio += punteggio;
    }

    public int getGolFatti() {
        return golFatti;
    }



    public void setGolFatti(int golFatti) {
        this.golFatti = golFatti;
    }

    public void addGolFatti(int golFatti) {

        this.golFatti += golFatti;
    }

    public int getGolSubiti() {
        return golSubiti;
    }

    public void setGolSubiti(int golSubiti) {
        this.golSubiti = golSubiti;
    }

    @Override
    public String toString() {
        return "Squadra{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", rosaGiocatori=" + rosaGiocatori +
                ", punteggio=" + punteggio +
                ", golFatti=" + golFatti +
                ", golSubiti=" + golSubiti +
                '}';
    }
}
