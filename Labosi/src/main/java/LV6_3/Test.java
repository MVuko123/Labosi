/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LV6_3;

/**
 *
 * @author Marin
 */
public class Test {

    public static void main(String[] args) {
        Konj konj = new Konj();
        Riba riba = new Riba();
        Ptica ptica = new Ptica();
        
        konj.radi();
        konj.kreceSe();
        riba.kreceSe();
        ptica.kreceSe();
        
        Zivotinja niz[] = new Zivotinja[3];
        niz[0] = konj;
        niz[1] = riba;
        niz[2] = ptica;
        
        for(int i = 0; i < 4; i++){
            niz[i].kreceSe();
        }
    
}
}
