/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LV8_2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 *
 * @author Marin
 */
public class Posluzitelj {
    public static void main(String[] args) throws SocketException, IOException {
        DatagramSocket socket;
        socket = new DatagramSocket(5000);
        while (true) {
            byte[] podaci = new byte[100];
            DatagramPacket prihvatniPaket = new DatagramPacket(podaci, podaci.length);
            socket.receive(prihvatniPaket);
            String compare = new String(prihvatniPaket.getData(), 0, prihvatniPaket.getLength());
            
            if (compare.contains("psovka1")||compare.contains("psovka2")||compare.contains("psovka3")||compare.contains("uvreda1")||compare.contains("uvreda2")||compare.contains("uvreda3")) {
                compare = compare.replace("psovka1", "*******");
                compare = compare.replace("psovka2", "*******");
                compare = compare.replace("psovka3", "*******");
                compare = compare.replace("uvreda1", "*******");
                compare = compare.replace("uvreda2", "*******");
                compare = compare.replace("uvreda3", "*******");
            }
            podaci=compare.getBytes();
            System.out.println("\nPaket primljen:"
                    + "\nHost: " + prihvatniPaket.getAddress()
                    + "\nPort: " + prihvatniPaket.getPort()
                    + "\nDuljina: " + prihvatniPaket.getLength()
                    + "\nSadrži:\n\t" + compare);

            DatagramPacket sPaket = new DatagramPacket(podaci,
                    prihvatniPaket.getLength(), prihvatniPaket.getAddress(), prihvatniPaket.getPort());
            socket.send(sPaket);
            System.out.println("Paket poslan\n");
        }
    }
    
}
