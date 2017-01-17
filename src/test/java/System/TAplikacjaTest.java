/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author reyzeer
 */
public class TAplikacjaTest {
    
    public TAplikacjaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class TAplikacja.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TAplikacja.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dodanieNowegoSprzetu method, of class TAplikacja.
     */
    @Test
    public void testDodanieNowegoSprzetu() {
        System.out.println("dodanieNowegoSprzetu");
        TAplikacja instance = new TAplikacja();
        instance.dodanieNowegoSprzetu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dodanieNowegoWypozyczenia method, of class TAplikacja.
     */
    @Test
    public void testDodanieNowegoWypozyczenia() {
        System.out.println("dodanieNowegoWypozyczenia");
        TAplikacja instance = new TAplikacja();
        instance.dodanieNowegoWypozyczenia();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of zamkniecieWypozyczenia method, of class TAplikacja.
     */
    @Test
    public void testZamkniecieWypozyczenia() {
        System.out.println("zamkniecieWypozyczenia");
        TAplikacja instance = new TAplikacja();
        instance.zamkniecieWypozyczenia();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dodanieNowejKategorii method, of class TAplikacja.
     */
    @Test
    public void testDodanieNowejKategorii() {
        System.out.println("dodanieNowejKategorii");
        TAplikacja instance = new TAplikacja();
        instance.dodanieNowejKategorii();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
