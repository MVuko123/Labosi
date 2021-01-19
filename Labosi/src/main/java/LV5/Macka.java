/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LV5;

/**
 *
 * @author Marin
 */
public class Macka extends Sisavac {
    private String vrsta; 

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }
    
    public static void opis(Macka macka){
        System.out.println("Macka: \n");
        System.out.println("Pasmina: " + macka.getVrsta() +"\n"); 
        System.out.println("Dob: " + macka.getDob() +"\n");
        System.out.println("Tezina: "+ macka.getTezina() +"\n");        
    }
}
