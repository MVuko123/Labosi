/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LV6_3;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Marin
 */
public class Konj implements Zivotinja, Radni {
    JFrame f;
    
    @Override
    public void kreceSe() {
        f = new JFrame();
       JOptionPane.showMessageDialog(f, "Trcim");
    }

    @Override
    public void radi() {
        
         f = new JFrame();
       JOptionPane.showMessageDialog(f, "Teglim");
    }
    
}
