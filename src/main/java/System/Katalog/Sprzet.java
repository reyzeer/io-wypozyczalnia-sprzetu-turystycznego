package System.Katalog;

import System.Katalog.Kategoria.*;

public class Sprzet {

    private String nazwa;
    private int ilosc;
    private double cenaZaOkres;
    private int dlugoscOkresu;
    private int maksymalnyCzasWypozyczenia;
    private Kategoria kategoria;

    public String getNazwa() {
            return this.nazwa;
    }

    /**
     * 
     * @param nazwa
     */
    public void setNazwa(String nazwa) {
            this.nazwa = nazwa;
    }

    /**
     * 
     * @param ilosc
     */
    public void setIlosc(int ilosc) {
            this.ilosc = ilosc;
    }

    public int getIlosc() {
            return this.ilosc;
    }

    public double getCenaZaOkres() {
            return this.cenaZaOkres;
    }

    /**
     * 
     * @param cenaZaOkres
     */
    public void setCenaZaOkres(double cenaZaOkres) {
            this.cenaZaOkres = cenaZaOkres;
    }

    public int getDlugoscOkresu() {
            return this.dlugoscOkresu;
    }

    /**
     * 
     * @param dlugoscOkres
     */
    public void setDlugoscOkresu(int dlugoscOkres) {
            this.dlugoscOkresu = dlugoscOkres;
    }

    public int getMaksymalnyCzasWypozyczenia() {
            return this.maksymalnyCzasWypozyczenia;
    }

    /**
     * 
     * @param maksymalnyCzasWypoczenia
     */
    public void setMaksymalnyCzasWypozyczenia(int maksymalnyCzasWypoczenia) {
            this.maksymalnyCzasWypozyczenia = maksymalnyCzasWypoczenia;
    }

    public Kategoria getKategoria() {
            return this.kategoria;
    }

    /**
     * 
     * @param kategoria
     */
    public void setKategoria(Kategoria kategoria) {
            this.kategoria = kategoria;
    }

}