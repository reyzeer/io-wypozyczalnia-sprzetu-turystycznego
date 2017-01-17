package System;

import System.Katalog.BazaSprzetu;
import System.Katalog.Kategoria.Kategoria;
import System.Katalog.Sprzet;

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
        
        // TODO - implement TAplikacja.dodanieNowegoSprzetu
        throw new UnsupportedOperationException();
    }

    public void dodanieNowegoWypozyczenia() {
        // TODO - implement TAplikacja.dodanieNowegoWypozyczenia
        throw new UnsupportedOperationException();
    }

    public void zamkniecieWypozyczenia() {
        // TODO - implement TAplikacja.zamkniecieWypozyczenia
        throw new UnsupportedOperationException();
    }

    public void dodanieNowejKategorii() {
        // TODO - implement TAplikacja.dodanieNowejKategorii
        throw new UnsupportedOperationException();
    }

}