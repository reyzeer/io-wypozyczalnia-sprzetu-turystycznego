/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnesse_fixture;

import System.TAplikacja;
import fit.Fixture;

/**
 *
 * @author reyzeer
 */
public class SetUp extends Fixture {

    static TAplikacja aplikacja;
    
    public SetUp() {
        aplikacja = new TAplikacja();
    }
    
}
