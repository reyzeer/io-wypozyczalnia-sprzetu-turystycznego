package System;

import System.Katalog.BazaSprzetu;
import System.Katalog.Kategoria.Kategoria;
import System.Katalog.Sprzet;
import System.ObslugaKlienta.Klienci.Klient;
import System.ObslugaKlienta.Wypozyczenia.BazaWypozyczen;
import System.ObslugaKlienta.Wypozyczenia.Wypozyczenie;

public class TAplikacja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.err.println("Hello world");
        
        // TODO code application logic here
    }

    public void dodanieNowegoSprzetu(
            String name,
            int ilosc,
            int dlugoscOkresu,
            int cenaZaOkres, 
            Kategoria katgoria,
            int maksymalnyCzasWypozyczenia) {
        
        Sprzet sprzet = new Sprzet(); 
       
        sprzet.setNazwa(name);
        sprzet.setIlosc(ilosc);
        sprzet.setDlugoscOkresu(dlugoscOkresu);
        sprzet.setCenaZaOkres(cenaZaOkres);
        sprzet.setKategoria(katgoria);
        sprzet.setMaksymalnyCzasWypozyczenia(maksymalnyCzasWypozyczenia);
        
        BazaSprzetu.dodaj(sprzet);
        
    }

    public void dodanieNowegoWypozyczenia(
            Klient klient,
            Sprzet[] sprzet,
            int dataRozpoczeciaWypozyczenia,
            int dataZakonczeniaWypozyczenia,
            boolean zakoczone) {
        
        Wypozyczenie wypozyczenie = new Wypozyczenie();
        
        wypozyczenie.setKlient(klient);
        wypozyczenie.setSprzet(sprzet);
        wypozyczenie.setDataRozpoczeciaWypozyczenia(dataRozpoczeciaWypozyczenia);

        BazaWypozyczen.dodaj(wypozyczenie);
    
    }

    public void zamkniecieWypozyczenia(
            int dataZakonczeniaWypozyczenia,
            boolean zakoczone) {
        
        Wypozyczenie wypozyczenie = new Wypozyczenie();
        
        wypozyczenie.setDataZakonczeniaWypozyczenia(dataZakonczeniaWypozyczenia);
        wypozyczenie.setZakonczone(zakoczone);
        
        BazaWypozyczen.usun(wypozyczenie)
        // TODO - implement TAplikacja.zamkniecieWypozyczenia
        throw new UnsupportedOperationException();
    }

    public void dodanieNowejKategorii(
            String name) {
        
        Kategoria kategoria = new Kategoria ();
        
        kategoria.setNazwa();
        
        // TODO - implement TAplikacja.dodanieNowejKategorii
        throw new UnsupportedOperationException();
    }

}