/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LV6_1;

/**
 *
 * @author Marin
 */
public class Test {
    public static void main(String[] args) {
        Zivotinja zivotinja = new Zivotinja();
        Konj konj = new Konj();
        Riba riba = new Riba();
        Ptica ptica = new Ptica();
        
        zivotinja.kreceSe();
        konj.kreceSe();
        riba.kreceSe();
        ptica.kreceSe();
        
        Zivotinja niz[] = new Zivotinja[4];
        niz[0] = zivotinja;
        niz[1] = konj;
        niz[2] = riba;
        niz[3] = ptica;
        
        for(int i = 0; i < 4; i++){
            niz[i].kreceSe();
        }
        
    }
    
}
