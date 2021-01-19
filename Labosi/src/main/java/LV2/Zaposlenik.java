/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LV2;

import javax.swing.JOptionPane;

/**
 *
 * @author Marin
 */
public class Zaposlenik {
    public int staz;
    public int starost;
    public double placa;

    public int getStaz() {
        return staz;
    }

    public void setStaz(int staz) {
        this.staz = staz;
    }

    public int getStarost() {
        return starost;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }

    public double getPlaca() {
        return placa;
    }

    public void setPlaca(double placa) {
        this.placa = placa;
    }

    public Zaposlenik() {
        this.staz = 22;
        this.starost = 48;
        this.placa = 7852.21;
    }
    
    public  void PromijeniPodatke(Zaposlenik zaposlenik){
        zaposlenik.staz = Integer.parseInt(JOptionPane.showInputDialog("Promijenite godine staza zaposlenika"));
        zaposlenik.starost = Integer.parseInt(JOptionPane.showInputDialog("Promijenite godine zaposlenika"));
        zaposlenik.placa = Double.parseDouble(JOptionPane.showInputDialog("Promijenite placu zaposlenika"));
    }
    
    public  void Ispis(Zaposlenik zaposlenik){
        System.out.println("Staz " + zaposlenik.staz + "\n" + "Starost: " + zaposlenik.starost + "\n" + "Placa: " + zaposlenik.placa);
        
    }
    
    public  double Zarada1(){
        double zarada = this.staz  * 12 * this.placa;
        return zarada;
    }
    
    public static double Zarada2(Zaposlenik zaposlenik){
        double zarada = zaposlenik.staz * 12 * zaposlenik.placa;
        return zarada;
        
    }
    
//    public static void main(String[] args) {
//        Zaposlenik zaposlenik = new Zaposlenik();
//        System.out.println("Vrijednosti na pocetku: \n");
//        zaposlenik.Ispis(zaposlenik);
//        System.out.println("Zarada prije promijene je:" + zaposlenik.Zarada1());
//        zaposlenik.PromijeniPodatke(zaposlenik);
//        System.out.println("\nVrijednosti nakon promijene: \n");
//        zaposlenik.Ispis(zaposlenik);
//        System.out.println("Zarada nakon promijene je:" + zaposlenik.Zarada2(zaposlenik));
//        
//    }
    
    
    
}
