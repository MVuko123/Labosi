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
public class Zaposlenik {
    JFrame f;
    private String ID;
    private String ime;
    private String prezime;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    
    public void predstaviSe(Object object){
        f = new JFrame();
        JOptionPane.showMessageDialog(f, "ID je: " + this.getID());
        JOptionPane.showMessageDialog(f, "Ime je: " + this.getIme());
        JOptionPane.showMessageDialog(f, "Prezime je: " + this.getPrezime());
        System.out.println(object.getClass().getSimpleName());
    }
    
    public void radi(){
        
    }
    
}
