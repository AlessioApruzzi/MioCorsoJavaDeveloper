package tinder_like;

public class Test {
    public static void main(String[] args) {


        Interesse interesse1 = new Interesse( "calcio");
        Interesse interesse2 = new Interesse( "lettura");
        Interesse interesse3 = new Interesse( "Tv Series");
        Interesse interesse4 = new Interesse( "fotografia");

        Utente utente1 = new Utente("alessio", 28);
        Utente utente2 = new Utente("lalala", 23 );
        Utente utente3 = new Utente("lololo", 35 );
      //  Utente utente4 = new Utente("lololo", 35, 3);

        utente1.addInteresse(interesse1);
        utente1.addInteresse(interesse2);
        utente1.addInteresse(interesse3);
        utente2.addInteresse(interesse3);
        utente2.addInteresse(interesse4);
        utente3.addInteresse(interesse2);
        utente3.addInteresse(interesse3);

        TinderApp tinderApp = new TinderApp();
        tinderApp.addUtenteAndInteressi(utente1);
        tinderApp.addUtenteAndInteressi(utente2);
        tinderApp.addUtenteAndInteressi(utente3);
      //  tinderApp.addUtenteAndInteressi(utente4);

        System.out.println(utente1);
        System.out.println(tinderApp.getUtenti());
        System.out.println(tinderApp.mostCommonInterest(utente1));
        System.out.println(tinderApp.getMostSimilarUser());
    }
}
