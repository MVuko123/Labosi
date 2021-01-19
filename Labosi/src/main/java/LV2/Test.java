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
public class Test {
    
    
    public static void main(String[] args) {
         Zarulja zarulja = new Zarulja();
         Zaposlenik zaposlenik = new Zaposlenik();
         
        System.out.println("Zarulja provjera:");
        zarulja.osram();
       
        
        System.out.println("\nZaposlenik provjera;");
        System.out.println("Vrijednosti na pocetku: \n");
        zaposlenik.Ispis(zaposlenik);
        System.out.println("Zarada prije promijene je:" + zaposlenik.Zarada1());
        zaposlenik.PromijeniPodatke(zaposlenik);
        System.out.println("\nVrijednosti nakon promijene: \n");
        zaposlenik.Ispis(zaposlenik);
        System.out.println("Zarada nakon promijene je:" + zaposlenik.Zarada2(zaposlenik));
    }
    
    
    
    
}
