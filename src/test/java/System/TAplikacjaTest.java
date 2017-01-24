/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import System.Katalog.BazaSprzetu;
import System.Katalog.Kategoria.BazaKategorii;
import System.Katalog.Kategoria.Kategoria;
import System.Katalog.Sprzet;
import System.ObslugaKlienta.Klienci.Klient;
import System.ObslugaKlienta.Wypozyczenia.BazaWypozyczen;
import System.ObslugaKlienta.Wypozyczenia.Wypozyczenie;
import java.util.ArrayList;
import java.util.List;
import mockit.Mocked;
import mockit.integration.junit4.JMockit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

/**
 *
 * @author reyzeer
 */
@Category({Test_Control.class, Test_Entity.class})
@RunWith(JMockit.class)
public class TAplikacjaTest {
    
    public TAplikacjaTest() {
    }
    
    @Rule
    public ExpectedException exception = ExpectedException.none(); //definicja obiektu odpowiedzialnego
     //za zachowanie metody testującej podczas generowania wyjątku przez testowaną metodę
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        //Dane
    }
    
    @After
    public void tearDown() {
    }

    @Mocked
    Klient klientAndrzej;
    
    /**
     * Test of main method, of class TAplikacja.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TAplikacja.main(args);
    }

    /**
     * Test of dodanieNowegoSprzetu method, of class TAplikacja.
     */
    @Test
    public void testDodanieNowegoSprzetu() {

        System.out.println("dodanieNowegoSprzetu");
        TAplikacja instance = new TAplikacja();

        Kategoria kategoria = new Kategoria();
        kategoria.setNazwa("Sporty zimowe");

        instance.dodanieNowegoSprzetu("Narty", 5, 7*24*60*60, 20000, kategoria, 28*24*60*60);
        
        Sprzet modelDoWyszukiwania = new Sprzet();
        modelDoWyszukiwania.setNazwa("Narty");
        modelDoWyszukiwania.setIlosc(5);
        modelDoWyszukiwania.setCenaZaOkres(20000);
        modelDoWyszukiwania.setCenaZaOkres(7*24*60*60);
        modelDoWyszukiwania.setKategoria(kategoria);
        modelDoWyszukiwania.setMaksymalnyCzasWypozyczenia(28*24*60*60);
        
        Sprzet sprzet = BazaSprzetu.szukaj(modelDoWyszukiwania);
        
        assertEquals(sprzet.getNazwa(), "Narty");
        assertEquals(sprzet.getIlosc(), 5);
        assertEquals(sprzet.getKategoria(), kategoria);
        assertEquals(sprzet.getDlugoscOkresu(), 7*24*60*60);
        
    }

    /**
     * Test of dodanieNowegoWypozyczenia method, of class TAplikacja.
     */
    @Test
    public void testDodanieNowegoWypozyczenia() {
        
        System.out.println("dodanieNowegoWypozyczenia");
        TAplikacja instance = new TAplikacja();
        
        Klient klient = new Klient();
        
        List<Sprzet> listaSprzetu = new ArrayList<Sprzet>();
       
        Sprzet modelDoWyszkiwania = new Sprzet();
        modelDoWyszkiwania.setNazwa("Narty");
        
        Sprzet sprzetPierwszy = BazaSprzetu.szukaj(modelDoWyszkiwania);
        
        listaSprzetu.add(sprzetPierwszy);
        
        int rozpoczecieZamowienia = (int) System.currentTimeMillis();
        
        instance.dodanieNowegoWypozyczenia(klient, listaSprzetu, rozpoczecieZamowienia, 0, false);
        
        Wypozyczenie modelDoWyszukania = new Wypozyczenie();
        modelDoWyszukania.setKlient(klient);
        modelDoWyszukania.setSprzet(listaSprzetu);
        modelDoWyszukania.setDataRozpoczeciaWypozyczenia(rozpoczecieZamowienia);
        
        assertEquals(BazaWypozyczen.szukaj(modelDoWyszukania).getKlient(), klient);
        assertEquals(BazaWypozyczen.szukaj(modelDoWyszukania).getDataRozpoczeciaWypozyczenia(), rozpoczecieZamowienia);
        assertEquals(BazaWypozyczen.szukaj(modelDoWyszukania).getSprzet(), listaSprzetu);
        
    }

    /**
     * Test of zamkniecieWypozyczenia method, of class TAplikacja.
     */
    @Test
    public void testZamkniecieWypozyczenia() {
        System.out.println("zamkniecieWypozyczenia");
        TAplikacja instance = new TAplikacja();
        
        instance.zamkniecieWypozyczenia(System.currentTimeMillis());

        fail("The test case is a prototype.");
    }

    /**
     * Test of dodanieNowejKategorii method, of class TAplikacja.
     */
    @Test
    public void testDodanieNowejKategorii() {
        System.out.println("dodanieNowejKategorii");
        TAplikacja instance = new TAplikacja();
        
        instance.dodanieNowejKategorii("Zimowe");
        Kategoria kategoria = BazaKategorii.szukaj("Zimowe");
        assertEquals(kategoria.getNazwa(), "Zimowe");
        
        fail("The test case is a prototype.");
    }
    
}
