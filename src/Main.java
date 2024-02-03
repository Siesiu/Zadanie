import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //Fragment testowania adresu
        /*Adres adres = Adres.dodajAdres();
        System.out.println(adres == null ? "null" : adres.wypiszDane());
        try {
            Adres tempAdres = Adres.edytujAdres(adres);
            System.out.println(tempAdres.wypiszDane());
        } catch (NullPointerException e) {
            System.out.println("Null");
        }*/


//        Wojewodztwo.wylistujWszystkie();


        /*Przychodnia przychodnia = Przychodnia.dodajPrzychodnie();
        try {
            System.out.println(przychodnia.wypiszDane());
        } catch (NullPointerException e) {
            System.out.println("NULL");
        }*/

        /*Przychodnia przychodnia = Przychodnia.dodajPrzychodnie();
        System.out.println(przychodnia.wypiszDane());
        przychodnia = Przychodnia.edytujPrzychodnie(przychodnia);
        System.out.println("Po edycji");
        System.out.println(przychodnia.wypiszDane());*/

        /*Lekarz lekarz = Lekarz.dodajLekarz();
        System.out.println(lekarz.wypiszDane());
        lekarz = Lekarz.edytujLekarz(lekarz);
        System.out.println("Po edycji");
        System.out.println(lekarz.wypiszDane());*/

        /*Pacjent pacjent = Pacjent.dodajPacjent();
        System.out.println(pacjent.wypiszDane());
        pacjent = Pacjent.edytujPacjent(pacjent);
        System.out.println("Po edycji");
        System.out.println(pacjent.wypiszDane());*/

        AlfaIOmega.run();


    }
}