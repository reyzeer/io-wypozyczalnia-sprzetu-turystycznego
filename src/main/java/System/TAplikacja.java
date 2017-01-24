package System;

import System.Katalog.BazaSprzetu;
import System.Katalog.Kategoria.Kategoria;
import System.Katalog.Sprzet;
import System.ObslugaKlienta.Klienci.Klient;
import System.ObslugaKlienta.Wypozyczenia.BazaWypozyczen;
import System.ObslugaKlienta.Wypozyczenia.Wypozyczenie;
import java.util.List;

public class TAplikacja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.err.println("Hello world");
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
            List<Sprzet> sprzet,
            int dataRozpoczeciaWypozyczenia,
            int dataZakonczeniaWypozyczenia,
            boolean zakoczone) {
        
        Wypozyczenie wypozyczenie = new Wypozyczenie();
        
        wypozyczenie.setKlient(klient);
        wypozyczenie.setSprzet(sprzet);
        wypozyczenie.setDataRozpoczeciaWypozyczenia(dataRozpoczeciaWypozyczenia);

        BazaWypozyczen.dodaj(wypozyczenie);
    
    }

    public void zamkniecieWypozyczenia(int dataZakonczeniaWypozyczenia) {
        
        Wypozyczenie wypozyczenie = new Wypozyczenie();
        
        wypozyczenie.setDataZakonczeniaWypozyczenia(dataZakonczeniaWypozyczenia);
        wypozyczenie.setZakonczone(true);
        
        BazaWypozyczen.usun(wypozyczenie);
    }

    public void dodanieNowejKategorii(String name) {
        
        Kategoria kategoria = new Kategoria();
        kategoria.setNazwa(name);
        
    }

}