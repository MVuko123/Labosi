/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LV7_2;

/**
 *
 * @author Marin
 */
public class Test {
    public static void main(String[] args) {

    Raketa r1 = new Raketa();
    Raketa r2 = new Raketa();
    Raketa r3 = new Raketa();
    Raketa r4 = new Raketa();
    Raketa r5 = new Raketa();
    
    r1.setIme("MX-774");
    r2.setIme("Atlas H");
    r3.setIme("Titan IV");
    r4.setIme("Pegasus");
    r5.setIme("Minotaur I");
    
    r1.run();
    r2.run();
    r3.run();
    r4.run();
    r5.run();
    
    }
}
