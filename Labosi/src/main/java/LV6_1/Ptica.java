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
public class Ptica extends Zivotinja{
    JFrame f;
    
    @Override
    public String getVrsta() {
        return vrsta;
    }

    @Override
    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }
    
    @Override
    public void kreceSe(){
      f = new JFrame();
      JOptionPane.showMessageDialog(f, "Letim");
   }
    
}
