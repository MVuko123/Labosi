/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LV8_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Marin
 */
public class Klijent {
      public static void main(String[] args) throws IOException {
   try {
        String host = "127.0.0.1";
        int port = 9999; 
        Socket klijent = new Socket(host, port);
        System.out.println("Klijent: "+klijent); 
        InputStream in = klijent.getInputStream();
        OutputStream out = klijent.getOutputStream();
        BufferedReader bis = new BufferedReader(new InputStreamReader(in));
        PrintWriter ps = new PrintWriter(new PrintStream(out), true /* autoflush */); 
        String unos;
        unos = JOptionPane.showInputDialog("Unesite poruku:");
        ps.println(unos);
        String linija = bis.readLine();
            System.out.println();
            System.out.println(linija);
            } catch (IOException ex) {
            Logger.getLogger(Klijent.class.getName()).log(Level.SEVERE, null, ex);
    }
}
}