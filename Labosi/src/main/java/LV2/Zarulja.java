/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LV2;

/**
 *
 * @author Marin
 */
public class Zarulja {
    
    private  boolean Stanje;

    public Zarulja() {
        this.Stanje = false;
    }
    
    
    public  void Provjeri(boolean Stanje){
        if(Stanje == true)
            System.out.println("Svijetli");
        else
            System.out.println("Mrak je");
    }
    
    public  void PritisniPrekidac(){
        if(Stanje == true) {
	      Stanje = false;
	      Provjeri(Stanje);
	}
	else {
		Stanje = true;
		Provjeri(Stanje);
	}
        
    }
    
    //napravljeno samo radi testa
    public void osram(){
        Zarulja osram = new Zarulja();
       for(int i = 0; i < 10; i++) {
	  osram.PritisniPrekidac();
	}
    }
    
//    public static void main(String[] args) {
//       Zarulja osram = new Zarulja();
//       for(int i = 0; i < 10; i++) {
//	  osram.PritisniPrekidac();
//	}
//    }  
}
