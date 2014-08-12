package servidor;

import java.net.DatagramSocket;
import java.net.SocketException;
import javax.swing.JOptionPane;

/**
 * Executar o servidor.
 */
public class ServidorSalas {    
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
