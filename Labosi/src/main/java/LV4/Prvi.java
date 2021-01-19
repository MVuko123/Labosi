/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LV4;

import java.io.File;

/**
 *
 * @author Marin
 */
public class Prvi {
   public static void ispis(int a, File file){
       for(int i = 0; i < a; i++){
           System.out.println(file.getName());
       }
       if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File file1 : files) {
                ispis (a, file1);
            }
        }
   }
   
   public static void velikoMaloSlovo(int a, File file){
       for(int i = 0; i < a; i++){
           if(file.getName().length() <1){
               
           }else{
               if ((file.getName().charAt(0) >= 'A' && file.getName().charAt(0) <= 'N') || (file.getName().charAt(0) >= 'a' && file.getName().charAt(0) <= 'n')) {
                    if (file.getName().charAt(0) >= 'a' && file.getName().charAt(0) <= 'n') {
                        
                        System.out.println("\n \n");
                        System.out.println(file.getName().substring(file.getName().length() -(file.getName().length() - 1)).toUpperCase());
                    }else if ((file.getName().charAt(0) >= 'O' && file.getName().charAt(0) <= 'Z') || (file.getName().charAt(0) >= 'o' && file.getName().charAt(0) <= 'z')) {
                    String zadnjeS = file.getName().substring(file.getName().length() - 1);
                    if (zadnjeS.charAt(0) >= 'o' && zadnjeS.charAt(0) <= 'z') {
                        System.out.println("\n \n");
                        System.out.println(file.getName().toUpperCase());
                    }
                }
               }
           }
       }
   }
   
    public static void main(String[] args) {
        ispis(1, new File("C:"));
        velikoMaloSlovo(1, new File("C:"));
    }
    }
 
