/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LV1;

import javax.swing.JOptionPane;

/**
 *
 * @author Marin
 */
public class Z6 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Unesite 1. broj"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Unesite 2. broj"));
        
        System.out.println(a + "+" + b + "=" + (a + b));
        System.out.println(a + "-" + b + "=" + (a - b));
        System.out.println(a + "*" + b + "=" + (a * b));
        System.out.println(a + "/" + b + "=" + (a / b));
        System.out.println(a + " mod " + b + "=" + (a % b));
       
        
        
    }
    
}
