package System.Katalog;

import java.util.ArrayList;

public class BazaSprzetu {

    static private ArrayList<Sprzet> sprzet = new ArrayList<Sprzet>();

    /**
     * 
     * @param model
     */
    static public boolean dodaj(Sprzet model) {
        boolean result = sprzet.add(model);
        return result;
    }

    /**
     * 
     * @param model
     */
    static public boolean usun(Sprzet model) {
        // TODO - implement BazaSprzetu.usun
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param model
     */
    static public boolean edytuj(Sprzet model) {
        // TODO - implement BazaSprzetu.edytuj
        throw new UnsupportedOperationException();
    }

    public static Sprzet szukaj(Sprzet sprzet) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static int liczbaSprzetu() {
        return sprzet.size();
    }
    
}