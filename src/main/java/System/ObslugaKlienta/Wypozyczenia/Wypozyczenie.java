package System.ObslugaKlienta.Wypozyczenia;

import System.ObslugaKlienta.Klienci.*;
import System.Katalog.*;

public class Wypozyczenie {

    private Klient klient;
    private Sprzet[] sprzet;
    private int dataRozpoczeciaWypozyczenia;
    private int dataZakonczeniaWypozyczenia;
    private boolean zakoczone;

    public void wydanieSprzetu() {
        // TODO - implement Wypozyczenie.wydanieSprzetu
        throw new UnsupportedOperationException();
    }

    public void zamkniecieWypozyczenia() {
        // TODO - implement Wypozyczenie.zamkniecieWypozyczenia
        throw new UnsupportedOperationException();
    }

    public void odebranieSprzetu() {
        // TODO - implement Wypozyczenie.odebranieSprzetu
        throw new UnsupportedOperationException();
    }

    public void weryfikacjaSprzetu() {
        // TODO - implement Wypozyczenie.weryfikacjaSprzetu
        throw new UnsupportedOperationException();
    }

    public void naliczenieOplaty() {
        // TODO - implement Wypozyczenie.naliczenieOplaty
        throw new UnsupportedOperationException();
    }

    public void przypomnienieOPrzekroczeniuTerminuZwrotu() {
        // TODO - implement Wypozyczenie.przypomnienieOPrzekroczeniuTerminuZwrotu
        throw new UnsupportedOperationException();
    }

    public void odjecieZnizki() {
        // TODO - implement Wypozyczenie.odjecieZnizki
        throw new UnsupportedOperationException();
    }

    public Klient getKlient() {
        return this.klient;
    }

    /**
     * 
     * @param klient
     */
    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public Sprzet[] getSprzet() {
        return this.sprzet;
    }

    /**
     * 
     * @param sprzet
     */
    public void setSprzet(Sprzet[] sprzet) {
        this.sprzet = sprzet;
    }

    public int getDataRozpoczeciaWypozyczenia() {
        return this.dataRozpoczeciaWypozyczenia;
    }

    /**
     * 
     * @param dataRozpoczeciaWypozyczenia
     */
    public void setDataRozpoczeciaWypozyczenia(int dataRozpoczeciaWypozyczenia) {
        this.dataRozpoczeciaWypozyczenia = dataRozpoczeciaWypozyczenia;
    }

    public int setDataZakonczeniaWypozyczenia(int dataZakonczeniaWypozyczenia) {
        return this.dataZakonczeniaWypozyczenia = dataZakonczeniaWypozyczenia;
    }
    
    public int getDataZakonczeniaWypozyczenia() {
        return this.dataZakonczeniaWypozyczenia;
    }

    public boolean isZakoczone() {
        return this.zakoczone;
    }

    /**
     * 
     * @param zakonczone
     */
    public void setZakonczone(boolean zakonczone) {
        // TODO - implement Wypozyczenie.setZakonczone
        throw new UnsupportedOperationException();
    }

}