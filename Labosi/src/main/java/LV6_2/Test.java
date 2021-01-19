/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LV6_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Marin
 */
public class Test {
    public static void main(String[] args) {
       
    Direktor direktor = new Direktor();
    Tajnica tajnica = new Tajnica();
    Vozac vozac = new Vozac();
    
    direktor.radi();
    tajnica.radi();
    vozac.radi();
    
    direktor.setID(JOptionPane.showInputDialog("Unesite direktorov ID"));
    direktor.setIme(JOptionPane.showInputDialog("Unesite direktorovo Ime"));
    direktor.setPrezime(JOptionPane.showInputDialog("Unesite direktorovo Prezime"));
    
    direktor.predstaviSe();
    
    tajnica.setID(JOptionPane.showInputDialog("Unesite tajnicin ID"));
    tajnica.setIme(JOptionPane.showInputDialog("Unesite tajnicino Ime"));
    tajnica.setPrezime(JOptionPane.showInputDialog("Unesite tajnicino Prezime"));
    
    tajnica.predstaviSe(tajnica);
    
    vozac.setID(JOptionPane.showInputDialog("Unesite vozacev ID"));
    vozac.setIme(JOptionPane.showInputDialog("Unesite vozacevo Ime"));
    vozac.setPrezime(JOptionPane.showInputDialog("Unesite vozacevo Prezime"));
    
    vozac.predstaviSe(vozac);
    
    }
}
