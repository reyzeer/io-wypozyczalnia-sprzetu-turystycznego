package System.Katalog.Kategoria;

import System.Katalog.Sprzet;
import java.util.ArrayList;
import java.util.List;

public class BazaKategorii {

    static private List<Kategoria> kategorie = new ArrayList<Kategoria>();

    static public int liczbaKategorii() {
        return kategorie.size();
    }
    
    /**
     *
     * @param model
     */
    static public boolean dodaj(Kategoria model) {
        boolean result = kategorie.add(model);
        return result;
    }

    /**
     *
     * @param model
     */
    static public boolean usun(Kategoria model) {
        // TODO - implement BazaKategorii.usun
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param dane
     */
    static public Kategoria szukaj(Kategoria kategoria) {
            if (kategorie.size() > 0) {
            for (Kategoria temp : kategorie) {
                System.out.println(temp.getNazwa());
                if (temp.getNazwa().equals(kategoria.getNazwa())) {
                    return temp;
                }
            }
        }
        return null;
    }

    /**
     *
     * @param model
     */
    static public boolean edytuj(Kategoria model) {
        // TODO - implement BazaKategorii.edytuj
        throw new UnsupportedOperationException();
    }

}
