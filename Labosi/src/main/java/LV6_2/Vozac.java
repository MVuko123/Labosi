/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LV6_2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;



/**
 *
 * @author Marin
 */
public class Vozac extends Zaposlenik{
    JFrame f;
    @Override
    public void radi(){
        f = new JFrame();
        JOptionPane.showMessageDialog(f, "Vozim");
        
    }
    
    
}
