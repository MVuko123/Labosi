/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LV4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Marin
 */
public class Drugi {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Student student;
        List<Student> studenti = new ArrayList<>();    
        for(int i = 0; i < 10; i++){
            student = new Student();
            student.setMaticniBroj(Integer.parseInt(JOptionPane.showInputDialog("Unesite maticni broj za"+ (i+1)+". studenta")));
            student.setIme(JOptionPane.showInputDialog("Unesite ime za " + (i+1)+". studenta." ));
            student.setPrezime(JOptionPane.showInputDialog("Unesite prezime za " + (i+1)+". studenta"));
            student.setFakultet(JOptionPane.showInputDialog("Unesite naziv fakuleteta koji" + (i+1)+". student pohada"));
            student.setSmjer(JOptionPane.showInputDialog("Unesite fakultetski smjer koji" + (i+1)+". student pohada"));
            student.setGodina(Integer.parseInt(JOptionPane.showInputDialog("Unesite koju godinu" + (i+1)+". student pohada")));
            student.setProsjecnaOcjena(Float.parseFloat(JOptionPane.showInputDialog("Unesite prosjecnu ocjenu"+ (i+1)+". studenta")));
            studenti.add(student);
        }
        
        try (FileOutputStream zapisi = new FileOutputStream("C:\\Users\\Marin\\OneDrive\\Dokumenti\\NetBeansProjects\\Labosi\\target\\studenti.txt"); 
                ObjectOutputStream out = new ObjectOutputStream(zapisi)) {
            
            
            
            for (Student st : studenti) {
                try {
                    out.writeObject(st);
                } catch (IOException e) {
                }
            }
        }
        
        
        try (FileInputStream ucitaj = new FileInputStream("C:\\Users\\Marin\\OneDrive\\Dokumenti\\NetBeansProjects\\Labosi\\target\\studenti.txt"); 
                ObjectInputStream in = new ObjectInputStream(ucitaj)) {
            double prosjek = 0.0;
            student = null;
            for(int i = 0; i < 10; i++){
                try {
                    student = (Student) in.readObject();
                    prosjek += student.getProsjecnaOcjena();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Drugi.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println((i + 1) + ". student:");
                System.out.println("\nIme: " + student.getIme());
                System.out.println("\nPrezime: " + student.getPrezime());
                System.out.println("\nFakultet: " + student.getFakultet());
                System.out.println("\nSmjer: " + student.getSmjer());
                System.out.println("\nGodina: " + student.getGodina());
                System.out.println("\nMaticni broj: " + student.getMaticniBroj());
                System.out.println("\nOcjena: " + student.getProsjecnaOcjena());
                System.out.println("\n \n");
                
            }
            
            prosjek /= 10;
            System.out.println("Prosjek ocjena studenata je: " + prosjek);
        }
    }   

}

  
