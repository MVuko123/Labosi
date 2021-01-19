/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LV5;

/**
 *
 * @author Marin
 */
public class Test {
    public static void main(String[] args) {
        Sisavac sisavaca = new Sisavac();
        Pas pas = new Pas();
        Macka macka = new Macka();
        
        pas.setVrsta("Francuski buldog");
        pas.setDob(2);
        pas.setTezina(12);
        
        macka.setVrsta("Perzijska");
        macka.setDob(6);
        macka.setTezina(7.5);
        
        pas.opis(pas);
        macka.opis(macka);
        
    }
    
}
