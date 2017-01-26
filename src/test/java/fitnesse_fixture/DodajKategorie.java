/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnesse_fixture;

import fit.ColumnFixture;
import java.util.IllegalFormatCodePointException;

/**
 *
 * @author reyzeer
 */
public class DodajKategorie extends ColumnFixture {
    
    String dane[];
    
    public boolean dodajKategorie() throws IllegalFormatCodePointException {
        
        int liczbaKategori = pobierzLiczbeKategoriiZAplikacji();
        
        try {
    
            String nazwa = dane[0];
            
            SetUp.aplikacja.dodanieNowejKategorii(nazwa);
            
            if (liczbaKategori != pobierzLiczbeKategoriiZAplikacji()) {
                return true;
            }
            
        } catch (IllegalFormatCodePointException e) {
            
        }
    
        return false;
        
    }

    public int pobierzLiczbeKategoriiZAplikacji() {
        int liczbaKategorii = SetUp.aplikacja.liczbaKategoriiWBazie();
        return liczbaKategorii;
    }
    
}
