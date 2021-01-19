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
public class LansirnaRampa {
    public void lansiraj(){
        JFrame f;
        int brojac = 11;
        for(int i = 10; i >= 0; i--){
            brojac--;
            f = new JFrame();
            JOptionPane.showMessageDialog(f, brojac);
        }
    }
    
}
