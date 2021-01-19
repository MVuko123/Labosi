/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LV8_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marin
 */
public class Posluzitelj {
     public static void main(String[] args) throws IOException {
        try{
        String linija;
        BufferedReader is;
        PrintWriter os;
        ServerSocket echoServer;
        Socket clientSocket = null;

       echoServer = new ServerSocket();
       echoServer.bind(new InetSocketAddress("127.0.0.1", 9999));
       System.out.println("Postavljeni posluzitelj: "+ echoServer.toString());
       clientSocket = echoServer.accept();
       System.out.println("Server>> Imamo klijenta: "+clientSocket.getInetAddress());
       is = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
       os = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()),true);

       linija = is.readLine();
       if(linija.contains("psovka1") || linija.contains("psovka2") || linija.contains("Psovka3") || linija.contains("uvreda1") || linija.contains("uvreda2") || linija.contains("uvreda3")){
           linija = linija.replace("psovka1", "*******");
           linija = linija.replace("psovka2", "*******");
           linija = linija.replace("psovka3", "*******");
           linija = linija.replace("uvreda1", "*******");
           linija = linija.replace("uvreda2", "*******");
           linija = linija.replace("uvreda3", "*******");
       }
       os.println("Echo: " + linija);
       } catch (IOException ex) {
            Logger.getLogger(Posluzitelj.class.getName()).log(Level.SEVERE, null, ex);
        }
 }

     }

