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
public class Pas extends Sisavac{
    private String vrsta; 

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }
    
    public static void opis(Pas pas){
        System.out.println("Pas: \n");
        System.out.println("Pasmina: " + pas.getVrsta() +"\n"); 
        System.out.println("Dob: " + pas.getDob() +"\n");
        System.out.println("Tezina: "+ pas.getTezina() +"\n");        
    }
}
