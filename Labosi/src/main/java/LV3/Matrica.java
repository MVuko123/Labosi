/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LV3;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Marin
 */
public class Matrica {

    public static void main(String[] args) {
        int n = 0,  m = 0;
        JFrame f;
        do {           
            try {
               n = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj elementat za vektor V: "));
            } catch (Exception greska) {
                f = new JFrame();
                JOptionPane.showMessageDialog(f, "Dogodila se greska!");
            }
            if (n < 2 || n > 10) {
                f = new JFrame();
              JOptionPane.showMessageDialog(f, "Unijeli ste premali ili preveliki broj za vektor V morat cete ponoviti unos!");
            }
        } while (n < 2 || n > 10);

        do {
            try {
                m = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj elementat za kvadratnu matricu: "));
            } catch (Exception greska) {
                f = new JFrame();
                JOptionPane.showMessageDialog(f, "Dogodila se greska!");
            }
            if (m < 1 || m > 5) {
                f = new JFrame();
              JOptionPane.showMessageDialog(f, "Unijeli ste premali ili preveliki broj za kvadratnu matricu morat cete ponoviti unos!");
            }
        } while (m < 1 || m > 5);
        
        int[][] matrica = new int[m][m];
        int[] vektor = new int[10];
        
        for(int i = 0; i < n; i++){
            vektor[i] = (int)(Math.random() * 100);
            System.out.println(vektor[i] + "\n");
        }
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                matrica[i][j] = (int)(Math.random() * 100);
                System.out.print(matrica[i][j] + " ");
            }
            System.out.println();
        }
        
        int odabir = 0, sumaD = 0, sumaRed = 0, sumaStupac = 0, brojac = 0;
        while(odabir != -1){
            odabir = Integer.parseInt(JOptionPane.showInputDialog("\n Odaberite opciju koju zelite: \n "
                    + "                                               1.Aritmeticka sredina sporedne cijagonale \n "
                    + "                                               2. Suma neparnih elemenata prvog stupca i prvog retka matrice\n "
                    + "                                               3.Svi brojevi s parnim indeksima vektora\n "
                    + "                                               4.Izlaz"));
            switch(odabir){
                case 1:
                    for(int i = 0, j = m -1; i < m && j > 0; i++, j--){
                        sumaD += matrica[i][j];
                        brojac++;
                    }  
                     f = new JFrame();
                    JOptionPane.showMessageDialog(f, "Aritmeticka sredina sporedne dijagonale je: " + (sumaD / brojac));
                    sumaD = 0;
                    brojac = 0;
                    break;
                case 2:
                    for(int i = 0, j = 0; j < m; j++){
                        if(matrica[i][j] % 2 != 0){
                            sumaRed += matrica[i][j];
                            brojac ++;
                        }
                    }
                    for(int i = 0, j = 0; i < m; i++){
                        if(matrica[i][j] % 2 != 0){
                            sumaStupac += matrica[i][j];
                            brojac++;
                        }
                    }
                    if(brojac == 0){
                        f = new JFrame();
                         JOptionPane.showMessageDialog(f, "Nema neparnih elemanata, nije moguće izračunati sumu!");                  
                    } else {
                        f = new JFrame();
                        JOptionPane.showMessageDialog(f,"Suma neparnih elemenata prvog reda i prvog stupca: " + (sumaRed + sumaStupac));
                    }
                    sumaRed = 0;
                    sumaStupac = 0;
                    brojac = 0;
                    break;
                case 3:
                    for(int i = 0; i < n; i++){
                        if(i % 2 == 0){
                            continue;
                        }
                        System.out.print("\n Brojevi na parnim indeksima vektora:" + vektor[i] + " ");
                    }
                    break;
                case 4:
                    System.exit(0);
                    }
            }
        
    }
}