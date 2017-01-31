/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnesse_fixture;

import System.Katalog.Kategoria.Kategoria;
import fit.ColumnFixture;
import java.util.IllegalFormatCodePointException;

/**
 *
 * @author reyzeer
 */
public class DodanieNowegoSprzetuTest extends ColumnFixture {
    
    String dane[];
    
    public int pobierzLiczbeSprzetuZAplikacji() {
        int liczbaSprzetu = SetUp.aplikacja.liczbaSprzetuWBazie();
        return liczbaSprzetu;
    }
    
    public boolean dodajSprzet() throws IllegalFormatCodePointException {
        
        int liczbaSprzetu = pobierzLiczbeSprzetuZAplikacji();
        
        try {
            
            String nazwa = dane[0];
            
            int ilosc = Integer.parseInt(dane[1]);
            int dlugoscOkresu = Integer.parseInt(dane[2]);
            int cenaZaOkres = Integer.parseInt(dane[3]);
            
            Kategoria kategoria = new Kategoria();
            
            kategoria.setNazwa(dane[4]);
            
            int maksymalnyCzasWypozyczenia = Integer.parseInt(dane[5]);
            
            
            SetUp.aplikacja.dodanieNowegoSprzetu(nazwa, ilosc, dlugoscOkresu, cenaZaOkres, kategoria, maksymalnyCzasWypozyczenia);
            
            if (liczbaSprzetu != pobierzLiczbeSprzetuZAplikacji()) {
                return true;
            }
            
        } catch (IllegalFormatCodePointException e) {
            
        }
    
        return false;
        
    }
    
}
