/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LV6_1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Marin
 */
public class Zivotinja {
    JFrame f;
    protected String vrsta;
    
   public void kreceSe(){
       f = new JFrame();
       JOptionPane.showMessageDialog(f, "Zivotinja se krece");
   }

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }
    
   
}
