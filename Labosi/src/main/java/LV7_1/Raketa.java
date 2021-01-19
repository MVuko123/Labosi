/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LV7_1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Marin
 */
public class Raketa extends Thread{
    String ime;
    LansirnaRampa lansirnaRampa;
    JFrame f;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public LansirnaRampa getLansirnaRampa() {
        return lansirnaRampa;
    }

    public void setLansirnaRampa(LansirnaRampa lansirnaRampa) {
        this.lansirnaRampa = lansirnaRampa;
    }
    
    @Override
    public void run(){
        lansirnaRampa = new LansirnaRampa();
        f = new JFrame();
        JOptionPane.showMessageDialog(f, this.ime + ": Pokrenuto Lasiranje!");
        lansirnaRampa.lansiraj();
        JOptionPane.showMessageDialog(f, "Lansiranje Uspijesno!");
        
    }
    
}
