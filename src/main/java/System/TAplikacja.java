package System;

import System.Katalog.BazaSprzetu;
import System.Katalog.Kategoria.BazaKategorii;
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

        System.err.print(
            "Menu\n" +
            "1.Dodaj nowy sprzęt\n" +
            "2.Dodaj nowe wypozyczenie.\n" +
            "3.Zamkniecie wypozyczenia\n" +
            "4.Dodaj nowa kategorie"
        );
        

    }

    public void dodanieNowegoSprzetu(
            String name,
            int ilosc,
            int dlugoscOkresu,
            int cenaZaOkres, 
            Kategoria kategoria,
            int maksymalnyCzasWypozyczenia) {
        
        /** --- Validacja --- */
        if (name == null || name.isEmpty()) {
            return;
        }
        
        if (ilosc < 0) {
            return;
        }
        
        if (dlugoscOkresu < 1*60*60) {
            return;
        }
        
        if (cenaZaOkres < 1) {
            return;
        }
        
        if (kategoria == null) {
            return;
        }
        
        if (maksymalnyCzasWypozyczenia < dlugoscOkresu) {
            return;
        }
        /** --- Validacja --- */
        
        Sprzet sprzet = new Sprzet(); 
       
        sprzet.setNazwa(name);
        sprzet.setIlosc(ilosc);
        sprzet.setDlugoscOkresu(dlugoscOkresu);
        sprzet.setCenaZaOkres(cenaZaOkres);
        sprzet.setKategoria(kategoria);
        sprzet.setMaksymalnyCzasWypozyczenia(maksymalnyCzasWypozyczenia);
        
        BazaSprzetu.dodaj(sprzet);
        
    }
    
    public int liczbaSprzetuWBazie() {
        return BazaSprzetu.liczbaSprzetu();
        
    }

    public int liczbaKategoriiWBazie() {
        return BazaKategorii.liczbaKategorii();
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
        
        if (name == null || name.isEmpty()) {
            return;
        }
        
        Kategoria modelDoWyszukiwania = new Kategoria();
        modelDoWyszukiwania.setNazwa(name);
        if (BazaKategorii.szukaj(modelDoWyszukiwania) != null) {
            return;
        }
        
        Kategoria kategoria = new Kategoria();
        kategoria.setNazwa(name);
        
        BazaKategorii.dodaj(kategoria);
        
    }

}