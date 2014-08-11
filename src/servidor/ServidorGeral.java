
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.net.DatagramSocket;
import java.net.SocketException;
import javax.swing.JOptionPane;

/**
 * Executar o servidor.
 *
 * @author Jonas
 */
public class ServidorGeral {
    
    public static void main(String[] targs) {

        try {
            String p = (JOptionPane.showInputDialog("porta servidor"));
            int porta;
            if (!p.isEmpty()) {
                porta = Integer.parseInt(p);
            } else {
                while (p.isEmpty()) {
                    p = (JOptionPane.showInputDialog("porta servidor"));
                }
                porta = Integer.parseInt(p);
            }
            do {
                DatagramSocket ds = new DatagramSocket(porta);
                new ThreadCliente(ds).start();
            } while (true);
        } catch (SocketException ioe) {
        }
    }

}
