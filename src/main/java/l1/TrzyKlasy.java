package l1;

/**
 * Hello world!
 *
 */
public class TrzyKlasy
{
    public static void main( String[] args )
    {
        System.out.println("Trzy współpracujące klasy?");
        Imie imie = new Imie();
        imie.show();
        Nazwisko nazwisko = new Nazwisko();
        nazwisko.show();
    }
}
